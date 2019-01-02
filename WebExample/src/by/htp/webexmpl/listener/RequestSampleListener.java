package by.htp.webexmpl.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestSampleListener implements ServletRequestListener{
	
	public void requestDestroyed(ServletRequestEvent sre) {
		
		System.out.println("destroy request" + sre.getServletRequest().getAttribute("id"));
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("init requestre" +sre.getServletRequest().getAttribute("id"));
	}
	
	

}
