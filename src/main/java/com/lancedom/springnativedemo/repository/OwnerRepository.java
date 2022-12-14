package com.lancedom.springnativedemo.repository;

import com.lancedom.springnativedemo.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {
    Owner findByFirstName(String firstName);
}
