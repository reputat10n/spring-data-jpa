package com.chau.jpa.repository;

import com.chau.jpa.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author Chau
 * @date 2020/6/19
 * @func
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Integer>, JpaSpecificationExecutor {
}
