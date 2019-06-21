package com.jtudy.designpatterns.visitorpattern;

public class PatternClient {

	public static void main(String[] args) {
		
		Album album = new Album();
		album.addImage(new PngImage());
		album.addImage(new GifImage());
		
		album.accept(new DisplayVisitor());
		
		album.accept(new PrinterVisitor());
	}
	
}
