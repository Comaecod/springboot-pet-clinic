package com.comaecod.petclinic.services;

import com.comaecod.petclinic.models.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
