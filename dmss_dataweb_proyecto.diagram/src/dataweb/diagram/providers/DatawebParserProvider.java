/*
 * 
 */
package dataweb.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import dataweb.DatawebPackage;
import dataweb.diagram.edit.parts.ActualizacionInstanciaNombreEditPart;
import dataweb.diagram.edit.parts.AtributoNombreEditPart;
import dataweb.diagram.edit.parts.BaseDatosNombreEditPart;
import dataweb.diagram.edit.parts.BorradoInstanciaNombreEditPart;
import dataweb.diagram.edit.parts.CRUDNombreEditPart;
import dataweb.diagram.edit.parts.ContenidoMultimediaTipoEditPart;
import dataweb.diagram.edit.parts.CrearInstanciaNombreEditPart;
import dataweb.diagram.edit.parts.CuestionarioNombreEditPart;
import dataweb.diagram.edit.parts.DetallesInstanciaNombreEditPart;
import dataweb.diagram.edit.parts.EncuestaDescripcionEditPart;
import dataweb.diagram.edit.parts.EntidadNombreEditPart;
import dataweb.diagram.edit.parts.IndexNombreEditPart;
import dataweb.diagram.edit.parts.IndiceDetalleNombreEditPart;
import dataweb.diagram.edit.parts.IndiceEntidadNombreEditPart;
import dataweb.diagram.edit.parts.IndiceExtendidoNombreEditPart;
import dataweb.diagram.edit.parts.NormalContenidoEditPart;
import dataweb.diagram.edit.parts.PreguntaTexto2EditPart;
import dataweb.diagram.edit.parts.PreguntaTextoEditPart;
import dataweb.diagram.edit.parts.RedSocialNombreEditPart;
import dataweb.diagram.edit.parts.RespuestaTextoEditPart;
import dataweb.diagram.edit.parts.RolNombreEditPart;
import dataweb.diagram.parsers.MessageFormatParser;
import dataweb.diagram.part.DatawebVisualIDRegistry;

/**
 * @generated
 */
