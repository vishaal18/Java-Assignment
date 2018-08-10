package CustomTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class LogoCustomTag extends SimpleTagSupport {
    public void doTag() throws JspException, IOException {
        final StringBuffer bodyContent = new StringBuffer();
        JspWriter out = getJspContext().getOut();
        bodyContent.append("<H1 style=\"color:blue;\"> Bank of Regina</H1>");
        out.write(bodyContent.toString());
    }
}
