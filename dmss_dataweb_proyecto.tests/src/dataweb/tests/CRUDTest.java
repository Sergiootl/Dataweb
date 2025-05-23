/**
 */
package dataweb.tests;

import dataweb.CRUD;
import dataweb.DatawebFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CRUD</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CRUDTest extends DependienteDeEntidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CRUDTest.class);
	}

	/**
	 * Constructs a new CRUD test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this CRUD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CRUD getFixture() {
		return (CRUD)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DatawebFactory.eINSTANCE.createCRUD());
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

} //CRUDTest
