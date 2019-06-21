package com.jtudy.designpatterns.visitorpattern;

import java.util.ArrayList;
import java.util.List;

public class Album extends Image {

	List<Image> images = new ArrayList<>();

	@Override
	public void accept(Visitor v) {
		for(Image image : images) {
			image.accept(v);
		}
	}	
	
	public void addImage(Image image) {
		images.add(image);
	}
	
}
