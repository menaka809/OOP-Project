package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.AccountantInformation;
import Entity.AdminInformation;
import Entity.SellerUserInformation;
import Entity.UserInformation;
import Model.AccountantDBTask;
import Model.AdminDBTask;
import Model.BuyerDBTask;
import Model.DBTask;
import Model.SellerDBTask;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	

	int isTrue;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nic=request.getParameter("nic");
		String password=request.getParameter("password");
		isTrue= DBTask.validate(nic, password);
		if(isTrue==1) {
			try {
				List<UserInformation> buyDetails=BuyerDBTask.verify(nic, password);
				request.setAttribute("details", buyDetails);
				}catch(Exception r) {
					r.getStackTrace();
				}
			RequestDispatcher dis=request.getRequestDispatcher("BuyerAcc.jsp");
			dis.forward(request,response);
		}
		else if(isTrue==2) {
			try {
				List<SellerUserInformation> sellerDetails=SellerDBTask.verify(nic, password);
				request.setAttribute("seller", sellerDetails);
				}catch(Exception r) {
					r.getStackTrace();
				}
			RequestDispatcher dis=request.getRequestDispatcher("SellerAcc.jsp");
			dis.forward(request,response);
		}
		else if(isTrue==3) {
			try {
				List<AdminInformation> adminDetails=AdminDBTask.verify(nic, password);
				request.setAttribute("admin", adminDetails);
				}catch(Exception r) {
					r.getStackTrace();
				}
			RequestDispatcher dis=request.getRequestDispatcher("AdminAcc.jsp");
			dis.forward(request,response);
		}
		else if(isTrue==4) {
			try {
				List<AccountantInformation>accountantDetails=AccountantDBTask.verify(nic, password);
				request.setAttribute("accountant", accountantDetails);
				}catch(Exception r) {
					r.getStackTrace();
				}
			RequestDispatcher dis=request.getRequestDispatcher("AccountantAcc.jsp");
			dis.forward(request,response);
		}
		else {
			RequestDispatcher diss=request.getRequestDispatcher("retry.jsp");
			diss.forward(request,response);
		}
		/*try {
			List<UserInformation> buyDetails=DBTask.verify(nic, password);
			request.setAttribute("details", buyDetails);
			}catch(Exception r) {
				r.getStackTrace();
			}
			RequestDispatcher req=request.getRequestDispatcher("BuyerAcc.jsp");
			req.forward(request, response);*/
		/*try {
			List<UserInformation> sellerDetails=DBTask.verify(nic, password);
			request.setAttribute("seller", sellerDetails);
				}catch(Exception r) {
					r.getStackTrace();
				}
				RequestDispatcher req1=request.getRequestDispatcher("SellerAcc.jsp");
				req1.forward(request, response);*/
		
			
	}

}
