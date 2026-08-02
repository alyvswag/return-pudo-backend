package com.example.returnpudo.repository;

import com.example.returnpudo.model.Pudo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PudoRepository extends JpaRepository<Pudo, Long> {

    List<Pudo> findByNameContainingIgnoreCase(String name);

}
