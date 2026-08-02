package com.example.returnpudo.service;

import com.example.returnpudo.model.Pudo;
import com.example.returnpudo.repository.PudoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PudoService {

    private final PudoRepository pudoRepository;

    public List<Pudo> getAllPudo() {
        return pudoRepository.findAll();
    }

    public List<Pudo> searchPudo(String name) {
        return pudoRepository.findByNameContainingIgnoreCase(name);
    }

    public Pudo addPudo(Pudo pudo) {
        return pudoRepository.save(pudo);
    }

    public void deletePudo(Long id) {
        pudoRepository.deleteById(id);
    }
}
