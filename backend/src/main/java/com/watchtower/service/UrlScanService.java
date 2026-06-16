package com.watchtower.service;

import com.watchtower.model.ScanRecord;
import com.watchtower.repository.ScanRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlScanService {

    private final ScanRecordRepository repository;

    public UrlScanService(ScanRecordRepository repository) {
        this.repository = repository;
    }

    public boolean scanUrl(String url) {

        boolean safe = true;

        ScanRecord record = new ScanRecord(url, safe);

        repository.save(record);

        return safe;
    }

    public List<ScanRecord> getHistory() {
        return repository.findAll();
    }
}
