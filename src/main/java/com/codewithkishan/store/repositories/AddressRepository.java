package com.codewithkishan.store.repositories;

import com.codewithkishan.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}