package day57_abstraction_polymorphism.shapes;

import day57_abstraction_polymorphism.polymorphism.Animal;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());
        for (Shape each : shapes) {
            each.draw();

        }
    }
}

