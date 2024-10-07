package com.apiweb.backend.Repository;

import com.apiweb.backend.Model.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthorRepository extends JpaRepository<AuthorModel, Integer> {
}
