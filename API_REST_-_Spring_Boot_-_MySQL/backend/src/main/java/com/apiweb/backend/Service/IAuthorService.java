package com.apiweb.backend.Service;

import com.apiweb.backend.Model.AuthorModel;

import java.util.List;

public interface IAuthorService {
    List<AuthorModel> getAllAuthors();
    AuthorModel createAuthor(AuthorModel authorModel);
    AuthorModel getAuthorById(int id);
}
