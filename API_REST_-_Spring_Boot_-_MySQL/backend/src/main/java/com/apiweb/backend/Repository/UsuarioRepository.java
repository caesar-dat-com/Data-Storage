package com.apiweb.backend.Repository;

import com.apiweb.backend.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UserModel, Long> {
}
