/**
 */
package dataweb.impl;

import dataweb.Atributo;
import dataweb.DatawebPackage;
import dataweb.DatawebTables;
import dataweb.Entidad;
import dataweb.Indice;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataweb.impl.IndiceImpl#getAtributos <em>Atributos</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IndiceImpl extends DependienteDeEntidadImpl implements Indice {
	/**
	 * The default value of the '{@link #getAtributos() <em>Atributos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos()
	 * @generated
	 * @ordered
	 */
	protected static final String ATRIBUTOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos()
	 * @generated
	 * @ordered
	 */
	protected String atributos = ATRIBUTOS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatawebPackage.Literals.INDICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAtributos() {
		return atributos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAtributos(String newAtributos) {
		String oldAtributos = atributos;
		atributos = newAtributos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.INDICE__ATRIBUTOS, oldAtributos, atributos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean R09_atributos_en_indice_pertenecen_a_entidad(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Indice::R09_atributos_en_indice_pertenecen_a_entidad";
		try {
			/**
			 *
			 * inv R09_atributos_en_indice_pertenecen_a_entidad:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = Atributos->forAll(a |
			 *           self.entidad.atributos->exists(at | at.Nombre = a))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DatawebPackage.Literals.INDICE___R09_ATRIBUTOS_EN_INDICE_PERTENECEN_AENTIDAD__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DatawebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String Atributos = this.getAtributos();
					final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, DatawebTables.SET_PRIMid_String, Atributos);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_a = oclAsSet.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_a.hasNext()) {
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
						/*@NonInvalid*/ String a = (String)ITERATOR_a.next();
						/**
						 * self.entidad.atributos->exists(at | at.Nombre = a)
						 */
						final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
						final /*@NonInvalid*/ Entidad entidad = this.getEntidad();
						final /*@NonInvalid*/ List<Atributo> atributos = entidad.getAtributos();
						final /*@NonInvalid*/ OrderedSetValue BOXED_atributos = idResolver.createOrderedSetOfAll(DatawebTables.ORD_CLSSid_Atributo, atributos);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_at = BOXED_atributos.iterator();
						/*@NonInvalid*/ Boolean exists;
						while (true) {
							if (!ITERATOR_at.hasNext()) {
								if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ Atributo at = (Atributo)ITERATOR_at.next();
							/**
							 * at.Nombre = a
							 */
							final /*@NonInvalid*/ String Nombre = at.getNombre();
							final /*@NonInvalid*/ boolean eq = a.equals(Nombre);
							//
							if (eq) {					// Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break;														// Stop immediately
							}
							else if (!eq) {				// Normal unsuccessful body evaluation result
								;															// Carry on
							}
							else {															// Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						//
						if (exists == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (exists == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (exists == null) {								// Abnormal null body evaluation result
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatawebPackage.INDICE__ATRIBUTOS:
				return getAtributos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatawebPackage.INDICE__ATRIBUTOS:
				setAtributos((String)newValue);
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
			case DatawebPackage.INDICE__ATRIBUTOS:
				setAtributos(ATRIBUTOS_EDEFAULT);
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
			case DatawebPackage.INDICE__ATRIBUTOS:
				return ATRIBUTOS_EDEFAULT == null ? atributos != null : !ATRIBUTOS_EDEFAULT.equals(atributos);
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
			case DatawebPackage.INDICE___R09_ATRIBUTOS_EN_INDICE_PERTENECEN_AENTIDAD__DIAGNOSTICCHAIN_MAP:
				return R09_atributos_en_indice_pertenecen_a_entidad((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (Atributos: ");
		result.append(atributos);
		result.append(')');
		return result.toString();
	}

} //IndiceImpl
