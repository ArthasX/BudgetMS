package com.budgetms.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

public class HacValidation extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException // 重载doGet()方法

	{
		String id = request.getParameter("id");
		String valid = "valid({\"valid\":0})";
		int count;
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		try {
			// valide = getDate(id);
			count=getDateMysql("");
			valid= String.format("valid({\"valid\":%d})",count);
			System.out.println(JSON.toJSON(valid ));
			out.print(JSON.toJSON(valid ));
			out.close();
		} catch (Exception e) {
			out.println("数据库连接失败");
		}

	}

	private int getDate(String id) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException, SQLException {
		int count;
		Connection conn = DB2Util.getConnection();
		Statement st = conn.createStatement();
		String qurey = "select count(*) from ig500 where prserialnum='" + id
				+ "'";
		st.execute(qurey);
		ResultSet rs = st.getResultSet();
		rs.next();
		count = rs.getInt(1);
		conn.close();
		return count;
	}

	private int getDateMysql(String id) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException, SQLException {
		int count;
		Connection conn = MysqlUtil.getConnection();
		Statement st = conn.createStatement();
		String qurey = "select count(*) from user";
		st.execute(qurey);
		ResultSet rs = st.getResultSet();
		rs.next();
		count = rs.getInt(1);
		conn.close();
		return count;
	}

	public static void main(String args[]) {
		HacValidation h = new HacValidation();
		try {
			System.out.print(h.getDateMysql(""));
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
