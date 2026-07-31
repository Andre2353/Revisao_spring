package com.example.revisao.controlers;

import com.example.revisao.DTOs.MusicaDTO;
import com.example.revisao.repositories.MusicaRepository;
import com.example.revisao.services.Musicaservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("musica")
public class MusicaCOntroller {
    private final Musicaservice musicaservice;

    public MusicaCOntroller(Musicaservice musicaservice) {
        this.musicaservice = musicaservice;
    }


    @PostMapping
    public ResponseEntity<?>criarMusica(@RequestBody MusicaDTO dto){
        musicaservice.criarMusica(dto);
        return ResponseEntity.ok("criado com sucesso");
    }
}
