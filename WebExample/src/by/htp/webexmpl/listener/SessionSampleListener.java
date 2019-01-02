package by.htp.webexmpl.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionSampleListener implements HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		
		System.out.println("new attribute" + se.getSession().getAttributeNames());
	}
	
	
	

}
