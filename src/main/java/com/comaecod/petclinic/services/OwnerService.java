package com.comaecod.petclinic.services;

import com.comaecod.petclinic.models.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByFirstName(String firstName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
