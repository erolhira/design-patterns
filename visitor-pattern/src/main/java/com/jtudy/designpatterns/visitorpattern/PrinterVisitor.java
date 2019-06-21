package com.jtudy.designpatterns.visitorpattern;

public class PrinterVisitor implements Visitor {

	@Override
	public void visit(PngImage image) {
		System.out.println("png image is printed.");	
	}

	@Override
	public void visit(GifImage image) {
		System.out.println("gif image is printed.");
	}

}
