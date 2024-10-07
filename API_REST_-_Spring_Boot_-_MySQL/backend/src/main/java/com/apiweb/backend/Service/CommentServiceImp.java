package com.apiweb.backend.Service;

import com.apiweb.backend.Model.CommentModel;
import com.apiweb.backend.Repository.ICommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImp implements ICommentService {

    @Autowired
    private ICommentRepository commentRepository;

    @Override
    public List<CommentModel> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public CommentModel createComment(CommentModel commentModel) {
        return commentRepository.save(commentModel);
    }

    @Override
    public CommentModel getCommentById(int id) {
        return commentRepository.findById(id).orElse(null);
    }
}
