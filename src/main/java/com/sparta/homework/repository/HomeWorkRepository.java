package com.sparta.homework.repository;

import com.sparta.homework.entity.HomeWork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeWorkRepository extends JpaRepository<HomeWork, Long> {
}