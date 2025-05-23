/*
* 
*/
package dataweb.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import dataweb.Aplicacion;
import dataweb.diagram.edit.parts.ActualizacionInstanciaEditPart;
import dataweb.diagram.edit.parts.ActualizacionInstanciaNombreEditPart;
import dataweb.diagram.edit.parts.AplicacionEditPart;
import dataweb.diagram.edit.parts.AtributoEditPart;
import dataweb.diagram.edit.parts.AtributoNombreEditPart;
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
import dataweb.diagram.edit.parts.CuestionarioEditPart;
import dataweb.diagram.edit.parts.CuestionarioNombreEditPart;
import dataweb.diagram.edit.parts.DetallesInstanciaEditPart;
import dataweb.diagram.edit.parts.DetallesInstanciaNombreEditPart;
import dataweb.diagram.edit.parts.EncuestaDescripcionEditPart;
import dataweb.diagram.edit.parts.EncuestaEditPart;
import dataweb.diagram.edit.parts.EntidadEditPart;
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
import dataweb.diagram.edit.parts.PaginaPantallaEntidadEditPart;
import dataweb.diagram.edit.parts.PaginaPantallaRedsocialEditPart;
import dataweb.diagram.edit.parts.PaginaPantallaUsuarioEditPart;
import dataweb.diagram.edit.parts.Pregunta2EditPart;
import dataweb.diagram.edit.parts.PreguntaEditPart;
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
import dataweb.diagram.part.DatawebDiagramEditorPlugin;
import dataweb.diagram.part.DatawebVisualIDRegistry;
import dataweb.diagram.providers.DatawebElementTypes;
import dataweb.diagram.providers.DatawebParserProvider;

/**
 * @generated
 */
