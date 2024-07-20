package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import com.Entity.User;

public class UserDao {
	
	String result = "";
	
	public String signupUser(String eid, String emname,String name, String pass, Connection con)
	{
		try
		{
			String sql = "insert into users values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, eid);
			ps.setString(2,emname);
			ps.setString(3, name);
			ps.setString(4, pass);
			
			int row = ps.executeUpdate();
			if(row==1)
			{
				result = "inserted";
			}
			else
			{
				result = "failed";
			}
		}
		catch (Exception e) {
			result = "failed";
			System.out.println(e);
		}
		finally
		{
			return result;
		}
	}
	
	
	
	public String loginUser(String name, String pass, Connection con)
	{
		try
		{
			String sql = "select * from users where Username = ? and Password = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			int count=0;
			while(rs.next())
			{
				count++;
			}
			if(count==1)
			{
				result="exists";
			}
			else
			{
				result="not exists";
			}
		}
		catch (Exception e) {
			result="not exists";
			System.out.println(e);
		}
		finally
		{
			return result;
		}
	}
	
	
	
	
	public String addDetails(int id, String name, int salary, Connection con)
	{
		try
		{
			String sql = "insert into user values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			
			int row = ps.executeUpdate();
			if(row==1)
			{
				result="added";
			}
			else
			{
				result="failed";
			}
		}
		catch (Exception e) {
			result="failed";
			System.out.println(e);
		}
		finally {
			return result;
		}
	}
	
	
	
	
	public ArrayList<User> getAllInfo(Connection con)
	{
		ArrayList<User> al = new ArrayList<User>();
		try
		{
			String sql = "select * from user";
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				User i = new User();
				
				i.setId(rs.getInt("id"));
				i.setName(rs.getString(2));
				i.setSalary(rs.getInt("salary"));
				
				al.add(i);
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			return al;
		}
	}
	
	
	
	public String delInfo(int id, Connection con)
	{
		try
		{
			String sql = "delete from user where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			
			
			int row = ps.executeUpdate();
			if(row==1)
			{
				result="deleted";
			}
			else
			{
				result="failed";
			}
		}
		catch (Exception e) {
			result="failed";
			System.out.println(e);
		}
		finally {
			return result;
		}
	}
	
	
	public String editInfo(int id, String name, int salary, Connection con)
	{
		try
		{
			String sql = "update user SET name=?, salary=? WHERE id=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setInt(2, salary);
			ps.setInt(3, id);
			int row = ps.executeUpdate();
			if(row ==1)
			{
				result="edited";
			}
			else
			{
				result="failed";
			}
		}
		catch (Exception e) {
			result="failed";
			System.out.println(e);
		}
		finally {
			return result;
		}
	}


}
