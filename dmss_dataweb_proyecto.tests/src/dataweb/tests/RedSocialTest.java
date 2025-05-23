/**
 */
package dataweb.tests;

import dataweb.DatawebFactory;
import dataweb.RedSocial;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Red Social</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RedSocialTest extends TestCase {

	/**
	 * The fixture for this Red Social test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedSocial fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RedSocialTest.class);
	}

	/**
	 * Constructs a new Red Social test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedSocialTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Red Social test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RedSocial fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Red Social test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedSocial getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DatawebFactory.eINSTANCE.createRedSocial());
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

} //RedSocialTest
