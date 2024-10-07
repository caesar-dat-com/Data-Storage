package com.apiweb.backend.Controller;

import com.apiweb.backend.Model.ViewModel;
import com.apiweb.backend.Service.IViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visualizaciones")
public class ViewController {

    @Autowired
    private IViewService viewService;

    @GetMapping
    public List<ViewModel> getAllViews() {
        return viewService.getAllViews();
    }

    @PostMapping
    public ResponseEntity<ViewModel> createView(@RequestBody ViewModel viewModel) {
        ViewModel newView = viewService.createView(viewModel);
        return ResponseEntity.ok(newView);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ViewModel> getViewById(@PathVariable int id) {
        ViewModel view = viewService.getViewById(id);
        if (view != null) {
            return ResponseEntity.ok(view);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
