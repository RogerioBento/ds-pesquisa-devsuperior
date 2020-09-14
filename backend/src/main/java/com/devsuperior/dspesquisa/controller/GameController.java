package com.devsuperior.dspesquisa.controller;

import java.util.List;

import com.devsuperior.dspesquisa.dto.GameDto;
import com.devsuperior.dspesquisa.services.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping()
    public ResponseEntity<List<GameDto>> findAll() {
        List<GameDto> list = gameService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
