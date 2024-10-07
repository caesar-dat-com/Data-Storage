package com.apiweb.backend.Service;

import com.apiweb.backend.Model.ResponseModel;

import java.util.List;

public interface IResponseService {
    List<ResponseModel> getAllResponses();
    ResponseModel createResponse(ResponseModel responseModel);
    ResponseModel getResponseById(int id);
}
