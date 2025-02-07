package com.salomaotech.projeto.entities;

import com.salomaotech.projeto.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepositoy extends JpaRepository<Produto, Long> {

}
