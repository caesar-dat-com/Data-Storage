package com.apiweb.backend.Service;

import com.apiweb.backend.Model.RatingModel;
import com.apiweb.backend.Repository.IRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements IRatingService {

    @Autowired
    private IRatingRepository ratingRepository;

    @Override
    public List<RatingModel> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public RatingModel createRating(RatingModel ratingModel) {
        return ratingRepository.save(ratingModel);
    }

    @Override
    public RatingModel getRatingById(int id) {
        return ratingRepository.findById(id).orElse(null);
    }
}
