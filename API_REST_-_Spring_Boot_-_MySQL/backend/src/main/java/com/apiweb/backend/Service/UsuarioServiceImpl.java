package com.apiweb.backend.Service;

import com.apiweb.backend.Model.UserModel;
import com.apiweb.backend.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<UserModel> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<UserModel> obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public UserModel guardarUsuario(UserModel usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
