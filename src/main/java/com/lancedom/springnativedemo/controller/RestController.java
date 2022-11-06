package com.lancedom.springnativedemo.controller;

import com.lancedom.springnativedemo.domain.Owner;
import com.lancedom.springnativedemo.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("v1/petclinic")
public class RestController {

    @Autowired
    OwnerRepository ownerRepository;

    @GetMapping(value = "/{firstName}")
    public Owner getOwner(@PathVariable("firstName") String firstName){
        return ownerRepository.findByFirstName(firstName);
    }
}
