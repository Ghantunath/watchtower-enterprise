package com.watchtower.repository;

import com.watchtower.model.ScanRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScanRecordRepository extends JpaRepository<ScanRecord, Long> {
}
