package anketa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class QuestionServlet extends HttpServlet {
    static final String TEMPLATE = "<html>"+"<head><title>Anketa</title></head>"+"<body>"+"<h1>%s</h1>"+"<h3>city :%s</h3>"+"<h3>age : %s</h3><br/><h2> %s</h2>"+"</body></html>";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        String name = req.getParameter( "name")+" "+req.getParameter("surname");

        int cityNumber = Integer.parseInt(req.getParameter("city"));
        String city = "";
        switch(cityNumber){
            case 1: city = "Vinnitsa";
            break;
            case 2 : city = "Dnepr";
            break;
            case 3 : city = "Donetsk";
            break;
            case 4 : city = "Zhitomir";
            break;
            case 5 : city = "Zaporozhye";
            break;
            case 6 : city = "Ivano-Frankovsk";
            break;
            case 7 : city = "Kiev";
            break;
            case 8 : city = "Kropivnitskiy";
            break;
            case 9 : city = "Lugansk";
            break;
            case 10 : city = "Lutsk";
            break;
            case 11 : city = "Lvov";
            break;
            case 12 : city = "Nikolaev";
            break;
            case 13 : city = "Odessa";
            break;
            case  14 : city = "Poltava";
            break;
            case 15 : city = "Rovno";
            break;
            case 16 : city = "Summy";
            break;
            case 17 : city = "Ternopol";
            break;
            case 18 : city = "Uzhgorod";
            break;
            case 19 : city = "Kharkov";
            break;
            case 20 : city = "Kherson";
            break;
            case 21 : city = "Khmelnitsky";
            break;
            case 22 : city = "Cherkassi";
            break;
            case 23 : city = "Chernihov";
            break;
        }

        String age = "";
        int numbAge = Integer.parseInt(req.getParameter("age"));
            if(numbAge == 1) age = "older than 30";
            else if(numbAge == 2) age = "from 20 to 30";
            else if(numbAge == 3) age = "under 20";

        String like = "";
         int numbLike = Integer.parseInt(req.getParameter("like"));
             if(numbLike == 1) like = "You like Java!";
             else if(numbLike == 2) like = "You don't likev Java!";

        resp.getWriter().println(String.format(TEMPLATE, name, city, age, like));
    }


}
