package by.htp.webexmpl.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.webexmpl.model.User;


//@WebServlet("/SamleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int id = 0;
       
   
    public SampleServlet() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//resp.getWriter().append("Served at: ").append(req.getContextPath());
		
		//System.out.println("SecondServlet");
		
		
		id++;
		req.setAttribute("id", id);
		
		System.out.println("SecondServlet");
		
		List<String> users = new ArrayList<>();
		
		users.add("Igor");
		users.add("Petr");
		
		req.setAttribute("users", users);
		
		
		req.setAttribute("param1", "value1");
		req.getRequestDispatcher("/WEB-INF/pages/second.jsp").forward(req, resp);
		
		System.out.println(req.getSession().getCreationTime());
		System.out.println(req.getSession().getId());
		req.getSession().setAttribute("atr", "123");
		
		//req.getSession().invalidate();
		//req.getSession().removeAttribute("user");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
