package pdfTest;


import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet(name = "readPdf", urlPatterns = { "/readPdf" })
@MultipartConfig(fileSizeThreshold = 5000000, maxFileSize = 10000000)
public class readPdf extends HttpServlet {

	private static final long serialVersionUID = 1L;


	public static void main(String[] args){
		System.out.println("Hello world");
	}

}
