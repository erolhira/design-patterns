package com.jtudy.designpatterns.visitorpattern;

public interface Visitor {

	public void visit(PngImage image);
	public void visit(GifImage image);
}
