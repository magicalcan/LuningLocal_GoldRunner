package com.example;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.stream.StreamSource;

public class HelloServlet extends HttpServlet {

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        String stageNum =  request.getParameter("stage");

        out.write("Deployed first change!".getBytes());
        out.flush();
        out.close();
    }
    public String transform(String stageFile){
	try {
            File stylesheet = new File("");
            File datafile = new File(stageFile);

            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(datafile);
            // ...
            StreamSource stylesource = new StreamSource(stylesheet); 
            Transformer transformer = Factory.newTransformer(stylesource);
        }
    }

}
