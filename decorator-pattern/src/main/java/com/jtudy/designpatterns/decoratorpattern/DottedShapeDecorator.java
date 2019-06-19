package com.jtudy.designpatterns.decoratorpattern;

public class DottedShapeDecorator extends ShapeDecorator {

	   public DottedShapeDecorator(Shape decoratedShape) {
	      super(decoratedShape);		
	   }

	   @Override
	   public void draw() {
	      decoratedShape.draw();	       
	      setDotted(decoratedShape);
	   }

	   private void setDotted(Shape decoratedShape){
	      System.out.println("Dotted");
	   }
	}
