/**
 */
package dataweb.impl;

import dataweb.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatawebFactoryImpl extends EFactoryImpl implements DatawebFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatawebFactory init() {
		try {
			DatawebFactory theDatawebFactory = (DatawebFactory)EPackage.Registry.INSTANCE.getEFactory(DatawebPackage.eNS_URI);
			if (theDatawebFactory != null) {
				return theDatawebFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatawebFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatawebFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatawebPackage.APLICACION: return createAplicacion();
			case DatawebPackage.BASE_DATOS: return createBaseDatos();
			case DatawebPackage.ENTIDAD: return createEntidad();
			case DatawebPackage.ATRIBUTO: return createAtributo();
			case DatawebPackage.CREAR_INSTANCIA: return createCrearInstancia();
			case DatawebPackage.INDICE_EXTENDIDO: return createIndiceExtendido();
			case DatawebPackage.DETALLES_INSTANCIA: return createDetallesInstancia();
			case DatawebPackage.ACTUALIZACION_INSTANCIA: return createActualizacionInstancia();
			case DatawebPackage.INDICE_ENTIDAD: return createIndiceEntidad();
			case DatawebPackage.INDICE_DETALLE: return createIndiceDetalle();
			case DatawebPackage.BORRADO_INSTANCIA: return createBorradoInstancia();
			case DatawebPackage.CUESTIONARIO: return createCuestionario();
			case DatawebPackage.PREGUNTA: return createPregunta();
			case DatawebPackage.NORMAL: return createNormal();
			case DatawebPackage.ENCUESTA: return createEncuesta();
			case DatawebPackage.RESPUESTA: return createRespuesta();
			case DatawebPackage.ROL: return createRol();
			case DatawebPackage.RED_SOCIAL: return createRedSocial();
			case DatawebPackage.CONTENIDO_MULTIMEDIA: return createContenidoMultimedia();
			case DatawebPackage.INDEX: return createIndex();
			case DatawebPackage.CRUD: return createCRUD();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DatawebPackage.TIPO_PREGUNTA:
				return createTipoPreguntaFromString(eDataType, initialValue);
			case DatawebPackage.TIPO_ATRIBUTO:
				return createTipoAtributoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DatawebPackage.TIPO_PREGUNTA:
				return convertTipoPreguntaToString(eDataType, instanceValue);
			case DatawebPackage.TIPO_ATRIBUTO:
				return convertTipoAtributoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aplicacion createAplicacion() {
		AplicacionImpl aplicacion = new AplicacionImpl();
		return aplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseDatos createBaseDatos() {
		BaseDatosImpl baseDatos = new BaseDatosImpl();
		return baseDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entidad createEntidad() {
		EntidadImpl entidad = new EntidadImpl();
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atributo createAtributo() {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrearInstancia createCrearInstancia() {
		CrearInstanciaImpl crearInstancia = new CrearInstanciaImpl();
		return crearInstancia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndiceExtendido createIndiceExtendido() {
		IndiceExtendidoImpl indiceExtendido = new IndiceExtendidoImpl();
		return indiceExtendido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetallesInstancia createDetallesInstancia() {
		DetallesInstanciaImpl detallesInstancia = new DetallesInstanciaImpl();
		return detallesInstancia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActualizacionInstancia createActualizacionInstancia() {
		ActualizacionInstanciaImpl actualizacionInstancia = new ActualizacionInstanciaImpl();
		return actualizacionInstancia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndiceEntidad createIndiceEntidad() {
		IndiceEntidadImpl indiceEntidad = new IndiceEntidadImpl();
		return indiceEntidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndiceDetalle createIndiceDetalle() {
		IndiceDetalleImpl indiceDetalle = new IndiceDetalleImpl();
		return indiceDetalle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BorradoInstancia createBorradoInstancia() {
		BorradoInstanciaImpl borradoInstancia = new BorradoInstanciaImpl();
		return borradoInstancia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cuestionario createCuestionario() {
		CuestionarioImpl cuestionario = new CuestionarioImpl();
		return cuestionario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pregunta createPregunta() {
		PreguntaImpl pregunta = new PreguntaImpl();
		return pregunta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Normal createNormal() {
		NormalImpl normal = new NormalImpl();
		return normal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Encuesta createEncuesta() {
		EncuestaImpl encuesta = new EncuestaImpl();
		return encuesta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Respuesta createRespuesta() {
		RespuestaImpl respuesta = new RespuestaImpl();
		return respuesta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rol createRol() {
		RolImpl rol = new RolImpl();
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RedSocial createRedSocial() {
		RedSocialImpl redSocial = new RedSocialImpl();
		return redSocial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContenidoMultimedia createContenidoMultimedia() {
		ContenidoMultimediaImpl contenidoMultimedia = new ContenidoMultimediaImpl();
		return contenidoMultimedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Index createIndex() {
		IndexImpl index = new IndexImpl();
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CRUD createCRUD() {
		CRUDImpl crud = new CRUDImpl();
		return crud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPregunta createTipoPreguntaFromString(EDataType eDataType, String initialValue) {
		TipoPregunta result = TipoPregunta.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoPreguntaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAtributo createTipoAtributoFromString(EDataType eDataType, String initialValue) {
		TipoAtributo result = TipoAtributo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoAtributoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatawebPackage getDatawebPackage() {
		return (DatawebPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatawebPackage getPackage() {
		return DatawebPackage.eINSTANCE;
	}

} //DatawebFactoryImpl
