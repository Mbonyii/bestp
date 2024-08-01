package com.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Submitted1 extends HttpServlet {
    private static final Logger logger = LogManager.getLogger(Submitted1.class);

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String id = req.getParameter("id");
        String names = req.getParameter("names");
        
        logger.debug("Received request with ID: " + id + " and Names: " + names);
        
        PrintWriter out = res.getWriter();
        out.println("Submmited Id is:"+id);
        out.println("Names are :"+names);
        
        logger.info("Response sent for ID: " + id + " and Names: " + names);
    }
}
