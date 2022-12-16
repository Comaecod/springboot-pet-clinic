package com.comaecod.petclinic.services;

import com.comaecod.petclinic.models.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
