package org.generation.brazil.farmaciaMota.repository;

// Esta camada é responsável pela comunicação com o banco de dados

import java.util.List;

import org.generation.brazil.farmaciaMota.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);
}
