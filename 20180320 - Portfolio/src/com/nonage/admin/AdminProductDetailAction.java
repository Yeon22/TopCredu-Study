package com.nonage.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nonage.controller.action.Action;
import com.nonage.dao.ProductDAO;
import com.nonage.dto.ProductVO;

public class AdminProductDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "admin/product/productDetail.jsp";
		//상품번호
		String pseq = request.getParameter("pseq").trim();
		
		ProductDAO productDAO = ProductDAO.getInstance();
		ProductVO productVO = productDAO.getProduct(pseq);
		
		request.setAttribute("productVO", productVO);
		
		//상품리스트(product_list.jsp) 페이지에서 쿼리 스트링으로 넘겨준 현재 페이지를 얻어온다.
		String tpage = "1";
		if(request.getParameter("tpage") != null) {
			tpage = request.getParameter("tpage");
		}
		request.setAttribute("tpage", tpage);
		
		String kindList[] = {"0", "Heels", "Boots", "Sandals", "Slipers", "Sneakers", "Sale"};
		int index = Integer.parseInt(productVO.getKind().trim());
		request.setAttribute("kind", kindList[index]);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
