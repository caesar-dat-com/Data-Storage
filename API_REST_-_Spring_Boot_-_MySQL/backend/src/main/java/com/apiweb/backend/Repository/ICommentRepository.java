package com.apiweb.backend.Repository;

import com.apiweb.backend.Model.CommentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentRepository extends JpaRepository<CommentModel, Integer> {
}
