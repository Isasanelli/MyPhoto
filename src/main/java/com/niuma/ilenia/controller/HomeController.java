package com.niuma.ilenia.controller;

import com.niuma.ilenia.dto.PhotoDto;
import com.niuma.ilenia.mapper.PhotoMapper;
import com.niuma.ilenia.service.PhotoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

@Controller
public class HomeController {

    @RequestMapping("/")

    public String index() {

        return "index";
    }

    @RequestMapping("/demo")
    @ResponseBody
    public String demo() {

        return "this is a demon page";
    }
}

/**
 * HomeController for REST API Request
 */
/*@Slf4j
@RestController
public class HomeController {

    @Autowired
    PhotoService photoService;

    @Autowired
    PhotoMapper photoMapper;

    @GetMapping(value = "/photos/{id}")
    public Mono<PhotoDto> getById(@PathVariable String id) {
        log.debug("get photo by id");
        return Mono.just(photoMapper.modelToDto(photoService.getById(Integer.parseInt(id)).get()));
    }

    @PostMapping(value = "/photos/create")
    public Mono<PhotoDto> create(@RequestBody PhotoDto photoDto) {
        log.debug("create object photo");
        return Mono.just(photoMapper.modelToDto(photoService.create(photoMapper.dtoToModel(photoDto))));
    }

}*/