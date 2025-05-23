/*
* 
*/
package dataweb.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import dataweb.diagram.edit.commands.EntidadEntidadRefereenciadaCreateCommand;
import dataweb.diagram.edit.commands.EntidadEntidadRefereenciadaReorientCommand;
import dataweb.diagram.edit.commands.EntidadUsuariosCreateCommand;
import dataweb.diagram.edit.commands.EntidadUsuariosReorientCommand;
import dataweb.diagram.edit.commands.PaginaPantallaEntidadCreateCommand;
import dataweb.diagram.edit.commands.PaginaPantallaEntidadReorientCommand;
import dataweb.diagram.edit.commands.RolEntidadesCreateCommand;
import dataweb.diagram.edit.commands.RolEntidadesReorientCommand;
import dataweb.diagram.edit.parts.AtributoEditPart;
import dataweb.diagram.edit.parts.EntidadEntidadAtributosCompartmentEditPart;
import dataweb.diagram.edit.parts.EntidadEntidadRefereenciadaEditPart;
import dataweb.diagram.edit.parts.EntidadUsuariosEditPart;
import dataweb.diagram.edit.parts.PaginaPantallaEntidadEditPart;
import dataweb.diagram.edit.parts.RolEntidadesEditPart;
import dataweb.diagram.part.DatawebVisualIDRegistry;
import dataweb.diagram.providers.DatawebElementTypes;

/**
 * @generated
 */
public class EntidadItemSemanticEditPolicy extends DatawebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EntidadItemSemanticEditPolicy() {
		super(DatawebElementTypes.Entidad_3005);
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
			if (DatawebVisualIDRegistry.getVisualID(incomingLink) == EntidadEntidadRefereenciadaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DatawebVisualIDRegistry.getVisualID(incomingLink) == RolEntidadesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DatawebVisualIDRegistry.getVisualID(incomingLink) == PaginaPantallaEntidadEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (DatawebVisualIDRegistry.getVisualID(outgoingLink) == EntidadEntidadRefereenciadaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DatawebVisualIDRegistry.getVisualID(outgoingLink) == EntidadUsuariosEditPart.VISUAL_ID) {
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
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (DatawebVisualIDRegistry.getVisualID(node)) {
			case EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (DatawebVisualIDRegistry.getVisualID(cnode)) {
					case AtributoEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (DatawebElementTypes.EntidadEntidadRefereenciada_4001 == req.getElementType()) {
			return getGEFWrapper(new EntidadEntidadRefereenciadaCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DatawebElementTypes.EntidadUsuarios_4002 == req.getElementType()) {
			return getGEFWrapper(new EntidadUsuariosCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DatawebElementTypes.RolEntidades_4004 == req.getElementType()) {
			return null;
		}
		if (DatawebElementTypes.PaginaPantallaEntidad_4009 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (DatawebElementTypes.EntidadEntidadRefereenciada_4001 == req.getElementType()) {
			return getGEFWrapper(new EntidadEntidadRefereenciadaCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DatawebElementTypes.EntidadUsuarios_4002 == req.getElementType()) {
			return null;
		}
		if (DatawebElementTypes.RolEntidades_4004 == req.getElementType()) {
			return getGEFWrapper(new RolEntidadesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DatawebElementTypes.PaginaPantallaEntidad_4009 == req.getElementType()) {
			return getGEFWrapper(new PaginaPantallaEntidadCreateCommand(req, req.getSource(), req.getTarget()));
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
		case EntidadEntidadRefereenciadaEditPart.VISUAL_ID:
			return getGEFWrapper(new EntidadEntidadRefereenciadaReorientCommand(req));
		case EntidadUsuariosEditPart.VISUAL_ID:
			return getGEFWrapper(new EntidadUsuariosReorientCommand(req));
		case RolEntidadesEditPart.VISUAL_ID:
			return getGEFWrapper(new RolEntidadesReorientCommand(req));
		case PaginaPantallaEntidadEditPart.VISUAL_ID:
			return getGEFWrapper(new PaginaPantallaEntidadReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
