package com.cibertec.fabric.repository;


import com.cibertec.fabric.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
