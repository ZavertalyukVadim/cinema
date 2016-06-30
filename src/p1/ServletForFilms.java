package p1;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by админ on 23.12.2014.
 */
@WebServlet("/films")
public class ServletForFilms extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        DataBase dataBase = new DataBase();
//        dataBase.readStudentsAndGroupsAndHallAndPremiere();
        dataBase.readStuds();
        dataBase.readFilms();
        dataBase.readActrors();
        dataBase.readGenres();
        dataBase.readPremiere();
        dataBase.readUrl();
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/films.jsp");
        request.setAttribute("studList",dataBase.getStuds());
        request.setAttribute("genresList", dataBase.getGenresList());
        request.setAttribute("actorsList", dataBase.getActorsList());
        request.setAttribute("urlList", dataBase.getUrlList());
        request.setAttribute("premiereList", dataBase.getPremiereList());
        request.setAttribute("filmsList", dataBase.getFilmsList());
        dispatcher.forward(request,response);
    }
}






























