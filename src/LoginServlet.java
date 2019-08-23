import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhengtx
 * @description dfbz
 * @date 2019/8/23
 */
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User login = userService.login(username,password);

        if(login!=null){
            System.out.println(login.getUsername());
            System.out.println(login.getPassword());
            req.setAttribute("user",login);
            req.getRequestDispatcher("/success").forward(req,resp);
        }else {
            req.setAttribute("flag","true");
            req.getRequestDispatcher("/Login.jsp").forward(req,resp);
        }
    }
}

