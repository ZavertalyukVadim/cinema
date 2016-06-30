<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Контакти кінозалу</title>
<link href="css/stylesheet.css" rel="stylesheet" type="text/css" />
<script src="http://maps.google.com/maps?file=api&v=2&&hl=ru&key=ABQIAAAALTPVufm_y4bze0hX1-F_0xQZRRnT-B5O1OVkm-
IywckVfduigRQhjdjpnbPnmdSpeC9ZOvfNKlNigQ" type="text/javascript"></script>
<script type="text/javascript">

function GMapInit() {
  // Инициализация класса Google Maps и расположение карты в слое GMapContainer
  var map = new GMap2(document.getElementById("GMapContainer"));

  // Задаем настройки вывода
  map.setCenter(new GLatLng(49.421158, 32.098870), 16);   // Широта, долгота и коэффициент
                    // увеличения цента (обязательный параметр)
  map.addControl(new GLargeMapControl()); // Добавляем на карту Google Maps управление прокруткой и приближением
  map.addControl(new GMapTypeControl());  // Добавляем на карту Google Maps возможность выбрать тип отображения
            //(карта, вид со спутника, комбинированный режим)
  map.enableScrollWheelZoom(); // Масштабирование карты скроллингом
}

</script>
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


<div id="content_container">
  <h1> Розміщення кінотеатру </h1> 
  <body onload="GMapInit()" onunload="GUnload()">
  <div style="width: 700px;height: 500px" id="GMapContainer">
  </div>
  <h2> Замовлення квитків за номером: 38093 000 0000 </h2> 
</div>



        
        
        
<div id="bottom_bar_black"> <div id="main_container">
	<div id="header_lower">  <div id="header_content_lowerline">Виконали
	    <div id="header_content_lowerboxcontent">
        Дзьома Артем<br />
	      Заверталюк Вадим<br />
      </div>
	</div> 
          </div>
          
</div>


</div> 
</div>
</body>
</html>