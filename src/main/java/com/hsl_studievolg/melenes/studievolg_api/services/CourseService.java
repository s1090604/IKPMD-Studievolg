package com.hsl_studievolg.melenes.studievolg_api.services;

import com.hsl_studievolg.melenes.studievolg_api.models.Course;
import com.hsl_studievolg.melenes.studievolg_api.repositories.CourseRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Lorenzo Jokhan on 24/05/2018.
 */
@Service
public class CourseService {

  @Autowired
  private CourseRepository repository;

  public void createCourse(Course course) {
    repository.save(course);
  }

  public void setCoursePassing(long id) throws NotFoundException{
    Optional<Course> courseFounded = repository.findById(id);
    Course foundCourse = courseFounded.orElseThrow(NotFoundException::new);
    foundCourse.setPassed();
    repository.save(foundCourse);
  }

  public List<Course> getAllCourses() {
    return repository.findAll();
  }
}
