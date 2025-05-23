/**
 */
package dataweb.tests;

import dataweb.DatawebFactory;
import dataweb.IndiceDetalle;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Indice Detalle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndiceDetalleTest extends IndiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndiceDetalleTest.class);
	}

	/**
	 * Constructs a new Indice Detalle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndiceDetalleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Indice Detalle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IndiceDetalle getFixture() {
		return (IndiceDetalle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DatawebFactory.eINSTANCE.createIndiceDetalle());
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

} //IndiceDetalleTest
