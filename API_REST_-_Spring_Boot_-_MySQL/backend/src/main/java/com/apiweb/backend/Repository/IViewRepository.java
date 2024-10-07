package com.apiweb.backend.Repository;

import com.apiweb.backend.Model.ViewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IViewRepository extends JpaRepository<ViewModel, Integer> {
}
