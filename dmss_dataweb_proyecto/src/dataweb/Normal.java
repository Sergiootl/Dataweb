/**
 */
package dataweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.Normal#getContenido <em>Contenido</em>}</li>
 *   <li>{@link dataweb.Normal#getContenidomultimedia <em>Contenidomultimedia</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getNormal()
 * @model annotation="DSLDoc"
 *        annotation="gmf.node label='Contenido' color='0,255,255'"
 * @generated
 */
public interface Normal extends PaginaPantalla {
	/**
	 * Returns the value of the '<em><b>Contenido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenido</em>' attribute.
	 * @see #setContenido(String)
	 * @see dataweb.DatawebPackage#getNormal_Contenido()
	 * @model
	 * @generated
	 */
	String getContenido();

	/**
	 * Sets the value of the '{@link dataweb.Normal#getContenido <em>Contenido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenido</em>' attribute.
	 * @see #getContenido()
	 * @generated
	 */
	void setContenido(String value);

	/**
	 * Returns the value of the '<em><b>Contenidomultimedia</b></em>' containment reference list.
	 * The list contents are of type {@link dataweb.ContenidoMultimedia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenidomultimedia</em>' containment reference list.
	 * @see dataweb.DatawebPackage#getNormal_Contenidomultimedia()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<ContenidoMultimedia> getContenidomultimedia();

} // Normal
