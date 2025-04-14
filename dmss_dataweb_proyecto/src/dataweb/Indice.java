/**
 */
package dataweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.Indice#getAtributos <em>Atributos</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getIndice()
 * @model abstract="true"
 * @generated
 */
public interface Indice extends DependienteDeEntidad {
	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' attribute.
	 * @see #setAtributos(String)
	 * @see dataweb.DatawebPackage#getIndice_Atributos()
	 * @model
	 * @generated
	 */
	String getAtributos();

	/**
	 * Sets the value of the '{@link dataweb.Indice#getAtributos <em>Atributos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributos</em>' attribute.
	 * @see #getAtributos()
	 * @generated
	 */
	void setAtributos(String value);

} // Indice
