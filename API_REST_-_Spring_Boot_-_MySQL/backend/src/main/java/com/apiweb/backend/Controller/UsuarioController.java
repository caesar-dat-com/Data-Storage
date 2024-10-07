package com.apiweb.backend.Controller;

import com.apiweb.backend.Model.UserModel;
import com.apiweb.backend.Service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping
    public List<UserModel> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> obtenerUsuarioPorId(@PathVariable Long id) {
        Optional<UserModel> usuario = usuarioService.obtenerUsuarioPorId(id);
        return usuario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public ResponseEntity<UserModel> guardarUsuario(@RequestBody UserModel usuario) {
        UserModel usuarioGuardado = usuarioService.guardarUsuario(usuario);
        return new ResponseEntity<>(usuarioGuardado, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminarUsuario(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
