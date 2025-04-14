/**
 */
package dataweb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dataweb.DatawebFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface DatawebPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataweb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dataweb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataweb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatawebPackage eINSTANCE = dataweb.impl.DatawebPackageImpl.init();

	/**
	 * The meta object id for the '{@link dataweb.impl.AplicacionImpl <em>Aplicacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.AplicacionImpl
	 * @see dataweb.impl.DatawebPackageImpl#getAplicacion()
	 * @generated
	 */
	int APLICACION = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Redessociales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__REDESSOCIALES = 2;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__DESCRIPCION = 3;

	/**
	 * The feature id for the '<em><b>Paginapantallas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__PAGINAPANTALLAS = 4;

	/**
	 * The feature id for the '<em><b>Basedatos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__BASEDATOS = 5;

	/**
	 * The number of structural features of the '<em>Aplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Aplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.BaseDatosImpl <em>Base Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.BaseDatosImpl
	 * @see dataweb.impl.DatawebPackageImpl#getBaseDatos()
	 * @generated
	 */
	int BASE_DATOS = 1;

	/**
	 * The feature id for the '<em><b>Tablas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS__TABLAS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Base Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.EntidadImpl <em>Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.EntidadImpl
	 * @see dataweb.impl.DatawebPackageImpl#getEntidad()
	 * @generated
	 */
	int ENTIDAD = 2;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__ATRIBUTOS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Indice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__INDICE = 2;

	/**
	 * The feature id for the '<em><b>Entidad Refereenciada</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__ENTIDAD_REFEREENCIADA = 3;

	/**
	 * The feature id for the '<em><b>Usuarios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__USUARIOS = 4;

	/**
	 * The number of structural features of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.AtributoImpl
	 * @see dataweb.impl.DatawebPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO_ATRIBUTO = 1;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__PRIMARY_KEY = 2;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.PaginaPantallaImpl <em>Pagina Pantalla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.PaginaPantallaImpl
	 * @see dataweb.impl.DatawebPackageImpl#getPaginaPantalla()
	 * @generated
	 */
	int PAGINA_PANTALLA = 22;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_PANTALLA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_PANTALLA__USUARIO = 1;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_PANTALLA__REDSOCIAL = 2;

	/**
	 * The number of structural features of the '<em>Pagina Pantalla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_PANTALLA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pagina Pantalla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_PANTALLA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.DependienteDeEntidadImpl <em>Dependiente De Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.DependienteDeEntidadImpl
	 * @see dataweb.impl.DatawebPackageImpl#getDependienteDeEntidad()
	 * @generated
	 */
	int DEPENDIENTE_DE_ENTIDAD = 13;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDIENTE_DE_ENTIDAD__NOMBRE = PAGINA_PANTALLA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDIENTE_DE_ENTIDAD__USUARIO = PAGINA_PANTALLA__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDIENTE_DE_ENTIDAD__REDSOCIAL = PAGINA_PANTALLA__REDSOCIAL;

	/**
	 * The number of structural features of the '<em>Dependiente De Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDIENTE_DE_ENTIDAD_FEATURE_COUNT = PAGINA_PANTALLA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependiente De Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDIENTE_DE_ENTIDAD_OPERATION_COUNT = PAGINA_PANTALLA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.CrearInstanciaImpl <em>Crear Instancia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.CrearInstanciaImpl
	 * @see dataweb.impl.DatawebPackageImpl#getCrearInstancia()
	 * @generated
	 */
	int CREAR_INSTANCIA = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAR_INSTANCIA__NOMBRE = DEPENDIENTE_DE_ENTIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAR_INSTANCIA__USUARIO = DEPENDIENTE_DE_ENTIDAD__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAR_INSTANCIA__REDSOCIAL = DEPENDIENTE_DE_ENTIDAD__REDSOCIAL;

	/**
	 * The number of structural features of the '<em>Crear Instancia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAR_INSTANCIA_FEATURE_COUNT = DEPENDIENTE_DE_ENTIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Crear Instancia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAR_INSTANCIA_OPERATION_COUNT = DEPENDIENTE_DE_ENTIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.IndiceImpl <em>Indice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.IndiceImpl
	 * @see dataweb.impl.DatawebPackageImpl#getIndice()
	 * @generated
	 */
	int INDICE = 20;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE__NOMBRE = DEPENDIENTE_DE_ENTIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE__USUARIO = DEPENDIENTE_DE_ENTIDAD__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE__REDSOCIAL = DEPENDIENTE_DE_ENTIDAD__REDSOCIAL;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE__ATRIBUTOS = DEPENDIENTE_DE_ENTIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Indice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_FEATURE_COUNT = DEPENDIENTE_DE_ENTIDAD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Indice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_OPERATION_COUNT = DEPENDIENTE_DE_ENTIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.IndiceExtendidoImpl <em>Indice Extendido</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.IndiceExtendidoImpl
	 * @see dataweb.impl.DatawebPackageImpl#getIndiceExtendido()
	 * @generated
	 */
	int INDICE_EXTENDIDO = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_EXTENDIDO__NOMBRE = INDICE__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_EXTENDIDO__USUARIO = INDICE__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_EXTENDIDO__REDSOCIAL = INDICE__REDSOCIAL;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_EXTENDIDO__ATRIBUTOS = INDICE__ATRIBUTOS;

	/**
	 * The number of structural features of the '<em>Indice Extendido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_EXTENDIDO_FEATURE_COUNT = INDICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Indice Extendido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_EXTENDIDO_OPERATION_COUNT = INDICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.DetallesInstanciaImpl <em>Detalles Instancia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.DetallesInstanciaImpl
	 * @see dataweb.impl.DatawebPackageImpl#getDetallesInstancia()
	 * @generated
	 */
	int DETALLES_INSTANCIA = 6;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLES_INSTANCIA__NOMBRE = DEPENDIENTE_DE_ENTIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLES_INSTANCIA__USUARIO = DEPENDIENTE_DE_ENTIDAD__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLES_INSTANCIA__REDSOCIAL = DEPENDIENTE_DE_ENTIDAD__REDSOCIAL;

	/**
	 * The number of structural features of the '<em>Detalles Instancia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLES_INSTANCIA_FEATURE_COUNT = DEPENDIENTE_DE_ENTIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Detalles Instancia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLES_INSTANCIA_OPERATION_COUNT = DEPENDIENTE_DE_ENTIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.ActualizacionInstanciaImpl <em>Actualizacion Instancia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.ActualizacionInstanciaImpl
	 * @see dataweb.impl.DatawebPackageImpl#getActualizacionInstancia()
	 * @generated
	 */
	int ACTUALIZACION_INSTANCIA = 7;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALIZACION_INSTANCIA__NOMBRE = DEPENDIENTE_DE_ENTIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALIZACION_INSTANCIA__USUARIO = DEPENDIENTE_DE_ENTIDAD__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALIZACION_INSTANCIA__REDSOCIAL = DEPENDIENTE_DE_ENTIDAD__REDSOCIAL;

	/**
	 * The number of structural features of the '<em>Actualizacion Instancia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALIZACION_INSTANCIA_FEATURE_COUNT = DEPENDIENTE_DE_ENTIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actualizacion Instancia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALIZACION_INSTANCIA_OPERATION_COUNT = DEPENDIENTE_DE_ENTIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.IndiceEntidadImpl <em>Indice Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.IndiceEntidadImpl
	 * @see dataweb.impl.DatawebPackageImpl#getIndiceEntidad()
	 * @generated
	 */
	int INDICE_ENTIDAD = 8;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_ENTIDAD__NOMBRE = INDICE__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_ENTIDAD__USUARIO = INDICE__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_ENTIDAD__REDSOCIAL = INDICE__REDSOCIAL;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_ENTIDAD__ATRIBUTOS = INDICE__ATRIBUTOS;

	/**
	 * The number of structural features of the '<em>Indice Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_ENTIDAD_FEATURE_COUNT = INDICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Indice Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_ENTIDAD_OPERATION_COUNT = INDICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.IndiceDetalleImpl <em>Indice Detalle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.IndiceDetalleImpl
	 * @see dataweb.impl.DatawebPackageImpl#getIndiceDetalle()
	 * @generated
	 */
	int INDICE_DETALLE = 9;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_DETALLE__NOMBRE = INDICE__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_DETALLE__USUARIO = INDICE__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_DETALLE__REDSOCIAL = INDICE__REDSOCIAL;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_DETALLE__ATRIBUTOS = INDICE__ATRIBUTOS;

	/**
	 * The number of structural features of the '<em>Indice Detalle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_DETALLE_FEATURE_COUNT = INDICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Indice Detalle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICE_DETALLE_OPERATION_COUNT = INDICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.BorradoInstanciaImpl <em>Borrado Instancia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.BorradoInstanciaImpl
	 * @see dataweb.impl.DatawebPackageImpl#getBorradoInstancia()
	 * @generated
	 */
	int BORRADO_INSTANCIA = 10;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO_INSTANCIA__NOMBRE = DEPENDIENTE_DE_ENTIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO_INSTANCIA__USUARIO = DEPENDIENTE_DE_ENTIDAD__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO_INSTANCIA__REDSOCIAL = DEPENDIENTE_DE_ENTIDAD__REDSOCIAL;

	/**
	 * The number of structural features of the '<em>Borrado Instancia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO_INSTANCIA_FEATURE_COUNT = DEPENDIENTE_DE_ENTIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Borrado Instancia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO_INSTANCIA_OPERATION_COUNT = DEPENDIENTE_DE_ENTIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.InteractivaImpl <em>Interactiva</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.InteractivaImpl
	 * @see dataweb.impl.DatawebPackageImpl#getInteractiva()
	 * @generated
	 */
	int INTERACTIVA = 16;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVA__NOMBRE = PAGINA_PANTALLA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVA__USUARIO = PAGINA_PANTALLA__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVA__REDSOCIAL = PAGINA_PANTALLA__REDSOCIAL;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVA__DESCRIPCION = PAGINA_PANTALLA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interactiva</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVA_FEATURE_COUNT = PAGINA_PANTALLA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interactiva</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVA_OPERATION_COUNT = PAGINA_PANTALLA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.CuestionarioImpl <em>Cuestionario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.CuestionarioImpl
	 * @see dataweb.impl.DatawebPackageImpl#getCuestionario()
	 * @generated
	 */
	int CUESTIONARIO = 11;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUESTIONARIO__NOMBRE = INTERACTIVA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUESTIONARIO__USUARIO = INTERACTIVA__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUESTIONARIO__REDSOCIAL = INTERACTIVA__REDSOCIAL;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUESTIONARIO__DESCRIPCION = INTERACTIVA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Evaluado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUESTIONARIO__EVALUADO = INTERACTIVA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cuestionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUESTIONARIO_FEATURE_COUNT = INTERACTIVA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cuestionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUESTIONARIO_OPERATION_COUNT = INTERACTIVA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.PreguntaImpl <em>Pregunta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.PreguntaImpl
	 * @see dataweb.impl.DatawebPackageImpl#getPregunta()
	 * @generated
	 */
	int PREGUNTA = 12;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__NOMBRE = INTERACTIVA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__USUARIO = INTERACTIVA__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__REDSOCIAL = INTERACTIVA__REDSOCIAL;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__DESCRIPCION = INTERACTIVA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__TIPO = INTERACTIVA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Respuestas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__RESPUESTAS = INTERACTIVA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__TEXTO = INTERACTIVA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Encuestas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__ENCUESTAS = INTERACTIVA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cuestionarios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__CUESTIONARIOS = INTERACTIVA_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pregunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_FEATURE_COUNT = INTERACTIVA_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Pregunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_OPERATION_COUNT = INTERACTIVA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.NormalImpl <em>Normal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.NormalImpl
	 * @see dataweb.impl.DatawebPackageImpl#getNormal()
	 * @generated
	 */
	int NORMAL = 14;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__NOMBRE = PAGINA_PANTALLA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__USUARIO = PAGINA_PANTALLA__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__REDSOCIAL = PAGINA_PANTALLA__REDSOCIAL;

	/**
	 * The feature id for the '<em><b>Contenido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__CONTENIDO = PAGINA_PANTALLA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contenidomultimedia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__CONTENIDOMULTIMEDIA = PAGINA_PANTALLA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FEATURE_COUNT = PAGINA_PANTALLA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_OPERATION_COUNT = PAGINA_PANTALLA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.EncuestaImpl <em>Encuesta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.EncuestaImpl
	 * @see dataweb.impl.DatawebPackageImpl#getEncuesta()
	 * @generated
	 */
	int ENCUESTA = 15;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA__NOMBRE = INTERACTIVA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA__USUARIO = INTERACTIVA__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA__REDSOCIAL = INTERACTIVA__REDSOCIAL;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA__DESCRIPCION = INTERACTIVA__DESCRIPCION;

	/**
	 * The number of structural features of the '<em>Encuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA_FEATURE_COUNT = INTERACTIVA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Encuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA_OPERATION_COUNT = INTERACTIVA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.RespuestaImpl <em>Respuesta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.RespuestaImpl
	 * @see dataweb.impl.DatawebPackageImpl#getRespuesta()
	 * @generated
	 */
	int RESPUESTA = 17;

	/**
	 * The feature id for the '<em><b>Rcorrecta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA__RCORRECTA = 0;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA__TEXTO = 1;

	/**
	 * The number of structural features of the '<em>Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.RolImpl <em>Rol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.RolImpl
	 * @see dataweb.impl.DatawebPackageImpl#getRol()
	 * @generated
	 */
	int ROL = 18;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Entidades</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ENTIDADES = 1;

	/**
	 * The feature id for the '<em><b>Accesoapaginapantalla</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ACCESOAPAGINAPANTALLA = 2;

	/**
	 * The number of structural features of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.RedSocialImpl <em>Red Social</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.RedSocialImpl
	 * @see dataweb.impl.DatawebPackageImpl#getRedSocial()
	 * @generated
	 */
	int RED_SOCIAL = 19;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_SOCIAL__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Paginapantalla</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_SOCIAL__PAGINAPANTALLA = 1;

	/**
	 * The number of structural features of the '<em>Red Social</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_SOCIAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Red Social</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_SOCIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.ContenidoMultimediaImpl <em>Contenido Multimedia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.ContenidoMultimediaImpl
	 * @see dataweb.impl.DatawebPackageImpl#getContenidoMultimedia()
	 * @generated
	 */
	int CONTENIDO_MULTIMEDIA = 21;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENIDO_MULTIMEDIA__TIPO = 0;

	/**
	 * The number of structural features of the '<em>Contenido Multimedia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENIDO_MULTIMEDIA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contenido Multimedia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENIDO_MULTIMEDIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.IndexImpl
	 * @see dataweb.impl.DatawebPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 23;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NOMBRE = PAGINA_PANTALLA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__USUARIO = PAGINA_PANTALLA__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__REDSOCIAL = PAGINA_PANTALLA__REDSOCIAL;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = PAGINA_PANTALLA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = PAGINA_PANTALLA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.impl.CRUDImpl <em>CRUD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.impl.CRUDImpl
	 * @see dataweb.impl.DatawebPackageImpl#getCRUD()
	 * @generated
	 */
	int CRUD = 24;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD__NOMBRE = DEPENDIENTE_DE_ENTIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD__USUARIO = DEPENDIENTE_DE_ENTIDAD__USUARIO;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD__REDSOCIAL = DEPENDIENTE_DE_ENTIDAD__REDSOCIAL;

	/**
	 * The number of structural features of the '<em>CRUD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_FEATURE_COUNT = DEPENDIENTE_DE_ENTIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CRUD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_OPERATION_COUNT = DEPENDIENTE_DE_ENTIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataweb.TipoPregunta <em>Tipo Pregunta</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.TipoPregunta
	 * @see dataweb.impl.DatawebPackageImpl#getTipoPregunta()
	 * @generated
	 */
	int TIPO_PREGUNTA = 25;

	/**
	 * The meta object id for the '{@link dataweb.TipoAtributo <em>Tipo Atributo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataweb.TipoAtributo
	 * @see dataweb.impl.DatawebPackageImpl#getTipoAtributo()
	 * @generated
	 */
	int TIPO_ATRIBUTO = 26;


	/**
	 * Returns the meta object for class '{@link dataweb.Aplicacion <em>Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aplicacion</em>'.
	 * @see dataweb.Aplicacion
	 * @generated
	 */
	EClass getAplicacion();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.Aplicacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dataweb.Aplicacion#getNombre()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link dataweb.Aplicacion#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see dataweb.Aplicacion#getRoles()
	 * @see #getAplicacion()
	 * @generated
	 */
	EReference getAplicacion_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link dataweb.Aplicacion#getRedessociales <em>Redessociales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Redessociales</em>'.
	 * @see dataweb.Aplicacion#getRedessociales()
	 * @see #getAplicacion()
	 * @generated
	 */
	EReference getAplicacion_Redessociales();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.Aplicacion#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see dataweb.Aplicacion#getDescripcion()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_Descripcion();

	/**
	 * Returns the meta object for the containment reference list '{@link dataweb.Aplicacion#getPaginapantallas <em>Paginapantallas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paginapantallas</em>'.
	 * @see dataweb.Aplicacion#getPaginapantallas()
	 * @see #getAplicacion()
	 * @generated
	 */
	EReference getAplicacion_Paginapantallas();

	/**
	 * Returns the meta object for the containment reference list '{@link dataweb.Aplicacion#getBasedatos <em>Basedatos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basedatos</em>'.
	 * @see dataweb.Aplicacion#getBasedatos()
	 * @see #getAplicacion()
	 * @generated
	 */
	EReference getAplicacion_Basedatos();

	/**
	 * Returns the meta object for class '{@link dataweb.BaseDatos <em>Base Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Datos</em>'.
	 * @see dataweb.BaseDatos
	 * @generated
	 */
	EClass getBaseDatos();

	/**
	 * Returns the meta object for the containment reference list '{@link dataweb.BaseDatos#getTablas <em>Tablas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tablas</em>'.
	 * @see dataweb.BaseDatos#getTablas()
	 * @see #getBaseDatos()
	 * @generated
	 */
	EReference getBaseDatos_Tablas();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.BaseDatos#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dataweb.BaseDatos#getNombre()
	 * @see #getBaseDatos()
	 * @generated
	 */
	EAttribute getBaseDatos_Nombre();

	/**
	 * Returns the meta object for class '{@link dataweb.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad</em>'.
	 * @see dataweb.Entidad
	 * @generated
	 */
	EClass getEntidad();

	/**
	 * Returns the meta object for the containment reference list '{@link dataweb.Entidad#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see dataweb.Entidad#getAtributos()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Atributos();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.Entidad#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dataweb.Entidad#getNombre()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_Nombre();

	/**
	 * Returns the meta object for the reference '{@link dataweb.Entidad#getIndice <em>Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Indice</em>'.
	 * @see dataweb.Entidad#getIndice()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Indice();

	/**
	 * Returns the meta object for the reference list '{@link dataweb.Entidad#getEntidadRefereenciada <em>Entidad Refereenciada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entidad Refereenciada</em>'.
	 * @see dataweb.Entidad#getEntidadRefereenciada()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_EntidadRefereenciada();

	/**
	 * Returns the meta object for the reference list '{@link dataweb.Entidad#getUsuarios <em>Usuarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usuarios</em>'.
	 * @see dataweb.Entidad#getUsuarios()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Usuarios();

	/**
	 * Returns the meta object for class '{@link dataweb.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see dataweb.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.Atributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dataweb.Atributo#getNombre()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.Atributo#getTipoAtributo <em>Tipo Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Atributo</em>'.
	 * @see dataweb.Atributo#getTipoAtributo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_TipoAtributo();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.Atributo#isPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see dataweb.Atributo#isPrimaryKey()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_PrimaryKey();

	/**
	 * Returns the meta object for class '{@link dataweb.CrearInstancia <em>Crear Instancia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crear Instancia</em>'.
	 * @see dataweb.CrearInstancia
	 * @generated
	 */
	EClass getCrearInstancia();

	/**
	 * Returns the meta object for class '{@link dataweb.IndiceExtendido <em>Indice Extendido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indice Extendido</em>'.
	 * @see dataweb.IndiceExtendido
	 * @generated
	 */
	EClass getIndiceExtendido();

	/**
	 * Returns the meta object for class '{@link dataweb.DetallesInstancia <em>Detalles Instancia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detalles Instancia</em>'.
	 * @see dataweb.DetallesInstancia
	 * @generated
	 */
	EClass getDetallesInstancia();

	/**
	 * Returns the meta object for class '{@link dataweb.ActualizacionInstancia <em>Actualizacion Instancia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actualizacion Instancia</em>'.
	 * @see dataweb.ActualizacionInstancia
	 * @generated
	 */
	EClass getActualizacionInstancia();

	/**
	 * Returns the meta object for class '{@link dataweb.IndiceEntidad <em>Indice Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indice Entidad</em>'.
	 * @see dataweb.IndiceEntidad
	 * @generated
	 */
	EClass getIndiceEntidad();

	/**
	 * Returns the meta object for class '{@link dataweb.IndiceDetalle <em>Indice Detalle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indice Detalle</em>'.
	 * @see dataweb.IndiceDetalle
	 * @generated
	 */
	EClass getIndiceDetalle();

	/**
	 * Returns the meta object for class '{@link dataweb.BorradoInstancia <em>Borrado Instancia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Borrado Instancia</em>'.
	 * @see dataweb.BorradoInstancia
	 * @generated
	 */
	EClass getBorradoInstancia();

	/**
	 * Returns the meta object for class '{@link dataweb.Cuestionario <em>Cuestionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cuestionario</em>'.
	 * @see dataweb.Cuestionario
	 * @generated
	 */
	EClass getCuestionario();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.Cuestionario#isEvaluado <em>Evaluado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluado</em>'.
	 * @see dataweb.Cuestionario#isEvaluado()
	 * @see #getCuestionario()
	 * @generated
	 */
	EAttribute getCuestionario_Evaluado();

	/**
	 * Returns the meta object for class '{@link dataweb.Pregunta <em>Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pregunta</em>'.
	 * @see dataweb.Pregunta
	 * @generated
	 */
	EClass getPregunta();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.Pregunta#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see dataweb.Pregunta#getTipo()
	 * @see #getPregunta()
	 * @generated
	 */
	EAttribute getPregunta_Tipo();

	/**
	 * Returns the meta object for the containment reference list '{@link dataweb.Pregunta#getRespuestas <em>Respuestas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Respuestas</em>'.
	 * @see dataweb.Pregunta#getRespuestas()
	 * @see #getPregunta()
	 * @generated
	 */
	EReference getPregunta_Respuestas();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.Pregunta#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see dataweb.Pregunta#getTexto()
	 * @see #getPregunta()
	 * @generated
	 */
	EAttribute getPregunta_Texto();

	/**
	 * Returns the meta object for the reference list '{@link dataweb.Pregunta#getEncuestas <em>Encuestas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encuestas</em>'.
	 * @see dataweb.Pregunta#getEncuestas()
	 * @see #getPregunta()
	 * @generated
	 */
	EReference getPregunta_Encuestas();

	/**
	 * Returns the meta object for the reference list '{@link dataweb.Pregunta#getCuestionarios <em>Cuestionarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cuestionarios</em>'.
	 * @see dataweb.Pregunta#getCuestionarios()
	 * @see #getPregunta()
	 * @generated
	 */
	EReference getPregunta_Cuestionarios();

	/**
	 * Returns the meta object for class '{@link dataweb.DependienteDeEntidad <em>Dependiente De Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependiente De Entidad</em>'.
	 * @see dataweb.DependienteDeEntidad
	 * @generated
	 */
	EClass getDependienteDeEntidad();

	/**
	 * Returns the meta object for class '{@link dataweb.Normal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal</em>'.
	 * @see dataweb.Normal
	 * @generated
	 */
	EClass getNormal();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.Normal#getContenido <em>Contenido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenido</em>'.
	 * @see dataweb.Normal#getContenido()
	 * @see #getNormal()
	 * @generated
	 */
	EAttribute getNormal_Contenido();

	/**
	 * Returns the meta object for the containment reference list '{@link dataweb.Normal#getContenidomultimedia <em>Contenidomultimedia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contenidomultimedia</em>'.
	 * @see dataweb.Normal#getContenidomultimedia()
	 * @see #getNormal()
	 * @generated
	 */
	EReference getNormal_Contenidomultimedia();

	/**
	 * Returns the meta object for class '{@link dataweb.Encuesta <em>Encuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encuesta</em>'.
	 * @see dataweb.Encuesta
	 * @generated
	 */
	EClass getEncuesta();

	/**
	 * Returns the meta object for class '{@link dataweb.Interactiva <em>Interactiva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interactiva</em>'.
	 * @see dataweb.Interactiva
	 * @generated
	 */
	EClass getInteractiva();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.Interactiva#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see dataweb.Interactiva#getDescripcion()
	 * @see #getInteractiva()
	 * @generated
	 */
	EAttribute getInteractiva_Descripcion();

	/**
	 * Returns the meta object for class '{@link dataweb.Respuesta <em>Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Respuesta</em>'.
	 * @see dataweb.Respuesta
	 * @generated
	 */
	EClass getRespuesta();

	/**
	 * Returns the meta object for the reference '{@link dataweb.Respuesta#getRcorrecta <em>Rcorrecta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rcorrecta</em>'.
	 * @see dataweb.Respuesta#getRcorrecta()
	 * @see #getRespuesta()
	 * @generated
	 */
	EReference getRespuesta_Rcorrecta();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.Respuesta#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see dataweb.Respuesta#getTexto()
	 * @see #getRespuesta()
	 * @generated
	 */
	EAttribute getRespuesta_Texto();

	/**
	 * Returns the meta object for class '{@link dataweb.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rol</em>'.
	 * @see dataweb.Rol
	 * @generated
	 */
	EClass getRol();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.Rol#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dataweb.Rol#getNombre()
	 * @see #getRol()
	 * @generated
	 */
	EAttribute getRol_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link dataweb.Rol#getEntidades <em>Entidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entidades</em>'.
	 * @see dataweb.Rol#getEntidades()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Entidades();

	/**
	 * Returns the meta object for the reference list '{@link dataweb.Rol#getAccesoapaginapantalla <em>Accesoapaginapantalla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesoapaginapantalla</em>'.
	 * @see dataweb.Rol#getAccesoapaginapantalla()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Accesoapaginapantalla();

	/**
	 * Returns the meta object for class '{@link dataweb.RedSocial <em>Red Social</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Red Social</em>'.
	 * @see dataweb.RedSocial
	 * @generated
	 */
	EClass getRedSocial();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.RedSocial#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dataweb.RedSocial#getNombre()
	 * @see #getRedSocial()
	 * @generated
	 */
	EAttribute getRedSocial_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link dataweb.RedSocial#getPaginapantalla <em>Paginapantalla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Paginapantalla</em>'.
	 * @see dataweb.RedSocial#getPaginapantalla()
	 * @see #getRedSocial()
	 * @generated
	 */
	EReference getRedSocial_Paginapantalla();

	/**
	 * Returns the meta object for class '{@link dataweb.Indice <em>Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indice</em>'.
	 * @see dataweb.Indice
	 * @generated
	 */
	EClass getIndice();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.Indice#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Atributos</em>'.
	 * @see dataweb.Indice#getAtributos()
	 * @see #getIndice()
	 * @generated
	 */
	EAttribute getIndice_Atributos();

	/**
	 * Returns the meta object for class '{@link dataweb.ContenidoMultimedia <em>Contenido Multimedia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenido Multimedia</em>'.
	 * @see dataweb.ContenidoMultimedia
	 * @generated
	 */
	EClass getContenidoMultimedia();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.ContenidoMultimedia#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see dataweb.ContenidoMultimedia#getTipo()
	 * @see #getContenidoMultimedia()
	 * @generated
	 */
	EAttribute getContenidoMultimedia_Tipo();

	/**
	 * Returns the meta object for class '{@link dataweb.PaginaPantalla <em>Pagina Pantalla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagina Pantalla</em>'.
	 * @see dataweb.PaginaPantalla
	 * @generated
	 */
	EClass getPaginaPantalla();

	/**
	 * Returns the meta object for the attribute '{@link dataweb.PaginaPantalla#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dataweb.PaginaPantalla#getNombre()
	 * @see #getPaginaPantalla()
	 * @generated
	 */
	EAttribute getPaginaPantalla_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link dataweb.PaginaPantalla#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usuario</em>'.
	 * @see dataweb.PaginaPantalla#getUsuario()
	 * @see #getPaginaPantalla()
	 * @generated
	 */
	EReference getPaginaPantalla_Usuario();

	/**
	 * Returns the meta object for the reference list '{@link dataweb.PaginaPantalla#getRedsocial <em>Redsocial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redsocial</em>'.
	 * @see dataweb.PaginaPantalla#getRedsocial()
	 * @see #getPaginaPantalla()
	 * @generated
	 */
	EReference getPaginaPantalla_Redsocial();

	/**
	 * Returns the meta object for class '{@link dataweb.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see dataweb.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for class '{@link dataweb.CRUD <em>CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRUD</em>'.
	 * @see dataweb.CRUD
	 * @generated
	 */
	EClass getCRUD();

	/**
	 * Returns the meta object for enum '{@link dataweb.TipoPregunta <em>Tipo Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Pregunta</em>'.
	 * @see dataweb.TipoPregunta
	 * @generated
	 */
	EEnum getTipoPregunta();

	/**
	 * Returns the meta object for enum '{@link dataweb.TipoAtributo <em>Tipo Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Atributo</em>'.
	 * @see dataweb.TipoAtributo
	 * @generated
	 */
	EEnum getTipoAtributo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatawebFactory getDatawebFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dataweb.impl.AplicacionImpl <em>Aplicacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.AplicacionImpl
		 * @see dataweb.impl.DatawebPackageImpl#getAplicacion()
		 * @generated
		 */
		EClass APLICACION = eINSTANCE.getAplicacion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__NOMBRE = eINSTANCE.getAplicacion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACION__ROLES = eINSTANCE.getAplicacion_Roles();

		/**
		 * The meta object literal for the '<em><b>Redessociales</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACION__REDESSOCIALES = eINSTANCE.getAplicacion_Redessociales();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__DESCRIPCION = eINSTANCE.getAplicacion_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Paginapantallas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACION__PAGINAPANTALLAS = eINSTANCE.getAplicacion_Paginapantallas();

		/**
		 * The meta object literal for the '<em><b>Basedatos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACION__BASEDATOS = eINSTANCE.getAplicacion_Basedatos();

		/**
		 * The meta object literal for the '{@link dataweb.impl.BaseDatosImpl <em>Base Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.BaseDatosImpl
		 * @see dataweb.impl.DatawebPackageImpl#getBaseDatos()
		 * @generated
		 */
		EClass BASE_DATOS = eINSTANCE.getBaseDatos();

		/**
		 * The meta object literal for the '<em><b>Tablas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_DATOS__TABLAS = eINSTANCE.getBaseDatos_Tablas();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_DATOS__NOMBRE = eINSTANCE.getBaseDatos_Nombre();

		/**
		 * The meta object literal for the '{@link dataweb.impl.EntidadImpl <em>Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.EntidadImpl
		 * @see dataweb.impl.DatawebPackageImpl#getEntidad()
		 * @generated
		 */
		EClass ENTIDAD = eINSTANCE.getEntidad();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__ATRIBUTOS = eINSTANCE.getEntidad_Atributos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__NOMBRE = eINSTANCE.getEntidad_Nombre();

		/**
		 * The meta object literal for the '<em><b>Indice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__INDICE = eINSTANCE.getEntidad_Indice();

		/**
		 * The meta object literal for the '<em><b>Entidad Refereenciada</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__ENTIDAD_REFEREENCIADA = eINSTANCE.getEntidad_EntidadRefereenciada();

		/**
		 * The meta object literal for the '<em><b>Usuarios</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__USUARIOS = eINSTANCE.getEntidad_Usuarios();

		/**
		 * The meta object literal for the '{@link dataweb.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.AtributoImpl
		 * @see dataweb.impl.DatawebPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOMBRE = eINSTANCE.getAtributo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo Atributo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO_ATRIBUTO = eINSTANCE.getAtributo_TipoAtributo();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__PRIMARY_KEY = eINSTANCE.getAtributo_PrimaryKey();

		/**
		 * The meta object literal for the '{@link dataweb.impl.CrearInstanciaImpl <em>Crear Instancia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.CrearInstanciaImpl
		 * @see dataweb.impl.DatawebPackageImpl#getCrearInstancia()
		 * @generated
		 */
		EClass CREAR_INSTANCIA = eINSTANCE.getCrearInstancia();

		/**
		 * The meta object literal for the '{@link dataweb.impl.IndiceExtendidoImpl <em>Indice Extendido</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.IndiceExtendidoImpl
		 * @see dataweb.impl.DatawebPackageImpl#getIndiceExtendido()
		 * @generated
		 */
		EClass INDICE_EXTENDIDO = eINSTANCE.getIndiceExtendido();

		/**
		 * The meta object literal for the '{@link dataweb.impl.DetallesInstanciaImpl <em>Detalles Instancia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.DetallesInstanciaImpl
		 * @see dataweb.impl.DatawebPackageImpl#getDetallesInstancia()
		 * @generated
		 */
		EClass DETALLES_INSTANCIA = eINSTANCE.getDetallesInstancia();

		/**
		 * The meta object literal for the '{@link dataweb.impl.ActualizacionInstanciaImpl <em>Actualizacion Instancia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.ActualizacionInstanciaImpl
		 * @see dataweb.impl.DatawebPackageImpl#getActualizacionInstancia()
		 * @generated
		 */
		EClass ACTUALIZACION_INSTANCIA = eINSTANCE.getActualizacionInstancia();

		/**
		 * The meta object literal for the '{@link dataweb.impl.IndiceEntidadImpl <em>Indice Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.IndiceEntidadImpl
		 * @see dataweb.impl.DatawebPackageImpl#getIndiceEntidad()
		 * @generated
		 */
		EClass INDICE_ENTIDAD = eINSTANCE.getIndiceEntidad();

		/**
		 * The meta object literal for the '{@link dataweb.impl.IndiceDetalleImpl <em>Indice Detalle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.IndiceDetalleImpl
		 * @see dataweb.impl.DatawebPackageImpl#getIndiceDetalle()
		 * @generated
		 */
		EClass INDICE_DETALLE = eINSTANCE.getIndiceDetalle();

		/**
		 * The meta object literal for the '{@link dataweb.impl.BorradoInstanciaImpl <em>Borrado Instancia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.BorradoInstanciaImpl
		 * @see dataweb.impl.DatawebPackageImpl#getBorradoInstancia()
		 * @generated
		 */
		EClass BORRADO_INSTANCIA = eINSTANCE.getBorradoInstancia();

		/**
		 * The meta object literal for the '{@link dataweb.impl.CuestionarioImpl <em>Cuestionario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.CuestionarioImpl
		 * @see dataweb.impl.DatawebPackageImpl#getCuestionario()
		 * @generated
		 */
		EClass CUESTIONARIO = eINSTANCE.getCuestionario();

		/**
		 * The meta object literal for the '<em><b>Evaluado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUESTIONARIO__EVALUADO = eINSTANCE.getCuestionario_Evaluado();

		/**
		 * The meta object literal for the '{@link dataweb.impl.PreguntaImpl <em>Pregunta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.PreguntaImpl
		 * @see dataweb.impl.DatawebPackageImpl#getPregunta()
		 * @generated
		 */
		EClass PREGUNTA = eINSTANCE.getPregunta();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREGUNTA__TIPO = eINSTANCE.getPregunta_Tipo();

		/**
		 * The meta object literal for the '<em><b>Respuestas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREGUNTA__RESPUESTAS = eINSTANCE.getPregunta_Respuestas();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREGUNTA__TEXTO = eINSTANCE.getPregunta_Texto();

		/**
		 * The meta object literal for the '<em><b>Encuestas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREGUNTA__ENCUESTAS = eINSTANCE.getPregunta_Encuestas();

		/**
		 * The meta object literal for the '<em><b>Cuestionarios</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREGUNTA__CUESTIONARIOS = eINSTANCE.getPregunta_Cuestionarios();

		/**
		 * The meta object literal for the '{@link dataweb.impl.DependienteDeEntidadImpl <em>Dependiente De Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.DependienteDeEntidadImpl
		 * @see dataweb.impl.DatawebPackageImpl#getDependienteDeEntidad()
		 * @generated
		 */
		EClass DEPENDIENTE_DE_ENTIDAD = eINSTANCE.getDependienteDeEntidad();

		/**
		 * The meta object literal for the '{@link dataweb.impl.NormalImpl <em>Normal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.NormalImpl
		 * @see dataweb.impl.DatawebPackageImpl#getNormal()
		 * @generated
		 */
		EClass NORMAL = eINSTANCE.getNormal();

		/**
		 * The meta object literal for the '<em><b>Contenido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL__CONTENIDO = eINSTANCE.getNormal_Contenido();

		/**
		 * The meta object literal for the '<em><b>Contenidomultimedia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL__CONTENIDOMULTIMEDIA = eINSTANCE.getNormal_Contenidomultimedia();

		/**
		 * The meta object literal for the '{@link dataweb.impl.EncuestaImpl <em>Encuesta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.EncuestaImpl
		 * @see dataweb.impl.DatawebPackageImpl#getEncuesta()
		 * @generated
		 */
		EClass ENCUESTA = eINSTANCE.getEncuesta();

		/**
		 * The meta object literal for the '{@link dataweb.impl.InteractivaImpl <em>Interactiva</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.InteractivaImpl
		 * @see dataweb.impl.DatawebPackageImpl#getInteractiva()
		 * @generated
		 */
		EClass INTERACTIVA = eINSTANCE.getInteractiva();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTIVA__DESCRIPCION = eINSTANCE.getInteractiva_Descripcion();

		/**
		 * The meta object literal for the '{@link dataweb.impl.RespuestaImpl <em>Respuesta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.RespuestaImpl
		 * @see dataweb.impl.DatawebPackageImpl#getRespuesta()
		 * @generated
		 */
		EClass RESPUESTA = eINSTANCE.getRespuesta();

		/**
		 * The meta object literal for the '<em><b>Rcorrecta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPUESTA__RCORRECTA = eINSTANCE.getRespuesta_Rcorrecta();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPUESTA__TEXTO = eINSTANCE.getRespuesta_Texto();

		/**
		 * The meta object literal for the '{@link dataweb.impl.RolImpl <em>Rol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.RolImpl
		 * @see dataweb.impl.DatawebPackageImpl#getRol()
		 * @generated
		 */
		EClass ROL = eINSTANCE.getRol();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROL__NOMBRE = eINSTANCE.getRol_Nombre();

		/**
		 * The meta object literal for the '<em><b>Entidades</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__ENTIDADES = eINSTANCE.getRol_Entidades();

		/**
		 * The meta object literal for the '<em><b>Accesoapaginapantalla</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__ACCESOAPAGINAPANTALLA = eINSTANCE.getRol_Accesoapaginapantalla();

		/**
		 * The meta object literal for the '{@link dataweb.impl.RedSocialImpl <em>Red Social</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.RedSocialImpl
		 * @see dataweb.impl.DatawebPackageImpl#getRedSocial()
		 * @generated
		 */
		EClass RED_SOCIAL = eINSTANCE.getRedSocial();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RED_SOCIAL__NOMBRE = eINSTANCE.getRedSocial_Nombre();

		/**
		 * The meta object literal for the '<em><b>Paginapantalla</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RED_SOCIAL__PAGINAPANTALLA = eINSTANCE.getRedSocial_Paginapantalla();

		/**
		 * The meta object literal for the '{@link dataweb.impl.IndiceImpl <em>Indice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.IndiceImpl
		 * @see dataweb.impl.DatawebPackageImpl#getIndice()
		 * @generated
		 */
		EClass INDICE = eINSTANCE.getIndice();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDICE__ATRIBUTOS = eINSTANCE.getIndice_Atributos();

		/**
		 * The meta object literal for the '{@link dataweb.impl.ContenidoMultimediaImpl <em>Contenido Multimedia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.ContenidoMultimediaImpl
		 * @see dataweb.impl.DatawebPackageImpl#getContenidoMultimedia()
		 * @generated
		 */
		EClass CONTENIDO_MULTIMEDIA = eINSTANCE.getContenidoMultimedia();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENIDO_MULTIMEDIA__TIPO = eINSTANCE.getContenidoMultimedia_Tipo();

		/**
		 * The meta object literal for the '{@link dataweb.impl.PaginaPantallaImpl <em>Pagina Pantalla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.PaginaPantallaImpl
		 * @see dataweb.impl.DatawebPackageImpl#getPaginaPantalla()
		 * @generated
		 */
		EClass PAGINA_PANTALLA = eINSTANCE.getPaginaPantalla();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINA_PANTALLA__NOMBRE = eINSTANCE.getPaginaPantalla_Nombre();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA_PANTALLA__USUARIO = eINSTANCE.getPaginaPantalla_Usuario();

		/**
		 * The meta object literal for the '<em><b>Redsocial</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA_PANTALLA__REDSOCIAL = eINSTANCE.getPaginaPantalla_Redsocial();

		/**
		 * The meta object literal for the '{@link dataweb.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.IndexImpl
		 * @see dataweb.impl.DatawebPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '{@link dataweb.impl.CRUDImpl <em>CRUD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.impl.CRUDImpl
		 * @see dataweb.impl.DatawebPackageImpl#getCRUD()
		 * @generated
		 */
		EClass CRUD = eINSTANCE.getCRUD();

		/**
		 * The meta object literal for the '{@link dataweb.TipoPregunta <em>Tipo Pregunta</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.TipoPregunta
		 * @see dataweb.impl.DatawebPackageImpl#getTipoPregunta()
		 * @generated
		 */
		EEnum TIPO_PREGUNTA = eINSTANCE.getTipoPregunta();

		/**
		 * The meta object literal for the '{@link dataweb.TipoAtributo <em>Tipo Atributo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataweb.TipoAtributo
		 * @see dataweb.impl.DatawebPackageImpl#getTipoAtributo()
		 * @generated
		 */
		EEnum TIPO_ATRIBUTO = eINSTANCE.getTipoAtributo();

	}

} //DatawebPackage
