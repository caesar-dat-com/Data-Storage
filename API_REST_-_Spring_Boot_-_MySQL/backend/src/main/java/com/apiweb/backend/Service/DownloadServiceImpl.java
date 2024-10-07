package com.apiweb.backend.Service;

import com.apiweb.backend.Model.DownloadModel;
import com.apiweb.backend.Repository.IDownloadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DownloadServiceImpl implements IDownloadService {

    @Autowired
    private IDownloadRepository downloadRepository;

    @Override
    public List<DownloadModel> getAllDownloads() {
        return downloadRepository.findAll();
    }

    @Override
    public DownloadModel createDownload(DownloadModel downloadModel) {
        return downloadRepository.save(downloadModel);
    }

    @Override
    public DownloadModel getDownloadById(int id) {
        return downloadRepository.findById(id).orElse(null);
    }
}
