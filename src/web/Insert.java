package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.BmBiz;
import biz.YgBiz;
import biz.impl.BmBizImpI;
import biz.impl.YgBizImpI;
import entity.bm;
import entity.yg;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		YgBiz	ygb=new YgBizImpI();
		BmBiz bmd=new BmBizImpI();
		int id=Integer.parseInt(request.getParameter("id"));
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String bmname=request.getParameter("bmname");
		String sal=request.getParameter("sal");
		int flag=Integer.parseInt(request.getParameter("flag"));
		String zw=request.getParameter("zw");
		bm u=new bm();
			yg user=new yg();
			user.setId(id);
			user.setName(username);
			user.setPwd(password);
			user.setMialbox(email);
			user.setSal(sal);
			user.setQx(flag);
			user.setZw(zw);
			u.setId(id);
			u.setBmname(bmname);
			ygb.Update("insert", user);
			bmd.insert(u);
			response.sendRedirect("insert.jsp");
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