public class DatawebParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser indiceExtendidoNombre_5001Parser;

	/**
	* @generated
	*/
	private IParser getIndiceExtendidoNombre_5001Parser() {
		if (indiceExtendidoNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getPaginaPantalla_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indiceExtendidoNombre_5001Parser = parser;
		}
		return indiceExtendidoNombre_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser indiceEntidadNombre_5002Parser;

	/**
	* @generated
	*/
	private IParser getIndiceEntidadNombre_5002Parser() {
		if (indiceEntidadNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getPaginaPantalla_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indiceEntidadNombre_5002Parser = parser;
		}
		return indiceEntidadNombre_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser indiceDetalleNombre_5003Parser;

	/**
	* @generated
	*/
	private IParser getIndiceDetalleNombre_5003Parser() {
		if (indiceDetalleNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getPaginaPantalla_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indiceDetalleNombre_5003Parser = parser;
		}
		return indiceDetalleNombre_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser crearInstanciaNombre_5004Parser;

	/**
	* @generated
	*/
	private IParser getCrearInstanciaNombre_5004Parser() {
		if (crearInstanciaNombre_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getPaginaPantalla_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			crearInstanciaNombre_5004Parser = parser;
		}
		return crearInstanciaNombre_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser detallesInstanciaNombre_5005Parser;

	/**
	* @generated
	*/
	private IParser getDetallesInstanciaNombre_5005Parser() {
		if (detallesInstanciaNombre_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getPaginaPantalla_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detallesInstanciaNombre_5005Parser = parser;
		}
		return detallesInstanciaNombre_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser actualizacionInstanciaNombre_5006Parser;

	/**
	* @generated
	*/
	private IParser getActualizacionInstanciaNombre_5006Parser() {
		if (actualizacionInstanciaNombre_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getPaginaPantalla_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actualizacionInstanciaNombre_5006Parser = parser;
		}
		return actualizacionInstanciaNombre_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser borradoInstanciaNombre_5007Parser;

	/**
	* @generated
	*/
	private IParser getBorradoInstanciaNombre_5007Parser() {
		if (borradoInstanciaNombre_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getPaginaPantalla_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			borradoInstanciaNombre_5007Parser = parser;
		}
		return borradoInstanciaNombre_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser cuestionarioNombre_5010Parser;

	/**
	* @generated
	*/
	private IParser getCuestionarioNombre_5010Parser() {
		if (cuestionarioNombre_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getPaginaPantalla_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cuestionarioNombre_5010Parser = parser;
		}
		return cuestionarioNombre_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser encuestaDescripcion_5012Parser;

	/**
	* @generated
	*/
	private IParser getEncuestaDescripcion_5012Parser() {
		if (encuestaDescripcion_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getInteractiva_Descripcion() };
			MessageFormatParser parser = new MessageFormatParser(features);
			encuestaDescripcion_5012Parser = parser;
		}
		return encuestaDescripcion_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser cRUDNombre_5013Parser;

	/**
	* @generated
	*/
	private IParser getCRUDNombre_5013Parser() {
		if (cRUDNombre_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getPaginaPantalla_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cRUDNombre_5013Parser = parser;
		}
		return cRUDNombre_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser normalContenido_5015Parser;

	/**
	* @generated
	*/
	private IParser getNormalContenido_5015Parser() {
		if (normalContenido_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getNormal_Contenido() };
			MessageFormatParser parser = new MessageFormatParser(features);
			normalContenido_5015Parser = parser;
		}
		return normalContenido_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser indexNombre_5016Parser;

	/**
	* @generated
	*/
	private IParser getIndexNombre_5016Parser() {
		if (indexNombre_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getPaginaPantalla_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexNombre_5016Parser = parser;
		}
		return indexNombre_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser rolNombre_5017Parser;

	/**
	* @generated
	*/
	private IParser getRolNombre_5017Parser() {
		if (rolNombre_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getRol_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rolNombre_5017Parser = parser;
		}
		return rolNombre_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser redSocialNombre_5018Parser;

	/**
	* @generated
	*/
	private IParser getRedSocialNombre_5018Parser() {
		if (redSocialNombre_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getRedSocial_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			redSocialNombre_5018Parser = parser;
		}
		return redSocialNombre_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser baseDatosNombre_5021Parser;

	/**
	* @generated
	*/
	private IParser getBaseDatosNombre_5021Parser() {
		if (baseDatosNombre_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getBaseDatos_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			baseDatosNombre_5021Parser = parser;
		}
		return baseDatosNombre_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser preguntaTexto_5009Parser;

	/**
	* @generated
	*/
	private IParser getPreguntaTexto_5009Parser() {
		if (preguntaTexto_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getPregunta_Texto() };
			MessageFormatParser parser = new MessageFormatParser(features);
			preguntaTexto_5009Parser = parser;
		}
		return preguntaTexto_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser respuestaTexto_5008Parser;

	/**
	* @generated
	*/
	private IParser getRespuestaTexto_5008Parser() {
		if (respuestaTexto_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getRespuesta_Texto() };
			MessageFormatParser parser = new MessageFormatParser(features);
			respuestaTexto_5008Parser = parser;
		}
		return respuestaTexto_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser preguntaTexto_5011Parser;

	/**
	* @generated
	*/
	private IParser getPreguntaTexto_5011Parser() {
		if (preguntaTexto_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getPregunta_Texto() };
			MessageFormatParser parser = new MessageFormatParser(features);
			preguntaTexto_5011Parser = parser;
		}
		return preguntaTexto_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser contenidoMultimediaTipo_5014Parser;

	/**
	* @generated
	*/
	private IParser getContenidoMultimediaTipo_5014Parser() {
		if (contenidoMultimediaTipo_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getContenidoMultimedia_Tipo() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contenidoMultimediaTipo_5014Parser = parser;
		}
		return contenidoMultimediaTipo_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser entidadNombre_5020Parser;

	/**
	* @generated
	*/
	private IParser getEntidadNombre_5020Parser() {
		if (entidadNombre_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getEntidad_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entidadNombre_5020Parser = parser;
		}
		return entidadNombre_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser atributoNombre_5019Parser;

	/**
	* @generated
	*/
	private IParser getAtributoNombre_5019Parser() {
		if (atributoNombre_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { DatawebPackage.eINSTANCE.getAtributo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atributoNombre_5019Parser = parser;
		}
		return atributoNombre_5019Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case IndiceExtendidoNombreEditPart.VISUAL_ID:
			return getIndiceExtendidoNombre_5001Parser();
		case IndiceEntidadNombreEditPart.VISUAL_ID:
			return getIndiceEntidadNombre_5002Parser();
		case IndiceDetalleNombreEditPart.VISUAL_ID:
			return getIndiceDetalleNombre_5003Parser();
		case CrearInstanciaNombreEditPart.VISUAL_ID:
			return getCrearInstanciaNombre_5004Parser();
		case DetallesInstanciaNombreEditPart.VISUAL_ID:
			return getDetallesInstanciaNombre_5005Parser();
		case ActualizacionInstanciaNombreEditPart.VISUAL_ID:
			return getActualizacionInstanciaNombre_5006Parser();
		case BorradoInstanciaNombreEditPart.VISUAL_ID:
			return getBorradoInstanciaNombre_5007Parser();
		case CuestionarioNombreEditPart.VISUAL_ID:
			return getCuestionarioNombre_5010Parser();
		case EncuestaDescripcionEditPart.VISUAL_ID:
			return getEncuestaDescripcion_5012Parser();
		case CRUDNombreEditPart.VISUAL_ID:
			return getCRUDNombre_5013Parser();
		case NormalContenidoEditPart.VISUAL_ID:
			return getNormalContenido_5015Parser();
		case IndexNombreEditPart.VISUAL_ID:
			return getIndexNombre_5016Parser();
		case RolNombreEditPart.VISUAL_ID:
			return getRolNombre_5017Parser();
		case RedSocialNombreEditPart.VISUAL_ID:
			return getRedSocialNombre_5018Parser();
		case BaseDatosNombreEditPart.VISUAL_ID:
			return getBaseDatosNombre_5021Parser();
		case PreguntaTextoEditPart.VISUAL_ID:
			return getPreguntaTexto_5009Parser();
		case RespuestaTextoEditPart.VISUAL_ID:
			return getRespuestaTexto_5008Parser();
		case PreguntaTexto2EditPart.VISUAL_ID:
			return getPreguntaTexto_5011Parser();
		case ContenidoMultimediaTipoEditPart.VISUAL_ID:
			return getContenidoMultimediaTipo_5014Parser();
		case EntidadNombreEditPart.VISUAL_ID:
			return getEntidadNombre_5020Parser();
		case AtributoNombreEditPart.VISUAL_ID:
			return getAtributoNombre_5019Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(DatawebVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DatawebVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DatawebElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
