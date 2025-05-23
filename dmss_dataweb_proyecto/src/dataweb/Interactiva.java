/**
 */
package dataweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactiva</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.Interactiva#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getInteractiva()
 * @model abstract="true"
 *        annotation="DSLDoc"
 * @generated
 */
public interface Interactiva extends PaginaPantalla {
	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see dataweb.DatawebPackage#getInteractiva_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link dataweb.Interactiva#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

} // Interactiva
