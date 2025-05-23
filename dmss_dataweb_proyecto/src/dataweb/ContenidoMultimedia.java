/**
 */
package dataweb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenido Multimedia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.ContenidoMultimedia#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getContenidoMultimedia()
 * @model annotation="DSLDoc"
 *        annotation="gmf.node label='Tipo' color='255,255,255'"
 * @generated
 */
public interface ContenidoMultimedia extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see dataweb.DatawebPackage#getContenidoMultimedia_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link dataweb.ContenidoMultimedia#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

} // ContenidoMultimedia
