package com.apiweb.backend.Controller;

import com.apiweb.backend.Model.AuthorModel;
import com.apiweb.backend.Service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AuthorController {

    @Autowired
    private IAuthorService authorService;

    @GetMapping
    public List<AuthorModel> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @PostMapping
    public ResponseEntity<AuthorModel> createAuthor(@RequestBody AuthorModel authorModel) {
        AuthorModel newAuthor = authorService.createAuthor(authorModel);
        return ResponseEntity.ok(newAuthor);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorModel> getAuthorById(@PathVariable int id) {
        AuthorModel author = authorService.getAuthorById(id);
        if (author != null) {
            return ResponseEntity.ok(author);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
