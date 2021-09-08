package com.flybutter.dummy.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flybutter.dummy.model.service.MemberService;
import com.flybutter.dummy.model.vo.Member;

/**
 * Servlet implementation class dummyLoginA
 */
@WebServlet("/dummyLoginA.ma")
public class dummyLoginA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dummyLoginA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		Member loginMember=null;
		if(no==0) {
			loginMember = new MemberService().loginAdmin(no);
			loginMember.setREC_PNO("0");
			loginMember.setMONEY(999999);
		}else {
			loginMember = new MemberService().loginMember(no);
		}
		HttpSession session = request.getSession();
		session.setAttribute("loginMember", loginMember);
		response.setContentType("text/html;charset=UTF-8");
		response.sendRedirect(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
