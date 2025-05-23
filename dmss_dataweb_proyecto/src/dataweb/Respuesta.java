/**
 */
package dataweb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Respuesta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.Respuesta#getTexto <em>Texto</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getRespuesta()
 * @model annotation="DSLDoc"
 *        annotation="gmf.node label='Texto' color='0,255,255'"
 * @generated
 */
public interface Respuesta extends EObject {
	/**
	 * Returns the value of the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texto</em>' attribute.
	 * @see #setTexto(String)
	 * @see dataweb.DatawebPackage#getRespuesta_Texto()
	 * @model
	 * @generated
	 */
	String getTexto();

	/**
	 * Sets the value of the '{@link dataweb.Respuesta#getTexto <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto</em>' attribute.
	 * @see #getTexto()
	 * @generated
	 */
	void setTexto(String value);

} // Respuesta
