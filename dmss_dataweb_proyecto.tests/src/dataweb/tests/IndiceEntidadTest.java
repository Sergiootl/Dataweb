/**
 */
package dataweb.tests;

import dataweb.DatawebFactory;
import dataweb.IndiceEntidad;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Indice Entidad</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndiceEntidadTest extends IndiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndiceEntidadTest.class);
	}

	/**
	 * Constructs a new Indice Entidad test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndiceEntidadTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Indice Entidad test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IndiceEntidad getFixture() {
		return (IndiceEntidad)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DatawebFactory.eINSTANCE.createIndiceEntidad());
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

} //IndiceEntidadTest
