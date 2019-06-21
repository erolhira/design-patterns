package com.jtudy.designpatterns.visitorpattern;

public class PngImage extends Image {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
