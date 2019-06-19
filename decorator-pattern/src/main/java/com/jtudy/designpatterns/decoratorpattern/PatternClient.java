package com.jtudy.designpatterns.decoratorpattern;

public class PatternClient {

	public static void main(String[] args) {

		Shape circle = new Circle();
		circle.draw();

		Shape redCircle = new DottedShapeDecorator(circle);
		redCircle.draw();

		Shape dottedSquare = new DottedShapeDecorator(new Square());
		dottedSquare.draw();
	}

}
