

package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("filename").equals(" ") || request.getParameter("filename").isEmpty())
        {
            request.setAttribute("Enter correct name", "Enter valid name");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
        else{
            String filename = request.getParameter("filename").endsWith(".pdf") ? request.getParameter("filename")
                    :request.getParameter("filename").concat(".pdf");
            String context = getServletContext().getRealPath(File.separator);
            String path = context + "WEB-INF/classes/controller/" +filename;
            download(response, request, path);
        }

    }

    private void download(HttpServletResponse response, HttpServletRequest request, String filename)throws IOException{
        File file = new File(filename);

        if(!file.exists()){
            request.setAttribute("error", "filename" +filename+ "not valid");
            try{
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
            catch (ServletException e)
            {
                e.printStackTrace();
            }
        }
        else{
            response.setContentType("application/octet-stream");
            response.setContentLength((int)filename.length());
            response.setHeader("content",String.format("attachment; filename=\"s\" ", file.getName()));
            OutputStream outputStream = response.getOutputStream();
            try(FileInputStream in = new FileInputStream(file)){
                byte[] buffer = new byte[1000];
                int len;
                while ((len  = in.read(buffer))>0){
                    outputStream.write(buffer, 0, len);
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
            outputStream.flush();
        }
    }

}