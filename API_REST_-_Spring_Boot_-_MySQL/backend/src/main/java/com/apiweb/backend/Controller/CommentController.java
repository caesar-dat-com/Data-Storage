package com.apiweb.backend.Controller;

import com.apiweb.backend.Model.CommentModel;
import com.apiweb.backend.Service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class CommentController {

    @Autowired
    private ICommentService commentService;

    @GetMapping
    public List<CommentModel> getAllComments() {
        return commentService.getAllComments();
    }

    @PostMapping
    public ResponseEntity<CommentModel> createComment(@RequestBody CommentModel commentModel) {
        CommentModel newComment = commentService.createComment(commentModel);
        return ResponseEntity.ok(newComment);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommentModel> getCommentById(@PathVariable int id) {
        CommentModel comment = commentService.getCommentById(id);
        if (comment != null) {
            return ResponseEntity.ok(comment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
