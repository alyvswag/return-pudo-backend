package com.example.returnpudo.controller;

import com.example.returnpudo.model.Pudo;
import com.example.returnpudo.service.PudoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pudo")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class PudoController {

    private final PudoService pudoService;

    @GetMapping
    public List<Pudo> getAllPudo() {
        return pudoService.getAllPudo();
    }

    @GetMapping("/search")
    public List<Pudo> searchPudo(@RequestParam String name) {
        return pudoService.searchPudo(name);
    }

    @PostMapping
    public Pudo addPudo(@RequestBody Pudo pudo) {
        return pudoService.addPudo(pudo);
    }

    @DeleteMapping("/{id}")
    public void deletePudo(@PathVariable Long id) {
        pudoService.deletePudo(id);
    }
}
