package com.apiweb.backend.Service;

import com.apiweb.backend.Model.UsuarioModel;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    List<UsuarioModel> obtenerUsuarios();

    Optional<UsuarioModel> obtenerUsuarioPorId(Long id);

    UsuarioModel guardarUsuario(UsuarioModel usuario);

    void eliminarUsuario(Long id);
}
