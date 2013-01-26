package net.sf.dan.cxf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Summator with Web interface.
 * daneel yaitskov
 */
@Controller
public class Ctrl {

    private static final Logger LOGGER = LoggerFactory.getLogger(Ctrl.class);

    @Resource(name = "remoteSummator")
    private Summator summator;

    @RequestMapping("/")
    public ModelAndView def() {
        LOGGER.debug("default view");
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
        LOGGER.debug("request sum with a = {} and b = {}", a, b);
        Map params = new HashMap();
        params.put("a", a);
        params.put("b", b);
        int result = summator.sum(a, b);
        params.put("resultSum", result);
        LOGGER.debug("request sum result is {}", result);
        return new ModelAndView("def", params);
    }

}
