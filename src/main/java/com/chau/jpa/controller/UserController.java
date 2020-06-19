package com.chau.jpa.controller;

import com.chau.jpa.domain.Car;
import com.chau.jpa.repository.CarRepository;
import com.chau.jpa.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Chau
 * @date 2020/6/19
 * @func
 */
@RestController
public class UserController {
    @Resource
    private CarRepository carRepository;
    @Resource
    private UserRepository userRepository;

    @RequestMapping("/mainInfo")
    public ResponseEntity<?> mainInfo() {
        List<Car> all = carRepository.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }

}
