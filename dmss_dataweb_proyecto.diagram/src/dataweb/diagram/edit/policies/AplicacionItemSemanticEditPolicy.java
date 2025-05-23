/*
* 
*/
package dataweb.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import dataweb.diagram.edit.commands.ActualizacionInstanciaCreateCommand;
import dataweb.diagram.edit.commands.BaseDatosCreateCommand;
import dataweb.diagram.edit.commands.BorradoInstanciaCreateCommand;
import dataweb.diagram.edit.commands.CRUDCreateCommand;
import dataweb.diagram.edit.commands.CrearInstanciaCreateCommand;
import dataweb.diagram.edit.commands.CuestionarioCreateCommand;
import dataweb.diagram.edit.commands.DetallesInstanciaCreateCommand;
import dataweb.diagram.edit.commands.EncuestaCreateCommand;
import dataweb.diagram.edit.commands.IndexCreateCommand;
import dataweb.diagram.edit.commands.IndiceDetalleCreateCommand;
import dataweb.diagram.edit.commands.IndiceEntidadCreateCommand;
import dataweb.diagram.edit.commands.IndiceExtendidoCreateCommand;
import dataweb.diagram.edit.commands.NormalCreateCommand;
import dataweb.diagram.edit.commands.RedSocialCreateCommand;
import dataweb.diagram.edit.commands.RolCreateCommand;
import dataweb.diagram.providers.DatawebElementTypes;

/**
 * @generated
 */
public class AplicacionItemSemanticEditPolicy extends DatawebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AplicacionItemSemanticEditPolicy() {
		super(DatawebElementTypes.Aplicacion_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DatawebElementTypes.IndiceExtendido_2001 == req.getElementType()) {
			return getGEFWrapper(new IndiceExtendidoCreateCommand(req));
		}
		if (DatawebElementTypes.IndiceEntidad_2002 == req.getElementType()) {
			return getGEFWrapper(new IndiceEntidadCreateCommand(req));
		}
		if (DatawebElementTypes.IndiceDetalle_2003 == req.getElementType()) {
			return getGEFWrapper(new IndiceDetalleCreateCommand(req));
		}
		if (DatawebElementTypes.CrearInstancia_2004 == req.getElementType()) {
			return getGEFWrapper(new CrearInstanciaCreateCommand(req));
		}
		if (DatawebElementTypes.DetallesInstancia_2005 == req.getElementType()) {
			return getGEFWrapper(new DetallesInstanciaCreateCommand(req));
		}
		if (DatawebElementTypes.ActualizacionInstancia_2006 == req.getElementType()) {
			return getGEFWrapper(new ActualizacionInstanciaCreateCommand(req));
		}
		if (DatawebElementTypes.BorradoInstancia_2007 == req.getElementType()) {
			return getGEFWrapper(new BorradoInstanciaCreateCommand(req));
		}
		if (DatawebElementTypes.Cuestionario_2008 == req.getElementType()) {
			return getGEFWrapper(new CuestionarioCreateCommand(req));
		}
		if (DatawebElementTypes.Encuesta_2009 == req.getElementType()) {
			return getGEFWrapper(new EncuestaCreateCommand(req));
		}
		if (DatawebElementTypes.CRUD_2010 == req.getElementType()) {
			return getGEFWrapper(new CRUDCreateCommand(req));
		}
		if (DatawebElementTypes.Normal_2011 == req.getElementType()) {
			return getGEFWrapper(new NormalCreateCommand(req));
		}
		if (DatawebElementTypes.Index_2012 == req.getElementType()) {
			return getGEFWrapper(new IndexCreateCommand(req));
		}
		if (DatawebElementTypes.Rol_2013 == req.getElementType()) {
			return getGEFWrapper(new RolCreateCommand(req));
		}
		if (DatawebElementTypes.RedSocial_2014 == req.getElementType()) {
			return getGEFWrapper(new RedSocialCreateCommand(req));
		}
		if (DatawebElementTypes.BaseDatos_2015 == req.getElementType()) {
			return getGEFWrapper(new BaseDatosCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
