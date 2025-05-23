/*
 * 
 */
package dataweb.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import dataweb.diagram.edit.parts.EntidadEditPart;
import dataweb.diagram.edit.parts.RolEditPart;
import dataweb.diagram.providers.DatawebElementTypes;
import dataweb.diagram.providers.DatawebModelingAssistantProvider;

/**
 * @generated
 */
public class DatawebModelingAssistantProviderOfEntidadEditPart extends DatawebModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((EntidadEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(EntidadEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DatawebElementTypes.EntidadEntidadRefereenciada_4001);
		types.add(DatawebElementTypes.EntidadUsuarios_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((EntidadEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(EntidadEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EntidadEditPart) {
			types.add(DatawebElementTypes.EntidadEntidadRefereenciada_4001);
		}
		if (targetEditPart instanceof RolEditPart) {
			types.add(DatawebElementTypes.EntidadUsuarios_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((EntidadEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(EntidadEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DatawebElementTypes.EntidadEntidadRefereenciada_4001) {
			types.add(DatawebElementTypes.Entidad_3005);
		} else if (relationshipType == DatawebElementTypes.EntidadUsuarios_4002) {
			types.add(DatawebElementTypes.Rol_2013);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((EntidadEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(EntidadEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DatawebElementTypes.EntidadEntidadRefereenciada_4001);
		types.add(DatawebElementTypes.RolEntidades_4004);
		types.add(DatawebElementTypes.PaginaPantallaEntidad_4009);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((EntidadEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(EntidadEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DatawebElementTypes.EntidadEntidadRefereenciada_4001) {
			types.add(DatawebElementTypes.Entidad_3005);
		} else if (relationshipType == DatawebElementTypes.RolEntidades_4004) {
			types.add(DatawebElementTypes.Rol_2013);
		} else if (relationshipType == DatawebElementTypes.PaginaPantallaEntidad_4009) {
			types.add(DatawebElementTypes.IndiceExtendido_2001);
			types.add(DatawebElementTypes.IndiceEntidad_2002);
			types.add(DatawebElementTypes.IndiceDetalle_2003);
			types.add(DatawebElementTypes.CrearInstancia_2004);
			types.add(DatawebElementTypes.DetallesInstancia_2005);
			types.add(DatawebElementTypes.ActualizacionInstancia_2006);
			types.add(DatawebElementTypes.BorradoInstancia_2007);
			types.add(DatawebElementTypes.Cuestionario_2008);
			types.add(DatawebElementTypes.Encuesta_2009);
			types.add(DatawebElementTypes.CRUD_2010);
			types.add(DatawebElementTypes.Normal_2011);
			types.add(DatawebElementTypes.Index_2012);
		}
		return types;
	}

}
