package com.digrii.adv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DBSrv extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html");  // <-- Added this
        PrintWriter pw = res.getWriter();

        String sno = req.getParameter("t1");
        int no = Integer.parseInt(sno);
        String name = req.getParameter("t2");
        String add = req.getParameter("t3");

        String qry = "insert into studentVag values(?,?,?)";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            try (Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE", "sunnydb1", "pass");
                 PreparedStatement ps = con.prepareStatement(qry)) {   // <-- No extra ;

                ps.setInt(1, no);
                ps.setString(2, name);
                ps.setString(3, add);

                int result = ps.executeUpdate();

                if (result == 0)
                    pw.println("<center><h1>Record not inserted</h1></center>");
                else
                    pw.println("<center><h1>Record inserted successfully</h1></center>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            pw.println("<center><h1 style='color:red;'>Something went wrong: " + e.getMessage() + "</h1></center>");
        }
    }
}
