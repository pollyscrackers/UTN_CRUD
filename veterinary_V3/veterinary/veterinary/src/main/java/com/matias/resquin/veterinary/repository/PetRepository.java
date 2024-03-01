package com.matias.resquin.veterinary.repository;

import com.matias.resquin.veterinary.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
