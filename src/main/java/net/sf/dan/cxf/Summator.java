package net.sf.dan.cxf;

import org.apache.cxf.annotations.WSDLDocumentation;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Daneel Yaitskov
 */
@WebService
@WSDLDocumentation(value = "Sums method")
public interface Summator {

    @WSDLDocumentation(value = "returns sum of args")
    int sum(@WebParam(name = "a")int a, @WebParam(name = "b") int b);
}
