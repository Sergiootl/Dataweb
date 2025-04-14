/**
 */
package dataweb.impl;

import dataweb.ActualizacionInstancia;
import dataweb.Aplicacion;
import dataweb.Atributo;
import dataweb.BaseDatos;
import dataweb.BorradoInstancia;
import dataweb.ContenidoMultimedia;
import dataweb.CrearInstancia;
import dataweb.Cuestionario;
import dataweb.DatawebFactory;
import dataweb.DatawebPackage;
import dataweb.DependienteDeEntidad;
import dataweb.DetallesInstancia;
import dataweb.Encuesta;
import dataweb.Entidad;
import dataweb.Index;
import dataweb.Indice;
import dataweb.IndiceDetalle;
import dataweb.IndiceEntidad;
import dataweb.IndiceExtendido;
import dataweb.Interactiva;
import dataweb.Normal;
import dataweb.PaginaPantalla;
import dataweb.Pregunta;
import dataweb.RedSocial;
import dataweb.Respuesta;
import dataweb.Rol;
import dataweb.TipoAtributo;
import dataweb.TipoPregunta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatawebPackageImpl extends EPackageImpl implements DatawebPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aplicacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseDatosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entidadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crearInstanciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indiceExtendidoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detallesInstanciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualizacionInstanciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indiceEntidadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indiceDetalleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass borradoInstanciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuestionarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preguntaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependienteDeEntidadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encuestaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactivaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respuestaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redSocialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenidoMultimediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginaPantallaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoPreguntaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoAtributoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dataweb.DatawebPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatawebPackageImpl() {
		super(eNS_URI, DatawebFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DatawebPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatawebPackage init() {
		if (isInited) return (DatawebPackage)EPackage.Registry.INSTANCE.getEPackage(DatawebPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDatawebPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DatawebPackageImpl theDatawebPackage = registeredDatawebPackage instanceof DatawebPackageImpl ? (DatawebPackageImpl)registeredDatawebPackage : new DatawebPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDatawebPackage.createPackageContents();

		// Initialize created meta-data
		theDatawebPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatawebPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatawebPackage.eNS_URI, theDatawebPackage);
		return theDatawebPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAplicacion() {
		return aplicacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAplicacion_Nombre() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAplicacion_Roles() {
		return (EReference)aplicacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAplicacion_Redessociales() {
		return (EReference)aplicacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAplicacion_Descripcion() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAplicacion_Paginapantallas() {
		return (EReference)aplicacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAplicacion_Basedatos() {
		return (EReference)aplicacionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseDatos() {
		return baseDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseDatos_Tablas() {
		return (EReference)baseDatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseDatos_Nombre() {
		return (EAttribute)baseDatosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntidad() {
		return entidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntidad_Atributos() {
		return (EReference)entidadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntidad_Nombre() {
		return (EAttribute)entidadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntidad_Indice() {
		return (EReference)entidadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntidad_EntidadRefereenciada() {
		return (EReference)entidadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntidad_Usuarios() {
		return (EReference)entidadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtributo_Nombre() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtributo_TipoAtributo() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtributo_PrimaryKey() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrearInstancia() {
		return crearInstanciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndiceExtendido() {
		return indiceExtendidoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDetallesInstancia() {
		return detallesInstanciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActualizacionInstancia() {
		return actualizacionInstanciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndiceEntidad() {
		return indiceEntidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndiceDetalle() {
		return indiceDetalleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBorradoInstancia() {
		return borradoInstanciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCuestionario() {
		return cuestionarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCuestionario_Evaluado() {
		return (EAttribute)cuestionarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPregunta() {
		return preguntaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPregunta_Tipo() {
		return (EAttribute)preguntaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPregunta_Respuestas() {
		return (EReference)preguntaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPregunta_Texto() {
		return (EAttribute)preguntaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPregunta_Encuestas() {
		return (EReference)preguntaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPregunta_Cuestionarios() {
		return (EReference)preguntaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependienteDeEntidad() {
		return dependienteDeEntidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormal() {
		return normalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormal_Contenido() {
		return (EAttribute)normalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormal_Contenidomultimedia() {
		return (EReference)normalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncuesta() {
		return encuestaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteractiva() {
		return interactivaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInteractiva_Descripcion() {
		return (EAttribute)interactivaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRespuesta() {
		return respuestaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRespuesta_Rcorrecta() {
		return (EReference)respuestaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRespuesta_Texto() {
		return (EAttribute)respuestaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRol() {
		return rolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRol_Nombre() {
		return (EAttribute)rolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRol_Entidades() {
		return (EReference)rolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRol_Accesoapaginapantalla() {
		return (EReference)rolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRedSocial() {
		return redSocialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRedSocial_Nombre() {
		return (EAttribute)redSocialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRedSocial_Paginapantalla() {
		return (EReference)redSocialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndice() {
		return indiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndice_Atributos() {
		return (EAttribute)indiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContenidoMultimedia() {
		return contenidoMultimediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContenidoMultimedia_Tipo() {
		return (EAttribute)contenidoMultimediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaginaPantalla() {
		return paginaPantallaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaginaPantalla_Nombre() {
		return (EAttribute)paginaPantallaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaginaPantalla_Usuario() {
		return (EReference)paginaPantallaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaginaPantalla_Redsocial() {
		return (EReference)paginaPantallaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndex() {
		return indexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCRUD() {
		return crudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTipoPregunta() {
		return tipoPreguntaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTipoAtributo() {
		return tipoAtributoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatawebFactory getDatawebFactory() {
		return (DatawebFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aplicacionEClass = createEClass(APLICACION);
		createEAttribute(aplicacionEClass, APLICACION__NOMBRE);
		createEReference(aplicacionEClass, APLICACION__ROLES);
		createEReference(aplicacionEClass, APLICACION__REDESSOCIALES);
		createEAttribute(aplicacionEClass, APLICACION__DESCRIPCION);
		createEReference(aplicacionEClass, APLICACION__PAGINAPANTALLAS);
		createEReference(aplicacionEClass, APLICACION__BASEDATOS);

		baseDatosEClass = createEClass(BASE_DATOS);
		createEReference(baseDatosEClass, BASE_DATOS__TABLAS);
		createEAttribute(baseDatosEClass, BASE_DATOS__NOMBRE);

		entidadEClass = createEClass(ENTIDAD);
		createEReference(entidadEClass, ENTIDAD__ATRIBUTOS);
		createEAttribute(entidadEClass, ENTIDAD__NOMBRE);
		createEReference(entidadEClass, ENTIDAD__INDICE);
		createEReference(entidadEClass, ENTIDAD__ENTIDAD_REFEREENCIADA);
		createEReference(entidadEClass, ENTIDAD__USUARIOS);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__NOMBRE);
		createEAttribute(atributoEClass, ATRIBUTO__TIPO_ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__PRIMARY_KEY);

		crearInstanciaEClass = createEClass(CREAR_INSTANCIA);

		indiceExtendidoEClass = createEClass(INDICE_EXTENDIDO);

		detallesInstanciaEClass = createEClass(DETALLES_INSTANCIA);

		actualizacionInstanciaEClass = createEClass(ACTUALIZACION_INSTANCIA);

		indiceEntidadEClass = createEClass(INDICE_ENTIDAD);

		indiceDetalleEClass = createEClass(INDICE_DETALLE);

		borradoInstanciaEClass = createEClass(BORRADO_INSTANCIA);

		cuestionarioEClass = createEClass(CUESTIONARIO);
		createEAttribute(cuestionarioEClass, CUESTIONARIO__EVALUADO);

		preguntaEClass = createEClass(PREGUNTA);
		createEAttribute(preguntaEClass, PREGUNTA__TIPO);
		createEReference(preguntaEClass, PREGUNTA__RESPUESTAS);
		createEAttribute(preguntaEClass, PREGUNTA__TEXTO);
		createEReference(preguntaEClass, PREGUNTA__ENCUESTAS);
		createEReference(preguntaEClass, PREGUNTA__CUESTIONARIOS);

		dependienteDeEntidadEClass = createEClass(DEPENDIENTE_DE_ENTIDAD);

		normalEClass = createEClass(NORMAL);
		createEAttribute(normalEClass, NORMAL__CONTENIDO);
		createEReference(normalEClass, NORMAL__CONTENIDOMULTIMEDIA);

		encuestaEClass = createEClass(ENCUESTA);

		interactivaEClass = createEClass(INTERACTIVA);
		createEAttribute(interactivaEClass, INTERACTIVA__DESCRIPCION);

		respuestaEClass = createEClass(RESPUESTA);
		createEReference(respuestaEClass, RESPUESTA__RCORRECTA);
		createEAttribute(respuestaEClass, RESPUESTA__TEXTO);

		rolEClass = createEClass(ROL);
		createEAttribute(rolEClass, ROL__NOMBRE);
		createEReference(rolEClass, ROL__ENTIDADES);
		createEReference(rolEClass, ROL__ACCESOAPAGINAPANTALLA);

		redSocialEClass = createEClass(RED_SOCIAL);
		createEAttribute(redSocialEClass, RED_SOCIAL__NOMBRE);
		createEReference(redSocialEClass, RED_SOCIAL__PAGINAPANTALLA);

		indiceEClass = createEClass(INDICE);
		createEAttribute(indiceEClass, INDICE__ATRIBUTOS);

		contenidoMultimediaEClass = createEClass(CONTENIDO_MULTIMEDIA);
		createEAttribute(contenidoMultimediaEClass, CONTENIDO_MULTIMEDIA__TIPO);

		paginaPantallaEClass = createEClass(PAGINA_PANTALLA);
		createEAttribute(paginaPantallaEClass, PAGINA_PANTALLA__NOMBRE);
		createEReference(paginaPantallaEClass, PAGINA_PANTALLA__USUARIO);
		createEReference(paginaPantallaEClass, PAGINA_PANTALLA__REDSOCIAL);

		indexEClass = createEClass(INDEX);

		crudEClass = createEClass(CRUD);

		// Create enums
		tipoPreguntaEEnum = createEEnum(TIPO_PREGUNTA);
		tipoAtributoEEnum = createEEnum(TIPO_ATRIBUTO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		crearInstanciaEClass.getESuperTypes().add(this.getDependienteDeEntidad());
		indiceExtendidoEClass.getESuperTypes().add(this.getIndice());
		detallesInstanciaEClass.getESuperTypes().add(this.getDependienteDeEntidad());
		actualizacionInstanciaEClass.getESuperTypes().add(this.getDependienteDeEntidad());
		indiceEntidadEClass.getESuperTypes().add(this.getIndice());
		indiceDetalleEClass.getESuperTypes().add(this.getIndice());
		borradoInstanciaEClass.getESuperTypes().add(this.getDependienteDeEntidad());
		cuestionarioEClass.getESuperTypes().add(this.getInteractiva());
		preguntaEClass.getESuperTypes().add(this.getInteractiva());
		dependienteDeEntidadEClass.getESuperTypes().add(this.getPaginaPantalla());
		normalEClass.getESuperTypes().add(this.getPaginaPantalla());
		encuestaEClass.getESuperTypes().add(this.getInteractiva());
		interactivaEClass.getESuperTypes().add(this.getPaginaPantalla());
		indiceEClass.getESuperTypes().add(this.getDependienteDeEntidad());
		indexEClass.getESuperTypes().add(this.getPaginaPantalla());
		crudEClass.getESuperTypes().add(this.getDependienteDeEntidad());

		// Initialize classes, features, and operations; add parameters
		initEClass(aplicacionEClass, Aplicacion.class, "Aplicacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAplicacion_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicacion_Roles(), this.getRol(), null, "roles", null, 1, -1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicacion_Redessociales(), this.getRedSocial(), null, "redessociales", null, 0, -1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_Descripcion(), ecorePackage.getEString(), "Descripcion", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicacion_Paginapantallas(), this.getPaginaPantalla(), null, "paginapantallas", null, 1, -1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicacion_Basedatos(), this.getBaseDatos(), null, "basedatos", null, 0, -1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseDatosEClass, BaseDatos.class, "BaseDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseDatos_Tablas(), this.getEntidad(), null, "tablas", null, 1, -1, BaseDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseDatos_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, BaseDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entidadEClass, Entidad.class, "Entidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntidad_Atributos(), this.getAtributo(), null, "atributos", null, 1, -1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntidad_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntidad_Indice(), this.getIndice(), null, "indice", null, 1, 1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntidad_EntidadRefereenciada(), this.getEntidad(), null, "entidadRefereenciada", null, 0, -1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntidad_Usuarios(), this.getRol(), this.getRol_Entidades(), "usuarios", null, 1, -1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_TipoAtributo(), this.getTipoAtributo(), "TipoAtributo", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_PrimaryKey(), ecorePackage.getEBoolean(), "PrimaryKey", null, 1, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crearInstanciaEClass, CrearInstancia.class, "CrearInstancia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indiceExtendidoEClass, IndiceExtendido.class, "IndiceExtendido", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(detallesInstanciaEClass, DetallesInstancia.class, "DetallesInstancia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actualizacionInstanciaEClass, ActualizacionInstancia.class, "ActualizacionInstancia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indiceEntidadEClass, IndiceEntidad.class, "IndiceEntidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indiceDetalleEClass, IndiceDetalle.class, "IndiceDetalle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(borradoInstanciaEClass, BorradoInstancia.class, "BorradoInstancia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cuestionarioEClass, Cuestionario.class, "Cuestionario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCuestionario_Evaluado(), ecorePackage.getEBoolean(), "Evaluado", null, 1, 1, Cuestionario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preguntaEClass, Pregunta.class, "Pregunta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPregunta_Tipo(), this.getTipoPregunta(), "Tipo", null, 0, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPregunta_Respuestas(), this.getRespuesta(), null, "respuestas", null, 0, -1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPregunta_Texto(), ecorePackage.getEString(), "Texto", null, 0, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPregunta_Encuestas(), this.getEncuesta(), null, "encuestas", null, 0, -1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPregunta_Cuestionarios(), this.getCuestionario(), null, "cuestionarios", null, 0, -1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependienteDeEntidadEClass, DependienteDeEntidad.class, "DependienteDeEntidad", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normalEClass, Normal.class, "Normal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNormal_Contenido(), ecorePackage.getEString(), "Contenido", null, 0, 1, Normal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormal_Contenidomultimedia(), this.getContenidoMultimedia(), null, "contenidomultimedia", null, 0, -1, Normal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encuestaEClass, Encuesta.class, "Encuesta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactivaEClass, Interactiva.class, "Interactiva", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractiva_Descripcion(), ecorePackage.getEString(), "Descripcion", null, 0, 1, Interactiva.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(respuestaEClass, Respuesta.class, "Respuesta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRespuesta_Rcorrecta(), this.getCuestionario(), null, "Rcorrecta", null, 1, 1, Respuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespuesta_Texto(), ecorePackage.getEString(), "Texto", null, 0, 1, Respuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolEClass, Rol.class, "Rol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRol_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRol_Entidades(), this.getEntidad(), this.getEntidad_Usuarios(), "entidades", null, 0, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRol_Accesoapaginapantalla(), this.getPaginaPantalla(), this.getPaginaPantalla_Usuario(), "accesoapaginapantalla", null, 0, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(redSocialEClass, RedSocial.class, "RedSocial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRedSocial_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, RedSocial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRedSocial_Paginapantalla(), this.getPaginaPantalla(), this.getPaginaPantalla_Redsocial(), "paginapantalla", null, 0, -1, RedSocial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indiceEClass, Indice.class, "Indice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndice_Atributos(), ecorePackage.getEString(), "Atributos", null, 0, 1, Indice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenidoMultimediaEClass, ContenidoMultimedia.class, "ContenidoMultimedia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenidoMultimedia_Tipo(), ecorePackage.getEString(), "Tipo", null, 0, 1, ContenidoMultimedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginaPantallaEClass, PaginaPantalla.class, "PaginaPantalla", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaginaPantalla_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, PaginaPantalla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaginaPantalla_Usuario(), this.getRol(), this.getRol_Accesoapaginapantalla(), "usuario", null, 1, -1, PaginaPantalla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaginaPantalla_Redsocial(), this.getRedSocial(), this.getRedSocial_Paginapantalla(), "redsocial", null, 0, -1, PaginaPantalla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexEClass, Index.class, "Index", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(crudEClass, dataweb.CRUD.class, "CRUD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(tipoPreguntaEEnum, TipoPregunta.class, "TipoPregunta");
		addEEnumLiteral(tipoPreguntaEEnum, TipoPregunta.OPCION_MULTIPLE);
		addEEnumLiteral(tipoPreguntaEEnum, TipoPregunta.VF);
		addEEnumLiteral(tipoPreguntaEEnum, TipoPregunta.CORTA);

		initEEnum(tipoAtributoEEnum, TipoAtributo.class, "TipoAtributo");
		addEEnumLiteral(tipoAtributoEEnum, TipoAtributo.INTEGER);
		addEEnumLiteral(tipoAtributoEEnum, TipoAtributo.BOOLEAN);
		addEEnumLiteral(tipoAtributoEEnum, TipoAtributo.STRING);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

} //DatawebPackageImpl
