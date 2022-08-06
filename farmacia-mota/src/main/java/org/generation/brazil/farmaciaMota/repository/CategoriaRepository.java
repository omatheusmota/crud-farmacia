package org.generation.brazil.farmaciaMota.repository;

import java.util.List;

import org.generation.brazil.farmaciaMota.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository <Produto, Long> {
	public List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);

}
