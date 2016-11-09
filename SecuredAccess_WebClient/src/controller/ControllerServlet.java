package controller;

import java.io.IOException;

import javax.ejb.EJB;
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
		try {
			String action = request.getParameter("action");
			System.out.println(action);
			if(action.equalsIgnoreCase("administrationTask")){
				request.setAttribute("result", workBean.administrationTask());
			}
			else if(action.equalsIgnoreCase("managingTask")){
				request.setAttribute("result", workBean.managingTask());
			}
			else if(action.equalsIgnoreCase("basicTask")){
				request.setAttribute("result", workBean.basicTask());
			}
					
		} catch (Exception e) {
			request.setAttribute("result", "Access denied!");
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