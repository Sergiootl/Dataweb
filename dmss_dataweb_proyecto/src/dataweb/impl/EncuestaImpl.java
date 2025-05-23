/**
 */
package dataweb.impl;

import dataweb.DatawebPackage;
import dataweb.DatawebTables;
import dataweb.Encuesta;

import dataweb.Pregunta;
import dataweb.Respuesta;
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
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encuesta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataweb.impl.EncuestaImpl#getPreguntasE <em>Preguntas E</em>}</li>
 *   <li>{@link dataweb.impl.EncuestaImpl#getNumeroPregVF <em>Numero Preg VF</em>}</li>
 *   <li>{@link dataweb.impl.EncuestaImpl#getNumeroPregSelect <em>Numero Preg Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncuestaImpl extends InteractivaImpl implements Encuesta {
	/**
	 * The cached value of the '{@link #getPreguntasE() <em>Preguntas E</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreguntasE()
	 * @generated
	 * @ordered
	 */
	protected EList<Pregunta> preguntasE;
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
	protected EncuestaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatawebPackage.Literals.ENCUESTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pregunta> getPreguntasE() {
		if (preguntasE == null) {
			preguntasE = new EObjectContainmentEList<Pregunta>(Pregunta.class, this, DatawebPackage.ENCUESTA__PREGUNTAS_E);
		}
		return preguntasE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.ENCUESTA__NUMERO_PREG_VF, oldNumeroPregVF, numeroPregVF));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.ENCUESTA__NUMERO_PREG_SELECT, oldNumeroPregSelect, numeroPregSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean R07b_encuesta_sin_respuesta_correcta(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Encuesta::R07b_encuesta_sin_respuesta_correcta";
		try {
			/**
			 *
			 * inv R07b_encuesta_sin_respuesta_correcta:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = preguntasE->forAll(p |
			 *           p.Rcorrecta.oclIsUndefined())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DatawebPackage.Literals.ENCUESTA___R0_7B_ENCUESTA_SIN_RESPUESTA_CORRECTA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DatawebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Pregunta> preguntasE = this.getPreguntasE();
				final /*@NonInvalid*/ OrderedSetValue BOXED_preguntasE = idResolver.createOrderedSetOfAll(DatawebTables.ORD_CLSSid_Pregunta, preguntasE);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_p = BOXED_preguntasE.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_p.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Pregunta p = (Pregunta)ITERATOR_p.next();
					/**
					 * p.Rcorrecta.oclIsUndefined()
					 */
					final /*@NonInvalid*/ Respuesta Rcorrecta = p.getRcorrecta();
					final /*@NonInvalid*/ boolean oclIsUndefined = Rcorrecta == null;
					//
					if (!oclIsUndefined) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (oclIsUndefined) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DatawebTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
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
			case DatawebPackage.ENCUESTA__PREGUNTAS_E:
				return ((InternalEList<?>)getPreguntasE()).basicRemove(otherEnd, msgs);
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
			case DatawebPackage.ENCUESTA__PREGUNTAS_E:
				return getPreguntasE();
			case DatawebPackage.ENCUESTA__NUMERO_PREG_VF:
				return getNumeroPregVF();
			case DatawebPackage.ENCUESTA__NUMERO_PREG_SELECT:
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
			case DatawebPackage.ENCUESTA__PREGUNTAS_E:
				getPreguntasE().clear();
				getPreguntasE().addAll((Collection<? extends Pregunta>)newValue);
				return;
			case DatawebPackage.ENCUESTA__NUMERO_PREG_VF:
				setNumeroPregVF((Integer)newValue);
				return;
			case DatawebPackage.ENCUESTA__NUMERO_PREG_SELECT:
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
			case DatawebPackage.ENCUESTA__PREGUNTAS_E:
				getPreguntasE().clear();
				return;
			case DatawebPackage.ENCUESTA__NUMERO_PREG_VF:
				setNumeroPregVF(NUMERO_PREG_VF_EDEFAULT);
				return;
			case DatawebPackage.ENCUESTA__NUMERO_PREG_SELECT:
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
			case DatawebPackage.ENCUESTA__PREGUNTAS_E:
				return preguntasE != null && !preguntasE.isEmpty();
			case DatawebPackage.ENCUESTA__NUMERO_PREG_VF:
				return numeroPregVF != NUMERO_PREG_VF_EDEFAULT;
			case DatawebPackage.ENCUESTA__NUMERO_PREG_SELECT:
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
			case DatawebPackage.ENCUESTA___R0_7B_ENCUESTA_SIN_RESPUESTA_CORRECTA__DIAGNOSTICCHAIN_MAP:
				return R07b_encuesta_sin_respuesta_correcta((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (numeroPregVF: ");
		result.append(numeroPregVF);
		result.append(", numeroPregSelect: ");
		result.append(numeroPregSelect);
		result.append(')');
		return result.toString();
	}

} //EncuestaImpl
