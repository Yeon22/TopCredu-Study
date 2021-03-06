<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/Portfolio_Shopping/admin/header.jsp" %>
<%@ include file="/Portfolio_Shopping/admin/sub_menu.jsp" %>

<script type="text/javascript">
function go_order_save(){
	var count = 0;
	
	if(document.frm.result.length == undefined){
		if(document.frm.result.checked == true){
			cout++;
		}
	}else{
		for(var i=0; i<document.frm.result.length; i++){
			if(document.frm.result[i].checked == true){
				count++;
			}
		}
	}
	
	if(count == 0){
		alert("주문처리할 항목을 선택해 주세요.");
	}else{
		document.frm.action = "ShoppingServlet?command=admin_order_save";
		document.frm.submit();
	}
}
</script>

<article>
	<h1>주문리스트(Order List)</h1>
	<form name="frm" method="post">
		<table style="float: right; margin-right: 0px;">
			<tr>
				<td id="searchbar">
					<strong style="font-size: 1.20em;">주문자 이름</strong>
					<input type="text" name="key" size="25" style="border: 1px solid black; height: 20px; margin-right: 5px;"/>
					<input class="btn" type="button" value="검색" onclick="order_search()"/>
				</td>
			</tr>
		</table>
		<br>
		<table id="orderList">
			<tr>
				<th>주문번호(처리여부)</th>
				<th>주문자</th>
				<th>상품명</th>
				<th>수량</th>
				<th>우편번호</th>
				<th>배송지</th>
				<th>전화</th>
				<th>주문일</th>
			</tr>
			<c:forEach items="${orderList}" var="orderVO">
			<tr>
				<td height="23" align="center" style="text-align: center; padding-right: 0px; font-weight: bold;">
					<c:choose>
						<c:when test="${orderVO.result == '1'}">
							<span style="font-weight: bold; color: blue;">${orderVO.odseq}</span>
							(<input type="checkbox" name="result" value="${orderVO.odseq}"/> 미처리)
						</c:when>
						<c:otherwise>
							<span style="font-weight: bold; color: red;">${orderVO.odseq}</span>
							(<input type="checkbox" checked="checked" disabled="disabled"/> 처리완료)
						</c:otherwise>
					</c:choose>
				</td>
				<td>${orderVO.mname}</td>
				<td>${orderVO.pname}</td>
				<td>${orderVO.quantity}</td>
				<td>${orderVO.zipNum}</td>
				<td>${orderVO.address}</td>
				<td>${orderVO.phone}</td>
				<td><fmt:formatDate value="${orderVO.indate}"/></td>
			</tr>
			</c:forEach>
		</table>
		<input type="button" class="btn" style="width: 200px;" value="주문처리(입금확인)" onclick="go_order_save()"/>
	</form>
</article>

<%@ include file="/Portfolio_Shopping/admin/footer.jsp" %>