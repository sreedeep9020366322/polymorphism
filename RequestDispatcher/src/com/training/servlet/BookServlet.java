package com.training.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.domains.BookManager;
import com.training.entity.Book;

/**
 * Servlet implementation class BookServlet
 */
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookManager mgr = new BookManager();
		
		mgr.init();
		
		HashMap<Long,Book> bookList = mgr.getAllBooks();
		
		request.setAttribute("BookLists", bookList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ShowBooks.jsp");
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		
		BookManager mgr = new BookManager();
		
		mgr.init();
		
		String id = request.getParameter("bookId");
		long bookId = Long.parseLong(id);
		Book book = mgr.findBookById(bookId);
		
		request.setAttribute("Book", book);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("FoundBook.jsp");
		
		dispatcher.forward(request, response);

	}

}
