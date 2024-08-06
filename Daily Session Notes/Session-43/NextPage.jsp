<jsp:useBean id="book" class="mypack.Book" scope="session"/>
Book No : <jsp:getProperty name="book" property="bno"/><br>
Book Name :<jsp:getProperty name="book" property="bname"/><br>
Book Price:<jsp:getProperty name="book" property="price"/>