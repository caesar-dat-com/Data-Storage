package com.apiweb.backend.Controller;

import com.apiweb.backend.Model.RatingModel;
import com.apiweb.backend.Service.IRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/valoraciones")
public class RatingController {

    @Autowired
    private IRatingService ratingService;

    @GetMapping
    public List<RatingModel> getAllRatings() {
        return ratingService.getAllRatings();
    }

    @PostMapping
    public ResponseEntity<RatingModel> createRating(@RequestBody RatingModel ratingModel) {
        RatingModel newRating = ratingService.createRating(ratingModel);
        return ResponseEntity.ok(newRating);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RatingModel> getRatingById(@PathVariable int id) {
        RatingModel rating = ratingService.getRatingById(id);
        if (rating != null) {
            return ResponseEntity.ok(rating);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
