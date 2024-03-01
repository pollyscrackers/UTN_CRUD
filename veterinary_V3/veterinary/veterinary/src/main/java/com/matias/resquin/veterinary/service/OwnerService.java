package com.matias.resquin.veterinary.service;

import com.matias.resquin.veterinary.entity.Owner;
import com.matias.resquin.veterinary.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    public Owner createOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    public Owner updateOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    public void deleteOwnerById(Long id) {
        ownerRepository.deleteById(id);
    }

}
