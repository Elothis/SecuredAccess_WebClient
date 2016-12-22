package controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.ejb.EJBAccessException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import work.*;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/work")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private WorkBeanLocal workBean;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String result = "";
		
		try {
			if(action.equalsIgnoreCase("administrationTask")){
				result = workBean.administrationTask();
				request.setAttribute("result", result);
			}
			else if(action.equalsIgnoreCase("managingTask")){
				result = workBean.managingTask();
				request.setAttribute("result",result);
			}
			else if(action.equalsIgnoreCase("basicTask")){
				result = workBean.basicTask();
				request.setAttribute("result", result);
			}
					
		} catch (EJBAccessException e) {
			result = "Access denied for " + request.getRemoteUser();
			request.setAttribute("result", result);
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
