<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <title>Про кінотеатр</title>
  <link href="css/stylesheet.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="top_bar_black">
  <div id="logo_container">
    <div id="logo_image">
    </div>

    <div id="nav_block">
      <a class="nav_button grow" href="index.jsp">Головна</a>
      <a class="nav_button grow" href="/ServletForNewFilms"> Скоро в кiно</a>
      <a class="nav_button grow" href="contacts.jsp"> Контакти</a>
      <a class="nav_button grow" href="about.jsp"> Про нас</a>
    </div>
  </div>
</div>


<body>
<h1>Hello, WEB</h1>
<form action = 'index.jsp'>
  <input type = 'submit' value='Go To Fiml'/>
</form>
<table border="1">
  <tr>
    <th>Number</th>
    <th>URL</th>
    <th>Name</th>
    <th>Time</th>
    <th>Genre</th>
    <th>Critique</th>
    <th>Actors</th>
    <th>Duration</th>
    <th>Information</th>
    <th>Hall</th>
  </tr>

  <c:forEach items="${studList}" var="stud" varStatus="status">
    <tr>
      <td>${status.count}</td>
      <td>${stud.url.urlOfFilm}</td>
      <td>${stud.films.nameOfFilm}</td>
      <td>${stud.time}</td>
      <td>${stud.genre.name}</td>
      <td>${stud.premiere.nameOfVariant}</td>
      <td>${stud.actors.nameOfActors}</td>
      <td>${stud.durationOfFilm}</td>
      <td>${stud.informationOfFilm}</td>
      <td>${stud.hall.hallName}</td>


      <td>
        <form action ="delRowServlet" method="post">
          <input type="hidden" name = "id" value="${stud.id}">
          <input type="image" src="delete.png" name="imgdelete" width="20" height="20">
        </form>
      </td>
    </tr>
  </c:forEach>
  <c:if test="${flag == true}">
    <tr>
      <form action="addRowServlet" method="post">
        <td></td>
        <td>
          <select name="slurl">
            <option></option>
            <c:forEach items="${urlList}" var="url">
              <option value="${url.id}">${url.urlOfFilm}</option>
            </c:forEach>
          </select>
        </td>

        <td>
          <select name="slfilms">
            <option></option>
            <c:forEach items="${filmsList}" var="films">
              <option value="${films.id}">${films.nameOfFilm}</option>
            </c:forEach>
          </select>
        </td>



        <td><input type = 'text' size="10" maxlength="15" name = 'tftime'></td>

        <td>
          <select name="slgenre">
            <option></option>
            <c:forEach items="${genresList}" var="genres">
              <option value="${genres.id}">${genres.name}</option>
            </c:forEach>
          </select>
        </td>

        <td>
          <select name="slpremiere">
            <option></option>
            <c:forEach items="${premiereList}" var="premiere">
              <option value="${premiere.id}">${premiere.nameOfVariant}</option>
            </c:forEach>
          </select>
        </td>





          <%--<td><input type = 'text' size="10" maxlength="6" name = 'tf'></td>--%>
        <td>
          <input type = 'text' size="20" maxlength="150" name = 'tfactor'>
            <%--<option></option>--%>
            <%--<c:forEach items="${actorsList}" var="actors">--%>
              <%--<option value="${actors.id}">${actors.nameOfActors}</option>--%>
            <%--</c:forEach>--%>
          <%--</select>--%>
        </td>

        <td><input type = 'text' size="20" maxlength="150" name = 'tfdur'></td>

        <td><input type = 'text' size="20" maxlength="150" name = 'tfinf'></td>

        <td>
          <select name="slhall">
            <option></option>
            <c:forEach items="${hallList}" var="hall">
              <option value="${hall.id}">${hall.hallName}</option>
            </c:forEach>
          </select>
        </td><td><input type="image" src="save.png" name="imgsave" width="20" height="20"></td>




      </form>
    </tr>
  </c:if>
  <td>
    <form action ="addRowServlet" method="get">
      <input type="image" src="add.png" name="imgadd" width="20" height="20">
    </form>
  </td>
</table>

<%--</form>--%>
</body>

</html>

