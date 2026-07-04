package com.codewithkishan.store.repositories;

import com.codewithkishan.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}