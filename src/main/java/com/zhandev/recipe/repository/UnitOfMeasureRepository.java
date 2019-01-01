package com.zhandev.recipe.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.zhandev.recipe.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

	Optional<UnitOfMeasure> findByDescription(String description);
}
