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

import dataweb.util.DatawebValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDatawebPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return DatawebValidator.INSTANCE;
				 }
			 });

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
	public EAttribute getAplicacion_PaginasMediasAccesibles() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAplicacion__R01_index_unico__DiagnosticChain_Map() {
		return aplicacionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAplicacion__R04_fuentes_externas_minimas__DiagnosticChain_Map() {
		return aplicacionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAplicacion__R06b_encuesta_y_cuestionario__DiagnosticChain_Map() {
		return aplicacionEClass.getEOperations().get(2);
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
	public EReference getEntidad_EntidadRefereenciada() {
		return (EReference)entidadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntidad_Usuarios() {
		return (EReference)entidadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntidad__R05_no_autorreferencia__DiagnosticChain_Map() {
		return entidadEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntidad__R03_indice_y_detalle_van_juntos__DiagnosticChain_Map() {
		return entidadEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntidad__R02_crud_no_combinado__DiagnosticChain_Map() {
		return entidadEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntidad__R08_indice_unico_por_entidad__DiagnosticChain_Map() {
		return entidadEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntidad__R06_no_referencia_inversa__DiagnosticChain_Map() {
		return entidadEClass.getEOperations().get(4);
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
	public EReference getCuestionario_PreguntasC() {
		return (EReference)cuestionarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCuestionario_NumeroPregVF() {
		return (EAttribute)cuestionarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCuestionario_NumeroPregSelect() {
		return (EAttribute)cuestionarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCuestionario__R07a_cuestionario_preguntas_con_respuesta_correcta__DiagnosticChain_Map() {
		return cuestionarioEClass.getEOperations().get(0);
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
	public EReference getPregunta_Rcorrecta() {
		return (EReference)preguntaEClass.getEStructuralFeatures().get(3);
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
	public EReference getEncuesta_PreguntasE() {
		return (EReference)encuestaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncuesta_NumeroPregVF() {
		return (EAttribute)encuestaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncuesta_NumeroPregSelect() {
		return (EAttribute)encuestaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEncuesta__R07b_encuesta_sin_respuesta_correcta__DiagnosticChain_Map() {
		return encuestaEClass.getEOperations().get(0);
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
	public EAttribute getRespuesta_Texto() {
		return (EAttribute)respuestaEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getRol_NumeroEntidadesAccesibles() {
		return (EAttribute)rolEClass.getEStructuralFeatures().get(3);
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
	public EOperation getIndice__R09_atributos_en_indice_pertenecen_a_entidad__DiagnosticChain_Map() {
		return indiceEClass.getEOperations().get(0);
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
	public EReference getPaginaPantalla_Entidad() {
		return (EReference)paginaPantallaEClass.getEStructuralFeatures().get(3);
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
		createEAttribute(aplicacionEClass, APLICACION__PAGINAS_MEDIAS_ACCESIBLES);
		createEOperation(aplicacionEClass, APLICACION___R01_INDEX_UNICO__DIAGNOSTICCHAIN_MAP);
		createEOperation(aplicacionEClass, APLICACION___R04_FUENTES_EXTERNAS_MINIMAS__DIAGNOSTICCHAIN_MAP);
		createEOperation(aplicacionEClass, APLICACION___R0_6B_ENCUESTA_YCUESTIONARIO__DIAGNOSTICCHAIN_MAP);

		baseDatosEClass = createEClass(BASE_DATOS);
		createEReference(baseDatosEClass, BASE_DATOS__TABLAS);
		createEAttribute(baseDatosEClass, BASE_DATOS__NOMBRE);

		entidadEClass = createEClass(ENTIDAD);
		createEReference(entidadEClass, ENTIDAD__ATRIBUTOS);
		createEAttribute(entidadEClass, ENTIDAD__NOMBRE);
		createEReference(entidadEClass, ENTIDAD__ENTIDAD_REFEREENCIADA);
		createEReference(entidadEClass, ENTIDAD__USUARIOS);
		createEOperation(entidadEClass, ENTIDAD___R05_NO_AUTORREFERENCIA__DIAGNOSTICCHAIN_MAP);
		createEOperation(entidadEClass, ENTIDAD___R03_INDICE_YDETALLE_VAN_JUNTOS__DIAGNOSTICCHAIN_MAP);
		createEOperation(entidadEClass, ENTIDAD___R02_CRUD_NO_COMBINADO__DIAGNOSTICCHAIN_MAP);
		createEOperation(entidadEClass, ENTIDAD___R08_INDICE_UNICO_POR_ENTIDAD__DIAGNOSTICCHAIN_MAP);
		createEOperation(entidadEClass, ENTIDAD___R06_NO_REFERENCIA_INVERSA__DIAGNOSTICCHAIN_MAP);

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
		createEReference(cuestionarioEClass, CUESTIONARIO__PREGUNTAS_C);
		createEAttribute(cuestionarioEClass, CUESTIONARIO__NUMERO_PREG_VF);
		createEAttribute(cuestionarioEClass, CUESTIONARIO__NUMERO_PREG_SELECT);
		createEOperation(cuestionarioEClass, CUESTIONARIO___R0_7A_CUESTIONARIO_PREGUNTAS_CON_RESPUESTA_CORRECTA__DIAGNOSTICCHAIN_MAP);

		preguntaEClass = createEClass(PREGUNTA);
		createEAttribute(preguntaEClass, PREGUNTA__TIPO);
		createEReference(preguntaEClass, PREGUNTA__RESPUESTAS);
		createEAttribute(preguntaEClass, PREGUNTA__TEXTO);
		createEReference(preguntaEClass, PREGUNTA__RCORRECTA);

		dependienteDeEntidadEClass = createEClass(DEPENDIENTE_DE_ENTIDAD);

		normalEClass = createEClass(NORMAL);
		createEAttribute(normalEClass, NORMAL__CONTENIDO);
		createEReference(normalEClass, NORMAL__CONTENIDOMULTIMEDIA);

		encuestaEClass = createEClass(ENCUESTA);
		createEReference(encuestaEClass, ENCUESTA__PREGUNTAS_E);
		createEAttribute(encuestaEClass, ENCUESTA__NUMERO_PREG_VF);
		createEAttribute(encuestaEClass, ENCUESTA__NUMERO_PREG_SELECT);
		createEOperation(encuestaEClass, ENCUESTA___R0_7B_ENCUESTA_SIN_RESPUESTA_CORRECTA__DIAGNOSTICCHAIN_MAP);

		interactivaEClass = createEClass(INTERACTIVA);
		createEAttribute(interactivaEClass, INTERACTIVA__DESCRIPCION);

		respuestaEClass = createEClass(RESPUESTA);
		createEAttribute(respuestaEClass, RESPUESTA__TEXTO);

		rolEClass = createEClass(ROL);
		createEAttribute(rolEClass, ROL__NOMBRE);
		createEReference(rolEClass, ROL__ENTIDADES);
		createEReference(rolEClass, ROL__ACCESOAPAGINAPANTALLA);
		createEAttribute(rolEClass, ROL__NUMERO_ENTIDADES_ACCESIBLES);

		redSocialEClass = createEClass(RED_SOCIAL);
		createEAttribute(redSocialEClass, RED_SOCIAL__NOMBRE);
		createEReference(redSocialEClass, RED_SOCIAL__PAGINAPANTALLA);

		indiceEClass = createEClass(INDICE);
		createEAttribute(indiceEClass, INDICE__ATRIBUTOS);
		createEOperation(indiceEClass, INDICE___R09_ATRIBUTOS_EN_INDICE_PERTENECEN_AENTIDAD__DIAGNOSTICCHAIN_MAP);

		contenidoMultimediaEClass = createEClass(CONTENIDO_MULTIMEDIA);
		createEAttribute(contenidoMultimediaEClass, CONTENIDO_MULTIMEDIA__TIPO);

		paginaPantallaEClass = createEClass(PAGINA_PANTALLA);
		createEAttribute(paginaPantallaEClass, PAGINA_PANTALLA__NOMBRE);
		createEReference(paginaPantallaEClass, PAGINA_PANTALLA__USUARIO);
		createEReference(paginaPantallaEClass, PAGINA_PANTALLA__REDSOCIAL);
		createEReference(paginaPantallaEClass, PAGINA_PANTALLA__ENTIDAD);

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
		initEAttribute(getAplicacion_PaginasMediasAccesibles(), ecorePackage.getEInt(), "paginasMediasAccesibles", null, 1, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAplicacion__R01_index_unico__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R01_index_unico", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAplicacion__R04_fuentes_externas_minimas__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R04_fuentes_externas_minimas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAplicacion__R06b_encuesta_y_cuestionario__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R06b_encuesta_y_cuestionario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(baseDatosEClass, BaseDatos.class, "BaseDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseDatos_Tablas(), this.getEntidad(), null, "tablas", null, 1, -1, BaseDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseDatos_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, BaseDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entidadEClass, Entidad.class, "Entidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntidad_Atributos(), this.getAtributo(), null, "atributos", null, 1, -1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntidad_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntidad_EntidadRefereenciada(), this.getEntidad(), null, "entidadRefereenciada", null, 0, -1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntidad_Usuarios(), this.getRol(), this.getRol_Entidades(), "usuarios", null, 1, -1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEntidad__R05_no_autorreferencia__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R05_no_autorreferencia", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntidad__R03_indice_y_detalle_van_juntos__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R03_indice_y_detalle_van_juntos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntidad__R02_crud_no_combinado__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R02_crud_no_combinado", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntidad__R08_indice_unico_por_entidad__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R08_indice_unico_por_entidad", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntidad__R06_no_referencia_inversa__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R06_no_referencia_inversa", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		initEReference(getCuestionario_PreguntasC(), this.getPregunta(), null, "preguntasC", null, 1, -1, Cuestionario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCuestionario_NumeroPregVF(), ecorePackage.getEInt(), "numeroPregVF", null, 1, 1, Cuestionario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCuestionario_NumeroPregSelect(), ecorePackage.getEInt(), "numeroPregSelect", null, 1, 1, Cuestionario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCuestionario__R07a_cuestionario_preguntas_con_respuesta_correcta__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R07a_cuestionario_preguntas_con_respuesta_correcta", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(preguntaEClass, Pregunta.class, "Pregunta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPregunta_Tipo(), this.getTipoPregunta(), "Tipo", null, 0, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPregunta_Respuestas(), this.getRespuesta(), null, "respuestas", null, 0, -1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPregunta_Texto(), ecorePackage.getEString(), "Texto", null, 0, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPregunta_Rcorrecta(), this.getRespuesta(), null, "Rcorrecta", null, 0, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependienteDeEntidadEClass, DependienteDeEntidad.class, "DependienteDeEntidad", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normalEClass, Normal.class, "Normal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNormal_Contenido(), ecorePackage.getEString(), "Contenido", null, 0, 1, Normal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormal_Contenidomultimedia(), this.getContenidoMultimedia(), null, "contenidomultimedia", null, 0, -1, Normal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encuestaEClass, Encuesta.class, "Encuesta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEncuesta_PreguntasE(), this.getPregunta(), null, "preguntasE", null, 1, -1, Encuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncuesta_NumeroPregVF(), ecorePackage.getEInt(), "numeroPregVF", null, 1, 1, Encuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncuesta_NumeroPregSelect(), ecorePackage.getEInt(), "numeroPregSelect", null, 1, 1, Encuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEncuesta__R07b_encuesta_sin_respuesta_correcta__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R07b_encuesta_sin_respuesta_correcta", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interactivaEClass, Interactiva.class, "Interactiva", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractiva_Descripcion(), ecorePackage.getEString(), "Descripcion", null, 0, 1, Interactiva.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(respuestaEClass, Respuesta.class, "Respuesta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRespuesta_Texto(), ecorePackage.getEString(), "Texto", null, 0, 1, Respuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolEClass, Rol.class, "Rol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRol_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRol_Entidades(), this.getEntidad(), this.getEntidad_Usuarios(), "entidades", null, 0, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRol_Accesoapaginapantalla(), this.getPaginaPantalla(), this.getPaginaPantalla_Usuario(), "accesoapaginapantalla", null, 0, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRol_NumeroEntidadesAccesibles(), ecorePackage.getEInt(), "numeroEntidadesAccesibles", null, 1, 1, Rol.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(redSocialEClass, RedSocial.class, "RedSocial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRedSocial_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, RedSocial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRedSocial_Paginapantalla(), this.getPaginaPantalla(), this.getPaginaPantalla_Redsocial(), "paginapantalla", null, 0, -1, RedSocial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indiceEClass, Indice.class, "Indice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndice_Atributos(), ecorePackage.getEString(), "Atributos", null, 0, 1, Indice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getIndice__R09_atributos_en_indice_pertenecen_a_entidad__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R09_atributos_en_indice_pertenecen_a_entidad", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenidoMultimediaEClass, ContenidoMultimedia.class, "ContenidoMultimedia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenidoMultimedia_Tipo(), ecorePackage.getEString(), "Tipo", null, 0, 1, ContenidoMultimedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginaPantallaEClass, PaginaPantalla.class, "PaginaPantalla", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaginaPantalla_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, PaginaPantalla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaginaPantalla_Usuario(), this.getRol(), this.getRol_Accesoapaginapantalla(), "usuario", null, 1, -1, PaginaPantalla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaginaPantalla_Redsocial(), this.getRedSocial(), this.getRedSocial_Paginapantalla(), "redsocial", null, 0, -1, PaginaPantalla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaginaPantalla_Entidad(), this.getEntidad(), null, "entidad", null, 1, 1, PaginaPantalla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		// gmf
		createGmfAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// DSLDoc
		createDSLDocAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.node
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (aplicacionEClass,
		   source,
		   new String[] {
			   "constraints", "R06b_encuesta_y_cuestionario"
		   });
		addAnnotation
		  (entidadEClass,
		   source,
		   new String[] {
			   "constraints", "R06_no_referencia_inversa"
		   });
		addAnnotation
		  (cuestionarioEClass,
		   source,
		   new String[] {
			   "constraints", "R07a_cuestionario_preguntas_con_respuesta_correcta"
		   });
		addAnnotation
		  (encuestaEClass,
		   source,
		   new String[] {
			   "constraints", "R07b_encuesta_sin_respuesta_correcta"
		   });
		addAnnotation
		  (indiceEClass,
		   source,
		   new String[] {
			   "constraints", "R09_atributos_en_indice_pertenecen_a_entidad"
		   });
	}

	/**
	 * Initializes the annotations for <b>DSLDoc</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDSLDocAnnotations() {
		String source = "DSLDoc";
		addAnnotation
		  (aplicacionEClass,
		   source,
		   new String[] {
			   "Author", "Sergio Terrazas Lobato y Javier Costillo Palacios",
			   "Last update", "19/04/2025"
		   });
		addAnnotation
		  (baseDatosEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (entidadEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (atributoEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (crearInstanciaEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (indiceExtendidoEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (detallesInstanciaEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (actualizacionInstanciaEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (indiceEntidadEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (indiceDetalleEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (borradoInstanciaEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (cuestionarioEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (preguntaEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (dependienteDeEntidadEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (normalEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (encuestaEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (interactivaEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (tipoPreguntaEEnum,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (respuestaEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (rolEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (redSocialEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (indiceEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (contenidoMultimediaEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (paginaPantallaEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (indexEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (tipoAtributoEEnum,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (crudEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (aplicacionEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getAplicacion__R01_index_unico__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \tpaginapantallas->select(p | p.oclIsTypeOf(Index))->size() = 1"
		   });
		addAnnotation
		  (getAplicacion__R04_fuentes_externas_minimas__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t    redessociales->size() >= 1 "
		   });
		addAnnotation
		  (getAplicacion__R06b_encuesta_y_cuestionario__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t    paginapantallas->exists(p | p.oclIsTypeOf(Encuesta)) and\n\t    paginapantallas->exists(p | p.oclIsTypeOf(Cuestionario))"
		   });
		addAnnotation
		  (getEntidad__R05_no_autorreferencia__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \tnot entidadRefereenciada->includes(self)"
		   });
		addAnnotation
		  (getEntidad__R03_indice_y_detalle_van_juntos__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t    let pp = Aplicacion.allInstances()->any(true).paginapantallas->select(p | p.entidad = self) in\n\t    (pp->exists(p | p.oclIsTypeOf(IndiceEntidad) or p.oclIsTypeOf(IndiceExtendido))) =\n\t    (pp->exists(p | p.oclIsTypeOf(DetallesInstancia)))"
		   });
		addAnnotation
		  (getEntidad__R02_crud_no_combinado__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t    let pp = Aplicacion.allInstances()->any(true).paginapantallas->select(p | p.entidad = self) in\n\t    pp->exists(p | p.oclIsTypeOf(CRUD)) implies\n\t    pp->forAll(p | not (\n\t        p.oclIsTypeOf(IndiceEntidad) or\n\t        p.oclIsTypeOf(IndiceExtendido) or\n\t        p.oclIsTypeOf(IndiceDetalle) or\n\t        p.oclIsTypeOf(DetallesInstancia) or\n\t        p.oclIsTypeOf(CrearInstancia) or\n\t        p.oclIsTypeOf(ActualizacionInstancia) or\n\t        p.oclIsTypeOf(BorradoInstancia)\n\t    ))"
		   });
		addAnnotation
		  (getEntidad__R08_indice_unico_por_entidad__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t    Aplicacion.allInstances()->any(true).paginapantallas\n\t      ->select(p | p.entidad = self and p.oclIsTypeOf(IndiceEntidad))->size() <= 1"
		   });
		addAnnotation
		  (getEntidad__R06_no_referencia_inversa__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \tentidadRefereenciada->forAll(e | not e.entidadRefereenciada->includes(self))"
		   });
		addAnnotation
		  (getCuestionario__R07a_cuestionario_preguntas_con_respuesta_correcta__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n  preguntasC->forAll(p |\n    if p.Tipo = TipoPregunta::V_F or p.Tipo = TipoPregunta::OpcionMultiple then\n      not p.Rcorrecta.oclIsUndefined()\n    else\n      p.Rcorrecta.oclIsUndefined()\n    endif\n  )"
		   });
		addAnnotation
		  (getEncuesta__R07b_encuesta_sin_respuesta_correcta__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n  preguntasE->forAll(p |\n    p.Rcorrecta.oclIsUndefined()\n  )"
		   });
		addAnnotation
		  (getIndice__R09_atributos_en_indice_pertenecen_a_entidad__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \tAtributos->forAll(a | self.entidad.atributos->exists(at | at.Nombre = a))"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getAplicacion_Roles(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAplicacion_Redessociales(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAplicacion_Paginapantallas(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAplicacion_Basedatos(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getBaseDatos_Tablas(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEntidad_Atributos(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCuestionario_PreguntasC(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getPregunta_Respuestas(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNormal_Contenidomultimedia(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEncuesta_PreguntasE(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (baseDatosEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (entidadEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (atributoEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (crearInstanciaEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (indiceExtendidoEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (detallesInstanciaEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (actualizacionInstanciaEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (indiceEntidadEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (indiceDetalleEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (borradoInstanciaEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (cuestionarioEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (preguntaEClass,
		   source,
		   new String[] {
			   "label", "Texto",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (normalEClass,
		   source,
		   new String[] {
			   "label", "Contenido",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (encuestaEClass,
		   source,
		   new String[] {
			   "label", "Descripcion",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (respuestaEClass,
		   source,
		   new String[] {
			   "label", "Texto",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (rolEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (redSocialEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (contenidoMultimediaEClass,
		   source,
		   new String[] {
			   "label", "Tipo",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (indexEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
		addAnnotation
		  (crudEClass,
		   source,
		   new String[] {
			   "label", "Nombre",
			   "color", "0,255,255"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (getEntidad_EntidadRefereenciada(),
		   source,
		   new String[] {
			   "source", "Entidad",
			   "target", "Entidad",
			   "target.decoration", "arrow",
			   "color", "255,0,0",
			   "width", "3"
		   });
		addAnnotation
		  (getEntidad_Usuarios(),
		   source,
		   new String[] {
			   "source", "EntidadRol",
			   "target", "Rol",
			   "target.decoration", "arrow",
			   "color", "255,0,0",
			   "width", "3"
		   });
		addAnnotation
		  (getPregunta_Rcorrecta(),
		   source,
		   new String[] {
			   "source", "Pregunta",
			   "target", "Respuesta",
			   "target.decoration", "arrow",
			   "color", "255,0,0",
			   "width", "3"
		   });
		addAnnotation
		  (getRol_Entidades(),
		   source,
		   new String[] {
			   "source", "Rol",
			   "target", "Entidad",
			   "target.decoration", "arrow",
			   "color", "255,0,0",
			   "width", "3"
		   });
		addAnnotation
		  (getRol_Accesoapaginapantalla(),
		   source,
		   new String[] {
			   "source", "Rol",
			   "target", "PaginaPantalla",
			   "target.decoration", "arrow",
			   "color", "255,0,0",
			   "width", "3"
		   });
		addAnnotation
		  (getRedSocial_Paginapantalla(),
		   source,
		   new String[] {
			   "source", "PaginaPantalla",
			   "target", "RedSocial",
			   "target.decoration", "arrow",
			   "color", "255,0,0",
			   "width", "3"
		   });
		addAnnotation
		  (getPaginaPantalla_Usuario(),
		   source,
		   new String[] {
			   "source", "PaginaPantalla",
			   "target", "Rol",
			   "target.decoration", "arrow",
			   "color", "255,0,0",
			   "width", "3"
		   });
		addAnnotation
		  (getPaginaPantalla_Redsocial(),
		   source,
		   new String[] {
			   "source", "PaginaPantalla",
			   "target", "RedSocial",
			   "target.decoration", "arrow",
			   "color", "255,0,0",
			   "width", "3"
		   });
		addAnnotation
		  (getPaginaPantalla_Entidad(),
		   source,
		   new String[] {
			   "source", "PaginaPantalla",
			   "target", "Entidad",
			   "target.decoration", "arrow",
			   "color", "255,0,0",
			   "width", "3"
		   });
	}

} //DatawebPackageImpl
