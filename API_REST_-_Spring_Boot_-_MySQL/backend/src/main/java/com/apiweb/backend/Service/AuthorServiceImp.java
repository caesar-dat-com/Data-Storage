package com.apiweb.backend.Service;

import com.apiweb.backend.Model.AuthorModel;
import com.apiweb.backend.Repository.IAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImp implements IAuthorService {

    @Autowired
    private IAuthorRepository authorRepository;

    @Override
    public List<AuthorModel> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public AuthorModel createAuthor(AuthorModel authorModel) {
        return authorRepository.save(authorModel);
    }

    @Override
    public AuthorModel getAuthorById(int id) {
        return authorRepository.findById(id).orElse(null);
    }
}
