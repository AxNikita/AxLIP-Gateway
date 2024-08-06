package ru.axproject.ax_lip_gateway.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.axproject.ax_lip_gateway.dto.PageDTO;
import ru.axproject.ax_lip_gateway.service.PageService;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PageController {

    private final PageService pageService;

    @PostMapping("/page")
    public ResponseEntity savePage(@RequestBody PageDTO pageDTO) {
        log.info(String.valueOf(pageDTO));
        pageService.sendPage(pageDTO.getPage().toString());
        return ResponseEntity.ok().build();
    }

}
