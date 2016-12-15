<%@page import="org.apache.tomcat.websocket.BackgroundProcess"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>1</title>
</head>
<body>
<% 
  int rows=10;
  int cols=10;
  out.println("<table  border=\"1\"  style='background-color: lightblue;'>");
  for(int x =1;x<rows;x++){
	  out.println("<tr>");
	  for (int y = 1; y < 10; y++) {
			if (y <= x) {
				out.println("<td width=60px style='text-align: center;'>" + x * y + "</td>");
				
			} else {
				out.println("<td style='text-align: center;'>嘻嘻</td>");
			}
		}
	  out.println("</tr>");

  }
  out.println("</table>");


  



%>

</body>
</html>