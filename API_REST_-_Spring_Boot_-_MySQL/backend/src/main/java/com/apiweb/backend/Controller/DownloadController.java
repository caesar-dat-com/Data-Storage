package com.apiweb.backend.Controller;

import com.apiweb.backend.Model.DownloadModel;
import com.apiweb.backend.Service.IDownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/descargas")
public class DownloadController {

    @Autowired
    private IDownloadService downloadService;

    @GetMapping
    public List<DownloadModel> getAllDownloads() {
        return downloadService.getAllDownloads();
    }

    @PostMapping
    public ResponseEntity<DownloadModel> createDownload(@RequestBody DownloadModel downloadModel) {
        DownloadModel newDownload = downloadService.createDownload(downloadModel);
        return ResponseEntity.ok(newDownload);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DownloadModel> getDownloadById(@PathVariable int id) {
        DownloadModel download = downloadService.getDownloadById(id);
        if (download != null) {
            return ResponseEntity.ok(download);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
