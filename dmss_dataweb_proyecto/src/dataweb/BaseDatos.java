/**
 */
package dataweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.BaseDatos#getTablas <em>Tablas</em>}</li>
 *   <li>{@link dataweb.BaseDatos#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getBaseDatos()
 * @model annotation="DSLDoc"
 *        annotation="gmf.node label='Nombre' color='255,253,208'"
 * @generated
 */
public interface BaseDatos extends EObject {
	/**
	 * Returns the value of the '<em><b>Tablas</b></em>' containment reference list.
	 * The list contents are of type {@link dataweb.Entidad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablas</em>' containment reference list.
	 * @see dataweb.DatawebPackage#getBaseDatos_Tablas()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Entidad> getTablas();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dataweb.DatawebPackage#getBaseDatos_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dataweb.BaseDatos#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // BaseDatos
