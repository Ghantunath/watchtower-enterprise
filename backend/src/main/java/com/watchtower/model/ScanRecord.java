package com.watchtower.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ScanRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    private boolean safe;

    private LocalDateTime createdAt;

    public ScanRecord() {}

    public ScanRecord(String url, boolean safe) {
        this.url = url;
        this.safe = safe;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public boolean isSafe() {
        return safe;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
