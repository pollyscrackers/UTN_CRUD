package com.matias.resquin.veterinary.controller;

import com.matias.resquin.veterinary.entity.Owner;
import com.matias.resquin.veterinary.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping
    public List<Owner> ownerList() {
        return ownerService.getAllOwners();
    }

    @PostMapping
    public Owner create(@RequestBody Owner owner) {
        return ownerService.createOwner(owner);
    }

    @PostMapping("/update/owner/{id}")
    public Owner update(@RequestBody Owner owner, @PathVariable Long id) {
        owner.setIdOwner(id);
        return ownerService.updateOwner(owner);
    }

    @DeleteMapping("/delete/owner/{id}")
    public void delete(@PathVariable Long id) {
        ownerService.deleteOwnerById(id);
    }
}
