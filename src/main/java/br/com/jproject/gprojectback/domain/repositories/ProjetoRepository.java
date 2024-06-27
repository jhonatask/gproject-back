package br.com.jproject.gprojectback.domain.repositories;

import br.com.jproject.gprojectback.domain.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, UUID> {
}
