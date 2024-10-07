package com.apiweb.backend.Repository;

import com.apiweb.backend.Model.PublicaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPublicaRepository extends JpaRepository<PublicaModel, PublicaId> {
}
