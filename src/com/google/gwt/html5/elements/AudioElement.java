package com.google.gwt.html5.elements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(AudioElement.TAG)
public class AudioElement extends Element {
	
	static final String TAG = "audio";

	  /**
	   * Assert that the given {@link Element} is compatible with this class and
	   * automatically typecast it.
	   */
	  public static AudioElement as(Element elem) {
	    assert elem.getTagName().equalsIgnoreCase(TAG);
	    return (AudioElement) elem;
	  }

	  protected AudioElement() {
	  }

}
