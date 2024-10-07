package com.apiweb.backend.Service;

import com.apiweb.backend.Model.ResponseModel;
import com.apiweb.backend.Repository.IResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseServiceImp implements IResponseService {

    @Autowired
    private IResponseRepository responseRepository;

    @Override
    public List<ResponseModel> getAllResponses() {
        return responseRepository.findAll();
    }

    @Override
    public ResponseModel createResponse(ResponseModel responseModel) {
        return responseRepository.save(responseModel);
    }

    @Override
    public ResponseModel getResponseById(int id) {
        return responseRepository.findById(id).orElse(null);
    }
}
