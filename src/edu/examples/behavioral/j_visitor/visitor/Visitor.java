package edu.examples.behavioral.j_visitor.visitor;

import edu.examples.behavioral.j_visitor.shapes.Circle;
import edu.examples.behavioral.j_visitor.shapes.CompoundShape;
import edu.examples.behavioral.j_visitor.shapes.Dot;
import edu.examples.behavioral.j_visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
