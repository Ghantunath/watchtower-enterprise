package com.watchtower.service;

import com.watchtower.model.ScanRecord;
import com.watchtower.repository.ScanRecordRepository;
import com.watchtower.client.GoogleSafeBrowsingClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlScanService {

    private final ScanRecordRepository repository;
    private final GoogleSafeBrowsingClient googleClient;

    public UrlScanService(ScanRecordRepository repository, GoogleSafeBrowsingClient googleClient) {
        this.repository = repository;
	this.googleClient = googleClient;
    }

    public boolean scanUrl(String url) {

        boolean safe = googleClient.isSafe(url);

        ScanRecord record = new ScanRecord(url, safe);

        repository.save(record);

        return safe;
    }

    public List<ScanRecord> getHistory() {
        return repository.findAll();
    }
}
