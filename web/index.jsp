<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <title>Багатозальний кінотеатр | Проект на РГР</title>
  <link href="css/stylesheet.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="top_bar_black">
  <div id="logo_container">
    <div id="logo_image">
    </div>

    <div id="nav_block">
      <a class="nav_button grow" href="forNewFilms.jsp">Головна</a>
      <a class="nav_button grow" href="/ServletForNewFilms"> Скоро в кiно</a>
      <a class="nav_button grow" href="contacts.jsp"> Контакти</a>
      <a class="nav_button grow" href="about.jsp"> Про нас</a>
    </div>
  </div>
</div>

<td>
  <form action ="hello">
    <input type="image" src="add.png" name="imgadd" width="20" height="20">
  </form>
</td>

<div id="content_container">
  <div id="header">
    <div class="header_content_mainline"> Сьогодні на екранах
    </div>
    <iframe id="section" src="films" name = "iframe" width = "100%" height="1000px"></iframe>

  </div>
</div>
<%--<c:forEach items="${studList}" var="stud">--%>
  <%--<div id="film_block">--%>

      <%--&lt;%&ndash;<img src="${stud.url.urlOfFilm}" heigth="400" width="300" id="film_pic">&ndash;%&gt;--%>

    <%--<input type="image" src="${stud.url.urlOfFilm}" name="imginfo" heigth="400" width="300" id="film_pic" style="float: left;">--%>
    <%--<a href="${stud.url.urlOfImage}?id=${stud.films.id}" src="${stud.url.urlOfFilm}" heigth="400" width="300" id="film_pic"></a>--%>
    <%--<div id="info">--%>
      <%--<h1>${stud.films.nameOfFilm}</h1>--%>
      <%--<p>ВремяasdsadasdasdqweqweqQWEQWEQWEQW:${stud.time}</p>--%>
      <%--<p>Жанр:${stud.genre.name}</p>--%>
      <%--<p>Про фильм:${stud.premiere.nameOfVariant}</p>--%>
      <%--<p>Актеры:${stud.actors.nameOfActors}</p>--%>
      <%--<p>Продолжительность:${stud.durationOfFilm}</p>--%>
      <%--<p>Зал:${stud.hall.hallName}</p>--%>
      <%--<p>Описание:${stud.informationOfFilm}</p>--%>
    <%--</div>--%>
  <%--</div>--%>
<%--</c:forEach>--%>




<%--<div id="bottom_bar_black">--%>
  <%--<div id="main_container">--%>
    <%--<div id="header_lower">--%>
      <%--<div id="header_content_lowerline">Виконали--%>
        <%--<div id="header_content_lowerboxcontent">--%>
          <%--Дзьома Артем<br />--%>
          <%--Заверталюк Вадим<br />--%>
        <%--</div>--%>
      <%--</div>--%>
    <%--</div>--%>
  <%--</div>--%>
<%--</div>--%>


</body>
</html>

