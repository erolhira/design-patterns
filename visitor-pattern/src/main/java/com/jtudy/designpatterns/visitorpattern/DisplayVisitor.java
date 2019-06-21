package com.jtudy.designpatterns.visitorpattern;

public class DisplayVisitor implements Visitor {

	@Override
	public void visit(PngImage image) {
		System.out.println("png image is displayed.");	
	}

	@Override
	public void visit(GifImage image) {
		System.out.println("gif image is displayed.");
	}

}
