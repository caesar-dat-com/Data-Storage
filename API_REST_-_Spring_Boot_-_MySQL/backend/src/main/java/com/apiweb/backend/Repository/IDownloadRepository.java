package com.apiweb.backend.Repository;

import com.apiweb.backend.Model.DownloadModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDownloadRepository extends JpaRepository<DownloadModel, Integer> {
}
