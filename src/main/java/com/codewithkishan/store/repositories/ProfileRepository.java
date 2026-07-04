package com.codewithkishan.store.repositories;

import com.codewithkishan.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}