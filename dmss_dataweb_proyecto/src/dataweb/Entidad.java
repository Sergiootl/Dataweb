/**
 */
package dataweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.Entidad#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link dataweb.Entidad#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dataweb.Entidad#getIndice <em>Indice</em>}</li>
 *   <li>{@link dataweb.Entidad#getEntidadRefereenciada <em>Entidad Refereenciada</em>}</li>
 *   <li>{@link dataweb.Entidad#getUsuarios <em>Usuarios</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getEntidad()
 * @model
 * @generated
 */
public interface Entidad extends EObject {
	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link dataweb.Atributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see dataweb.DatawebPackage#getEntidad_Atributos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Atributo> getAtributos();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dataweb.DatawebPackage#getEntidad_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dataweb.Entidad#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Indice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indice</em>' reference.
	 * @see #setIndice(Indice)
	 * @see dataweb.DatawebPackage#getEntidad_Indice()
	 * @model required="true"
	 * @generated
	 */
	Indice getIndice();

	/**
	 * Sets the value of the '{@link dataweb.Entidad#getIndice <em>Indice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indice</em>' reference.
	 * @see #getIndice()
	 * @generated
	 */
	void setIndice(Indice value);

	/**
	 * Returns the value of the '<em><b>Entidad Refereenciada</b></em>' reference list.
	 * The list contents are of type {@link dataweb.Entidad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad Refereenciada</em>' reference list.
	 * @see dataweb.DatawebPackage#getEntidad_EntidadRefereenciada()
	 * @model
	 * @generated
	 */
	EList<Entidad> getEntidadRefereenciada();

	/**
	 * Returns the value of the '<em><b>Usuarios</b></em>' reference list.
	 * The list contents are of type {@link dataweb.Rol}.
	 * It is bidirectional and its opposite is '{@link dataweb.Rol#getEntidades <em>Entidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuarios</em>' reference list.
	 * @see dataweb.DatawebPackage#getEntidad_Usuarios()
	 * @see dataweb.Rol#getEntidades
	 * @model opposite="entidades" required="true"
	 * @generated
	 */
	EList<Rol> getUsuarios();

} // Entidad
