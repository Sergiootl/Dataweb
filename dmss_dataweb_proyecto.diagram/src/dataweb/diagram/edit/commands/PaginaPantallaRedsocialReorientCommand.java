/*
 * 
 */
package dataweb.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import dataweb.PaginaPantalla;
import dataweb.RedSocial;
import dataweb.diagram.edit.policies.DatawebBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class PaginaPantallaRedsocialReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public PaginaPantallaRedsocialReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof PaginaPantalla) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof RedSocial && newEnd instanceof PaginaPantalla)) {
			return false;
		}
		return DatawebBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPaginaPantallaRedsocial_4008(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof RedSocial && newEnd instanceof RedSocial)) {
			return false;
		}
		return DatawebBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPaginaPantallaRedsocial_4008(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getRedsocial().remove(getOldTarget());
		getNewSource().getRedsocial().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getRedsocial().remove(getOldTarget());
		getOldSource().getRedsocial().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected PaginaPantalla getOldSource() {
		return (PaginaPantalla) referenceOwner;
	}

	/**
	* @generated
	*/
	protected PaginaPantalla getNewSource() {
		return (PaginaPantalla) newEnd;
	}

	/**
	* @generated
	*/
	protected RedSocial getOldTarget() {
		return (RedSocial) oldEnd;
	}

	/**
	* @generated
	*/
	protected RedSocial getNewTarget() {
		return (RedSocial) newEnd;
	}
}
