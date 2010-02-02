package com.google.gwt.html5.elements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(VideoElement.TAG)
public class VideoElement extends Element {
	
	static final String TAG = "video";

	  /**
	   * Assert that the given {@link Element} is compatible with this class and
	   * automatically typecast it.
	   */
	  public static VideoElement as(Element elem) {
	    assert elem.getTagName().equalsIgnoreCase(TAG);
	    return (VideoElement) elem;
	  }

	  protected VideoElement() {
	  }

}
