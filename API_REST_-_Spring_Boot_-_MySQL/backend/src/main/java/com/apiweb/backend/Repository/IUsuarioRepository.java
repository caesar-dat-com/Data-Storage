package com.apiweb.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apiweb.backend.Model.UserModel;

public interface IUsuarioRepository extends JpaRepository<UserModel, Integer> {

}
