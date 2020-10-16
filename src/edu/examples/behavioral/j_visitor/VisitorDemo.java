package edu.examples.behavioral.j_visitor;

import edu.examples.behavioral.j_visitor.shapes.*;
import edu.examples.behavioral.j_visitor.visitor.XMLExportVisitor;

/**
 * Here are some examples of pattern in core Java libraries:
 *     javax.lang.model.element.AnnotationValue and AnnotationValueVisitor
 *     javax.lang.model.element.Element and ElementVisitor
 *     javax.lang.model.type.TypeMirror and TypeVisitor
 *     java.nio.file.FileVisitor and SimpleFileVisitor
 *     javax.faces.component.visit.VisitContext and VisitCallback
 */
public class VisitorDemo {

    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}
