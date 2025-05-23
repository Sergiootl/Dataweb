/**
 */
package dataweb.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>dataweb</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatawebTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DatawebTests("dataweb Tests");
		suite.addTestSuite(AplicacionTest.class);
		suite.addTestSuite(EntidadTest.class);
		suite.addTestSuite(IndiceExtendidoTest.class);
		suite.addTestSuite(IndiceEntidadTest.class);
		suite.addTestSuite(IndiceDetalleTest.class);
		suite.addTestSuite(CuestionarioTest.class);
		suite.addTestSuite(EncuestaTest.class);
		suite.addTestSuite(RolTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatawebTests(String name) {
		super(name);
	}

} //DatawebTests
