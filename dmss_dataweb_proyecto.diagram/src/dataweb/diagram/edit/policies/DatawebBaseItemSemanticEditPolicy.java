/*
 * 
 */
package dataweb.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import dataweb.Entidad;
import dataweb.PaginaPantalla;
import dataweb.Pregunta;
import dataweb.RedSocial;
import dataweb.Respuesta;
import dataweb.Rol;
import dataweb.diagram.part.DatawebDiagramEditorPlugin;
import dataweb.diagram.part.DatawebVisualIDRegistry;
import dataweb.diagram.providers.DatawebElementTypes;

/**
 * @generated
 */
public class DatawebBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	* Extended request data key to hold editpart visual id.
	* @generated
	*/
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	* @generated
	*/
	private final IElementType myElementType;

	/**
	* @generated
	*/
	protected DatawebBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	* Extended request data key to hold editpart visual id.
	* Add visual id of edited editpart to extended data of the request
	* so command switch can decide what kind of diagram element is being edited.
	* It is done in those cases when it's not possible to deduce diagram
	* element kind from domain element.
	* 
	* @generated
	*/
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof View) {
				Integer id = new Integer(DatawebVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	* Returns visual id from request parameters.
	* @generated
	*/
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest, semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	* @generated
	*/
	protected Command addDeleteViewCommand(Command mainCommand, DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand.chain(deleteViewCommand);
	}

	/**
	* @generated
	*/
	private Command getEditHelperCommand(IEditCommandRequest request, Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy
					? ((ICommandProxy) editPolicyCommand).getICommand()
					: new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(), command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	* @generated
	*/
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = DatawebElementTypes.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType : myElementType;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	* @generated
	*/
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	* Returns editing domain from the host edit part.
	* @generated
	*/
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	* Clean all shortcuts to the host element from the same diagram
	* @generated
	*/
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() //$NON-NLS-1$
					|| nextView.getElement() != view.getElement()) {
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	* @generated
	*/
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = DatawebDiagramEditorPlugin.getInstance().getLinkConstraints();
		if (cached == null) {
			DatawebDiagramEditorPlugin.getInstance().setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		* @generated
		*/
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateEntidadEntidadRefereenciada_4001(Entidad source, Entidad target) {
			if (source != null) {
				if (source.getEntidadRefereenciada().contains(target)) {
					return false;
				}
			}

			return canExistEntidadEntidadRefereenciada_4001(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEntidadUsuarios_4002(Entidad source, Rol target) {
			if (source != null) {
				if (source.getUsuarios().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getEntidades().contains(target))) {
				return false;
			}

			return canExistEntidadUsuarios_4002(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePreguntaRcorrecta_4003(Pregunta source, Respuesta target) {
			if (source != null) {
				if (source.getRcorrecta() != null) {
					return false;
				}
			}

			return canExistPreguntaRcorrecta_4003(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRolEntidades_4004(Rol source, Entidad target) {
			if (source != null) {
				if (source.getEntidades().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getUsuarios().contains(target))) {
				return false;
			}

			return canExistRolEntidades_4004(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRolAccesoapaginapantalla_4005(Rol source, PaginaPantalla target) {
			if (source != null) {
				if (source.getAccesoapaginapantalla().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getUsuario().contains(target))) {
				return false;
			}

			return canExistRolAccesoapaginapantalla_4005(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRedSocialPaginapantalla_4006(RedSocial source, PaginaPantalla target) {
			if (source != null) {
				if (source.getPaginapantalla().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getRedsocial().contains(target))) {
				return false;
			}

			return canExistRedSocialPaginapantalla_4006(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePaginaPantallaUsuario_4007(PaginaPantalla source, Rol target) {
			if (source != null) {
				if (source.getUsuario().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getAccesoapaginapantalla().contains(target))) {
				return false;
			}

			return canExistPaginaPantallaUsuario_4007(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePaginaPantallaRedsocial_4008(PaginaPantalla source, RedSocial target) {
			if (source != null) {
				if (source.getRedsocial().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getPaginapantalla().contains(target))) {
				return false;
			}

			return canExistPaginaPantallaRedsocial_4008(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePaginaPantallaEntidad_4009(PaginaPantalla source, Entidad target) {
			if (source != null) {
				if (source.getEntidad() != null) {
					return false;
				}
			}

			return canExistPaginaPantallaEntidad_4009(source, target);
		}

		/**
		* @generated
		*/
		public boolean canExistEntidadEntidadRefereenciada_4001(Entidad source, Entidad target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistEntidadUsuarios_4002(Entidad source, Rol target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistPreguntaRcorrecta_4003(Pregunta source, Respuesta target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistRolEntidades_4004(Rol source, Entidad target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistRolAccesoapaginapantalla_4005(Rol source, PaginaPantalla target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistRedSocialPaginapantalla_4006(RedSocial source, PaginaPantalla target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistPaginaPantallaUsuario_4007(PaginaPantalla source, Rol target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistPaginaPantallaRedsocial_4008(PaginaPantalla source, RedSocial target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistPaginaPantallaEntidad_4009(PaginaPantalla source, Entidad target) {
			return true;
		}
	}

}
