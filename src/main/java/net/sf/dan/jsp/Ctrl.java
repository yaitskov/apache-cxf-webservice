package net.sf.dan.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * daneel yaitskov
 */
@Controller
public class Ctrl {

    @Resource
    private Summator summator;

    @RequestMapping("/")
    public ModelAndView def() {
        Map params = new HashMap();
        params.put("a", "0");
        params.put("b", "0");
        params.put("resultSum", null);
        return new ModelAndView("def", params);
    }

    /**
     * Sums 2 http parameters and prints the result.
     * @param a fist int number
     * @param b second int number
     */
    @RequestMapping("/Sum")
    public ModelAndView sum(@RequestParam("a") int a, @RequestParam("b") int b) {
        Map params = new HashMap();
        params.put("a", a);
        params.put("b", b);
        params.put("resultSum", summator.sum(a, b));
        return new ModelAndView("def", params);
    }

}
