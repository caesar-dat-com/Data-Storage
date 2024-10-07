package com.apiweb.backend.Service;

import com.apiweb.backend.Model.CommentModel;

import java.util.List;

public interface ICommentService {
    List<CommentModel> getAllComments();
    CommentModel createComment(CommentModel commentModel);
    CommentModel getCommentById(int id);
}
