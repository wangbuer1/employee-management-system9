package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import biz.BmBiz;
import biz.YgBiz;
import biz.impl.BmBizImpI;
import biz.impl.YgBizImpI;
import entity.yg;

/**
 * Servlet implementation class Delete3
 */
@WebServlet("/Delete3")
public class Delete3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接收请求
		HttpSession session=request.getSession();
		//调用业务层
		YgBiz yg=new YgBizImpI();
		BmBiz bm=new BmBizImpI();	
		yg user=new yg();
		int id=Integer.parseInt(request.getParameter("id"));
		user.setId(id);
		bm.remove(id);
		yg.Update("delete",user);
		response.sendRedirect("show3");}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
