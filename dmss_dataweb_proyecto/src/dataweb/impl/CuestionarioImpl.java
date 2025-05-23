/**
 */
package dataweb.impl;

import dataweb.Cuestionario;
import dataweb.DatawebPackage;

import dataweb.DatawebTables;
import dataweb.Pregunta;
import dataweb.Respuesta;
import dataweb.TipoPregunta;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cuestionario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataweb.impl.CuestionarioImpl#isEvaluado <em>Evaluado</em>}</li>
 *   <li>{@link dataweb.impl.CuestionarioImpl#getPreguntasC <em>Preguntas C</em>}</li>
 *   <li>{@link dataweb.impl.CuestionarioImpl#getNumeroPregVF <em>Numero Preg VF</em>}</li>
 *   <li>{@link dataweb.impl.CuestionarioImpl#getNumeroPregSelect <em>Numero Preg Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CuestionarioImpl extends InteractivaImpl implements Cuestionario {
	/**
	 * The default value of the '{@link #isEvaluado() <em>Evaluado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEvaluado()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EVALUADO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEvaluado() <em>Evaluado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEvaluado()
	 * @generated
	 * @ordered
	 */
	protected boolean evaluado = EVALUADO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreguntasC() <em>Preguntas C</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreguntasC()
	 * @generated
	 * @ordered
	 */
	protected EList<Pregunta> preguntasC;

	/**
	 * The default value of the '{@link #getNumeroPregVF() <em>Numero Preg VF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPregVF()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_PREG_VF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumeroPregVF() <em>Numero Preg VF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPregVF()
	 * @generated
	 * @ordered
	 */
	protected int numeroPregVF = NUMERO_PREG_VF_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroPregSelect() <em>Numero Preg Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPregSelect()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_PREG_SELECT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumeroPregSelect() <em>Numero Preg Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPregSelect()
	 * @generated
	 * @ordered
	 */
	protected int numeroPregSelect = NUMERO_PREG_SELECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CuestionarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatawebPackage.Literals.CUESTIONARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEvaluado() {
		return evaluado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvaluado(boolean newEvaluado) {
		boolean oldEvaluado = evaluado;
		evaluado = newEvaluado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.CUESTIONARIO__EVALUADO, oldEvaluado, evaluado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pregunta> getPreguntasC() {
		if (preguntasC == null) {
			preguntasC = new EObjectContainmentEList<Pregunta>(Pregunta.class, this, DatawebPackage.CUESTIONARIO__PREGUNTAS_C);
		}
		return preguntasC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumeroPregVF() {
		return numeroPregVF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumeroPregVF(int newNumeroPregVF) {
		int oldNumeroPregVF = numeroPregVF;
		numeroPregVF = newNumeroPregVF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.CUESTIONARIO__NUMERO_PREG_VF, oldNumeroPregVF, numeroPregVF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumeroPregSelect() {
		return numeroPregSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumeroPregSelect(int newNumeroPregSelect) {
		int oldNumeroPregSelect = numeroPregSelect;
		numeroPregSelect = newNumeroPregSelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.CUESTIONARIO__NUMERO_PREG_SELECT, oldNumeroPregSelect, numeroPregSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean R07a_cuestionario_preguntas_con_respuesta_correcta(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Cuestionario::R07a_cuestionario_preguntas_con_respuesta_correcta";
		try {
			/**
			 *
			 * inv R07a_cuestionario_preguntas_con_respuesta_correcta:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = preguntasC->forAll(p |
			 *           if p.Tipo = TipoPregunta::V_F or p.Tipo = TipoPregunta::OpcionMultiple
			 *           then not p.Rcorrecta.oclIsUndefined()
			 *           else p.Rcorrecta.oclIsUndefined()
			 *           endif)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DatawebPackage.Literals.CUESTIONARIO___R0_7A_CUESTIONARIO_PREGUNTAS_CON_RESPUESTA_CORRECTA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DatawebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_1;
			if (le) {
				local_1 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Pregunta> preguntasC = this.getPreguntasC();
					final /*@NonInvalid*/ OrderedSetValue BOXED_preguntasC = idResolver.createOrderedSetOfAll(DatawebTables.ORD_CLSSid_Pregunta, preguntasC);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_p = BOXED_preguntasC.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_p.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Pregunta p = (Pregunta)ITERATOR_p.next();
						/**
						 *
						 * if p.Tipo = TipoPregunta::V_F or p.Tipo = TipoPregunta::OpcionMultiple
						 * then not p.Rcorrecta.oclIsUndefined()
						 * else p.Rcorrecta.oclIsUndefined()
						 * endif
						 */
						final /*@NonInvalid*/ Respuesta Rcorrecta_0 = p.getRcorrecta();
						final /*@NonInvalid*/ TipoPregunta Tipo_0 = p.getTipo();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_Tipo_0 = Tipo_0 == null ? null : DatawebTables.ENUMid_TipoPregunta.getEnumerationLiteralId(ClassUtil.nonNullState(Tipo_0.getName()));
						final /*@NonInvalid*/ boolean oclIsUndefined_0 = Rcorrecta_0 == null;
						final /*@NonInvalid*/ boolean eq = BOXED_Tipo_0 == DatawebTables.ELITid_V_F;
						final /*@NonInvalid*/ Boolean or;
						if (eq) {
							or = ValueUtil.TRUE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean eq_0 = BOXED_Tipo_0 == DatawebTables.ELITid_OpcionMultiple;
							if (eq_0) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								or = ValueUtil.FALSE_VALUE;
							}
						}
						if (or == null) {
							throw new InvalidValueException("Null if condition");
						}
						/*@NonInvalid*/ Boolean local_0;
						if (or) {
							final /*@NonInvalid*/ Boolean not;
							if (!oclIsUndefined_0) {
								not = ValueUtil.TRUE_VALUE;
							}
							else {
								if (oclIsUndefined_0) {
									not = ValueUtil.FALSE_VALUE;
								}
								else {
									not = null;
								}
							}
							local_0 = not;
						}
						else {
							local_0 = oclIsUndefined_0;
						}
						//
						if (local_0 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (local_0 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (local_0 == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, DatawebTables.INT_0).booleanValue();
				local_1 = logDiagnostic;
			}
			return local_1;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatawebPackage.CUESTIONARIO__PREGUNTAS_C:
				return ((InternalEList<?>)getPreguntasC()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatawebPackage.CUESTIONARIO__EVALUADO:
				return isEvaluado();
			case DatawebPackage.CUESTIONARIO__PREGUNTAS_C:
				return getPreguntasC();
			case DatawebPackage.CUESTIONARIO__NUMERO_PREG_VF:
				return getNumeroPregVF();
			case DatawebPackage.CUESTIONARIO__NUMERO_PREG_SELECT:
				return getNumeroPregSelect();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatawebPackage.CUESTIONARIO__EVALUADO:
				setEvaluado((Boolean)newValue);
				return;
			case DatawebPackage.CUESTIONARIO__PREGUNTAS_C:
				getPreguntasC().clear();
				getPreguntasC().addAll((Collection<? extends Pregunta>)newValue);
				return;
			case DatawebPackage.CUESTIONARIO__NUMERO_PREG_VF:
				setNumeroPregVF((Integer)newValue);
				return;
			case DatawebPackage.CUESTIONARIO__NUMERO_PREG_SELECT:
				setNumeroPregSelect((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatawebPackage.CUESTIONARIO__EVALUADO:
				setEvaluado(EVALUADO_EDEFAULT);
				return;
			case DatawebPackage.CUESTIONARIO__PREGUNTAS_C:
				getPreguntasC().clear();
				return;
			case DatawebPackage.CUESTIONARIO__NUMERO_PREG_VF:
				setNumeroPregVF(NUMERO_PREG_VF_EDEFAULT);
				return;
			case DatawebPackage.CUESTIONARIO__NUMERO_PREG_SELECT:
				setNumeroPregSelect(NUMERO_PREG_SELECT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatawebPackage.CUESTIONARIO__EVALUADO:
				return evaluado != EVALUADO_EDEFAULT;
			case DatawebPackage.CUESTIONARIO__PREGUNTAS_C:
				return preguntasC != null && !preguntasC.isEmpty();
			case DatawebPackage.CUESTIONARIO__NUMERO_PREG_VF:
				return numeroPregVF != NUMERO_PREG_VF_EDEFAULT;
			case DatawebPackage.CUESTIONARIO__NUMERO_PREG_SELECT:
				return numeroPregSelect != NUMERO_PREG_SELECT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DatawebPackage.CUESTIONARIO___R0_7A_CUESTIONARIO_PREGUNTAS_CON_RESPUESTA_CORRECTA__DIAGNOSTICCHAIN_MAP:
				return R07a_cuestionario_preguntas_con_respuesta_correcta((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Evaluado: ");
		result.append(evaluado);
		result.append(", numeroPregVF: ");
		result.append(numeroPregVF);
		result.append(", numeroPregSelect: ");
		result.append(numeroPregSelect);
		result.append(')');
		return result.toString();
	}

} //CuestionarioImpl
