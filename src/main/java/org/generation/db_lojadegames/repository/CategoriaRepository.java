package org.generation.db_lojadegames.repository;

import java.util.List;

import org.generation.db_lojadegames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);
}
