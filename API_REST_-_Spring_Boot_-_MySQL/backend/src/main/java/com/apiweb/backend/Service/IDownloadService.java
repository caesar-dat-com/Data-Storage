package com.apiweb.backend.Service;

import com.apiweb.backend.Model.DownloadModel;

import java.util.List;

public interface IDownloadService {
    List<DownloadModel> getAllDownloads();
    DownloadModel createDownload(DownloadModel downloadModel);
    DownloadModel getDownloadById(int id);
}
