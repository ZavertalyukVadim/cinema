package p1;


//import p1.models.Films;
//import p1.models.Groups;
//import p1.models.Hall;

import p1.models.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
* Created by админ on 31.03.2015.
*/
@WebServlet("/addRowServlet")
public class AddRowServlet extends HttpServlet {

    private boolean flag;
    private List<Student> studs;
    private List<Genre> genres;
    private  List<Actors> actors;
    private List<Premiere>  premiere;
    private List<Films> films;
    private List<UrlOfFilm> url;
    private List<Hall> hall;


    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataBase dataBase = new DataBase();
        genres = dataBase.session.createQuery("from p1.models.Genre g where g.id="+request.getParameter("slgenre")).list();
        actors = dataBase.session.createQuery("from p1.models.Actors g where g.id="+request.getParameter("slactors")).list();
        premiere = dataBase.session.createQuery("from p1.models.Premiere g where g.id="+request.getParameter("slpremiere")).list();
        films = dataBase.session.createQuery("from p1.models.Films g where g.id="+request.getParameter("slfilms")).list();
        url = dataBase.session.createQuery("from p1.models.UrlOfFilm g where g.id="+request.getParameter("slurl")).list();
        hall=dataBase.session.createQuery("from p1.models.Hall g where g.id="+request.getParameter("slhall")).list();
        //dataBase.setGroupsList(groups);
        dataBase.addStudent( url.get(0), films.get(0), request.getParameter("tftime"), genres.get(0), premiere.get(0), request.getParameter("tfactor"), request.getParameter("tfdur"),request.getParameter("tfinf"),hall.get(0));
//        flag = false;
        response.sendRedirect("/hello");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        flag = true;
        request.setAttribute("flag", flag);
        ServletContext context= getServletContext();
        RequestDispatcher rd= context.getRequestDispatcher("/hello");
        rd.forward(request, response);
    }


    public List<Student> getStuds() {
        return studs;
    }

    public void setStuds(List<Student> studs) {
        this.studs = studs;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Actors> getActors() {
        return actors;
    }

    public void setActors(List<Actors> actors) {
        this.actors = actors;
    }

    public List<Premiere> getPremiere() {
        return premiere;
    }

    public void setPremiere(List<Premiere> premiere) {
        this.premiere = premiere;
    }

    public List<Films> getFilms() {
        return films;
    }

    public void setFilms(List<Films> films) {
        this.films = films;
    }

    public List<UrlOfFilm> getUrl() {
        return url;
    }

    public void setUrl(List<UrlOfFilm> url) {
        this.url = url;
    }

}
