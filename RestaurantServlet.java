package com.oupp.restaurant.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oupp.restaurant.model.Restaurant;
import com.oupp.restaurant.dao.RestaurantDao;
/**
 * Servlet implementation class RestaurantServlet
 */
@WebServlet("/RestaurantServlet")
public class RestaurantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private RestaurantDao restaurantDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void init()
    {
    	restaurantDao=new RestaurantDao();
    }
    public RestaurantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String phoneNumber=request.getParameter("phoneNumber");
		String capacity=request.getParameter("capacity");
		Restaurant restaurant=new Restaurant();
		restaurant.setName(name);
		restaurant.setPhoneNumber(phoneNumber);
		restaurant.setAddress(address);
		restaurant.setCapacity(capacity);
		try{
			RestaurantDao.getRestaurant(restaurant);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		//doGet(request, response);
	}

}
