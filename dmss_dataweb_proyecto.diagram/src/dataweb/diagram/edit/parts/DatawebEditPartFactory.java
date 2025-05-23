/*
 * 
 */
package dataweb.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import dataweb.diagram.part.DatawebVisualIDRegistry;

/**
 * @generated
 */
public class DatawebEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DatawebVisualIDRegistry.getVisualID(view)) {

			case AplicacionEditPart.VISUAL_ID:
				return new AplicacionEditPart(view);

			case IndiceExtendidoEditPart.VISUAL_ID:
				return new IndiceExtendidoEditPart(view);

			case IndiceExtendidoNombreEditPart.VISUAL_ID:
				return new IndiceExtendidoNombreEditPart(view);

			case IndiceEntidadEditPart.VISUAL_ID:
				return new IndiceEntidadEditPart(view);

			case IndiceEntidadNombreEditPart.VISUAL_ID:
				return new IndiceEntidadNombreEditPart(view);

			case IndiceDetalleEditPart.VISUAL_ID:
				return new IndiceDetalleEditPart(view);

			case IndiceDetalleNombreEditPart.VISUAL_ID:
				return new IndiceDetalleNombreEditPart(view);

			case CrearInstanciaEditPart.VISUAL_ID:
				return new CrearInstanciaEditPart(view);

			case CrearInstanciaNombreEditPart.VISUAL_ID:
				return new CrearInstanciaNombreEditPart(view);

			case DetallesInstanciaEditPart.VISUAL_ID:
				return new DetallesInstanciaEditPart(view);

			case DetallesInstanciaNombreEditPart.VISUAL_ID:
				return new DetallesInstanciaNombreEditPart(view);

			case ActualizacionInstanciaEditPart.VISUAL_ID:
				return new ActualizacionInstanciaEditPart(view);

			case ActualizacionInstanciaNombreEditPart.VISUAL_ID:
				return new ActualizacionInstanciaNombreEditPart(view);

			case BorradoInstanciaEditPart.VISUAL_ID:
				return new BorradoInstanciaEditPart(view);

			case BorradoInstanciaNombreEditPart.VISUAL_ID:
				return new BorradoInstanciaNombreEditPart(view);

			case CuestionarioEditPart.VISUAL_ID:
				return new CuestionarioEditPart(view);

			case CuestionarioNombreEditPart.VISUAL_ID:
				return new CuestionarioNombreEditPart(view);

			case EncuestaEditPart.VISUAL_ID:
				return new EncuestaEditPart(view);

			case EncuestaDescripcionEditPart.VISUAL_ID:
				return new EncuestaDescripcionEditPart(view);

			case CRUDEditPart.VISUAL_ID:
				return new CRUDEditPart(view);

			case CRUDNombreEditPart.VISUAL_ID:
				return new CRUDNombreEditPart(view);

			case NormalEditPart.VISUAL_ID:
				return new NormalEditPart(view);

			case NormalContenidoEditPart.VISUAL_ID:
				return new NormalContenidoEditPart(view);

			case IndexEditPart.VISUAL_ID:
				return new IndexEditPart(view);

			case IndexNombreEditPart.VISUAL_ID:
				return new IndexNombreEditPart(view);

			case RolEditPart.VISUAL_ID:
				return new RolEditPart(view);

			case RolNombreEditPart.VISUAL_ID:
				return new RolNombreEditPart(view);

			case RedSocialEditPart.VISUAL_ID:
				return new RedSocialEditPart(view);

			case RedSocialNombreEditPart.VISUAL_ID:
				return new RedSocialNombreEditPart(view);

			case BaseDatosEditPart.VISUAL_ID:
				return new BaseDatosEditPart(view);

			case BaseDatosNombreEditPart.VISUAL_ID:
				return new BaseDatosNombreEditPart(view);

			case PreguntaEditPart.VISUAL_ID:
				return new PreguntaEditPart(view);

			case PreguntaTextoEditPart.VISUAL_ID:
				return new PreguntaTextoEditPart(view);

			case RespuestaEditPart.VISUAL_ID:
				return new RespuestaEditPart(view);

			case RespuestaTextoEditPart.VISUAL_ID:
				return new RespuestaTextoEditPart(view);

			case Pregunta2EditPart.VISUAL_ID:
				return new Pregunta2EditPart(view);

			case PreguntaTexto2EditPart.VISUAL_ID:
				return new PreguntaTexto2EditPart(view);

			case ContenidoMultimediaEditPart.VISUAL_ID:
				return new ContenidoMultimediaEditPart(view);

			case ContenidoMultimediaTipoEditPart.VISUAL_ID:
				return new ContenidoMultimediaTipoEditPart(view);

			case EntidadEditPart.VISUAL_ID:
				return new EntidadEditPart(view);

			case EntidadNombreEditPart.VISUAL_ID:
				return new EntidadNombreEditPart(view);

			case AtributoEditPart.VISUAL_ID:
				return new AtributoEditPart(view);

			case AtributoNombreEditPart.VISUAL_ID:
				return new AtributoNombreEditPart(view);

			case CuestionarioCuestionarioPreguntasCCompartmentEditPart.VISUAL_ID:
				return new CuestionarioCuestionarioPreguntasCCompartmentEditPart(view);

			case PreguntaPreguntaRespuestasCompartmentEditPart.VISUAL_ID:
				return new PreguntaPreguntaRespuestasCompartmentEditPart(view);

			case EncuestaEncuestaPreguntasECompartmentEditPart.VISUAL_ID:
				return new EncuestaEncuestaPreguntasECompartmentEditPart(view);

			case PreguntaPreguntaRespuestasCompartment2EditPart.VISUAL_ID:
				return new PreguntaPreguntaRespuestasCompartment2EditPart(view);

			case NormalNormalContenidomultimediaCompartmentEditPart.VISUAL_ID:
				return new NormalNormalContenidomultimediaCompartmentEditPart(view);

			case BaseDatosBaseDatosTablasCompartmentEditPart.VISUAL_ID:
				return new BaseDatosBaseDatosTablasCompartmentEditPart(view);

			case EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID:
				return new EntidadEntidadAtributosCompartmentEditPart(view);

			case EntidadEntidadRefereenciadaEditPart.VISUAL_ID:
				return new EntidadEntidadRefereenciadaEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case EntidadUsuariosEditPart.VISUAL_ID:
				return new EntidadUsuariosEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case PreguntaRcorrectaEditPart.VISUAL_ID:
				return new PreguntaRcorrectaEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case RolEntidadesEditPart.VISUAL_ID:
				return new RolEntidadesEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case RolAccesoapaginapantallaEditPart.VISUAL_ID:
				return new RolAccesoapaginapantallaEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case RedSocialPaginapantallaEditPart.VISUAL_ID:
				return new RedSocialPaginapantallaEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case PaginaPantallaUsuarioEditPart.VISUAL_ID:
				return new PaginaPantallaUsuarioEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case PaginaPantallaRedsocialEditPart.VISUAL_ID:
				return new PaginaPantallaRedsocialEditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case PaginaPantallaEntidadEditPart.VISUAL_ID:
				return new PaginaPantallaEntidadEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
