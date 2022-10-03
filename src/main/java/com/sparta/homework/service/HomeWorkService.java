package com.sparta.homework.service;

import com.sparta.homework.dto.HomeWorkRequestDto;
import com.sparta.homework.entity.HomeWork;
import com.sparta.homework.repository.HomeWorkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class HomeWorkService {
    private final HomeWorkRepository homeWorkRepository;

    @Transactional
    public Long update(Long id, HomeWorkRequestDto requestDto) {
        HomeWork homework = homeWorkRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        homework.update(requestDto);
        return homework.getId();
    }
    @Transactional
    public Long delete(Long id){
       homeWorkRepository.deleteById(id);
       return id;
    }

    @Transactional
    public Long post(HomeWorkRequestDto requestDto){
        HomeWork post= new HomeWork(requestDto);
        homeWorkRepository.save(post);
        return post.getId();
    }

    @Transactional
    public List<HomeWork> getpost(){return homeWorkRepository.findAll();}

    @Transactional
    public HomeWork getone(Long id){
        return homeWorkRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
    }

    @Transactional
    public boolean check(Long id, HomeWorkRequestDto homeWorkRequestDto){
        HomeWork homework = homeWorkRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        if(homework.getPassword().equals(homeWorkRequestDto.getPassword())){
            return true;
        }else{
            return false;
        }
    }
}