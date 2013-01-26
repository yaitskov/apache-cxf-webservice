package net.sf.dan.jsp;

import org.springframework.stereotype.Service;

/**
 * Inner service.
 * Daneel Yaitskov
 */
@Service
public class Summator {

    int sum(int a, int b) {
        return  a + b;
    }
}
