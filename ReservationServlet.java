package com.oupp.restaurant.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oupp.restaurant.dao.ReservationDao;
import com.oupp.restaurant.model.Reservation;
/**
 * Servlet implementation class ReservationServlet
 */
@WebServlet("/ReservationServlet")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private ReservationDao reservationDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
     public void init()
     {
    	 reservationDao= new ReservationDao();
     }
    public ReservationServlet() {
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
		String id=request.getParameter("id");
		String date=request.getParameter("date");
		String time=request.getParameter("time");
		String partySize=request.getParameter("partySize");
		String phoneNumber=request.getParameter("phoneNumber");
		String tableId=request.getParameter("tableId");
		Reservation reservation=new Reservation();
		reservation.setId(id);
		reservation.setDate(date);
		reservation.setTime(time);
		reservation.setPartySize(partySize);
		reservation.setPhoneNumber(phoneNumber);
		reservation.setTableId(tableId);
		try{
			reservationDao.getReservation(reservation);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		//doGet(request, response);
	}

}
