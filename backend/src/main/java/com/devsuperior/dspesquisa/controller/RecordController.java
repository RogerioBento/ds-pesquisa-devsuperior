package com.devsuperior.dspesquisa.controller;

import java.util.List;

import com.devsuperior.dspesquisa.dto.GameDto;
import com.devsuperior.dspesquisa.dto.RecordDto;
import com.devsuperior.dspesquisa.dto.RecordInsertDto;
import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.repositories.GameRepository;
import com.devsuperior.dspesquisa.services.GameService;
import com.devsuperior.dspesquisa.services.RecordService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/records")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @PostMapping()
    public ResponseEntity<RecordDto> insert(@RequestBody RecordInsertDto dto) {
       RecordDto newDto = recordService.insert(dto);
       return ResponseEntity.ok().body(newDto);
    }
}
