/**
 */
package dataweb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dataweb.DatawebPackage
 * @generated
 */
public interface DatawebFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatawebFactory eINSTANCE = dataweb.impl.DatawebFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aplicacion</em>'.
	 * @generated
	 */
	Aplicacion createAplicacion();

	/**
	 * Returns a new object of class '<em>Base Datos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Datos</em>'.
	 * @generated
	 */
	BaseDatos createBaseDatos();

	/**
	 * Returns a new object of class '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidad</em>'.
	 * @generated
	 */
	Entidad createEntidad();

	/**
	 * Returns a new object of class '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo</em>'.
	 * @generated
	 */
	Atributo createAtributo();

	/**
	 * Returns a new object of class '<em>Crear Instancia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crear Instancia</em>'.
	 * @generated
	 */
	CrearInstancia createCrearInstancia();

	/**
	 * Returns a new object of class '<em>Indice Extendido</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indice Extendido</em>'.
	 * @generated
	 */
	IndiceExtendido createIndiceExtendido();

	/**
	 * Returns a new object of class '<em>Detalles Instancia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detalles Instancia</em>'.
	 * @generated
	 */
	DetallesInstancia createDetallesInstancia();

	/**
	 * Returns a new object of class '<em>Actualizacion Instancia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actualizacion Instancia</em>'.
	 * @generated
	 */
	ActualizacionInstancia createActualizacionInstancia();

	/**
	 * Returns a new object of class '<em>Indice Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indice Entidad</em>'.
	 * @generated
	 */
	IndiceEntidad createIndiceEntidad();

	/**
	 * Returns a new object of class '<em>Indice Detalle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indice Detalle</em>'.
	 * @generated
	 */
	IndiceDetalle createIndiceDetalle();

	/**
	 * Returns a new object of class '<em>Borrado Instancia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Borrado Instancia</em>'.
	 * @generated
	 */
	BorradoInstancia createBorradoInstancia();

	/**
	 * Returns a new object of class '<em>Cuestionario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cuestionario</em>'.
	 * @generated
	 */
	Cuestionario createCuestionario();

	/**
	 * Returns a new object of class '<em>Pregunta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pregunta</em>'.
	 * @generated
	 */
	Pregunta createPregunta();

	/**
	 * Returns a new object of class '<em>Normal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal</em>'.
	 * @generated
	 */
	Normal createNormal();

	/**
	 * Returns a new object of class '<em>Encuesta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encuesta</em>'.
	 * @generated
	 */
	Encuesta createEncuesta();

	/**
	 * Returns a new object of class '<em>Respuesta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Respuesta</em>'.
	 * @generated
	 */
	Respuesta createRespuesta();

	/**
	 * Returns a new object of class '<em>Rol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rol</em>'.
	 * @generated
	 */
	Rol createRol();

	/**
	 * Returns a new object of class '<em>Red Social</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Red Social</em>'.
	 * @generated
	 */
	RedSocial createRedSocial();

	/**
	 * Returns a new object of class '<em>Contenido Multimedia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenido Multimedia</em>'.
	 * @generated
	 */
	ContenidoMultimedia createContenidoMultimedia();

	/**
	 * Returns a new object of class '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index</em>'.
	 * @generated
	 */
	Index createIndex();

	/**
	 * Returns a new object of class '<em>CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CRUD</em>'.
	 * @generated
	 */
	CRUD createCRUD();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatawebPackage getDatawebPackage();

} //DatawebFactory
