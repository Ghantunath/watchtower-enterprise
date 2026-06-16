package com.watchtower.controller;

import com.watchtower.model.ScanRequest;
import com.watchtower.model.ScanResponse;
import com.watchtower.model.ScanRecord;
import com.watchtower.service.UrlScanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/url")
public class ScanController {

    private final UrlScanService urlScanService;

    public ScanController(UrlScanService urlScanService) {
        this.urlScanService = urlScanService;
    }

    @PostMapping("/scan")
    public ScanResponse scan(@RequestBody ScanRequest request) {

        boolean safe = urlScanService.scanUrl(request.getUrl());

        return new ScanResponse(
                request.getUrl(),
                safe
        );
    }

    @GetMapping("/history")
    public List<ScanRecord> getHistory() {
        return urlScanService.getHistory();
    }

}
