package com.apiweb.backend.Repository;

import com.apiweb.backend.Model.RatingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRatingRepository extends JpaRepository<RatingModel, Integer> {
}
