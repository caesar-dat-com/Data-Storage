package com.apiweb.backend.Service;

import com.apiweb.backend.Model.UserModel;
import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    List<UserModel> obtenerUsuarios();

    Optional<UserModel> obtenerUsuarioPorId(Long id);

    UserModel guardarUsuario(UserModel usuario);

    void eliminarUsuario(Long id);
}
