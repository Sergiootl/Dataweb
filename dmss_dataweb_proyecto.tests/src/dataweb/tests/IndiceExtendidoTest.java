/**
 */
package dataweb.tests;

import dataweb.DatawebFactory;
import dataweb.IndiceExtendido;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Indice Extendido</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndiceExtendidoTest extends IndiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndiceExtendidoTest.class);
	}

	/**
	 * Constructs a new Indice Extendido test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndiceExtendidoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Indice Extendido test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IndiceExtendido getFixture() {
		return (IndiceExtendido)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DatawebFactory.eINSTANCE.createIndiceExtendido());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IndiceExtendidoTest
