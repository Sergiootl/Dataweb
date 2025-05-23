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
import dataweb.Rol;
import dataweb.diagram.edit.policies.DatawebBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class RolAccesoapaginapantallaReorientCommand extends EditElementCommand {

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
	public RolAccesoapaginapantallaReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof Rol) {
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
		if (!(oldEnd instanceof PaginaPantalla && newEnd instanceof Rol)) {
			return false;
		}
		return DatawebBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRolAccesoapaginapantalla_4005(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof PaginaPantalla && newEnd instanceof PaginaPantalla)) {
			return false;
		}
		return DatawebBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRolAccesoapaginapantalla_4005(getOldSource(), getNewTarget());
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
		getOldSource().getAccesoapaginapantalla().remove(getOldTarget());
		getNewSource().getAccesoapaginapantalla().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getAccesoapaginapantalla().remove(getOldTarget());
		getOldSource().getAccesoapaginapantalla().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected Rol getOldSource() {
		return (Rol) referenceOwner;
	}

	/**
	* @generated
	*/
	protected Rol getNewSource() {
		return (Rol) newEnd;
	}

	/**
	* @generated
	*/
	protected PaginaPantalla getOldTarget() {
		return (PaginaPantalla) oldEnd;
	}

	/**
	* @generated
	*/
	protected PaginaPantalla getNewTarget() {
		return (PaginaPantalla) newEnd;
	}
}
