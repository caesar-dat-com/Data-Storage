package com.apiweb.backend.Service;

import com.apiweb.backend.Model.RatingModel;

import java.util.List;

public interface IRatingService {
    List<RatingModel> getAllRatings();
    RatingModel createRating(RatingModel ratingModel);
    RatingModel getRatingById(int id);
}
