/*
 * 
 */
package dataweb.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import dataweb.diagram.providers.DatawebElementTypes;
import dataweb.diagram.providers.DatawebModelingAssistantProvider;

/**
 * @generated
 */
public class DatawebModelingAssistantProviderOfAplicacionEditPart extends DatawebModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(15);
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
		types.add(DatawebElementTypes.Rol_2013);
		types.add(DatawebElementTypes.RedSocial_2014);
		types.add(DatawebElementTypes.BaseDatos_2015);
		return types;
	}

}
