package com.jtudy.designpatterns.visitorpattern;

public class GifImage extends Image {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
