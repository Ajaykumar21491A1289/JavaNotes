<%@page errorPage = "ShowErrors.jsp" %>
<%
  int nr = Integer.parseInt(request.getParameter("nr"));
  int dr = Integer.parseInt(request.getParameter("dr"));
%>
Numerator : <%= nr %> <br>
Denominator : <%= dr %><br>
Quotient : <%= nr/dr %>
