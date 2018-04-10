package iat265.aga53;

import processing.core.PApplet;

/**
 *
 * @author ankit
 */
public class FrontLeg extends AnimalComponent {

    public FrontLeg(PApplet p, String name, AnimalComponent parent, float angle) {
        super(p, name, parent.pos.x, parent.pos.y,
                .7f * parent.branchLength, .8f * parent.branchWidth,
                parent.rot + p.radians(angle));
    }

    @Override
    public void drawShape() {
        p.pushStyle();
        p.fill(c);
        p.pushMatrix();
        p.translate(pos.x, pos.y);
        p.rotate(rot);
        p.stroke(c);
        p.strokeWeight(branchWidth);
        p.line(0, 0, 0, -branchLength);
        p.popMatrix();
        p.popStyle();
    }

    @Override
    public void updatePosition(float x, float y) {
        //do nothing
    }
}
