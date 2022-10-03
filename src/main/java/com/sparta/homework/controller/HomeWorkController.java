package com.sparta.homework.controller;

import com.sparta.homework.dto.HomeWorkRequestDto;
import com.sparta.homework.entity.HomeWork;
import com.sparta.homework.repository.HomeWorkRepository;
import com.sparta.homework.service.HomeWorkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class HomeWorkController {

    private final HomeWorkRepository homeWorkRepository;
    private  final HomeWorkService homeWorkService;

    @GetMapping("/api/homework")
    public List<HomeWork> getHomeWork() {
        return homeWorkService.getpost();
    }

    @PostMapping("/api/homework")
    public Long homeWorkmemo(@RequestBody HomeWorkRequestDto requestDto) {
        return homeWorkService.post(requestDto);
    }
    @DeleteMapping("/api/homework/{id}")
    public Long deleteMemo(@PathVariable Long id) {
        homeWorkService.delete(id);
        return id;
    }
    @PutMapping("/api/homework/{id}")
    public Long updateMemo(@PathVariable Long id, @RequestBody HomeWorkRequestDto requestDto) {
        homeWorkService.update(id, requestDto);
        return id;
    }

    @GetMapping("/api/homework/{id}")
    public HomeWork getone(@PathVariable Long id) {
        return homeWorkService.getone(id);
    }
    @PostMapping("/api/homework/{id}")
    public boolean check(@PathVariable Long id, @RequestBody HomeWorkRequestDto requestDto) {
        return homeWorkService.check(id, requestDto);
    }
}