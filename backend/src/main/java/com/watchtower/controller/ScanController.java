package com.watchtower.controller;

import com.watchtower.model.ScanRequest;
import com.watchtower.service.UrlScanService;
import org.springframework.web.bind.annotation.*;
import com.watchtower.model.ScanResponse;

@RestController
@RequestMapping("/api/v1/url")
public class ScanController {

    private final UrlScanService urlScanService;

    public ScanController(UrlScanService urlScanService) {
        this.urlScanService = urlScanService;
    }

    @PostMapping("/scan")
    public ScanResponse scan(@RequestBody ScanRequest request) {

        return urlScanService.scanUrl(request.getUrl());

    }
}
