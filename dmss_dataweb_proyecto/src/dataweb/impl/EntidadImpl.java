/**
 */
package dataweb.impl;

import dataweb.Aplicacion;
import dataweb.Atributo;
import dataweb.DatawebPackage;
import dataweb.DatawebTables;
import dataweb.Entidad;
import dataweb.Indice;
import dataweb.PaginaPantalla;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
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
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataweb.impl.EntidadImpl#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link dataweb.impl.EntidadImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dataweb.impl.EntidadImpl#getEntidadRefereenciada <em>Entidad Refereenciada</em>}</li>
 *   <li>{@link dataweb.impl.EntidadImpl#getUsuarios <em>Usuarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntidadImpl extends EObjectImpl implements Entidad {
	/**
	 * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> atributos;

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
	 * The cached value of the '{@link #getEntidadRefereenciada() <em>Entidad Refereenciada</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadRefereenciada()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> entidadRefereenciada;

	/**
	 * The cached value of the '{@link #getUsuarios() <em>Usuarios</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> usuarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntidadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatawebPackage.Literals.ENTIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Atributo> getAtributos() {
		if (atributos == null) {
			atributos = new EObjectContainmentEList<Atributo>(Atributo.class, this, DatawebPackage.ENTIDAD__ATRIBUTOS);
		}
		return atributos;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.ENTIDAD__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entidad> getEntidadRefereenciada() {
		if (entidadRefereenciada == null) {
			entidadRefereenciada = new EObjectResolvingEList<Entidad>(Entidad.class, this, DatawebPackage.ENTIDAD__ENTIDAD_REFEREENCIADA);
		}
		return entidadRefereenciada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rol> getUsuarios() {
		if (usuarios == null) {
			usuarios = new EObjectWithInverseResolvingEList.ManyInverse<Rol>(Rol.class, this, DatawebPackage.ENTIDAD__USUARIOS, DatawebPackage.ROL__ENTIDADES);
		}
		return usuarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean R05_no_autorreferencia(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entidad::R05_no_autorreferencia";
		try {
			/**
			 *
			 * inv R05_no_autorreferencia:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = not entidadRefereenciada->includes(self)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DatawebPackage.Literals.ENTIDAD___R05_NO_AUTORREFERENCIA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DatawebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Entidad> entidadRefereenciada = this.getEntidadRefereenciada();
				final /*@NonInvalid*/ OrderedSetValue BOXED_entidadRefereenciada = idResolver.createOrderedSetOfAll(DatawebTables.ORD_CLSSid_Entidad, entidadRefereenciada);
				final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_entidadRefereenciada, this).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!includes) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					if (includes) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						result = null;
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
	public boolean R03_indice_y_detalle_van_juntos(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entidad::R03_indice_y_detalle_van_juntos";
		try {
			/**
			 *
			 * inv R03_indice_y_detalle_van_juntos:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = let
			 *           pp : OrderedSet(dataweb::PaginaPantalla) = Aplicacion.allInstances()
			 *           ->any(true)
			 *           .paginapantallas->select(p | p.entidad = self)
			 *         in
			 *           pp->exists(p |
			 *             (
			 *               p.oclIsTypeOf(IndiceEntidad) or
			 *               p.oclIsTypeOf(IndiceExtendido)
			 *             )) =
			 *           pp->exists(p | p.oclIsTypeOf(DetallesInstancia))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DatawebPackage.Literals.ENTIDAD___R03_INDICE_YDETALLE_VAN_JUNTOS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DatawebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_eq_0;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_Aplicacion_0 = idResolver.getClass(DatawebTables.CLSSid_Aplicacion, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, DatawebTables.SET_CLSSid_Aplicacion, TYP_dataweb_c_c_Aplicacion_0);
					Iterator<Object> ITERATOR__1 = allInstances.iterator();
					/*@NonInvalid*/ Aplicacion any;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							throw new InvalidValueException("Nothing to return for ''any''");
						}
						/*@NonInvalid*/ Aplicacion _1 = (Aplicacion)ITERATOR__1.next();
						/**
						 * true
						 */
						//
						if (ValueUtil.TRUE_VALUE) {			// Carry on till something found
							any = _1;
							break;
						}
					}
					final /*@NonInvalid*/ List<PaginaPantalla> paginapantallas = any.getPaginapantallas();
					final /*@NonInvalid*/ OrderedSetValue BOXED_paginapantallas = idResolver.createOrderedSetOfAll(DatawebTables.ORD_CLSSid_PaginaPantalla, paginapantallas);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(DatawebTables.ORD_CLSSid_PaginaPantalla);
					Iterator<Object> ITERATOR_p = BOXED_paginapantallas.iterator();
					/*@NonInvalid*/ OrderedSetValue pp;
					while (true) {
						if (!ITERATOR_p.hasNext()) {
							pp = accumulator;
							break;
						}
						/*@NonInvalid*/ PaginaPantalla p = (PaginaPantalla)ITERATOR_p.next();
						/**
						 * p.entidad = self
						 */
						final /*@NonInvalid*/ Entidad entidad = p.getEntidad();
						final /*@NonInvalid*/ boolean eq = entidad.equals(this);
						//
						if (eq) {
							accumulator.add(p);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_p_0 = pp.iterator();
					/*@Thrown*/ Boolean exists;
					while (true) {
						if (!ITERATOR_p_0.hasNext()) {
							if (accumulator_0 == null) {
								exists = null;
							}
							else if (accumulator_0 == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ PaginaPantalla p_0 = (PaginaPantalla)ITERATOR_p_0.next();
						/**
						 *
						 * p.oclIsTypeOf(IndiceEntidad) or
						 * p.oclIsTypeOf(IndiceExtendido)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_IndiceEntidad_0 = idResolver.getClass(DatawebTables.CLSSid_IndiceEntidad, null);
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_IndiceExtendido_0 = idResolver.getClass(DatawebTables.CLSSid_IndiceExtendido, null);
						final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p_0, TYP_dataweb_c_c_IndiceEntidad_0).booleanValue();
						final /*@NonInvalid*/ Boolean or;
						if (oclIsTypeOf) {
							or = ValueUtil.TRUE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p_0, TYP_dataweb_c_c_IndiceExtendido_0).booleanValue();
							if (oclIsTypeOf_0) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								or = ValueUtil.FALSE_VALUE;
							}
						}
						//
						if (or == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break;														// Stop immediately
						}
						else if (or == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
							;															// Carry on
						}
						else if (or == null) {								// Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.FALSE_VALUE) {
								accumulator_0 = null;										// Cache a null failure
							}
						}
						else {															// Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_p_1 = pp.iterator();
					/*@NonInvalid*/ Boolean exists_0;
					while (true) {
						if (!ITERATOR_p_1.hasNext()) {
							if (accumulator_1 == ValueUtil.FALSE_VALUE) {
								exists_0 = ValueUtil.FALSE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_1;
							}
							break;
						}
						/*@NonInvalid*/ PaginaPantalla p_1 = (PaginaPantalla)ITERATOR_p_1.next();
						/**
						 * p.oclIsTypeOf(DetallesInstancia)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_DetallesInstancia_0 = idResolver.getClass(DatawebTables.CLSSid_DetallesInstancia, null);
						final /*@NonInvalid*/ boolean oclIsTypeOf_1 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p_1, TYP_dataweb_c_c_DetallesInstancia_0).booleanValue();
						//
						if (oclIsTypeOf_1) {					// Normal successful body evaluation result
							exists_0 = ValueUtil.TRUE_VALUE;
							break;														// Stop immediately
						}
						else if (!oclIsTypeOf_1) {				// Normal unsuccessful body evaluation result
							;															// Carry on
						}
						else {															// Impossible badly typed result
							accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					final /*@Thrown*/ boolean eq_0 = exists == exists_0;
					CAUGHT_eq_0 = eq_0;
				}
				catch (Exception e) {
					CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_eq_0, DatawebTables.INT_0).booleanValue();
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
	public boolean R02_crud_no_combinado(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entidad::R02_crud_no_combinado";
		try {
			/**
			 *
			 * inv R02_crud_no_combinado:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = let
			 *           pp : OrderedSet(dataweb::PaginaPantalla) = Aplicacion.allInstances()
			 *           ->any(true)
			 *           .paginapantallas->select(p | p.entidad = self)
			 *         in
			 *           pp->exists(p | p.oclIsTypeOf(CRUD)) implies
			 *           pp->forAll(p |
			 *             not (
			 *               p.oclIsTypeOf(IndiceEntidad) or
			 *               p.oclIsTypeOf(IndiceExtendido) or
			 *               p.oclIsTypeOf(IndiceDetalle) or
			 *               p.oclIsTypeOf(DetallesInstancia) or
			 *               p.oclIsTypeOf(CrearInstancia) or
			 *               p.oclIsTypeOf(ActualizacionInstancia) or
			 *               p.oclIsTypeOf(BorradoInstancia)
			 *             ))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DatawebPackage.Literals.ENTIDAD___R02_CRUD_NO_COMBINADO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DatawebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_implies;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_Aplicacion = idResolver.getClass(DatawebTables.CLSSid_Aplicacion, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, DatawebTables.SET_CLSSid_Aplicacion, TYP_dataweb_c_c_Aplicacion);
					Iterator<Object> ITERATOR__1 = allInstances.iterator();
					/*@NonInvalid*/ Aplicacion any;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							throw new InvalidValueException("Nothing to return for ''any''");
						}
						/*@NonInvalid*/ Aplicacion _1 = (Aplicacion)ITERATOR__1.next();
						/**
						 * true
						 */
						//
						if (ValueUtil.TRUE_VALUE) {			// Carry on till something found
							any = _1;
							break;
						}
					}
					final /*@NonInvalid*/ List<PaginaPantalla> paginapantallas = any.getPaginapantallas();
					final /*@NonInvalid*/ OrderedSetValue BOXED_paginapantallas = idResolver.createOrderedSetOfAll(DatawebTables.ORD_CLSSid_PaginaPantalla, paginapantallas);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(DatawebTables.ORD_CLSSid_PaginaPantalla);
					Iterator<Object> ITERATOR_p = BOXED_paginapantallas.iterator();
					/*@NonInvalid*/ OrderedSetValue pp;
					while (true) {
						if (!ITERATOR_p.hasNext()) {
							pp = accumulator;
							break;
						}
						/*@NonInvalid*/ PaginaPantalla p = (PaginaPantalla)ITERATOR_p.next();
						/**
						 * p.entidad = self
						 */
						final /*@NonInvalid*/ Entidad entidad = p.getEntidad();
						final /*@NonInvalid*/ boolean eq = entidad.equals(this);
						//
						if (eq) {
							accumulator.add(p);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_p_0 = pp.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_p_0.hasNext()) {
							if (accumulator_0 == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ PaginaPantalla p_0 = (PaginaPantalla)ITERATOR_p_0.next();
						/**
						 * p.oclIsTypeOf(CRUD)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_CRUD = idResolver.getClass(DatawebTables.CLSSid_CRUD, null);
						final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p_0, TYP_dataweb_c_c_CRUD).booleanValue();
						//
						if (oclIsTypeOf) {					// Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break;														// Stop immediately
						}
						else if (!oclIsTypeOf) {				// Normal unsuccessful body evaluation result
							;															// Carry on
						}
						else {															// Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					final /*@Thrown*/ Boolean implies;
					if (exists == ValueUtil.FALSE_VALUE) {
						implies = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							/*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_p_1 = pp.iterator();
							/*@Thrown*/ Boolean forAll;
							while (true) {
								if (!ITERATOR_p_1.hasNext()) {
									if (accumulator_1 == null) {
										forAll = null;
									}
									else if (accumulator_1 == ValueUtil.TRUE_VALUE) {
										forAll = ValueUtil.TRUE_VALUE;
									}
									else {
										throw (InvalidValueException)accumulator_1;
									}
									break;
								}
								/*@NonInvalid*/ PaginaPantalla p_1 = (PaginaPantalla)ITERATOR_p_1.next();
								/**
								 *
								 * not (
								 *   p.oclIsTypeOf(IndiceEntidad) or
								 *   p.oclIsTypeOf(IndiceExtendido) or
								 *   p.oclIsTypeOf(IndiceDetalle) or
								 *   p.oclIsTypeOf(DetallesInstancia) or
								 *   p.oclIsTypeOf(CrearInstancia) or
								 *   p.oclIsTypeOf(ActualizacionInstancia) or
								 *   p.oclIsTypeOf(BorradoInstancia)
								 * )
								 */
								/*@Caught*/ Object CAUGHT_not;
								try {
									/*@Caught*/ Object CAUGHT_or_4;
									try {
										final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_BorradoInstancia = idResolver.getClass(DatawebTables.CLSSid_BorradoInstancia, null);
										/*@Caught*/ Object CAUGHT_or_3;
										try {
											final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_ActualizacionInstancia = idResolver.getClass(DatawebTables.CLSSid_ActualizacionInstancia, null);
											/*@Caught*/ Object CAUGHT_or_2;
											try {
												final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_CrearInstancia = idResolver.getClass(DatawebTables.CLSSid_CrearInstancia, null);
												/*@Caught*/ Object CAUGHT_or_1;
												try {
													final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_DetallesInstancia = idResolver.getClass(DatawebTables.CLSSid_DetallesInstancia, null);
													/*@Caught*/ Object CAUGHT_or_0;
													try {
														final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_IndiceDetalle = idResolver.getClass(DatawebTables.CLSSid_IndiceDetalle, null);
														final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_IndiceEntidad = idResolver.getClass(DatawebTables.CLSSid_IndiceEntidad, null);
														final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_IndiceExtendido = idResolver.getClass(DatawebTables.CLSSid_IndiceExtendido, null);
														final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p_1, TYP_dataweb_c_c_IndiceEntidad).booleanValue();
														final /*@NonInvalid*/ Boolean or;
														if (oclIsTypeOf_0) {
															or = ValueUtil.TRUE_VALUE;
														}
														else {
															final /*@NonInvalid*/ boolean oclIsTypeOf_1 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p_1, TYP_dataweb_c_c_IndiceExtendido).booleanValue();
															if (oclIsTypeOf_1) {
																or = ValueUtil.TRUE_VALUE;
															}
															else {
																or = ValueUtil.FALSE_VALUE;
															}
														}
														final /*@Thrown*/ Boolean or_0;
														if (or == ValueUtil.TRUE_VALUE) {
															or_0 = ValueUtil.TRUE_VALUE;
														}
														else {
															final /*@NonInvalid*/ boolean oclIsTypeOf_2 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p_1, TYP_dataweb_c_c_IndiceDetalle).booleanValue();
															if (oclIsTypeOf_2) {
																or_0 = ValueUtil.TRUE_VALUE;
															}
															else {
																if (or == null) {
																	or_0 = null;
																}
																else {
																	or_0 = ValueUtil.FALSE_VALUE;
																}
															}
														}
														CAUGHT_or_0 = or_0;
													}
													catch (Exception e) {
														CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
													}
													final /*@Thrown*/ Boolean or_1;
													if (CAUGHT_or_0 == ValueUtil.TRUE_VALUE) {
														or_1 = ValueUtil.TRUE_VALUE;
													}
													else {
														final /*@NonInvalid*/ boolean oclIsTypeOf_3 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p_1, TYP_dataweb_c_c_DetallesInstancia).booleanValue();
														if (oclIsTypeOf_3) {
															or_1 = ValueUtil.TRUE_VALUE;
														}
														else {
															if (CAUGHT_or_0 instanceof InvalidValueException) {
																throw (InvalidValueException)CAUGHT_or_0;
															}
															if (CAUGHT_or_0 == null) {
																or_1 = null;
															}
															else {
																or_1 = ValueUtil.FALSE_VALUE;
															}
														}
													}
													CAUGHT_or_1 = or_1;
												}
												catch (Exception e) {
													CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
												}
												final /*@Thrown*/ Boolean or_2;
												if (CAUGHT_or_1 == ValueUtil.TRUE_VALUE) {
													or_2 = ValueUtil.TRUE_VALUE;
												}
												else {
													final /*@NonInvalid*/ boolean oclIsTypeOf_4 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p_1, TYP_dataweb_c_c_CrearInstancia).booleanValue();
													if (oclIsTypeOf_4) {
														or_2 = ValueUtil.TRUE_VALUE;
													}
													else {
														if (CAUGHT_or_1 instanceof InvalidValueException) {
															throw (InvalidValueException)CAUGHT_or_1;
														}
														if (CAUGHT_or_1 == null) {
															or_2 = null;
														}
														else {
															or_2 = ValueUtil.FALSE_VALUE;
														}
													}
												}
												CAUGHT_or_2 = or_2;
											}
											catch (Exception e) {
												CAUGHT_or_2 = ValueUtil.createInvalidValue(e);
											}
											final /*@Thrown*/ Boolean or_3;
											if (CAUGHT_or_2 == ValueUtil.TRUE_VALUE) {
												or_3 = ValueUtil.TRUE_VALUE;
											}
											else {
												final /*@NonInvalid*/ boolean oclIsTypeOf_5 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p_1, TYP_dataweb_c_c_ActualizacionInstancia).booleanValue();
												if (oclIsTypeOf_5) {
													or_3 = ValueUtil.TRUE_VALUE;
												}
												else {
													if (CAUGHT_or_2 instanceof InvalidValueException) {
														throw (InvalidValueException)CAUGHT_or_2;
													}
													if (CAUGHT_or_2 == null) {
														or_3 = null;
													}
													else {
														or_3 = ValueUtil.FALSE_VALUE;
													}
												}
											}
											CAUGHT_or_3 = or_3;
										}
										catch (Exception e) {
											CAUGHT_or_3 = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean or_4;
										if (CAUGHT_or_3 == ValueUtil.TRUE_VALUE) {
											or_4 = ValueUtil.TRUE_VALUE;
										}
										else {
											final /*@NonInvalid*/ boolean oclIsTypeOf_6 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p_1, TYP_dataweb_c_c_BorradoInstancia).booleanValue();
											if (oclIsTypeOf_6) {
												or_4 = ValueUtil.TRUE_VALUE;
											}
											else {
												if (CAUGHT_or_3 instanceof InvalidValueException) {
													throw (InvalidValueException)CAUGHT_or_3;
												}
												if (CAUGHT_or_3 == null) {
													or_4 = null;
												}
												else {
													or_4 = ValueUtil.FALSE_VALUE;
												}
											}
										}
										CAUGHT_or_4 = or_4;
									}
									catch (Exception e) {
										CAUGHT_or_4 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_or_4 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_or_4;
									}
									final /*@Thrown*/ Boolean not;
									if (CAUGHT_or_4 == ValueUtil.FALSE_VALUE) {
										not = ValueUtil.TRUE_VALUE;
									}
									else {
										if (CAUGHT_or_4 == ValueUtil.TRUE_VALUE) {
											not = ValueUtil.FALSE_VALUE;
										}
										else {
											not = null;
										}
									}
									CAUGHT_not = not;
								}
								catch (Exception e) {
									CAUGHT_not = ValueUtil.createInvalidValue(e);
								}
								//
								if (CAUGHT_not == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
									forAll = ValueUtil.FALSE_VALUE;
									break;														// Stop immediately
								}
								else if (CAUGHT_not == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
									;															// Carry on
								}
								else if (CAUGHT_not == null) {								// Abnormal null body evaluation result
									if (accumulator_1 == ValueUtil.TRUE_VALUE) {
										accumulator_1 = null;										// Cache a null failure
									}
								}
								else if (CAUGHT_not instanceof InvalidValueException) {		// Abnormal exception evaluation result
									accumulator_1 = CAUGHT_not;									// Cache an exception failure
								}
								else {															// Impossible badly typed result
									accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						}
						catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {
							implies = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_forAll instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_forAll;
							}
							if ((exists == null) || (CAUGHT_forAll == null)) {
								implies = null;
							}
							else {
								implies = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_implies = implies;
				}
				catch (Exception e) {
					CAUGHT_implies = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_implies, DatawebTables.INT_0).booleanValue();
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
	public boolean R08_indice_unico_por_entidad(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entidad::R08_indice_unico_por_entidad";
		try {
			/**
			 *
			 * inv R08_indice_unico_por_entidad:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Aplicacion.allInstances()
			 *         ->any(true)
			 *         .paginapantallas->select(p |
			 *           (p.entidad = self and p.oclIsTypeOf(IndiceEntidad)
			 *           ))
			 *         ->size() <= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DatawebPackage.Literals.ENTIDAD___R08_INDICE_UNICO_POR_ENTIDAD__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DatawebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_Aplicacion_0 = idResolver.getClass(DatawebTables.CLSSid_Aplicacion, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, DatawebTables.SET_CLSSid_Aplicacion, TYP_dataweb_c_c_Aplicacion_0);
					Iterator<Object> ITERATOR__1 = allInstances.iterator();
					/*@NonInvalid*/ Aplicacion any;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							throw new InvalidValueException("Nothing to return for ''any''");
						}
						/*@NonInvalid*/ Aplicacion _1 = (Aplicacion)ITERATOR__1.next();
						/**
						 * true
						 */
						//
						if (ValueUtil.TRUE_VALUE) {			// Carry on till something found
							any = _1;
							break;
						}
					}
					final /*@NonInvalid*/ List<PaginaPantalla> paginapantallas = any.getPaginapantallas();
					final /*@NonInvalid*/ OrderedSetValue BOXED_paginapantallas = idResolver.createOrderedSetOfAll(DatawebTables.ORD_CLSSid_PaginaPantalla, paginapantallas);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(DatawebTables.ORD_CLSSid_PaginaPantalla);
					Iterator<Object> ITERATOR_p = BOXED_paginapantallas.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_p.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ PaginaPantalla p = (PaginaPantalla)ITERATOR_p.next();
						/**
						 * p.entidad = self and p.oclIsTypeOf(IndiceEntidad)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataweb_c_c_IndiceEntidad_0 = idResolver.getClass(DatawebTables.CLSSid_IndiceEntidad, null);
						final /*@NonInvalid*/ Entidad entidad = p.getEntidad();
						final /*@NonInvalid*/ boolean eq = entidad.equals(this);
						final /*@NonInvalid*/ Boolean and;
						if (!eq) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, p, TYP_dataweb_c_c_IndiceEntidad_0).booleanValue();
							if (!oclIsTypeOf) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						if (and == null) {
							throw new InvalidValueException("Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
						}
						//
						if (and == ValueUtil.TRUE_VALUE) {
							accumulator.add(p);
						}
					}
					final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@Thrown*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, DatawebTables.INT_1).booleanValue();
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
	public boolean R06_no_referencia_inversa(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entidad::R06_no_referencia_inversa";
		try {
			/**
			 *
			 * inv R06_no_referencia_inversa:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = entidadRefereenciada->forAll(e |
			 *           not e.entidadRefereenciada->includes(self))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DatawebPackage.Literals.ENTIDAD___R06_NO_REFERENCIA_INVERSA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DatawebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Entidad> entidadRefereenciada = this.getEntidadRefereenciada();
					final /*@NonInvalid*/ OrderedSetValue BOXED_entidadRefereenciada = idResolver.createOrderedSetOfAll(DatawebTables.ORD_CLSSid_Entidad, entidadRefereenciada);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_e_0 = BOXED_entidadRefereenciada.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_e_0.hasNext()) {
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
						/*@NonInvalid*/ Entidad e_0 = (Entidad)ITERATOR_e_0.next();
						/**
						 * not e.entidadRefereenciada->includes(self)
						 */
						final /*@NonInvalid*/ List<Entidad> entidadRefereenciada_0 = e_0.getEntidadRefereenciada();
						final /*@NonInvalid*/ OrderedSetValue BOXED_entidadRefereenciada_0 = idResolver.createOrderedSetOfAll(DatawebTables.ORD_CLSSid_Entidad, entidadRefereenciada_0);
						final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_entidadRefereenciada_0, this).booleanValue();
						final /*@NonInvalid*/ Boolean not;
						if (!includes) {
							not = ValueUtil.TRUE_VALUE;
						}
						else {
							if (includes) {
								not = ValueUtil.FALSE_VALUE;
							}
							else {
								not = null;
							}
						}
						//
						if (not == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (not == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (not == null) {								// Abnormal null body evaluation result
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatawebPackage.ENTIDAD__USUARIOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsuarios()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatawebPackage.ENTIDAD__ATRIBUTOS:
				return ((InternalEList<?>)getAtributos()).basicRemove(otherEnd, msgs);
			case DatawebPackage.ENTIDAD__USUARIOS:
				return ((InternalEList<?>)getUsuarios()).basicRemove(otherEnd, msgs);
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
			case DatawebPackage.ENTIDAD__ATRIBUTOS:
				return getAtributos();
			case DatawebPackage.ENTIDAD__NOMBRE:
				return getNombre();
			case DatawebPackage.ENTIDAD__ENTIDAD_REFEREENCIADA:
				return getEntidadRefereenciada();
			case DatawebPackage.ENTIDAD__USUARIOS:
				return getUsuarios();
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
			case DatawebPackage.ENTIDAD__ATRIBUTOS:
				getAtributos().clear();
				getAtributos().addAll((Collection<? extends Atributo>)newValue);
				return;
			case DatawebPackage.ENTIDAD__NOMBRE:
				setNombre((String)newValue);
				return;
			case DatawebPackage.ENTIDAD__ENTIDAD_REFEREENCIADA:
				getEntidadRefereenciada().clear();
				getEntidadRefereenciada().addAll((Collection<? extends Entidad>)newValue);
				return;
			case DatawebPackage.ENTIDAD__USUARIOS:
				getUsuarios().clear();
				getUsuarios().addAll((Collection<? extends Rol>)newValue);
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
			case DatawebPackage.ENTIDAD__ATRIBUTOS:
				getAtributos().clear();
				return;
			case DatawebPackage.ENTIDAD__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DatawebPackage.ENTIDAD__ENTIDAD_REFEREENCIADA:
				getEntidadRefereenciada().clear();
				return;
			case DatawebPackage.ENTIDAD__USUARIOS:
				getUsuarios().clear();
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
			case DatawebPackage.ENTIDAD__ATRIBUTOS:
				return atributos != null && !atributos.isEmpty();
			case DatawebPackage.ENTIDAD__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DatawebPackage.ENTIDAD__ENTIDAD_REFEREENCIADA:
				return entidadRefereenciada != null && !entidadRefereenciada.isEmpty();
			case DatawebPackage.ENTIDAD__USUARIOS:
				return usuarios != null && !usuarios.isEmpty();
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
			case DatawebPackage.ENTIDAD___R05_NO_AUTORREFERENCIA__DIAGNOSTICCHAIN_MAP:
				return R05_no_autorreferencia((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DatawebPackage.ENTIDAD___R03_INDICE_YDETALLE_VAN_JUNTOS__DIAGNOSTICCHAIN_MAP:
				return R03_indice_y_detalle_van_juntos((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DatawebPackage.ENTIDAD___R02_CRUD_NO_COMBINADO__DIAGNOSTICCHAIN_MAP:
				return R02_crud_no_combinado((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DatawebPackage.ENTIDAD___R08_INDICE_UNICO_POR_ENTIDAD__DIAGNOSTICCHAIN_MAP:
				return R08_indice_unico_por_entidad((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DatawebPackage.ENTIDAD___R06_NO_REFERENCIA_INVERSA__DIAGNOSTICCHAIN_MAP:
				return R06_no_referencia_inversa((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(')');
		return result.toString();
	}

} //EntidadImpl
