package examPro.com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class ResquestDispatcher
 */
public class ResquestDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ResquestDispatcher() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		final String HTTPMETHOD = request.getMethod(); // this line of code Identify which method get or post from
														// client
		if (HTTPMETHOD.equals("GET")) {
			response.getWriter()
					.write(new ObjectMapper().writeValueAsString(RequestHelper.processGet(request, response)));
			response.setContentType("application/json");
		} else if (HTTPMETHOD.equals("POST")) {
			RequestHelper.processPost(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
