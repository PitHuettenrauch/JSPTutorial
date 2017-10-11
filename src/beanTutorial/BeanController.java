package beanTutorial;

import java.sql.*;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;


public class BeanController extends javax.servlet.http.HttpServlet {
   // protected void  doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

  //  }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException
    {


            Connection conn = null;
            Statement stmt = null;
            String id = null;
            id = request.getParameter("id");
            DataBean data = new DataBean();
            try
            { Class.forName("com.mysql.jdbc.Driver");
                 //Open a connection
                 conn = DriverManager.getConnection("jdbc:mysql://localhost/jsptutorial", "Pit", "1234");
                 // Execute SQL query
                 stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM worker WHERE id = " + id);
                 rs.next();
                 //position the query on the first dataset
                 data.setName(rs.getString("Name"));
                 data.setOccupation(rs.getString("Occupation"));
                 data.setAge(rs.getInt("Age"));
                 data.setWorkingHours(rs.getInt("WorkingHours"));
                 request.setAttribute("data", data);
                 RequestDispatcher dispatch = request.getRequestDispatcher("test.jsp");
                 dispatch.forward(request, response);



            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            finally { if (stmt != null) try
            {
                stmt.close();
            }
            catch (SQLException e) { }
            if (conn != null) try
            {
                conn.close();
            }
            catch (SQLException e) { }
    }



    }


}
