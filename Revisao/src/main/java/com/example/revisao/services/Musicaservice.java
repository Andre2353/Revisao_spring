package com.example.revisao.services;

import com.example.revisao.DTOs.MusicaDTO;
import com.example.revisao.entities.Musica;
import com.example.revisao.repositories.MusicaRepository;
import org.springframework.stereotype.Service;

@Service
public class Musicaservice {
    private final MusicaRepository musicaRepository;

    public Musicaservice(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }
    public MusicaDTO criarMusica(MusicaDTO dto){
        Musica musica = new Musica();
        musica.setTitulo(dto.getTitulo());
        musica.setDataLancamento(dto.getDataLancamento());
        musica.setCantor(dto.getCantor());
        return dto;

    }
}
