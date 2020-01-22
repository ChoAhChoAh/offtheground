package otg.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class PatchServlet
 */
public class PatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private static  String defaultPath=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,String> pMap = request.getParameterMap();
		if(pMap.containsKey("patchUI")) {
			response.sendRedirect(request.getContextPath()+"/patch/patch.html");
		}
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		StringBuilder sb = new StringBuilder("");
		try {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setHeaderEncoding("UTF-8");
			List<FileItem> items = upload.parseRequest(request);
			String fileName = null;
			String opType = null;
			for(FileItem f : items) {
				try {
					if(!f.isFormField()) {
						fileName = f.getName();
						opType = f.getFieldName().split("\\|")[0];
						String path = f.getFieldName().split("\\|")[1];
						String uploadPath = this.getServletContext().getRealPath("/")+path+"\\"+fileName;
						File file = new File(uploadPath);
						if(opType.equals("delete")&&file.exists()) {
							file.delete();
						}else if(opType.equals("add")) {
							f.write(file);
						}
						sb.append(fileName+" success "+opType+"\r\n");						
					}					
				}catch(Exception e) {
					sb.append(fileName+" fail "+opType+"\r\n");			
				}
			}
			out.write(sb.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			out.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
