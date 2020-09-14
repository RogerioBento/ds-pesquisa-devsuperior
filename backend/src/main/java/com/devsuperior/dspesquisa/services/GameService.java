package com.devsuperior.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.dspesquisa.dto.GameDto;
import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameDto> findAll(){
        List<Game> list = gameRepository.findAll();
        return list.stream().map(x -> new GameDto(x)).collect(Collectors.toList());

    }
}
