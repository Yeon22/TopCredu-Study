package Portfolio.Shopping.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Portfolio.Shopping.controller.action.Action;
import Portfolio.Shopping.dao.ProductDAO;
import Portfolio.Shopping.dto.ProductVO;

public class AdminProductListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "admin/product/productList.jsp";
		String key = request.getParameter("key");
		String tpage = request.getParameter("tpage");
		
		if(key == null) {
			key = "";
		}
		
		if(tpage == null) {
			tpage = "1";
		} else if(tpage.equals("")) {
			tpage = "1";
		}
		
		request.setAttribute("key", key);
		request.setAttribute("tpage", tpage);
		
		ProductDAO productDAO = ProductDAO.getInstance();
		ArrayList<ProductVO> productList = productDAO.listProduct(Integer.parseInt(tpage), key);
		String paging = productDAO.pageNumber(Integer.parseInt(tpage), key);
		
		request.setAttribute("productList", productList);
		request.setAttribute("paging", paging);
		
		int n = productList.size();
		request.setAttribute("productListSize", n);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
