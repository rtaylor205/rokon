package com.stickycoding.rokon;


/**
 * DrawableObject.java
 * An extension of DynamicObject, for objects which are to be drawn 
 * Confusion with Androids own Drawable class may be a potential issue, though this being an interface they cannot easily be used accidentally
 *  
 * @author Richard
 */

public class DrawableObject extends DynamicObject {
	
	protected Layer parentLayer;
	
	public DrawableObject(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	

}