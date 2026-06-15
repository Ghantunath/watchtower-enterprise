package com.watchtower.model;

public class ScanResponse {

    private String url;
    private boolean safe;

    public ScanResponse(String url, boolean safe) {
        this.url = url;
        this.safe = safe;
    }

    public String getUrl() {
        return url;
    }

    public boolean isSafe() {
        return safe;
    }
}
