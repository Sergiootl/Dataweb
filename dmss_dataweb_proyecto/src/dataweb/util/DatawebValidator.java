/**
 */
package dataweb.util;

import dataweb.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see dataweb.DatawebPackage
 * @generated
 */
public class DatawebValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DatawebValidator INSTANCE = new DatawebValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "dataweb";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R01 index unico' of 'Aplicacion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APLICACION__R01_INDEX_UNICO = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R04 fuentes externas minimas' of 'Aplicacion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APLICACION__R04_FUENTES_EXTERNAS_MINIMAS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R0 6b encuesta ycuestionario' of 'Aplicacion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APLICACION__R0_6B_ENCUESTA_YCUESTIONARIO = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R05 no autorreferencia' of 'Entidad'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTIDAD__R05_NO_AUTORREFERENCIA = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R03 indice ydetalle van juntos' of 'Entidad'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTIDAD__R03_INDICE_YDETALLE_VAN_JUNTOS = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R02 crud no combinado' of 'Entidad'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTIDAD__R02_CRUD_NO_COMBINADO = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R08 indice unico por entidad' of 'Entidad'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTIDAD__R08_INDICE_UNICO_POR_ENTIDAD = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R06 no referencia inversa' of 'Entidad'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTIDAD__R06_NO_REFERENCIA_INVERSA = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R0 7a cuestionario preguntas con respuesta correcta' of 'Cuestionario'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CUESTIONARIO__R0_7A_CUESTIONARIO_PREGUNTAS_CON_RESPUESTA_CORRECTA = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R0 7b encuesta sin respuesta correcta' of 'Encuesta'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCUESTA__R0_7B_ENCUESTA_SIN_RESPUESTA_CORRECTA = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R09 atributos en indice pertenecen aentidad' of 'Indice'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INDICE__R09_ATRIBUTOS_EN_INDICE_PERTENECEN_AENTIDAD = 11;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 11;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatawebValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DatawebPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DatawebPackage.APLICACION:
				return validateAplicacion((Aplicacion)value, diagnostics, context);
			case DatawebPackage.BASE_DATOS:
				return validateBaseDatos((BaseDatos)value, diagnostics, context);
			case DatawebPackage.ENTIDAD:
				return validateEntidad((Entidad)value, diagnostics, context);
			case DatawebPackage.ATRIBUTO:
				return validateAtributo((Atributo)value, diagnostics, context);
			case DatawebPackage.CREAR_INSTANCIA:
				return validateCrearInstancia((CrearInstancia)value, diagnostics, context);
			case DatawebPackage.INDICE_EXTENDIDO:
				return validateIndiceExtendido((IndiceExtendido)value, diagnostics, context);
			case DatawebPackage.DETALLES_INSTANCIA:
				return validateDetallesInstancia((DetallesInstancia)value, diagnostics, context);
			case DatawebPackage.ACTUALIZACION_INSTANCIA:
				return validateActualizacionInstancia((ActualizacionInstancia)value, diagnostics, context);
			case DatawebPackage.INDICE_ENTIDAD:
				return validateIndiceEntidad((IndiceEntidad)value, diagnostics, context);
			case DatawebPackage.INDICE_DETALLE:
				return validateIndiceDetalle((IndiceDetalle)value, diagnostics, context);
			case DatawebPackage.BORRADO_INSTANCIA:
				return validateBorradoInstancia((BorradoInstancia)value, diagnostics, context);
			case DatawebPackage.CUESTIONARIO:
				return validateCuestionario((Cuestionario)value, diagnostics, context);
			case DatawebPackage.PREGUNTA:
				return validatePregunta((Pregunta)value, diagnostics, context);
			case DatawebPackage.DEPENDIENTE_DE_ENTIDAD:
				return validateDependienteDeEntidad((DependienteDeEntidad)value, diagnostics, context);
			case DatawebPackage.NORMAL:
				return validateNormal((Normal)value, diagnostics, context);
			case DatawebPackage.ENCUESTA:
				return validateEncuesta((Encuesta)value, diagnostics, context);
			case DatawebPackage.INTERACTIVA:
				return validateInteractiva((Interactiva)value, diagnostics, context);
			case DatawebPackage.RESPUESTA:
				return validateRespuesta((Respuesta)value, diagnostics, context);
			case DatawebPackage.ROL:
				return validateRol((Rol)value, diagnostics, context);
			case DatawebPackage.RED_SOCIAL:
				return validateRedSocial((RedSocial)value, diagnostics, context);
			case DatawebPackage.INDICE:
				return validateIndice((Indice)value, diagnostics, context);
			case DatawebPackage.CONTENIDO_MULTIMEDIA:
				return validateContenidoMultimedia((ContenidoMultimedia)value, diagnostics, context);
			case DatawebPackage.PAGINA_PANTALLA:
				return validatePaginaPantalla((PaginaPantalla)value, diagnostics, context);
			case DatawebPackage.INDEX:
				return validateIndex((Index)value, diagnostics, context);
			case DatawebPackage.CRUD:
				return validateCRUD((CRUD)value, diagnostics, context);
			case DatawebPackage.TIPO_PREGUNTA:
				return validateTipoPregunta((TipoPregunta)value, diagnostics, context);
			case DatawebPackage.TIPO_ATRIBUTO:
				return validateTipoAtributo((TipoAtributo)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAplicacion(Aplicacion aplicacion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aplicacion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aplicacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aplicacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aplicacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aplicacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aplicacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aplicacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aplicacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aplicacion, diagnostics, context);
		if (result || diagnostics != null) result &= validateAplicacion_R06b_encuesta_y_cuestionario(aplicacion, diagnostics, context);
		if (result || diagnostics != null) result &= validateAplicacion_R01_index_unico(aplicacion, diagnostics, context);
		if (result || diagnostics != null) result &= validateAplicacion_R04_fuentes_externas_minimas(aplicacion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R06b_encuesta_y_cuestionario constraint of '<em>Aplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAplicacion_R06b_encuesta_y_cuestionario(Aplicacion aplicacion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return aplicacion.R06b_encuesta_y_cuestionario(diagnostics, context);
	}

	/**
	 * Validates the R01_index_unico constraint of '<em>Aplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAplicacion_R01_index_unico(Aplicacion aplicacion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return aplicacion.R01_index_unico(diagnostics, context);
	}

	/**
	 * Validates the R04_fuentes_externas_minimas constraint of '<em>Aplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAplicacion_R04_fuentes_externas_minimas(Aplicacion aplicacion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return aplicacion.R04_fuentes_externas_minimas(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseDatos(BaseDatos baseDatos, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseDatos, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad(Entidad entidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entidad, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntidad_R06_no_referencia_inversa(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntidad_R05_no_autorreferencia(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntidad_R03_indice_y_detalle_van_juntos(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntidad_R02_crud_no_combinado(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntidad_R08_indice_unico_por_entidad(entidad, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R06_no_referencia_inversa constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad_R06_no_referencia_inversa(Entidad entidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entidad.R06_no_referencia_inversa(diagnostics, context);
	}

	/**
	 * Validates the R05_no_autorreferencia constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad_R05_no_autorreferencia(Entidad entidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entidad.R05_no_autorreferencia(diagnostics, context);
	}

	/**
	 * Validates the R03_indice_y_detalle_van_juntos constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad_R03_indice_y_detalle_van_juntos(Entidad entidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entidad.R03_indice_y_detalle_van_juntos(diagnostics, context);
	}

	/**
	 * Validates the R02_crud_no_combinado constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad_R02_crud_no_combinado(Entidad entidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entidad.R02_crud_no_combinado(diagnostics, context);
	}

	/**
	 * Validates the R08_indice_unico_por_entidad constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad_R08_indice_unico_por_entidad(Entidad entidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entidad.R08_indice_unico_por_entidad(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtributo(Atributo atributo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atributo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrearInstancia(CrearInstancia crearInstancia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crearInstancia, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndiceExtendido(IndiceExtendido indiceExtendido, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(indiceExtendido, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(indiceExtendido, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(indiceExtendido, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(indiceExtendido, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(indiceExtendido, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(indiceExtendido, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(indiceExtendido, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(indiceExtendido, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(indiceExtendido, diagnostics, context);
		if (result || diagnostics != null) result &= validateIndice_R09_atributos_en_indice_pertenecen_a_entidad(indiceExtendido, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetallesInstancia(DetallesInstancia detallesInstancia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detallesInstancia, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActualizacionInstancia(ActualizacionInstancia actualizacionInstancia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actualizacionInstancia, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndiceEntidad(IndiceEntidad indiceEntidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(indiceEntidad, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(indiceEntidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(indiceEntidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(indiceEntidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(indiceEntidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(indiceEntidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(indiceEntidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(indiceEntidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(indiceEntidad, diagnostics, context);
		if (result || diagnostics != null) result &= validateIndice_R09_atributos_en_indice_pertenecen_a_entidad(indiceEntidad, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndiceDetalle(IndiceDetalle indiceDetalle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(indiceDetalle, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(indiceDetalle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(indiceDetalle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(indiceDetalle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(indiceDetalle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(indiceDetalle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(indiceDetalle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(indiceDetalle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(indiceDetalle, diagnostics, context);
		if (result || diagnostics != null) result &= validateIndice_R09_atributos_en_indice_pertenecen_a_entidad(indiceDetalle, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBorradoInstancia(BorradoInstancia borradoInstancia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(borradoInstancia, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCuestionario(Cuestionario cuestionario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cuestionario, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cuestionario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cuestionario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cuestionario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cuestionario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cuestionario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cuestionario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cuestionario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cuestionario, diagnostics, context);
		if (result || diagnostics != null) result &= validateCuestionario_R07a_cuestionario_preguntas_con_respuesta_correcta(cuestionario, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R07a_cuestionario_preguntas_con_respuesta_correcta constraint of '<em>Cuestionario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCuestionario_R07a_cuestionario_preguntas_con_respuesta_correcta(Cuestionario cuestionario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cuestionario.R07a_cuestionario_preguntas_con_respuesta_correcta(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePregunta(Pregunta pregunta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pregunta, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependienteDeEntidad(DependienteDeEntidad dependienteDeEntidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependienteDeEntidad, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormal(Normal normal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(normal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncuesta(Encuesta encuesta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encuesta, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(encuesta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encuesta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encuesta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(encuesta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encuesta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encuesta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encuesta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encuesta, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncuesta_R07b_encuesta_sin_respuesta_correcta(encuesta, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R07b_encuesta_sin_respuesta_correcta constraint of '<em>Encuesta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncuesta_R07b_encuesta_sin_respuesta_correcta(Encuesta encuesta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encuesta.R07b_encuesta_sin_respuesta_correcta(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractiva(Interactiva interactiva, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactiva, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRespuesta(Respuesta respuesta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(respuesta, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRol(Rol rol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedSocial(RedSocial redSocial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(redSocial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndice(Indice indice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(indice, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(indice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(indice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(indice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(indice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(indice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(indice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(indice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(indice, diagnostics, context);
		if (result || diagnostics != null) result &= validateIndice_R09_atributos_en_indice_pertenecen_a_entidad(indice, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R09_atributos_en_indice_pertenecen_a_entidad constraint of '<em>Indice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndice_R09_atributos_en_indice_pertenecen_a_entidad(Indice indice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return indice.R09_atributos_en_indice_pertenecen_a_entidad(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContenidoMultimedia(ContenidoMultimedia contenidoMultimedia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contenidoMultimedia, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaginaPantalla(PaginaPantalla paginaPantalla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paginaPantalla, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndex(Index index, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(index, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCRUD(CRUD crud, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crud, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTipoPregunta(TipoPregunta tipoPregunta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTipoAtributo(TipoAtributo tipoAtributo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DatawebValidator
