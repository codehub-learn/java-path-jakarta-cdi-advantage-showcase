package gr.codelearn.javapathjakartacdiadvantageshowcase.servlet;

import gr.codelearn.javapathjakartacdiadvantageshowcase.domain.Video;
import gr.codelearn.javapathjakartacdiadvantageshowcase.service.VideoEditorService;
import jakarta.inject.Inject;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

@WebServlet(name = "mp4Servlet", value = "/mp4-servlet")
public class Mp4Servlet extends HttpServlet {
    private Video video;

    @Inject
    private VideoEditorService videoEditorService;

    @Override
    public void init() throws ServletException {
        video = new Video();
        video.setId(1);
        video.setName("Matrix");
        video.setSizeGb(new BigDecimal("3.5"));
        video.setViews(1_000_000);
        video.setYear(1999);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + " Video: "+ video + "</h1>");
        out.println("<h1>" +  videoEditorService.edit(video) + "</h1>");
        out.println("<h1>" +  videoEditorService.save(video) + "</h1>");
        out.println("</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
