import com.DNDStore.CloseDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "SerchServlet", urlPatterns = "/search")
public class SerchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Load the driver
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rset = null;
        String searchItem = request.getParameter("input");

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            String absPath = getServletContext().getRealPath("/WEB-INF/lib/dbdemo");
            conn = DriverManager.getConnection("jdbc:derby:" + absPath,"stacy","stacy"); // db password
            stmt = conn.prepareStatement("Select * from ITEMS where upper(NAME) like ?");
            stmt.setString(1, "%" + searchItem.toUpperCase() + "%");
            rset = stmt.executeQuery();

            StringBuilder html = new StringBuilder("<html><body><ul>");

            while (rset.next()) {
                String name = rset.getString("NAME");
                String damage = rset.getString("DAMAGE");
                int cost = rset.getInt("Cost");
                String coin = rset.getString("cointype");
                html.append("<li>").append(name +"," + damage + "," + cost + "," + coin).append("</li>");
            }

            html.append("</ul></body></html>");

            response.getWriter().print(html.toString());
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally{
            CloseDB.closeAll(conn,stmt,rset);
        }

    }
}
