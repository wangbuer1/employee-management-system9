package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.YgBiz;
import biz.impl.YgBizImpI;
import entity.bm;
import entity.yg;

/**
 * Servlet implementation class userServlet
 */
@WebServlet("/userServlet")
public class userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	YgBiz	ygb=new YgBizImpI();
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	String email=request.getParameter("email");
	String bmname=request.getParameter("bmname");
	String sal=request.getParameter("sal");
	int flag=Integer.parseInt(request.getParameter("flag"));
	String zw=request.getParameter("zw");
		yg user=new yg();
		user.setName(username);
		user.setPwd(password);
		user.setMialbox(email);
		user.setSal(sal);
		user.setQx(flag);
		user.setZw(zw);
		ygb.Update("insert", user);
		response.sendRedirect("index.jsp");


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
