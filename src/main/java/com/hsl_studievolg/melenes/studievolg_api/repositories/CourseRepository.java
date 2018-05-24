package com.hsl_studievolg.melenes.studievolg_api.repositories;

import com.hsl_studievolg.melenes.studievolg_api.models.Course;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Lorenzo Jokhan on 24/05/2018.
 */
@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

  @Override
  List<Course> findAll();
}
