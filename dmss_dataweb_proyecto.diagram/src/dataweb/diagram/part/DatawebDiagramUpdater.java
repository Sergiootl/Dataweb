/*
* 
*/
package dataweb.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import dataweb.ActualizacionInstancia;
import dataweb.Aplicacion;
import dataweb.Atributo;
import dataweb.BaseDatos;
import dataweb.BorradoInstancia;
import dataweb.ContenidoMultimedia;
import dataweb.CrearInstancia;
import dataweb.Cuestionario;
import dataweb.DatawebPackage;
import dataweb.DetallesInstancia;
import dataweb.Encuesta;
import dataweb.Entidad;
import dataweb.Index;
import dataweb.IndiceDetalle;
import dataweb.IndiceEntidad;
import dataweb.IndiceExtendido;
import dataweb.Normal;
import dataweb.PaginaPantalla;
import dataweb.Pregunta;
import dataweb.RedSocial;
import dataweb.Respuesta;
import dataweb.Rol;
import dataweb.diagram.edit.parts.ActualizacionInstanciaEditPart;
import dataweb.diagram.edit.parts.AplicacionEditPart;
import dataweb.diagram.edit.parts.AtributoEditPart;
import dataweb.diagram.edit.parts.BaseDatosBaseDatosTablasCompartmentEditPart;
import dataweb.diagram.edit.parts.BaseDatosEditPart;
import dataweb.diagram.edit.parts.BorradoInstanciaEditPart;
import dataweb.diagram.edit.parts.CRUDEditPart;
import dataweb.diagram.edit.parts.ContenidoMultimediaEditPart;
import dataweb.diagram.edit.parts.CrearInstanciaEditPart;
import dataweb.diagram.edit.parts.CuestionarioCuestionarioPreguntasCCompartmentEditPart;
import dataweb.diagram.edit.parts.CuestionarioEditPart;
import dataweb.diagram.edit.parts.DetallesInstanciaEditPart;
import dataweb.diagram.edit.parts.EncuestaEditPart;
import dataweb.diagram.edit.parts.EncuestaEncuestaPreguntasECompartmentEditPart;
import dataweb.diagram.edit.parts.EntidadEditPart;
import dataweb.diagram.edit.parts.EntidadEntidadAtributosCompartmentEditPart;
import dataweb.diagram.edit.parts.EntidadEntidadRefereenciadaEditPart;
import dataweb.diagram.edit.parts.EntidadUsuariosEditPart;
import dataweb.diagram.edit.parts.IndexEditPart;
import dataweb.diagram.edit.parts.IndiceDetalleEditPart;
import dataweb.diagram.edit.parts.IndiceEntidadEditPart;
import dataweb.diagram.edit.parts.IndiceExtendidoEditPart;
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
import dataweb.diagram.edit.parts.RedSocialEditPart;
import dataweb.diagram.edit.parts.RedSocialPaginapantallaEditPart;
import dataweb.diagram.edit.parts.RespuestaEditPart;
import dataweb.diagram.edit.parts.RolAccesoapaginapantallaEditPart;
import dataweb.diagram.edit.parts.RolEditPart;
import dataweb.diagram.edit.parts.RolEntidadesEditPart;
import dataweb.diagram.providers.DatawebElementTypes;

/**
 * @generated
 */
