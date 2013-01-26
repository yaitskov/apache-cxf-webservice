package net.sf.dan.cxf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebService;

/**
 * Provides SOAP service and Inner service.
 * Daneel Yaitskov
 */
@WebService(endpointInterface = "net.sf.dan.cxf.Summator")
public class SummatorImpl implements Summator {

    private static final Logger LOGGER = LoggerFactory.getLogger(SummatorImpl.class);

    @Override
    public int sum(int a, int b) {
        LOGGER.debug("got a = {} and b = {}", a, b);
        int result = a + b;
        LOGGER.debug("result = {}", result);
        return  result;
    }
}
