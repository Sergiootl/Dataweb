/*
 * 
 */
package dataweb.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import dataweb.DatawebPackage;
import dataweb.diagram.edit.parts.ActualizacionInstanciaEditPart;
import dataweb.diagram.edit.parts.AplicacionEditPart;
import dataweb.diagram.edit.parts.AtributoEditPart;
import dataweb.diagram.edit.parts.BaseDatosEditPart;
import dataweb.diagram.edit.parts.BorradoInstanciaEditPart;
import dataweb.diagram.edit.parts.CRUDEditPart;
import dataweb.diagram.edit.parts.ContenidoMultimediaEditPart;
import dataweb.diagram.edit.parts.CrearInstanciaEditPart;
import dataweb.diagram.edit.parts.CuestionarioEditPart;
import dataweb.diagram.edit.parts.DetallesInstanciaEditPart;
import dataweb.diagram.edit.parts.EncuestaEditPart;
import dataweb.diagram.edit.parts.EntidadEditPart;
import dataweb.diagram.edit.parts.EntidadEntidadRefereenciadaEditPart;
import dataweb.diagram.edit.parts.EntidadUsuariosEditPart;
import dataweb.diagram.edit.parts.IndexEditPart;
import dataweb.diagram.edit.parts.IndiceDetalleEditPart;
import dataweb.diagram.edit.parts.IndiceEntidadEditPart;
import dataweb.diagram.edit.parts.IndiceExtendidoEditPart;
import dataweb.diagram.edit.parts.NormalEditPart;
import dataweb.diagram.edit.parts.PaginaPantallaEntidadEditPart;
import dataweb.diagram.edit.parts.PaginaPantallaRedsocialEditPart;
import dataweb.diagram.edit.parts.PaginaPantallaUsuarioEditPart;
import dataweb.diagram.edit.parts.Pregunta2EditPart;
import dataweb.diagram.edit.parts.PreguntaEditPart;
import dataweb.diagram.edit.parts.PreguntaRcorrectaEditPart;
import dataweb.diagram.edit.parts.RedSocialEditPart;
import dataweb.diagram.edit.parts.RedSocialPaginapantallaEditPart;
import dataweb.diagram.edit.parts.RespuestaEditPart;
import dataweb.diagram.edit.parts.RolAccesoapaginapantallaEditPart;
import dataweb.diagram.edit.parts.RolEditPart;
import dataweb.diagram.edit.parts.RolEntidadesEditPart;
import dataweb.diagram.part.DatawebDiagramEditorPlugin;

/**
 * @generated
 */
public class DatawebElementTypes {

