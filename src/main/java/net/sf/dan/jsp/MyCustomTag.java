package net.sf.dan.jsp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Puts html code:
 * <pre>
 *     input field
 *     sign «+»
 *     another input field
 *     sign  «=»
 *     button  «ОК»
 * </pre>
 * Daneel Yaitskov
 */
public class MyCustomTag extends SimpleTagSupport {

    private String a,b,result;

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        printInput("a", HtmlInputType.TEXT, a);
        out.print("<span>+</span>");
        printInput("b", HtmlInputType.TEXT, b);
        out.println("<span>= " + (result == null ? "?" : result ) + "</span>");
        printInput("calc", HtmlInputType.SUBMIT, "OK");
    }

    public void printInput(String name, HtmlInputType type, Object value)
            throws IOException {
        JspWriter writer = getJspContext().getOut();
        writer.print("<input name='" + name + "' type='" + type + "'");
        if (value != null) {
            writer.print(" value='" + value + "'");
        }
        writer.print("/>");
    }
}
