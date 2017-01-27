<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Form</title>
</head>
<body>
<form:form action="processProductData" commandName="product">
ProductName:<form:input type="text" path="productName"/>
Price:<form:input type="text" path="price"/>
Quantity:<form:input type="text" path="quantity"/>
Manufacture:<form:input type="text" path="manufactur"/>

<input type="submit" value="Add Product"/>
</form:form>
</body>
</html>