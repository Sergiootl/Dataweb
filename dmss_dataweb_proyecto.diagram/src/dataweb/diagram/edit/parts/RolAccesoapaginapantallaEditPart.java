/*
 * 
 */
package dataweb.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import dataweb.diagram.edit.policies.RolAccesoapaginapantallaItemSemanticEditPolicy;

/**
 * @generated
 */
public class RolAccesoapaginapantallaEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4005;

	/**
	* @generated
	*/
	public RolAccesoapaginapantallaEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new RolAccesoapaginapantallaItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new RolAccesoapaginapantallaFigure();
	}

	/**
	* @generated
	*/
	public RolAccesoapaginapantallaFigure getPrimaryShape() {
		return (RolAccesoapaginapantallaFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RolAccesoapaginapantallaFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public RolAccesoapaginapantallaFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(THIS_FORE);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 211, 211, 211);

}
