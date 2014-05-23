package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class sample_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=windows-31j");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

int count = 10;
Date startDate = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>\r\n");
      out.write("\t\t\tJSPサンプルページ\r\n");
      out.write("\t\t</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
 System.out.println("Hello World!"); 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
 for (int i = 0 ; i < count; i++){ 
      out.write("\r\n");
      out.write("\t\t\t<p>");
      out.print( String.valueOf(i) );
      out.write("ループ目です。<p/>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\tこのJSPは");
      out.print( sdf.format(startDate) );
      out.write("に起動されました。\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<!-- コメント２ --!>\r\n");
      out.write("\t\t");

			// コメント３
			System.out.println("コメントの確認です。");
		
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
