package com.apiweb.backend.Service;

import com.apiweb.backend.Model.ViewModel;

import java.util.List;

public interface IViewService {
    List<ViewModel> getAllViews();
    ViewModel createView(ViewModel viewModel);
    ViewModel getViewById(int id);
}
