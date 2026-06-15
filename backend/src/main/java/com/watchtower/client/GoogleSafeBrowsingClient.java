package com.watchtower.client;

import org.springframework.stereotype.Component;

@Component
public class GoogleSafeBrowsingClient {

    public boolean isSafe(String url) {

        System.out.println("Pretending to scan URL: " + url);

        return true;
    }
}
