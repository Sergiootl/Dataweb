/**
 */
package dataweb.impl;

import dataweb.Aplicacion;
import dataweb.BaseDatos;
import dataweb.DatawebPackage;
import dataweb.DatawebTables;
import dataweb.PaginaPantalla;
import dataweb.RedSocial;
import dataweb.Rol;

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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aplicacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataweb.impl.AplicacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dataweb.impl.AplicacionImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link dataweb.impl.AplicacionImpl#getRedessociales <em>Redessociales</em>}</li>
 *   <li>{@link dataweb.impl.AplicacionImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link dataweb.impl.AplicacionImpl#getPaginapantallas <em>Paginapantallas</em>}</li>
 *   <li>{@link dataweb.impl.AplicacionImpl#getBasedatos <em>Basedatos</em>}</li>
 *   <li>{@link dataweb.impl.AplicacionImpl#getPaginasMediasAccesibles <em>Paginas Medias Accesibles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AplicacionImpl extends EObjectImpl implements Aplicacion {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> roles;

	/**
	 * The cached value of the '{@link #getRedessociales() <em>Redessociales</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedessociales()
	 * @generated
	 * @ordered
	 */
	protected EList<RedSocial> redessociales;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaginapantallas() <em>Paginapantallas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginapantallas()
	 * @generated
	 * @ordered
	 */
	protected EList<PaginaPantalla> paginapantallas;

	/**
	 * The cached value of the '{@link #getBasedatos() <em>Basedatos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedatos()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseDatos> basedatos;

	/**
	 * The default value of the '{@link #getPaginasMediasAccesibles() <em>Paginas Medias Accesibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginasMediasAccesibles()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGINAS_MEDIAS_ACCESIBLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPaginasMediasAccesibles() <em>Paginas Medias Accesibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginasMediasAccesibles()
	 * @generated
	 * @ordered
	 */
	protected int paginasMediasAccesibles = PAGINAS_MEDIAS_ACCESIBLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AplicacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatawebPackage.Literals.APLICACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.APLICACION__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rol> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Rol>(Rol.class, this, DatawebPackage.APLICACION__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RedSocial> getRedessociales() {
		if (redessociales == null) {
			redessociales = new EObjectContainmentEList<RedSocial>(RedSocial.class, this, DatawebPackage.APLICACION__REDESSOCIALES);
		}
		return redessociales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.APLICACION__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PaginaPantalla> getPaginapantallas() {
		if (paginapantallas == null) {
			paginapantallas = new EObjectContainmentEList<PaginaPantalla>(PaginaPantalla.class, this, DatawebPackage.APLICACION__PAGINAPANTALLAS);
		}
		return paginapantallas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseDatos> getBasedatos() {
		if (basedatos == null) {
			basedatos = new EObjectContainmentEList<BaseDatos>(BaseDatos.class, this, DatawebPackage.APLICACION__BASEDATOS);
		}
		return basedatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPaginasMediasAccesibles() {
		return paginasMediasAccesibles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaginasMediasAccesibles(int newPaginasMediasAccesibles) {
		int oldPaginasMediasAccesibles = paginasMediasAccesibles;
		paginasMediasAccesibles = newPaginasMediasAccesibles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.APLICACION__PAGINAS_MEDIAS_ACCESIBLES, oldPaginasMediasAccesibles, paginasMediasAccesibles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean R01_index_unico(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Aplicacion::R01_index_unico";
		try {
			/**
			 *
			 * inv R01_index_unico:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = paginapantallas->select(p |
			 *           p.oclIsTypeOf(Index))
			 *         ->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DatawebPackage.Literals.APLICACION___R01_INDEX_UNICO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DatawebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<PaginaPantalla> paginapantallas = this.getPaginapantallas();
				final /*@NonInvalid*/ OrderedSetValue BOXED_paginapantallas = idResolver.createOrderedSetOfAll(DatawebTables.ORD_CLSSid_PaginaPantalla, paginapantallas);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(DatawebTables.ORD_CLSSid_PaginaPantalla);
				Iterator<Object> ITERATOR_p = BOXED_paginapantallas.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_p.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ PaginaPantalla p = (PaginaPantalla)ITERATOR_p.next();
					/**
					 * p.oclIsTypeOf(Index)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_Index = idResolver.getClass(DatawebTables.CLSSid_Index, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p, TYP_dataweb_c_c_Index).booleanValue();
					//
					if (oclIsTypeOf) {
						accumulator.add(p);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean result = size.equals(DatawebTables.INT_1);
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
	public boolean R04_fuentes_externas_minimas(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Aplicacion::R04_fuentes_externas_minimas";
		try {
			/**
			 *
			 * inv R04_fuentes_externas_minimas:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = redessociales->size() >= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DatawebPackage.Literals.APLICACION___R04_FUENTES_EXTERNAS_MINIMAS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DatawebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<RedSocial> redessociales = this.getRedessociales();
				final /*@NonInvalid*/ OrderedSetValue BOXED_redessociales = idResolver.createOrderedSetOfAll(DatawebTables.ORD_CLSSid_RedSocial, redessociales);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_redessociales);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, DatawebTables.INT_1).booleanValue();
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
	public boolean R06b_encuesta_y_cuestionario(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Aplicacion::R06b_encuesta_y_cuestionario";
		try {
			/**
			 *
			 * inv R06b_encuesta_y_cuestionario:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = paginapantallas->exists(p |
			 *           p.oclIsTypeOf(Encuesta)) and
			 *         paginapantallas->exists(p | p.oclIsTypeOf(Cuestionario))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DatawebPackage.Literals.APLICACION___R0_6B_ENCUESTA_YCUESTIONARIO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DatawebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<PaginaPantalla> paginapantallas_0 = this.getPaginapantallas();
					final /*@NonInvalid*/ OrderedSetValue BOXED_paginapantallas_0 = idResolver.createOrderedSetOfAll(DatawebTables.ORD_CLSSid_PaginaPantalla, paginapantallas_0);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_p = BOXED_paginapantallas_0.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_p.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ PaginaPantalla p = (PaginaPantalla)ITERATOR_p.next();
						/**
						 * p.oclIsTypeOf(Encuesta)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_Encuesta = idResolver.getClass(DatawebTables.CLSSid_Encuesta, null);
						final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p, TYP_dataweb_c_c_Encuesta).booleanValue();
						//
						if (oclIsTypeOf) {					// Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break;														// Stop immediately
						}
						else if (!oclIsTypeOf) {				// Normal unsuccessful body evaluation result
							;															// Carry on
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					final /*@Thrown*/ Boolean result;
					if (exists == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_p_0 = BOXED_paginapantallas_0.iterator();
						/*@NonInvalid*/ Boolean exists_0;
						while (true) {
							if (!ITERATOR_p_0.hasNext()) {
								if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									exists_0 = ValueUtil.FALSE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ PaginaPantalla p_0 = (PaginaPantalla)ITERATOR_p_0.next();
							/**
							 * p.oclIsTypeOf(Cuestionario)
							 */
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_Cuestionario = idResolver.getClass(DatawebTables.CLSSid_Cuestionario, null);
							final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p_0, TYP_dataweb_c_c_Cuestionario).booleanValue();
							//
							if (oclIsTypeOf_0) {					// Normal successful body evaluation result
								exists_0 = ValueUtil.TRUE_VALUE;
								break;														// Stop immediately
							}
							else if (!oclIsTypeOf_0) {				// Normal unsuccessful body evaluation result
								;															// Carry on
							}
							else {															// Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						if (exists_0 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if ((exists == null) || (exists_0 == null)) {
								result = null;
							}
							else {
								result = ValueUtil.TRUE_VALUE;
							}
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatawebPackage.APLICACION__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case DatawebPackage.APLICACION__REDESSOCIALES:
				return ((InternalEList<?>)getRedessociales()).basicRemove(otherEnd, msgs);
			case DatawebPackage.APLICACION__PAGINAPANTALLAS:
				return ((InternalEList<?>)getPaginapantallas()).basicRemove(otherEnd, msgs);
			case DatawebPackage.APLICACION__BASEDATOS:
				return ((InternalEList<?>)getBasedatos()).basicRemove(otherEnd, msgs);
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
			case DatawebPackage.APLICACION__NOMBRE:
				return getNombre();
			case DatawebPackage.APLICACION__ROLES:
				return getRoles();
			case DatawebPackage.APLICACION__REDESSOCIALES:
				return getRedessociales();
			case DatawebPackage.APLICACION__DESCRIPCION:
				return getDescripcion();
			case DatawebPackage.APLICACION__PAGINAPANTALLAS:
				return getPaginapantallas();
			case DatawebPackage.APLICACION__BASEDATOS:
				return getBasedatos();
			case DatawebPackage.APLICACION__PAGINAS_MEDIAS_ACCESIBLES:
				return getPaginasMediasAccesibles();
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
			case DatawebPackage.APLICACION__NOMBRE:
				setNombre((String)newValue);
				return;
			case DatawebPackage.APLICACION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Rol>)newValue);
				return;
			case DatawebPackage.APLICACION__REDESSOCIALES:
				getRedessociales().clear();
				getRedessociales().addAll((Collection<? extends RedSocial>)newValue);
				return;
			case DatawebPackage.APLICACION__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case DatawebPackage.APLICACION__PAGINAPANTALLAS:
				getPaginapantallas().clear();
				getPaginapantallas().addAll((Collection<? extends PaginaPantalla>)newValue);
				return;
			case DatawebPackage.APLICACION__BASEDATOS:
				getBasedatos().clear();
				getBasedatos().addAll((Collection<? extends BaseDatos>)newValue);
				return;
			case DatawebPackage.APLICACION__PAGINAS_MEDIAS_ACCESIBLES:
				setPaginasMediasAccesibles((Integer)newValue);
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
			case DatawebPackage.APLICACION__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DatawebPackage.APLICACION__ROLES:
				getRoles().clear();
				return;
			case DatawebPackage.APLICACION__REDESSOCIALES:
				getRedessociales().clear();
				return;
			case DatawebPackage.APLICACION__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case DatawebPackage.APLICACION__PAGINAPANTALLAS:
				getPaginapantallas().clear();
				return;
			case DatawebPackage.APLICACION__BASEDATOS:
				getBasedatos().clear();
				return;
			case DatawebPackage.APLICACION__PAGINAS_MEDIAS_ACCESIBLES:
				setPaginasMediasAccesibles(PAGINAS_MEDIAS_ACCESIBLES_EDEFAULT);
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
			case DatawebPackage.APLICACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DatawebPackage.APLICACION__ROLES:
				return roles != null && !roles.isEmpty();
			case DatawebPackage.APLICACION__REDESSOCIALES:
				return redessociales != null && !redessociales.isEmpty();
			case DatawebPackage.APLICACION__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case DatawebPackage.APLICACION__PAGINAPANTALLAS:
				return paginapantallas != null && !paginapantallas.isEmpty();
			case DatawebPackage.APLICACION__BASEDATOS:
				return basedatos != null && !basedatos.isEmpty();
			case DatawebPackage.APLICACION__PAGINAS_MEDIAS_ACCESIBLES:
				return paginasMediasAccesibles != PAGINAS_MEDIAS_ACCESIBLES_EDEFAULT;
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
			case DatawebPackage.APLICACION___R01_INDEX_UNICO__DIAGNOSTICCHAIN_MAP:
				return R01_index_unico((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DatawebPackage.APLICACION___R04_FUENTES_EXTERNAS_MINIMAS__DIAGNOSTICCHAIN_MAP:
				return R04_fuentes_externas_minimas((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DatawebPackage.APLICACION___R0_6B_ENCUESTA_YCUESTIONARIO__DIAGNOSTICCHAIN_MAP:
				return R06b_encuesta_y_cuestionario((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (Nombre: ");
		result.append(nombre);
		result.append(", Descripcion: ");
		result.append(descripcion);
		result.append(", paginasMediasAccesibles: ");
		result.append(paginasMediasAccesibles);
		result.append(')');
		return result.toString();
	}

} //AplicacionImpl
