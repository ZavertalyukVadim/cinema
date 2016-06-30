package p1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
* Created by Вадимка on 25.06.2015.
*/
@WebServlet("/ServletForNewFilms")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        DataBase dataBase = new DataBase();
//       dataBase.readStudentsAndGroupsAndHallAndPremiere();
        dataBase.readStuds();
        dataBase.readFilms();
        dataBase.readActrors();
        dataBase.readGenres();
        dataBase.readPremiere();
        dataBase.readUrl();
        dataBase.readhall();
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/forNewFilms.jsp");
        request.setAttribute("studList",dataBase.getStuds());
        request.setAttribute("genresList", dataBase.getGenresList());
        request.setAttribute("actorsList", dataBase.getActorsList());
        request.setAttribute("urlList", dataBase.getUrlList());
        request.setAttribute("premiereList", dataBase.getPremiereList());
        request.setAttribute("filmsList", dataBase.getFilmsList());
        request.setAttribute("hallList", dataBase.getHallList());
        dispatcher.forward(request,response);
    }
}
