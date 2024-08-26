package com.backend.backend.repository;

import com.backend.backend.model.WorkoutModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface workoutRepository extends JpaRepository<WorkoutModel,Long> {

}

