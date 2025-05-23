/*
* 
*/
package dataweb.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import dataweb.diagram.edit.commands.PaginaPantallaEntidadCreateCommand;
import dataweb.diagram.edit.commands.PaginaPantallaEntidadReorientCommand;
import dataweb.diagram.edit.commands.PaginaPantallaRedsocialCreateCommand;
import dataweb.diagram.edit.commands.PaginaPantallaRedsocialReorientCommand;
import dataweb.diagram.edit.commands.PaginaPantallaUsuarioCreateCommand;
import dataweb.diagram.edit.commands.PaginaPantallaUsuarioReorientCommand;
import dataweb.diagram.edit.commands.RedSocialPaginapantallaCreateCommand;
import dataweb.diagram.edit.commands.RedSocialPaginapantallaReorientCommand;
import dataweb.diagram.edit.commands.RolAccesoapaginapantallaCreateCommand;
import dataweb.diagram.edit.commands.RolAccesoapaginapantallaReorientCommand;
import dataweb.diagram.edit.parts.PaginaPantallaEntidadEditPart;
import dataweb.diagram.edit.parts.PaginaPantallaRedsocialEditPart;
import dataweb.diagram.edit.parts.PaginaPantallaUsuarioEditPart;
import dataweb.diagram.edit.parts.RedSocialPaginapantallaEditPart;
import dataweb.diagram.edit.parts.RolAccesoapaginapantallaEditPart;
import dataweb.diagram.part.DatawebVisualIDRegistry;
import dataweb.diagram.providers.DatawebElementTypes;

/**
 * @generated
 */
public class IndiceEntidadItemSemanticEditPolicy extends DatawebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IndiceEntidadItemSemanticEditPolicy() {
		super(DatawebElementTypes.IndiceEntidad_2002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (DatawebVisualIDRegistry.getVisualID(incomingLink) == RolAccesoapaginapantallaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DatawebVisualIDRegistry.getVisualID(incomingLink) == RedSocialPaginapantallaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (DatawebVisualIDRegistry.getVisualID(outgoingLink) == PaginaPantallaUsuarioEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DatawebVisualIDRegistry.getVisualID(outgoingLink) == PaginaPantallaRedsocialEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DatawebVisualIDRegistry.getVisualID(outgoingLink) == PaginaPantallaEntidadEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (DatawebElementTypes.RolAccesoapaginapantalla_4005 == req.getElementType()) {
			return null;
		}
		if (DatawebElementTypes.RedSocialPaginapantalla_4006 == req.getElementType()) {
			return null;
		}
		if (DatawebElementTypes.PaginaPantallaUsuario_4007 == req.getElementType()) {
			return getGEFWrapper(new PaginaPantallaUsuarioCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DatawebElementTypes.PaginaPantallaRedsocial_4008 == req.getElementType()) {
			return getGEFWrapper(new PaginaPantallaRedsocialCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DatawebElementTypes.PaginaPantallaEntidad_4009 == req.getElementType()) {
			return getGEFWrapper(new PaginaPantallaEntidadCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (DatawebElementTypes.RolAccesoapaginapantalla_4005 == req.getElementType()) {
			return getGEFWrapper(new RolAccesoapaginapantallaCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DatawebElementTypes.RedSocialPaginapantalla_4006 == req.getElementType()) {
			return getGEFWrapper(new RedSocialPaginapantallaCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DatawebElementTypes.PaginaPantallaUsuario_4007 == req.getElementType()) {
			return null;
		}
		if (DatawebElementTypes.PaginaPantallaRedsocial_4008 == req.getElementType()) {
			return null;
		}
		if (DatawebElementTypes.PaginaPantallaEntidad_4009 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case RolAccesoapaginapantallaEditPart.VISUAL_ID:
			return getGEFWrapper(new RolAccesoapaginapantallaReorientCommand(req));
		case RedSocialPaginapantallaEditPart.VISUAL_ID:
			return getGEFWrapper(new RedSocialPaginapantallaReorientCommand(req));
		case PaginaPantallaUsuarioEditPart.VISUAL_ID:
			return getGEFWrapper(new PaginaPantallaUsuarioReorientCommand(req));
		case PaginaPantallaRedsocialEditPart.VISUAL_ID:
			return getGEFWrapper(new PaginaPantallaRedsocialReorientCommand(req));
		case PaginaPantallaEntidadEditPart.VISUAL_ID:
			return getGEFWrapper(new PaginaPantallaEntidadReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