	/**
	* @generated
	*/
	private DatawebElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DatawebDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Aplicacion_1000 = getElementType("dmss_dataweb_proyecto.diagram.Aplicacion_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndiceExtendido_2001 = getElementType(
			"dmss_dataweb_proyecto.diagram.IndiceExtendido_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndiceEntidad_2002 = getElementType(
			"dmss_dataweb_proyecto.diagram.IndiceEntidad_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndiceDetalle_2003 = getElementType(
			"dmss_dataweb_proyecto.diagram.IndiceDetalle_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CrearInstancia_2004 = getElementType(
			"dmss_dataweb_proyecto.diagram.CrearInstancia_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DetallesInstancia_2005 = getElementType(
			"dmss_dataweb_proyecto.diagram.DetallesInstancia_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ActualizacionInstancia_2006 = getElementType(
			"dmss_dataweb_proyecto.diagram.ActualizacionInstancia_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BorradoInstancia_2007 = getElementType(
			"dmss_dataweb_proyecto.diagram.BorradoInstancia_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Cuestionario_2008 = getElementType(
			"dmss_dataweb_proyecto.diagram.Cuestionario_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Encuesta_2009 = getElementType("dmss_dataweb_proyecto.diagram.Encuesta_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CRUD_2010 = getElementType("dmss_dataweb_proyecto.diagram.CRUD_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Normal_2011 = getElementType("dmss_dataweb_proyecto.diagram.Normal_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Index_2012 = getElementType("dmss_dataweb_proyecto.diagram.Index_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Rol_2013 = getElementType("dmss_dataweb_proyecto.diagram.Rol_2013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RedSocial_2014 = getElementType("dmss_dataweb_proyecto.diagram.RedSocial_2014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BaseDatos_2015 = getElementType("dmss_dataweb_proyecto.diagram.BaseDatos_2015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Pregunta_3001 = getElementType("dmss_dataweb_proyecto.diagram.Pregunta_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Respuesta_3002 = getElementType("dmss_dataweb_proyecto.diagram.Respuesta_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Pregunta_3003 = getElementType("dmss_dataweb_proyecto.diagram.Pregunta_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContenidoMultimedia_3004 = getElementType(
			"dmss_dataweb_proyecto.diagram.ContenidoMultimedia_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Entidad_3005 = getElementType("dmss_dataweb_proyecto.diagram.Entidad_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Atributo_3006 = getElementType("dmss_dataweb_proyecto.diagram.Atributo_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntidadEntidadRefereenciada_4001 = getElementType(
			"dmss_dataweb_proyecto.diagram.EntidadEntidadRefereenciada_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntidadUsuarios_4002 = getElementType(
			"dmss_dataweb_proyecto.diagram.EntidadUsuarios_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PreguntaRcorrecta_4003 = getElementType(
			"dmss_dataweb_proyecto.diagram.PreguntaRcorrecta_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RolEntidades_4004 = getElementType(
			"dmss_dataweb_proyecto.diagram.RolEntidades_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RolAccesoapaginapantalla_4005 = getElementType(
			"dmss_dataweb_proyecto.diagram.RolAccesoapaginapantalla_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RedSocialPaginapantalla_4006 = getElementType(
			"dmss_dataweb_proyecto.diagram.RedSocialPaginapantalla_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PaginaPantallaUsuario_4007 = getElementType(
			"dmss_dataweb_proyecto.diagram.PaginaPantallaUsuario_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PaginaPantallaRedsocial_4008 = getElementType(
			"dmss_dataweb_proyecto.diagram.PaginaPantallaRedsocial_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PaginaPantallaEntidad_4009 = getElementType(
			"dmss_dataweb_proyecto.diagram.PaginaPantallaEntidad_4009"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Aplicacion_1000, DatawebPackage.eINSTANCE.getAplicacion());

			elements.put(IndiceExtendido_2001, DatawebPackage.eINSTANCE.getIndiceExtendido());

			elements.put(IndiceEntidad_2002, DatawebPackage.eINSTANCE.getIndiceEntidad());

			elements.put(IndiceDetalle_2003, DatawebPackage.eINSTANCE.getIndiceDetalle());

			elements.put(CrearInstancia_2004, DatawebPackage.eINSTANCE.getCrearInstancia());

			elements.put(DetallesInstancia_2005, DatawebPackage.eINSTANCE.getDetallesInstancia());

			elements.put(ActualizacionInstancia_2006, DatawebPackage.eINSTANCE.getActualizacionInstancia());

			elements.put(BorradoInstancia_2007, DatawebPackage.eINSTANCE.getBorradoInstancia());

			elements.put(Cuestionario_2008, DatawebPackage.eINSTANCE.getCuestionario());

			elements.put(Encuesta_2009, DatawebPackage.eINSTANCE.getEncuesta());

			elements.put(CRUD_2010, DatawebPackage.eINSTANCE.getCRUD());

			elements.put(Normal_2011, DatawebPackage.eINSTANCE.getNormal());

			elements.put(Index_2012, DatawebPackage.eINSTANCE.getIndex());

			elements.put(Rol_2013, DatawebPackage.eINSTANCE.getRol());

			elements.put(RedSocial_2014, DatawebPackage.eINSTANCE.getRedSocial());

			elements.put(BaseDatos_2015, DatawebPackage.eINSTANCE.getBaseDatos());

			elements.put(Pregunta_3001, DatawebPackage.eINSTANCE.getPregunta());

			elements.put(Respuesta_3002, DatawebPackage.eINSTANCE.getRespuesta());

			elements.put(Pregunta_3003, DatawebPackage.eINSTANCE.getPregunta());

			elements.put(ContenidoMultimedia_3004, DatawebPackage.eINSTANCE.getContenidoMultimedia());

			elements.put(Entidad_3005, DatawebPackage.eINSTANCE.getEntidad());

			elements.put(Atributo_3006, DatawebPackage.eINSTANCE.getAtributo());

			elements.put(EntidadEntidadRefereenciada_4001, DatawebPackage.eINSTANCE.getEntidad_EntidadRefereenciada());

			elements.put(EntidadUsuarios_4002, DatawebPackage.eINSTANCE.getEntidad_Usuarios());

			elements.put(PreguntaRcorrecta_4003, DatawebPackage.eINSTANCE.getPregunta_Rcorrecta());

			elements.put(RolEntidades_4004, DatawebPackage.eINSTANCE.getRol_Entidades());

			elements.put(RolAccesoapaginapantalla_4005, DatawebPackage.eINSTANCE.getRol_Accesoapaginapantalla());

			elements.put(RedSocialPaginapantalla_4006, DatawebPackage.eINSTANCE.getRedSocial_Paginapantalla());

			elements.put(PaginaPantallaUsuario_4007, DatawebPackage.eINSTANCE.getPaginaPantalla_Usuario());

			elements.put(PaginaPantallaRedsocial_4008, DatawebPackage.eINSTANCE.getPaginaPantalla_Redsocial());

			elements.put(PaginaPantallaEntidad_4009, DatawebPackage.eINSTANCE.getPaginaPantalla_Entidad());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Aplicacion_1000);
			KNOWN_ELEMENT_TYPES.add(IndiceExtendido_2001);
			KNOWN_ELEMENT_TYPES.add(IndiceEntidad_2002);
			KNOWN_ELEMENT_TYPES.add(IndiceDetalle_2003);
			KNOWN_ELEMENT_TYPES.add(CrearInstancia_2004);
			KNOWN_ELEMENT_TYPES.add(DetallesInstancia_2005);
			KNOWN_ELEMENT_TYPES.add(ActualizacionInstancia_2006);
			KNOWN_ELEMENT_TYPES.add(BorradoInstancia_2007);
			KNOWN_ELEMENT_TYPES.add(Cuestionario_2008);
			KNOWN_ELEMENT_TYPES.add(Encuesta_2009);
			KNOWN_ELEMENT_TYPES.add(CRUD_2010);
			KNOWN_ELEMENT_TYPES.add(Normal_2011);
			KNOWN_ELEMENT_TYPES.add(Index_2012);
			KNOWN_ELEMENT_TYPES.add(Rol_2013);
			KNOWN_ELEMENT_TYPES.add(RedSocial_2014);
			KNOWN_ELEMENT_TYPES.add(BaseDatos_2015);
			KNOWN_ELEMENT_TYPES.add(Pregunta_3001);
			KNOWN_ELEMENT_TYPES.add(Respuesta_3002);
			KNOWN_ELEMENT_TYPES.add(Pregunta_3003);
			KNOWN_ELEMENT_TYPES.add(ContenidoMultimedia_3004);
			KNOWN_ELEMENT_TYPES.add(Entidad_3005);
			KNOWN_ELEMENT_TYPES.add(Atributo_3006);
			KNOWN_ELEMENT_TYPES.add(EntidadEntidadRefereenciada_4001);
			KNOWN_ELEMENT_TYPES.add(EntidadUsuarios_4002);
			KNOWN_ELEMENT_TYPES.add(PreguntaRcorrecta_4003);
			KNOWN_ELEMENT_TYPES.add(RolEntidades_4004);
			KNOWN_ELEMENT_TYPES.add(RolAccesoapaginapantalla_4005);
			KNOWN_ELEMENT_TYPES.add(RedSocialPaginapantalla_4006);
			KNOWN_ELEMENT_TYPES.add(PaginaPantallaUsuario_4007);
			KNOWN_ELEMENT_TYPES.add(PaginaPantallaRedsocial_4008);
			KNOWN_ELEMENT_TYPES.add(PaginaPantallaEntidad_4009);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case AplicacionEditPart.VISUAL_ID:
			return Aplicacion_1000;
		case IndiceExtendidoEditPart.VISUAL_ID:
			return IndiceExtendido_2001;
		case IndiceEntidadEditPart.VISUAL_ID:
			return IndiceEntidad_2002;
		case IndiceDetalleEditPart.VISUAL_ID:
			return IndiceDetalle_2003;
		case CrearInstanciaEditPart.VISUAL_ID:
			return CrearInstancia_2004;
		case DetallesInstanciaEditPart.VISUAL_ID:
			return DetallesInstancia_2005;
		case ActualizacionInstanciaEditPart.VISUAL_ID:
			return ActualizacionInstancia_2006;
		case BorradoInstanciaEditPart.VISUAL_ID:
			return BorradoInstancia_2007;
		case CuestionarioEditPart.VISUAL_ID:
			return Cuestionario_2008;
		case EncuestaEditPart.VISUAL_ID:
			return Encuesta_2009;
		case CRUDEditPart.VISUAL_ID:
			return CRUD_2010;
		case NormalEditPart.VISUAL_ID:
			return Normal_2011;
		case IndexEditPart.VISUAL_ID:
			return Index_2012;
		case RolEditPart.VISUAL_ID:
			return Rol_2013;
		case RedSocialEditPart.VISUAL_ID:
			return RedSocial_2014;
		case BaseDatosEditPart.VISUAL_ID:
			return BaseDatos_2015;
		case PreguntaEditPart.VISUAL_ID:
			return Pregunta_3001;
		case RespuestaEditPart.VISUAL_ID:
			return Respuesta_3002;
		case Pregunta2EditPart.VISUAL_ID:
			return Pregunta_3003;
		case ContenidoMultimediaEditPart.VISUAL_ID:
			return ContenidoMultimedia_3004;
		case EntidadEditPart.VISUAL_ID:
			return Entidad_3005;
		case AtributoEditPart.VISUAL_ID:
			return Atributo_3006;
		case EntidadEntidadRefereenciadaEditPart.VISUAL_ID:
			return EntidadEntidadRefereenciada_4001;
		case EntidadUsuariosEditPart.VISUAL_ID:
			return EntidadUsuarios_4002;
		case PreguntaRcorrectaEditPart.VISUAL_ID:
			return PreguntaRcorrecta_4003;
		case RolEntidadesEditPart.VISUAL_ID:
			return RolEntidades_4004;
		case RolAccesoapaginapantallaEditPart.VISUAL_ID:
			return RolAccesoapaginapantalla_4005;
		case RedSocialPaginapantallaEditPart.VISUAL_ID:
			return RedSocialPaginapantalla_4006;
		case PaginaPantallaUsuarioEditPart.VISUAL_ID:
			return PaginaPantallaUsuario_4007;
		case PaginaPantallaRedsocialEditPart.VISUAL_ID:
			return PaginaPantallaRedsocial_4008;
		case PaginaPantallaEntidadEditPart.VISUAL_ID:
			return PaginaPantallaEntidad_4009;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return dataweb.diagram.providers.DatawebElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return dataweb.diagram.providers.DatawebElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return dataweb.diagram.providers.DatawebElementTypes.getElement(elementTypeAdapter);
		}
	};

}