public class DatawebDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<DatawebNodeDescriptor> getSemanticChildren(View view) {
		switch (DatawebVisualIDRegistry.getVisualID(view)) {
		case AplicacionEditPart.VISUAL_ID:
			return getAplicacion_1000SemanticChildren(view);
		case CuestionarioCuestionarioPreguntasCCompartmentEditPart.VISUAL_ID:
			return getCuestionarioCuestionarioPreguntasCCompartment_7001SemanticChildren(view);
		case PreguntaPreguntaRespuestasCompartmentEditPart.VISUAL_ID:
			return getPreguntaPreguntaRespuestasCompartment_7002SemanticChildren(view);
		case EncuestaEncuestaPreguntasECompartmentEditPart.VISUAL_ID:
			return getEncuestaEncuestaPreguntasECompartment_7003SemanticChildren(view);
		case PreguntaPreguntaRespuestasCompartment2EditPart.VISUAL_ID:
			return getPreguntaPreguntaRespuestasCompartment_7004SemanticChildren(view);
		case NormalNormalContenidomultimediaCompartmentEditPart.VISUAL_ID:
			return getNormalNormalContenidomultimediaCompartment_7005SemanticChildren(view);
		case BaseDatosBaseDatosTablasCompartmentEditPart.VISUAL_ID:
			return getBaseDatosBaseDatosTablasCompartment_7006SemanticChildren(view);
		case EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID:
			return getEntidadEntidadAtributosCompartment_7007SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DatawebNodeDescriptor> getAplicacion_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Aplicacion modelElement = (Aplicacion) view.getElement();
		LinkedList<DatawebNodeDescriptor> result = new LinkedList<DatawebNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPaginapantallas().iterator(); it.hasNext();) {
			PaginaPantalla childElement = (PaginaPantalla) it.next();
			int visualID = DatawebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IndiceExtendidoEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IndiceEntidadEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IndiceDetalleEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CrearInstanciaEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DetallesInstanciaEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActualizacionInstanciaEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BorradoInstanciaEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CuestionarioEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EncuestaEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CRUDEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NormalEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IndexEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			Rol childElement = (Rol) it.next();
			int visualID = DatawebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RolEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRedessociales().iterator(); it.hasNext();) {
			RedSocial childElement = (RedSocial) it.next();
			int visualID = DatawebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RedSocialEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getBasedatos().iterator(); it.hasNext();) {
			BaseDatos childElement = (BaseDatos) it.next();
			int visualID = DatawebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == BaseDatosEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DatawebNodeDescriptor> getCuestionarioCuestionarioPreguntasCCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Cuestionario modelElement = (Cuestionario) containerView.getElement();
		LinkedList<DatawebNodeDescriptor> result = new LinkedList<DatawebNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPreguntasC().iterator(); it.hasNext();) {
			Pregunta childElement = (Pregunta) it.next();
			int visualID = DatawebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PreguntaEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DatawebNodeDescriptor> getPreguntaPreguntaRespuestasCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Pregunta modelElement = (Pregunta) containerView.getElement();
		LinkedList<DatawebNodeDescriptor> result = new LinkedList<DatawebNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRespuestas().iterator(); it.hasNext();) {
			Respuesta childElement = (Respuesta) it.next();
			int visualID = DatawebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RespuestaEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DatawebNodeDescriptor> getEncuestaEncuestaPreguntasECompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Encuesta modelElement = (Encuesta) containerView.getElement();
		LinkedList<DatawebNodeDescriptor> result = new LinkedList<DatawebNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPreguntasE().iterator(); it.hasNext();) {
			Pregunta childElement = (Pregunta) it.next();
			int visualID = DatawebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Pregunta2EditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DatawebNodeDescriptor> getPreguntaPreguntaRespuestasCompartment_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Pregunta modelElement = (Pregunta) containerView.getElement();
		LinkedList<DatawebNodeDescriptor> result = new LinkedList<DatawebNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRespuestas().iterator(); it.hasNext();) {
			Respuesta childElement = (Respuesta) it.next();
			int visualID = DatawebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RespuestaEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DatawebNodeDescriptor> getNormalNormalContenidomultimediaCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Normal modelElement = (Normal) containerView.getElement();
		LinkedList<DatawebNodeDescriptor> result = new LinkedList<DatawebNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContenidomultimedia().iterator(); it.hasNext();) {
			ContenidoMultimedia childElement = (ContenidoMultimedia) it.next();
			int visualID = DatawebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ContenidoMultimediaEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DatawebNodeDescriptor> getBaseDatosBaseDatosTablasCompartment_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BaseDatos modelElement = (BaseDatos) containerView.getElement();
		LinkedList<DatawebNodeDescriptor> result = new LinkedList<DatawebNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTablas().iterator(); it.hasNext();) {
			Entidad childElement = (Entidad) it.next();
			int visualID = DatawebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EntidadEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DatawebNodeDescriptor> getEntidadEntidadAtributosCompartment_7007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Entidad modelElement = (Entidad) containerView.getElement();
		LinkedList<DatawebNodeDescriptor> result = new LinkedList<DatawebNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = DatawebVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AtributoEditPart.VISUAL_ID) {
				result.add(new DatawebNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DatawebLinkDescriptor> getContainedLinks(View view) {
		switch (DatawebVisualIDRegistry.getVisualID(view)) {
		case AplicacionEditPart.VISUAL_ID:
			return getAplicacion_1000ContainedLinks(view);
		case IndiceExtendidoEditPart.VISUAL_ID:
			return getIndiceExtendido_2001ContainedLinks(view);
		case IndiceEntidadEditPart.VISUAL_ID:
			return getIndiceEntidad_2002ContainedLinks(view);
		case IndiceDetalleEditPart.VISUAL_ID:
			return getIndiceDetalle_2003ContainedLinks(view);
		case CrearInstanciaEditPart.VISUAL_ID:
			return getCrearInstancia_2004ContainedLinks(view);
		case DetallesInstanciaEditPart.VISUAL_ID:
			return getDetallesInstancia_2005ContainedLinks(view);
		case ActualizacionInstanciaEditPart.VISUAL_ID:
			return getActualizacionInstancia_2006ContainedLinks(view);
		case BorradoInstanciaEditPart.VISUAL_ID:
			return getBorradoInstancia_2007ContainedLinks(view);
		case CuestionarioEditPart.VISUAL_ID:
			return getCuestionario_2008ContainedLinks(view);
		case EncuestaEditPart.VISUAL_ID:
			return getEncuesta_2009ContainedLinks(view);
		case CRUDEditPart.VISUAL_ID:
			return getCRUD_2010ContainedLinks(view);
		case NormalEditPart.VISUAL_ID:
			return getNormal_2011ContainedLinks(view);
		case IndexEditPart.VISUAL_ID:
			return getIndex_2012ContainedLinks(view);
		case RolEditPart.VISUAL_ID:
			return getRol_2013ContainedLinks(view);
		case RedSocialEditPart.VISUAL_ID:
			return getRedSocial_2014ContainedLinks(view);
		case BaseDatosEditPart.VISUAL_ID:
			return getBaseDatos_2015ContainedLinks(view);
		case PreguntaEditPart.VISUAL_ID:
			return getPregunta_3001ContainedLinks(view);
		case RespuestaEditPart.VISUAL_ID:
			return getRespuesta_3002ContainedLinks(view);
		case Pregunta2EditPart.VISUAL_ID:
			return getPregunta_3003ContainedLinks(view);
		case ContenidoMultimediaEditPart.VISUAL_ID:
			return getContenidoMultimedia_3004ContainedLinks(view);
		case EntidadEditPart.VISUAL_ID:
			return getEntidad_3005ContainedLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_3006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DatawebLinkDescriptor> getIncomingLinks(View view) {
		switch (DatawebVisualIDRegistry.getVisualID(view)) {
		case IndiceExtendidoEditPart.VISUAL_ID:
			return getIndiceExtendido_2001IncomingLinks(view);
		case IndiceEntidadEditPart.VISUAL_ID:
			return getIndiceEntidad_2002IncomingLinks(view);
		case IndiceDetalleEditPart.VISUAL_ID:
			return getIndiceDetalle_2003IncomingLinks(view);
		case CrearInstanciaEditPart.VISUAL_ID:
			return getCrearInstancia_2004IncomingLinks(view);
		case DetallesInstanciaEditPart.VISUAL_ID:
			return getDetallesInstancia_2005IncomingLinks(view);
		case ActualizacionInstanciaEditPart.VISUAL_ID:
			return getActualizacionInstancia_2006IncomingLinks(view);
		case BorradoInstanciaEditPart.VISUAL_ID:
			return getBorradoInstancia_2007IncomingLinks(view);
		case CuestionarioEditPart.VISUAL_ID:
			return getCuestionario_2008IncomingLinks(view);
		case EncuestaEditPart.VISUAL_ID:
			return getEncuesta_2009IncomingLinks(view);
		case CRUDEditPart.VISUAL_ID:
			return getCRUD_2010IncomingLinks(view);
		case NormalEditPart.VISUAL_ID:
			return getNormal_2011IncomingLinks(view);
		case IndexEditPart.VISUAL_ID:
			return getIndex_2012IncomingLinks(view);
		case RolEditPart.VISUAL_ID:
			return getRol_2013IncomingLinks(view);
		case RedSocialEditPart.VISUAL_ID:
			return getRedSocial_2014IncomingLinks(view);
		case BaseDatosEditPart.VISUAL_ID:
			return getBaseDatos_2015IncomingLinks(view);
		case PreguntaEditPart.VISUAL_ID:
			return getPregunta_3001IncomingLinks(view);
		case RespuestaEditPart.VISUAL_ID:
			return getRespuesta_3002IncomingLinks(view);
		case Pregunta2EditPart.VISUAL_ID:
			return getPregunta_3003IncomingLinks(view);
		case ContenidoMultimediaEditPart.VISUAL_ID:
			return getContenidoMultimedia_3004IncomingLinks(view);
		case EntidadEditPart.VISUAL_ID:
			return getEntidad_3005IncomingLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_3006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DatawebLinkDescriptor> getOutgoingLinks(View view) {
		switch (DatawebVisualIDRegistry.getVisualID(view)) {
		case IndiceExtendidoEditPart.VISUAL_ID:
			return getIndiceExtendido_2001OutgoingLinks(view);
		case IndiceEntidadEditPart.VISUAL_ID:
			return getIndiceEntidad_2002OutgoingLinks(view);
		case IndiceDetalleEditPart.VISUAL_ID:
			return getIndiceDetalle_2003OutgoingLinks(view);
		case CrearInstanciaEditPart.VISUAL_ID:
			return getCrearInstancia_2004OutgoingLinks(view);
		case DetallesInstanciaEditPart.VISUAL_ID:
			return getDetallesInstancia_2005OutgoingLinks(view);
		case ActualizacionInstanciaEditPart.VISUAL_ID:
			return getActualizacionInstancia_2006OutgoingLinks(view);
		case BorradoInstanciaEditPart.VISUAL_ID:
			return getBorradoInstancia_2007OutgoingLinks(view);
		case CuestionarioEditPart.VISUAL_ID:
			return getCuestionario_2008OutgoingLinks(view);
		case EncuestaEditPart.VISUAL_ID:
			return getEncuesta_2009OutgoingLinks(view);
		case CRUDEditPart.VISUAL_ID:
			return getCRUD_2010OutgoingLinks(view);
		case NormalEditPart.VISUAL_ID:
			return getNormal_2011OutgoingLinks(view);
		case IndexEditPart.VISUAL_ID:
			return getIndex_2012OutgoingLinks(view);
		case RolEditPart.VISUAL_ID:
			return getRol_2013OutgoingLinks(view);
		case RedSocialEditPart.VISUAL_ID:
			return getRedSocial_2014OutgoingLinks(view);
		case BaseDatosEditPart.VISUAL_ID:
			return getBaseDatos_2015OutgoingLinks(view);
		case PreguntaEditPart.VISUAL_ID:
			return getPregunta_3001OutgoingLinks(view);
		case RespuestaEditPart.VISUAL_ID:
			return getRespuesta_3002OutgoingLinks(view);
		case Pregunta2EditPart.VISUAL_ID:
			return getPregunta_3003OutgoingLinks(view);
		case ContenidoMultimediaEditPart.VISUAL_ID:
			return getContenidoMultimedia_3004OutgoingLinks(view);
		case EntidadEditPart.VISUAL_ID:
			return getEntidad_3005OutgoingLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_3006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getAplicacion_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getIndiceExtendido_2001ContainedLinks(View view) {
		IndiceExtendido modelElement = (IndiceExtendido) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getIndiceEntidad_2002ContainedLinks(View view) {
		IndiceEntidad modelElement = (IndiceEntidad) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getIndiceDetalle_2003ContainedLinks(View view) {
		IndiceDetalle modelElement = (IndiceDetalle) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getCrearInstancia_2004ContainedLinks(View view) {
		CrearInstancia modelElement = (CrearInstancia) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getDetallesInstancia_2005ContainedLinks(View view) {
		DetallesInstancia modelElement = (DetallesInstancia) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getActualizacionInstancia_2006ContainedLinks(View view) {
		ActualizacionInstancia modelElement = (ActualizacionInstancia) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getBorradoInstancia_2007ContainedLinks(View view) {
		BorradoInstancia modelElement = (BorradoInstancia) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getCuestionario_2008ContainedLinks(View view) {
		Cuestionario modelElement = (Cuestionario) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getEncuesta_2009ContainedLinks(View view) {
		Encuesta modelElement = (Encuesta) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getCRUD_2010ContainedLinks(View view) {
		dataweb.CRUD modelElement = (dataweb.CRUD) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getNormal_2011ContainedLinks(View view) {
		Normal modelElement = (Normal) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getIndex_2012ContainedLinks(View view) {
		Index modelElement = (Index) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getRol_2013ContainedLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rol_Entidades_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getRedSocial_2014ContainedLinks(View view) {
		RedSocial modelElement = (RedSocial) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getBaseDatos_2015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getPregunta_3001ContainedLinks(View view) {
		Pregunta modelElement = (Pregunta) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pregunta_Rcorrecta_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getRespuesta_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getPregunta_3003ContainedLinks(View view) {
		Pregunta modelElement = (Pregunta) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pregunta_Rcorrecta_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getContenidoMultimedia_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getEntidad_3005ContainedLinks(View view) {
		Entidad modelElement = (Entidad) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_EntidadRefereenciada_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_Usuarios_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getAtributo_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getIndiceExtendido_2001IncomingLinks(View view) {
		IndiceExtendido modelElement = (IndiceExtendido) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getIndiceEntidad_2002IncomingLinks(View view) {
		IndiceEntidad modelElement = (IndiceEntidad) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getIndiceDetalle_2003IncomingLinks(View view) {
		IndiceDetalle modelElement = (IndiceDetalle) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getCrearInstancia_2004IncomingLinks(View view) {
		CrearInstancia modelElement = (CrearInstancia) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getDetallesInstancia_2005IncomingLinks(View view) {
		DetallesInstancia modelElement = (DetallesInstancia) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getActualizacionInstancia_2006IncomingLinks(View view) {
		ActualizacionInstancia modelElement = (ActualizacionInstancia) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getBorradoInstancia_2007IncomingLinks(View view) {
		BorradoInstancia modelElement = (BorradoInstancia) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getCuestionario_2008IncomingLinks(View view) {
		Cuestionario modelElement = (Cuestionario) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getEncuesta_2009IncomingLinks(View view) {
		Encuesta modelElement = (Encuesta) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getCRUD_2010IncomingLinks(View view) {
		dataweb.CRUD modelElement = (dataweb.CRUD) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getNormal_2011IncomingLinks(View view) {
		Normal modelElement = (Normal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getIndex_2012IncomingLinks(View view) {
		Index modelElement = (Index) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getRol_2013IncomingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Usuarios_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getRedSocial_2014IncomingLinks(View view) {
		RedSocial modelElement = (RedSocial) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getBaseDatos_2015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getPregunta_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getRespuesta_3002IncomingLinks(View view) {
		Respuesta modelElement = (Respuesta) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Pregunta_Rcorrecta_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getPregunta_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getContenidoMultimedia_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getEntidad_3005IncomingLinks(View view) {
		Entidad modelElement = (Entidad) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Entidad_EntidadRefereenciada_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Entidades_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getAtributo_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getIndiceExtendido_2001OutgoingLinks(View view) {
		IndiceExtendido modelElement = (IndiceExtendido) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getIndiceEntidad_2002OutgoingLinks(View view) {
		IndiceEntidad modelElement = (IndiceEntidad) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getIndiceDetalle_2003OutgoingLinks(View view) {
		IndiceDetalle modelElement = (IndiceDetalle) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getCrearInstancia_2004OutgoingLinks(View view) {
		CrearInstancia modelElement = (CrearInstancia) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getDetallesInstancia_2005OutgoingLinks(View view) {
		DetallesInstancia modelElement = (DetallesInstancia) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getActualizacionInstancia_2006OutgoingLinks(View view) {
		ActualizacionInstancia modelElement = (ActualizacionInstancia) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getBorradoInstancia_2007OutgoingLinks(View view) {
		BorradoInstancia modelElement = (BorradoInstancia) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getCuestionario_2008OutgoingLinks(View view) {
		Cuestionario modelElement = (Cuestionario) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getEncuesta_2009OutgoingLinks(View view) {
		Encuesta modelElement = (Encuesta) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getCRUD_2010OutgoingLinks(View view) {
		dataweb.CRUD modelElement = (dataweb.CRUD) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getNormal_2011OutgoingLinks(View view) {
		Normal modelElement = (Normal) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getIndex_2012OutgoingLinks(View view) {
		Index modelElement = (Index) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getRol_2013OutgoingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rol_Entidades_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getRedSocial_2014OutgoingLinks(View view) {
		RedSocial modelElement = (RedSocial) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getBaseDatos_2015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getPregunta_3001OutgoingLinks(View view) {
		Pregunta modelElement = (Pregunta) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pregunta_Rcorrecta_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getRespuesta_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getPregunta_3003OutgoingLinks(View view) {
		Pregunta modelElement = (Pregunta) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pregunta_Rcorrecta_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getContenidoMultimedia_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getEntidad_3005OutgoingLinks(View view) {
		Entidad modelElement = (Entidad) view.getElement();
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_EntidadRefereenciada_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_Usuarios_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatawebLinkDescriptor> getAtributo_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DatawebLinkDescriptor> getIncomingFeatureModelFacetLinks_Entidad_EntidadRefereenciada_4001(
			Entidad target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DatawebPackage.eINSTANCE.getEntidad_EntidadRefereenciada()) {
				result.add(new DatawebLinkDescriptor(setting.getEObject(), target,
						DatawebElementTypes.EntidadEntidadRefereenciada_4001,
						EntidadEntidadRefereenciadaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DatawebLinkDescriptor> getIncomingFeatureModelFacetLinks_Entidad_Usuarios_4002(Rol target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DatawebPackage.eINSTANCE.getEntidad_Usuarios()) {
				result.add(new DatawebLinkDescriptor(setting.getEObject(), target,
						DatawebElementTypes.EntidadUsuarios_4002, EntidadUsuariosEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DatawebLinkDescriptor> getIncomingFeatureModelFacetLinks_Pregunta_Rcorrecta_4003(
			Respuesta target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DatawebPackage.eINSTANCE.getPregunta_Rcorrecta()) {
				result.add(new DatawebLinkDescriptor(setting.getEObject(), target,
						DatawebElementTypes.PreguntaRcorrecta_4003, PreguntaRcorrectaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DatawebLinkDescriptor> getIncomingFeatureModelFacetLinks_Rol_Entidades_4004(
			Entidad target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DatawebPackage.eINSTANCE.getRol_Entidades()) {
				result.add(new DatawebLinkDescriptor(setting.getEObject(), target,
						DatawebElementTypes.RolEntidades_4004, RolEntidadesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DatawebLinkDescriptor> getIncomingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(
			PaginaPantalla target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DatawebPackage.eINSTANCE.getRol_Accesoapaginapantalla()) {
				result.add(new DatawebLinkDescriptor(setting.getEObject(), target,
						DatawebElementTypes.RolAccesoapaginapantalla_4005, RolAccesoapaginapantallaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DatawebLinkDescriptor> getIncomingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(
			PaginaPantalla target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DatawebPackage.eINSTANCE.getRedSocial_Paginapantalla()) {
				result.add(new DatawebLinkDescriptor(setting.getEObject(), target,
						DatawebElementTypes.RedSocialPaginapantalla_4006, RedSocialPaginapantallaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DatawebLinkDescriptor> getIncomingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(
			Rol target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DatawebPackage.eINSTANCE.getPaginaPantalla_Usuario()) {
				result.add(new DatawebLinkDescriptor(setting.getEObject(), target,
						DatawebElementTypes.PaginaPantallaUsuario_4007, PaginaPantallaUsuarioEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DatawebLinkDescriptor> getIncomingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(
			RedSocial target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DatawebPackage.eINSTANCE.getPaginaPantalla_Redsocial()) {
				result.add(new DatawebLinkDescriptor(setting.getEObject(), target,
						DatawebElementTypes.PaginaPantallaRedsocial_4008, PaginaPantallaRedsocialEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DatawebLinkDescriptor> getIncomingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(
			Entidad target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DatawebPackage.eINSTANCE.getPaginaPantalla_Entidad()) {
				result.add(new DatawebLinkDescriptor(setting.getEObject(), target,
						DatawebElementTypes.PaginaPantallaEntidad_4009, PaginaPantallaEntidadEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DatawebLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entidad_EntidadRefereenciada_4001(
			Entidad source) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		for (Iterator<?> destinations = source.getEntidadRefereenciada().iterator(); destinations.hasNext();) {
			Entidad destination = (Entidad) destinations.next();
			result.add(
					new DatawebLinkDescriptor(source, destination, DatawebElementTypes.EntidadEntidadRefereenciada_4001,
							EntidadEntidadRefereenciadaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DatawebLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entidad_Usuarios_4002(
			Entidad source) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		for (Iterator<?> destinations = source.getUsuarios().iterator(); destinations.hasNext();) {
			Rol destination = (Rol) destinations.next();
			result.add(new DatawebLinkDescriptor(source, destination, DatawebElementTypes.EntidadUsuarios_4002,
					EntidadUsuariosEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DatawebLinkDescriptor> getOutgoingFeatureModelFacetLinks_Pregunta_Rcorrecta_4003(
			Pregunta source) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		Respuesta destination = source.getRcorrecta();
		if (destination == null) {
			return result;
		}
		result.add(new DatawebLinkDescriptor(source, destination, DatawebElementTypes.PreguntaRcorrecta_4003,
				PreguntaRcorrectaEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DatawebLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rol_Entidades_4004(Rol source) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		for (Iterator<?> destinations = source.getEntidades().iterator(); destinations.hasNext();) {
			Entidad destination = (Entidad) destinations.next();
			result.add(new DatawebLinkDescriptor(source, destination, DatawebElementTypes.RolEntidades_4004,
					RolEntidadesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DatawebLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rol_Accesoapaginapantalla_4005(
			Rol source) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		for (Iterator<?> destinations = source.getAccesoapaginapantalla().iterator(); destinations.hasNext();) {
			PaginaPantalla destination = (PaginaPantalla) destinations.next();
			result.add(new DatawebLinkDescriptor(source, destination, DatawebElementTypes.RolAccesoapaginapantalla_4005,
					RolAccesoapaginapantallaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DatawebLinkDescriptor> getOutgoingFeatureModelFacetLinks_RedSocial_Paginapantalla_4006(
			RedSocial source) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		for (Iterator<?> destinations = source.getPaginapantalla().iterator(); destinations.hasNext();) {
			PaginaPantalla destination = (PaginaPantalla) destinations.next();
			result.add(new DatawebLinkDescriptor(source, destination, DatawebElementTypes.RedSocialPaginapantalla_4006,
					RedSocialPaginapantallaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DatawebLinkDescriptor> getOutgoingFeatureModelFacetLinks_PaginaPantalla_Usuario_4007(
			PaginaPantalla source) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		for (Iterator<?> destinations = source.getUsuario().iterator(); destinations.hasNext();) {
			Rol destination = (Rol) destinations.next();
			result.add(new DatawebLinkDescriptor(source, destination, DatawebElementTypes.PaginaPantallaUsuario_4007,
					PaginaPantallaUsuarioEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DatawebLinkDescriptor> getOutgoingFeatureModelFacetLinks_PaginaPantalla_Redsocial_4008(
			PaginaPantalla source) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		for (Iterator<?> destinations = source.getRedsocial().iterator(); destinations.hasNext();) {
			RedSocial destination = (RedSocial) destinations.next();
			result.add(new DatawebLinkDescriptor(source, destination, DatawebElementTypes.PaginaPantallaRedsocial_4008,
					PaginaPantallaRedsocialEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DatawebLinkDescriptor> getOutgoingFeatureModelFacetLinks_PaginaPantalla_Entidad_4009(
			PaginaPantalla source) {
		LinkedList<DatawebLinkDescriptor> result = new LinkedList<DatawebLinkDescriptor>();
		Entidad destination = source.getEntidad();
		if (destination == null) {
			return result;
		}
		result.add(new DatawebLinkDescriptor(source, destination, DatawebElementTypes.PaginaPantallaEntidad_4009,
				PaginaPantallaEntidadEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<DatawebNodeDescriptor> getSemanticChildren(View view) {
			return DatawebDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DatawebLinkDescriptor> getContainedLinks(View view) {
			return DatawebDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DatawebLinkDescriptor> getIncomingLinks(View view) {
			return DatawebDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DatawebLinkDescriptor> getOutgoingLinks(View view) {
			return DatawebDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
