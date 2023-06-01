import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class imagetest extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("image/jpeg");
		OutputStream out = response.getOutputStream();


		String pathToWeb = getServletContext().getRealPath(File.separator);
		File f = new File(pathToWeb + "/shop/manuimage/manu_image/13.jpg");
		BufferedImage bi = ImageIO.read(f);

		

		

		
		ImageIO.write(bi, "jpg", out);
		out.close();

		
	}

}