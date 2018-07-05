package com.reizx.miniokhttputils;


import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

public class UriTest {
    @Test
    public void uriTest() throws URISyntaxException {
        String testUrl = "http://www.java2s.com:8080/yourpath/fileName.htm?stove=10&path=32&id=4#harvic";
        URI uri = new URI(testUrl);
        System.out.println("getScheme()  : " + uri.getScheme());
        System.out.println("getSchemeSpecificPart()  : " + uri.getSchemeSpecificPart());
        System.out.println("getFragment()  : " + uri.getFragment());
        System.out.println("getAuthority()  : " + uri.getAuthority());
        System.out.println("getPath()  : " + uri.getPath());
        System.out.println("getQuery()  : " + uri.getQuery());
        System.out.println("getHost()  : " + uri.getHost());
        System.out.println("getPort()  : " + uri.getPort());
    }
}
