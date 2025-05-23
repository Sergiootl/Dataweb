/**
 */
package dataweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Red Social</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.RedSocial#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dataweb.RedSocial#getPaginapantalla <em>Paginapantalla</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getRedSocial()
 * @model annotation="DSLDoc"
 *        annotation="gmf.node label='Nombre' color='0,255,255'"
 * @generated
 */
public interface RedSocial extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dataweb.DatawebPackage#getRedSocial_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dataweb.RedSocial#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Paginapantalla</b></em>' reference list.
	 * The list contents are of type {@link dataweb.PaginaPantalla}.
	 * It is bidirectional and its opposite is '{@link dataweb.PaginaPantalla#getRedsocial <em>Redsocial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paginapantalla</em>' reference list.
	 * @see dataweb.DatawebPackage#getRedSocial_Paginapantalla()
	 * @see dataweb.PaginaPantalla#getRedsocial
	 * @model opposite="redsocial"
	 *        annotation="gmf.link source='PaginaPantalla' target='RedSocial' target.decoration='arrow' color='255,0,0' width='3'"
	 * @generated
	 */
	EList<PaginaPantalla> getPaginapantalla();

} // RedSocial
