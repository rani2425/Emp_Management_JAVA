package com.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ConnectionFactory.ConnectionFactory;
import com.Dao.UserDao;
import com.Entity.User;
@WebServlet ("/addDetails")
public class Launch3 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("uid");
		String name = req.getParameter("uname");
		String salary = req.getParameter("usalary");
		
		Connection con = ConnectionFactory.getCon();
		UserDao uDao = new UserDao();
		
		String res=uDao.addDetails(Integer.valueOf(id), name, Integer.valueOf(salary), con);
		
		ArrayList<User> al=uDao.getAllInfo(con);
		
		HttpSession s = req.getSession();
		
		if(res.equals("added"))
		{
			s.setAttribute("alinfo", al);
			resp.sendRedirect("home.jsp");
		}
		else
		{
			resp.sendRedirect("add.html");
		}
	}
}












