/**
 */
package dataweb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Pregunta</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dataweb.DatawebPackage#getTipoPregunta()
 * @model annotation="DSLDoc"
 * @generated
 */
public enum TipoPregunta implements Enumerator {
	/**
	 * The '<em><b>Opcion Multiple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPCION_MULTIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	OPCION_MULTIPLE(0, "OpcionMultiple", "OpcionMultiple"),

	/**
	 * The '<em><b>VF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VF_VALUE
	 * @generated
	 * @ordered
	 */
	VF(1, "V_F", "V_F"),

	/**
	 * The '<em><b>Corta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORTA_VALUE
	 * @generated
	 * @ordered
	 */
	CORTA(2, "Corta", "Corta");

	/**
	 * The '<em><b>Opcion Multiple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPCION_MULTIPLE
	 * @model name="OpcionMultiple"
	 * @generated
	 * @ordered
	 */
	public static final int OPCION_MULTIPLE_VALUE = 0;

	/**
	 * The '<em><b>VF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VF
	 * @model name="V_F"
	 * @generated
	 * @ordered
	 */
	public static final int VF_VALUE = 1;

	/**
	 * The '<em><b>Corta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORTA
	 * @model name="Corta"
	 * @generated
	 * @ordered
	 */
	public static final int CORTA_VALUE = 2;

	/**
	 * An array of all the '<em><b>Tipo Pregunta</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoPregunta[] VALUES_ARRAY =
		new TipoPregunta[] {
			OPCION_MULTIPLE,
			VF,
			CORTA,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Pregunta</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoPregunta> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Pregunta</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoPregunta get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoPregunta result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Pregunta</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoPregunta getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoPregunta result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Pregunta</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoPregunta get(int value) {
		switch (value) {
			case OPCION_MULTIPLE_VALUE: return OPCION_MULTIPLE;
			case VF_VALUE: return VF;
			case CORTA_VALUE: return CORTA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoPregunta(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TipoPregunta
