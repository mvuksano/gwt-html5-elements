package com.google.gwt.html5.elements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(CanvasElement.TAG)
public class CanvasElement extends Element {
	
	static final String TAG = "canvas";

	  /**
	   * Assert that the given {@link Element} is compatible with this class and
	   * automatically typecast it.
	   */
	  public static CanvasElement as(Element elem) {
	    assert elem.getTagName().equalsIgnoreCase(TAG);
	    return (CanvasElement) elem;
	  }

	  protected CanvasElement() {
	  }

}