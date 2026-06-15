package com.watchtower.service;

import com.watchtower.client.GoogleSafeBrowsingClient;
import com.watchtower.model.ScanResponse;
import org.springframework.stereotype.Service;

@Service
public class UrlScanService {

    private final GoogleSafeBrowsingClient googleClient;

    public UrlScanService(GoogleSafeBrowsingClient googleClient) {
        this.googleClient = googleClient;
    }

    public ScanResponse scanUrl(String url) {

        boolean safe = googleClient.isSafe(url);

        return new ScanResponse(url, safe);
    }
}
