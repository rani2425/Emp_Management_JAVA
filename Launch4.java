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
@WebServlet("/delInfo")
public class Launch4 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		
		
		System.out.println(id);
		
		Connection con = ConnectionFactory.getCon();
		UserDao iDao = new UserDao();
		
		
		String res = iDao.delInfo(Integer.valueOf(id), con);
		HttpSession s = req.getSession();
		
		ArrayList<User> al = iDao.getAllInfo(con);
		
		
		if(res.equals("deleted"))
		{
			s.setAttribute("alinfo", al);
			resp.sendRedirect("home.jsp");
		}
	}
}







