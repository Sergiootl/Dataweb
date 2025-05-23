/**
 */
package dataweb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.Atributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dataweb.Atributo#getTipoAtributo <em>Tipo Atributo</em>}</li>
 *   <li>{@link dataweb.Atributo#isPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getAtributo()
 * @model annotation="DSLDoc"
 *        annotation="gmf.node label='Nombre' color='255,0,0'"
 * @generated
 */
public interface Atributo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dataweb.DatawebPackage#getAtributo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dataweb.Atributo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Atributo</b></em>' attribute.
	 * The literals are from the enumeration {@link dataweb.TipoAtributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Atributo</em>' attribute.
	 * @see dataweb.TipoAtributo
	 * @see #setTipoAtributo(TipoAtributo)
	 * @see dataweb.DatawebPackage#getAtributo_TipoAtributo()
	 * @model
	 * @generated
	 */
	TipoAtributo getTipoAtributo();

	/**
	 * Sets the value of the '{@link dataweb.Atributo#getTipoAtributo <em>Tipo Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Atributo</em>' attribute.
	 * @see dataweb.TipoAtributo
	 * @see #getTipoAtributo()
	 * @generated
	 */
	void setTipoAtributo(TipoAtributo value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' attribute.
	 * @see #setPrimaryKey(boolean)
	 * @see dataweb.DatawebPackage#getAtributo_PrimaryKey()
	 * @model required="true"
	 * @generated
	 */
	boolean isPrimaryKey();

	/**
	 * Sets the value of the '{@link dataweb.Atributo#isPrimaryKey <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' attribute.
	 * @see #isPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(boolean value);

} // Atributo