public class DatawebNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		DatawebDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		DatawebDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DatawebNavigatorItem && !isOwnView(((DatawebNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof DatawebNavigatorGroup) {
			DatawebNavigatorGroup group = (DatawebNavigatorGroup) element;
			return DatawebDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof DatawebNavigatorItem) {
			DatawebNavigatorItem navigatorItem = (DatawebNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (DatawebVisualIDRegistry.getVisualID(view)) {
		case AplicacionEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.example.org/dataweb?Aplicacion", //$NON-NLS-1$
					DatawebElementTypes.Aplicacion_1000);
		case IndiceExtendidoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?IndiceExtendido", //$NON-NLS-1$
					DatawebElementTypes.IndiceExtendido_2001);
		case IndiceEntidadEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?IndiceEntidad", //$NON-NLS-1$
					DatawebElementTypes.IndiceEntidad_2002);
		case IndiceDetalleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?IndiceDetalle", //$NON-NLS-1$
					DatawebElementTypes.IndiceDetalle_2003);
		case CrearInstanciaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?CrearInstancia", //$NON-NLS-1$
					DatawebElementTypes.CrearInstancia_2004);
		case DetallesInstanciaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?DetallesInstancia", //$NON-NLS-1$
					DatawebElementTypes.DetallesInstancia_2005);
		case ActualizacionInstanciaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?ActualizacionInstancia", //$NON-NLS-1$
					DatawebElementTypes.ActualizacionInstancia_2006);
		case BorradoInstanciaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?BorradoInstancia", //$NON-NLS-1$
					DatawebElementTypes.BorradoInstancia_2007);
		case CuestionarioEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?Cuestionario", //$NON-NLS-1$
					DatawebElementTypes.Cuestionario_2008);
		case EncuestaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?Encuesta", //$NON-NLS-1$
					DatawebElementTypes.Encuesta_2009);
		case CRUDEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?CRUD", //$NON-NLS-1$
					DatawebElementTypes.CRUD_2010);
		case NormalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?Normal", //$NON-NLS-1$
					DatawebElementTypes.Normal_2011);
		case IndexEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?Index", //$NON-NLS-1$
					DatawebElementTypes.Index_2012);
		case RolEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?Rol", DatawebElementTypes.Rol_2013); //$NON-NLS-1$
		case RedSocialEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?RedSocial", //$NON-NLS-1$
					DatawebElementTypes.RedSocial_2014);
		case BaseDatosEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataweb?BaseDatos", //$NON-NLS-1$
					DatawebElementTypes.BaseDatos_2015);
		case PreguntaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dataweb?Pregunta", //$NON-NLS-1$
					DatawebElementTypes.Pregunta_3001);
		case RespuestaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dataweb?Respuesta", //$NON-NLS-1$
					DatawebElementTypes.Respuesta_3002);
		case Pregunta2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dataweb?Pregunta", //$NON-NLS-1$
					DatawebElementTypes.Pregunta_3003);
		case ContenidoMultimediaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dataweb?ContenidoMultimedia", //$NON-NLS-1$
					DatawebElementTypes.ContenidoMultimedia_3004);
		case EntidadEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dataweb?Entidad", DatawebElementTypes.Entidad_3005); //$NON-NLS-1$
		case AtributoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dataweb?Atributo", //$NON-NLS-1$
					DatawebElementTypes.Atributo_3006);
		case EntidadEntidadRefereenciadaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataweb?Entidad?entidadRefereenciada", //$NON-NLS-1$
					DatawebElementTypes.EntidadEntidadRefereenciada_4001);
		case EntidadUsuariosEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataweb?Entidad?usuarios", //$NON-NLS-1$
					DatawebElementTypes.EntidadUsuarios_4002);
		case PreguntaRcorrectaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataweb?Pregunta?Rcorrecta", //$NON-NLS-1$
					DatawebElementTypes.PreguntaRcorrecta_4003);
		case RolEntidadesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataweb?Rol?entidades", //$NON-NLS-1$
					DatawebElementTypes.RolEntidades_4004);
		case RolAccesoapaginapantallaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataweb?Rol?accesoapaginapantalla", //$NON-NLS-1$
					DatawebElementTypes.RolAccesoapaginapantalla_4005);
		case RedSocialPaginapantallaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataweb?RedSocial?paginapantalla", //$NON-NLS-1$
					DatawebElementTypes.RedSocialPaginapantalla_4006);
		case PaginaPantallaUsuarioEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataweb?PaginaPantalla?usuario", //$NON-NLS-1$
					DatawebElementTypes.PaginaPantallaUsuario_4007);
		case PaginaPantallaRedsocialEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataweb?PaginaPantalla?redsocial", //$NON-NLS-1$
					DatawebElementTypes.PaginaPantallaRedsocial_4008);
		case PaginaPantallaEntidadEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataweb?PaginaPantalla?entidad", //$NON-NLS-1$
					DatawebElementTypes.PaginaPantallaEntidad_4009);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DatawebDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && DatawebElementTypes.isKnownElementType(elementType)) {
			image = DatawebElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof DatawebNavigatorGroup) {
			DatawebNavigatorGroup group = (DatawebNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DatawebNavigatorItem) {
			DatawebNavigatorItem navigatorItem = (DatawebNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (DatawebVisualIDRegistry.getVisualID(view)) {
		case AplicacionEditPart.VISUAL_ID:
			return getAplicacion_1000Text(view);
		case IndiceExtendidoEditPart.VISUAL_ID:
			return getIndiceExtendido_2001Text(view);
		case IndiceEntidadEditPart.VISUAL_ID:
			return getIndiceEntidad_2002Text(view);
		case IndiceDetalleEditPart.VISUAL_ID:
			return getIndiceDetalle_2003Text(view);
		case CrearInstanciaEditPart.VISUAL_ID:
			return getCrearInstancia_2004Text(view);
		case DetallesInstanciaEditPart.VISUAL_ID:
			return getDetallesInstancia_2005Text(view);
		case ActualizacionInstanciaEditPart.VISUAL_ID:
			return getActualizacionInstancia_2006Text(view);
		case BorradoInstanciaEditPart.VISUAL_ID:
			return getBorradoInstancia_2007Text(view);
		case CuestionarioEditPart.VISUAL_ID:
			return getCuestionario_2008Text(view);
		case EncuestaEditPart.VISUAL_ID:
			return getEncuesta_2009Text(view);
		case CRUDEditPart.VISUAL_ID:
			return getCRUD_2010Text(view);
		case NormalEditPart.VISUAL_ID:
			return getNormal_2011Text(view);
		case IndexEditPart.VISUAL_ID:
			return getIndex_2012Text(view);
		case RolEditPart.VISUAL_ID:
			return getRol_2013Text(view);
		case RedSocialEditPart.VISUAL_ID:
			return getRedSocial_2014Text(view);
		case BaseDatosEditPart.VISUAL_ID:
			return getBaseDatos_2015Text(view);
		case PreguntaEditPart.VISUAL_ID:
			return getPregunta_3001Text(view);
		case RespuestaEditPart.VISUAL_ID:
			return getRespuesta_3002Text(view);
		case Pregunta2EditPart.VISUAL_ID:
			return getPregunta_3003Text(view);
		case ContenidoMultimediaEditPart.VISUAL_ID:
			return getContenidoMultimedia_3004Text(view);
		case EntidadEditPart.VISUAL_ID:
			return getEntidad_3005Text(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_3006Text(view);
		case EntidadEntidadRefereenciadaEditPart.VISUAL_ID:
			return getEntidadEntidadRefereenciada_4001Text(view);
		case EntidadUsuariosEditPart.VISUAL_ID:
			return getEntidadUsuarios_4002Text(view);
		case PreguntaRcorrectaEditPart.VISUAL_ID:
			return getPreguntaRcorrecta_4003Text(view);
		case RolEntidadesEditPart.VISUAL_ID:
			return getRolEntidades_4004Text(view);
		case RolAccesoapaginapantallaEditPart.VISUAL_ID:
			return getRolAccesoapaginapantalla_4005Text(view);
		case RedSocialPaginapantallaEditPart.VISUAL_ID:
			return getRedSocialPaginapantalla_4006Text(view);
		case PaginaPantallaUsuarioEditPart.VISUAL_ID:
			return getPaginaPantallaUsuario_4007Text(view);
		case PaginaPantallaRedsocialEditPart.VISUAL_ID:
			return getPaginaPantallaRedsocial_4008Text(view);
		case PaginaPantallaEntidadEditPart.VISUAL_ID:
			return getPaginaPantallaEntidad_4009Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getAplicacion_1000Text(View view) {
		Aplicacion domainModelElement = (Aplicacion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndiceExtendido_2001Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.IndiceExtendido_2001,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(IndiceExtendidoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndiceEntidad_2002Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.IndiceEntidad_2002,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(IndiceEntidadNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndiceDetalle_2003Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.IndiceDetalle_2003,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(IndiceDetalleNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCrearInstancia_2004Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.CrearInstancia_2004,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(CrearInstanciaNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDetallesInstancia_2005Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.DetallesInstancia_2005,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(DetallesInstanciaNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActualizacionInstancia_2006Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.ActualizacionInstancia_2006,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(ActualizacionInstanciaNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBorradoInstancia_2007Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.BorradoInstancia_2007,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(BorradoInstanciaNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCuestionario_2008Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.Cuestionario_2008,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(CuestionarioNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEncuesta_2009Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.Encuesta_2009,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(EncuestaDescripcionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCRUD_2010Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.CRUD_2010,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(CRUDNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNormal_2011Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.Normal_2011,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(NormalContenidoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndex_2012Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.Index_2012,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(IndexNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRol_2013Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.Rol_2013,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(RolNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRedSocial_2014Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.RedSocial_2014,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(RedSocialNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBaseDatos_2015Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.BaseDatos_2015,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(BaseDatosNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPregunta_3001Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.Pregunta_3001,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(PreguntaTextoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRespuesta_3002Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.Respuesta_3002,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(RespuestaTextoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPregunta_3003Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.Pregunta_3003,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(PreguntaTexto2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContenidoMultimedia_3004Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.ContenidoMultimedia_3004,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(ContenidoMultimediaTipoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidad_3005Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.Entidad_3005,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(EntidadNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAtributo_3006Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.Atributo_3006,
				view.getElement() != null ? view.getElement() : view,
				DatawebVisualIDRegistry.getType(AtributoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidadEntidadRefereenciada_4001Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.EntidadEntidadRefereenciada_4001,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidadUsuarios_4002Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.EntidadUsuarios_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPreguntaRcorrecta_4003Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.PreguntaRcorrecta_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRolEntidades_4004Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.RolEntidades_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRolAccesoapaginapantalla_4005Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.RolAccesoapaginapantalla_4005,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRedSocialPaginapantalla_4006Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.RedSocialPaginapantalla_4006,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaPantallaUsuario_4007Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.PaginaPantallaUsuario_4007,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaPantallaRedsocial_4008Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.PaginaPantallaRedsocial_4008,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaPantallaEntidad_4009Text(View view) {
		IParser parser = DatawebParserProvider.getParser(DatawebElementTypes.PaginaPantallaEntidad_4009,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatawebDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return AplicacionEditPart.MODEL_ID.equals(DatawebVisualIDRegistry.getModelID(view));
	}

}
