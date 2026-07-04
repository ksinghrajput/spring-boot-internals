package com.codewithkishan.store.repositories;

import com.codewithkishan.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
