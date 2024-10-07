package com.apiweb.backend.Service;

import com.apiweb.backend.Model.ViewModel;
import com.apiweb.backend.Repository.IViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewServiceImp implements IViewService {

    @Autowired
    private IViewRepository viewRepository;

    @Override
    public List<ViewModel> getAllViews() {
        return viewRepository.findAll();
    }

    @Override
    public ViewModel createView(ViewModel viewModel) {
        return viewRepository.save(viewModel);
    }

    @Override
    public ViewModel getViewById(int id) {
        return viewRepository.findById(id).orElse(null);
    }
}
