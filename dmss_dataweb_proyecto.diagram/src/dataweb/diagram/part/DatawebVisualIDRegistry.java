/*
* 
*/
package dataweb.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import dataweb.Aplicacion;
import dataweb.DatawebPackage;
import dataweb.diagram.edit.parts.ActualizacionInstanciaEditPart;
import dataweb.diagram.edit.parts.ActualizacionInstanciaNombreEditPart;
import dataweb.diagram.edit.parts.AplicacionEditPart;
import dataweb.diagram.edit.parts.AtributoEditPart;
import dataweb.diagram.edit.parts.AtributoNombreEditPart;
import dataweb.diagram.edit.parts.BaseDatosBaseDatosTablasCompartmentEditPart;
import dataweb.diagram.edit.parts.BaseDatosEditPart;
import dataweb.diagram.edit.parts.BaseDatosNombreEditPart;
import dataweb.diagram.edit.parts.BorradoInstanciaEditPart;
import dataweb.diagram.edit.parts.BorradoInstanciaNombreEditPart;
import dataweb.diagram.edit.parts.CRUDEditPart;
import dataweb.diagram.edit.parts.CRUDNombreEditPart;
import dataweb.diagram.edit.parts.ContenidoMultimediaEditPart;
import dataweb.diagram.edit.parts.ContenidoMultimediaTipoEditPart;
import dataweb.diagram.edit.parts.CrearInstanciaEditPart;
import dataweb.diagram.edit.parts.CrearInstanciaNombreEditPart;
import dataweb.diagram.edit.parts.CuestionarioCuestionarioPreguntasCCompartmentEditPart;
import dataweb.diagram.edit.parts.CuestionarioEditPart;
import dataweb.diagram.edit.parts.CuestionarioNombreEditPart;
import dataweb.diagram.edit.parts.DetallesInstanciaEditPart;
import dataweb.diagram.edit.parts.DetallesInstanciaNombreEditPart;
import dataweb.diagram.edit.parts.EncuestaDescripcionEditPart;
import dataweb.diagram.edit.parts.EncuestaEditPart;
import dataweb.diagram.edit.parts.EncuestaEncuestaPreguntasECompartmentEditPart;
import dataweb.diagram.edit.parts.EntidadEditPart;
import dataweb.diagram.edit.parts.EntidadEntidadAtributosCompartmentEditPart;
import dataweb.diagram.edit.parts.EntidadEntidadRefereenciadaEditPart;
import dataweb.diagram.edit.parts.EntidadNombreEditPart;
import dataweb.diagram.edit.parts.EntidadUsuariosEditPart;
import dataweb.diagram.edit.parts.IndexEditPart;
import dataweb.diagram.edit.parts.IndexNombreEditPart;
import dataweb.diagram.edit.parts.IndiceDetalleEditPart;
import dataweb.diagram.edit.parts.IndiceDetalleNombreEditPart;
import dataweb.diagram.edit.parts.IndiceEntidadEditPart;
import dataweb.diagram.edit.parts.IndiceEntidadNombreEditPart;
import dataweb.diagram.edit.parts.IndiceExtendidoEditPart;
import dataweb.diagram.edit.parts.IndiceExtendidoNombreEditPart;
import dataweb.diagram.edit.parts.NormalContenidoEditPart;
import dataweb.diagram.edit.parts.NormalEditPart;
import dataweb.diagram.edit.parts.NormalNormalContenidomultimediaCompartmentEditPart;
import dataweb.diagram.edit.parts.PaginaPantallaEntidadEditPart;
import dataweb.diagram.edit.parts.PaginaPantallaRedsocialEditPart;
import dataweb.diagram.edit.parts.PaginaPantallaUsuarioEditPart;
import dataweb.diagram.edit.parts.Pregunta2EditPart;
import dataweb.diagram.edit.parts.PreguntaEditPart;
import dataweb.diagram.edit.parts.PreguntaPreguntaRespuestasCompartment2EditPart;
import dataweb.diagram.edit.parts.PreguntaPreguntaRespuestasCompartmentEditPart;
import dataweb.diagram.edit.parts.PreguntaRcorrectaEditPart;
import dataweb.diagram.edit.parts.PreguntaTexto2EditPart;
import dataweb.diagram.edit.parts.PreguntaTextoEditPart;
import dataweb.diagram.edit.parts.RedSocialEditPart;
import dataweb.diagram.edit.parts.RedSocialNombreEditPart;
import dataweb.diagram.edit.parts.RedSocialPaginapantallaEditPart;
import dataweb.diagram.edit.parts.RespuestaEditPart;
import dataweb.diagram.edit.parts.RespuestaTextoEditPart;
import dataweb.diagram.edit.parts.RolAccesoapaginapantallaEditPart;
import dataweb.diagram.edit.parts.RolEditPart;
import dataweb.diagram.edit.parts.RolEntidadesEditPart;
import dataweb.diagram.edit.parts.RolNombreEditPart;
import dataweb.diagram.edit.parts.WrappingLabel2EditPart;
import dataweb.diagram.edit.parts.WrappingLabel3EditPart;
import dataweb.diagram.edit.parts.WrappingLabel4EditPart;
import dataweb.diagram.edit.parts.WrappingLabel5EditPart;
import dataweb.diagram.edit.parts.WrappingLabel6EditPart;
import dataweb.diagram.edit.parts.WrappingLabel7EditPart;
import dataweb.diagram.edit.parts.WrappingLabel8EditPart;
import dataweb.diagram.edit.parts.WrappingLabel9EditPart;
import dataweb.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DatawebVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "dmss_dataweb_proyecto.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (AplicacionEditPart.MODEL_ID.equals(view.getType())) {
				return AplicacionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return dataweb.diagram.part.DatawebVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				DatawebDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DatawebPackage.eINSTANCE.getAplicacion().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Aplicacion) domainElement)) {
			return AplicacionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = dataweb.diagram.part.DatawebVisualIDRegistry.getModelID(containerView);
		if (!AplicacionEditPart.MODEL_ID.equals(containerModelID) && !"dataweb".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (AplicacionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dataweb.diagram.part.DatawebVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = AplicacionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case AplicacionEditPart.VISUAL_ID:
			if (DatawebPackage.eINSTANCE.getIndiceExtendido().isSuperTypeOf(domainElement.eClass())) {
				return IndiceExtendidoEditPart.VISUAL_ID;
			}
			if (DatawebPackage.eINSTANCE.getIndiceEntidad().isSuperTypeOf(domainElement.eClass())) {
				return IndiceEntidadEditPart.VISUAL_ID;
			}
			if (DatawebPackage.eINSTANCE.getIndiceDetalle().isSuperTypeOf(domainElement.eClass())) {
				return IndiceDetalleEditPart.VISUAL_ID;
			}
			if (DatawebPackage.eINSTANCE.getCrearInstancia().isSuperTypeOf(domainElement.eClass())) {
				return CrearInstanciaEditPart.VISUAL_ID;
			}
			if (DatawebPackage.eINSTANCE.getDetallesInstancia().isSuperTypeOf(domainElement.eClass())) {
				return DetallesInstanciaEditPart.VISUAL_ID;
			}
			if (DatawebPackage.eINSTANCE.getActualizacionInstancia().isSuperTypeOf(domainElement.eClass())) {
				return ActualizacionInstanciaEditPart.VISUAL_ID;
			}
			if (DatawebPackage.eINSTANCE.getBorradoInstancia().isSuperTypeOf(domainElement.eClass())) {
				return BorradoInstanciaEditPart.VISUAL_ID;
			}
			if (DatawebPackage.eINSTANCE.getCuestionario().isSuperTypeOf(domainElement.eClass())) {
				return CuestionarioEditPart.VISUAL_ID;
			}
			if (DatawebPackage.eINSTANCE.getEncuesta().isSuperTypeOf(domainElement.eClass())) {
				return EncuestaEditPart.VISUAL_ID;
			}
			if (DatawebPackage.eINSTANCE.getCRUD().isSuperTypeOf(domainElement.eClass())) {
				return CRUDEditPart.VISUAL_ID;
			}
			if (DatawebPackage.eINSTANCE.getNormal().isSuperTypeOf(domainElement.eClass())) {
				return NormalEditPart.VISUAL_ID;
			}
			if (DatawebPackage.eINSTANCE.getIndex().isSuperTypeOf(domainElement.eClass())) {
				return IndexEditPart.VISUAL_ID;
			}
			if (DatawebPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return RolEditPart.VISUAL_ID;
			}
			if (DatawebPackage.eINSTANCE.getRedSocial().isSuperTypeOf(domainElement.eClass())) {
				return RedSocialEditPart.VISUAL_ID;
			}
			if (DatawebPackage.eINSTANCE.getBaseDatos().isSuperTypeOf(domainElement.eClass())) {
				return BaseDatosEditPart.VISUAL_ID;
			}
			break;
		case CuestionarioCuestionarioPreguntasCCompartmentEditPart.VISUAL_ID:
			if (DatawebPackage.eINSTANCE.getPregunta().isSuperTypeOf(domainElement.eClass())) {
				return PreguntaEditPart.VISUAL_ID;
			}
			break;
		case PreguntaPreguntaRespuestasCompartmentEditPart.VISUAL_ID:
			if (DatawebPackage.eINSTANCE.getRespuesta().isSuperTypeOf(domainElement.eClass())) {
				return RespuestaEditPart.VISUAL_ID;
			}
			break;
		case EncuestaEncuestaPreguntasECompartmentEditPart.VISUAL_ID:
			if (DatawebPackage.eINSTANCE.getPregunta().isSuperTypeOf(domainElement.eClass())) {
				return Pregunta2EditPart.VISUAL_ID;
			}
			break;
		case PreguntaPreguntaRespuestasCompartment2EditPart.VISUAL_ID:
			if (DatawebPackage.eINSTANCE.getRespuesta().isSuperTypeOf(domainElement.eClass())) {
				return RespuestaEditPart.VISUAL_ID;
			}
			break;
		case NormalNormalContenidomultimediaCompartmentEditPart.VISUAL_ID:
			if (DatawebPackage.eINSTANCE.getContenidoMultimedia().isSuperTypeOf(domainElement.eClass())) {
				return ContenidoMultimediaEditPart.VISUAL_ID;
			}
			break;
		case BaseDatosBaseDatosTablasCompartmentEditPart.VISUAL_ID:
			if (DatawebPackage.eINSTANCE.getEntidad().isSuperTypeOf(domainElement.eClass())) {
				return EntidadEditPart.VISUAL_ID;
			}
			break;
		case EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID:
			if (DatawebPackage.eINSTANCE.getAtributo().isSuperTypeOf(domainElement.eClass())) {
				return AtributoEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = dataweb.diagram.part.DatawebVisualIDRegistry.getModelID(containerView);
		if (!AplicacionEditPart.MODEL_ID.equals(containerModelID) && !"dataweb".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (AplicacionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dataweb.diagram.part.DatawebVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = AplicacionEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case AplicacionEditPart.VISUAL_ID:
			if (IndiceExtendidoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndiceEntidadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndiceDetalleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CrearInstanciaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetallesInstanciaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActualizacionInstanciaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorradoInstanciaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CuestionarioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EncuestaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CRUDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NormalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RedSocialEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BaseDatosEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndiceExtendidoEditPart.VISUAL_ID:
			if (IndiceExtendidoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndiceEntidadEditPart.VISUAL_ID:
			if (IndiceEntidadNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndiceDetalleEditPart.VISUAL_ID:
			if (IndiceDetalleNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CrearInstanciaEditPart.VISUAL_ID:
			if (CrearInstanciaNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetallesInstanciaEditPart.VISUAL_ID:
			if (DetallesInstanciaNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActualizacionInstanciaEditPart.VISUAL_ID:
			if (ActualizacionInstanciaNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BorradoInstanciaEditPart.VISUAL_ID:
			if (BorradoInstanciaNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CuestionarioEditPart.VISUAL_ID:
			if (CuestionarioNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CuestionarioCuestionarioPreguntasCCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EncuestaEditPart.VISUAL_ID:
			if (EncuestaDescripcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EncuestaEncuestaPreguntasECompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CRUDEditPart.VISUAL_ID:
			if (CRUDNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NormalEditPart.VISUAL_ID:
			if (NormalContenidoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NormalNormalContenidomultimediaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexEditPart.VISUAL_ID:
			if (IndexNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RolEditPart.VISUAL_ID:
			if (RolNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RedSocialEditPart.VISUAL_ID:
			if (RedSocialNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BaseDatosEditPart.VISUAL_ID:
			if (BaseDatosNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BaseDatosBaseDatosTablasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PreguntaEditPart.VISUAL_ID:
			if (PreguntaTextoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PreguntaPreguntaRespuestasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RespuestaEditPart.VISUAL_ID:
			if (RespuestaTextoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pregunta2EditPart.VISUAL_ID:
			if (PreguntaTexto2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PreguntaPreguntaRespuestasCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContenidoMultimediaEditPart.VISUAL_ID:
			if (ContenidoMultimediaTipoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntidadEditPart.VISUAL_ID:
			if (EntidadNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoEditPart.VISUAL_ID:
			if (AtributoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CuestionarioCuestionarioPreguntasCCompartmentEditPart.VISUAL_ID:
			if (PreguntaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PreguntaPreguntaRespuestasCompartmentEditPart.VISUAL_ID:
			if (RespuestaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EncuestaEncuestaPreguntasECompartmentEditPart.VISUAL_ID:
			if (Pregunta2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PreguntaPreguntaRespuestasCompartment2EditPart.VISUAL_ID:
			if (RespuestaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NormalNormalContenidomultimediaCompartmentEditPart.VISUAL_ID:
			if (ContenidoMultimediaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BaseDatosBaseDatosTablasCompartmentEditPart.VISUAL_ID:
			if (EntidadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID:
			if (AtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntidadEntidadRefereenciadaEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntidadUsuariosEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PreguntaRcorrectaEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RolEntidadesEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RolAccesoapaginapantallaEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RedSocialPaginapantallaEditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PaginaPantallaUsuarioEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PaginaPantallaRedsocialEditPart.VISUAL_ID:
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PaginaPantallaEntidadEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Aplicacion element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case CuestionarioCuestionarioPreguntasCCompartmentEditPart.VISUAL_ID:
		case PreguntaPreguntaRespuestasCompartmentEditPart.VISUAL_ID:
		case EncuestaEncuestaPreguntasECompartmentEditPart.VISUAL_ID:
		case PreguntaPreguntaRespuestasCompartment2EditPart.VISUAL_ID:
		case NormalNormalContenidomultimediaCompartmentEditPart.VISUAL_ID:
		case BaseDatosBaseDatosTablasCompartmentEditPart.VISUAL_ID:
		case EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case AplicacionEditPart.VISUAL_ID:
			return false;
		case IndiceExtendidoEditPart.VISUAL_ID:
		case IndiceEntidadEditPart.VISUAL_ID:
		case IndiceDetalleEditPart.VISUAL_ID:
		case CrearInstanciaEditPart.VISUAL_ID:
		case DetallesInstanciaEditPart.VISUAL_ID:
		case ActualizacionInstanciaEditPart.VISUAL_ID:
		case BorradoInstanciaEditPart.VISUAL_ID:
		case CRUDEditPart.VISUAL_ID:
		case IndexEditPart.VISUAL_ID:
		case RolEditPart.VISUAL_ID:
		case RedSocialEditPart.VISUAL_ID:
		case RespuestaEditPart.VISUAL_ID:
		case ContenidoMultimediaEditPart.VISUAL_ID:
		case AtributoEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return dataweb.diagram.part.DatawebVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return dataweb.diagram.part.DatawebVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return dataweb.diagram.part.DatawebVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return dataweb.diagram.part.DatawebVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return dataweb.diagram.part.DatawebVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return dataweb.diagram.part.DatawebVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
