<%--
  Created by IntelliJ IDEA.
  User: parimeo
  Date: 05.10.2017
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>Kuchen</title>
  </head>
  <body>
    <h1>Willkommen!</h1>
    <jsp:useBean scope="session" id="data" class="beanTutorial.DataBean" />

    <h2>Hier sind ihre Daten</h2>
    <p>Name: ${data.name}</p>
    <p>Occupation: ${data.occupation}</p>
    <p>Age: ${data.age}</p>
    <p>WorkingHours: ${data.workingHours}</p>
  </body>
</html>
