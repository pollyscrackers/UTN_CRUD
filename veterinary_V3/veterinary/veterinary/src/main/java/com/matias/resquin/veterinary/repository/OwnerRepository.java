package com.matias.resquin.veterinary.repository;

import com.matias.resquin.veterinary.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
