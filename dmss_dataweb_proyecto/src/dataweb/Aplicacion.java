/**
 */
package dataweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aplicacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.Aplicacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dataweb.Aplicacion#getRoles <em>Roles</em>}</li>
 *   <li>{@link dataweb.Aplicacion#getRedessociales <em>Redessociales</em>}</li>
 *   <li>{@link dataweb.Aplicacion#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link dataweb.Aplicacion#getPaginapantallas <em>Paginapantallas</em>}</li>
 *   <li>{@link dataweb.Aplicacion#getBasedatos <em>Basedatos</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getAplicacion()
 * @model
 * @generated
 */
public interface Aplicacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dataweb.DatawebPackage#getAplicacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dataweb.Aplicacion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link dataweb.Rol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see dataweb.DatawebPackage#getAplicacion_Roles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Rol> getRoles();

	/**
	 * Returns the value of the '<em><b>Redessociales</b></em>' containment reference list.
	 * The list contents are of type {@link dataweb.RedSocial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redessociales</em>' containment reference list.
	 * @see dataweb.DatawebPackage#getAplicacion_Redessociales()
	 * @model containment="true"
	 * @generated
	 */
	EList<RedSocial> getRedessociales();

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see dataweb.DatawebPackage#getAplicacion_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link dataweb.Aplicacion#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Paginapantallas</b></em>' containment reference list.
	 * The list contents are of type {@link dataweb.PaginaPantalla}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paginapantallas</em>' containment reference list.
	 * @see dataweb.DatawebPackage#getAplicacion_Paginapantallas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PaginaPantalla> getPaginapantallas();

	/**
	 * Returns the value of the '<em><b>Basedatos</b></em>' containment reference list.
	 * The list contents are of type {@link dataweb.BaseDatos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basedatos</em>' containment reference list.
	 * @see dataweb.DatawebPackage#getAplicacion_Basedatos()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseDatos> getBasedatos();

} // Aplicacion
