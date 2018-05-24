package com.hsl_studievolg.melenes.studievolg_api.controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hsl_studievolg.melenes.studievolg_api.repositories.CourseRepository;
import com.hsl_studievolg.melenes.studievolg_api.models.Course;
import com.hsl_studievolg.melenes.studievolg_api.services.CourseService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lorenzo Jokhan on 24/05/2018.
 */
@RestController
public class Controller {

  @Autowired
  private CourseService service;

  @PostMapping
  public void create(@RequestBody Course course) {
    service.createCourse(course);
  }

  @PostMapping("/set-passed")
  public void setPassing(long id) throws NotFoundException {
    service.setCoursePassing(id);
  }

  @GetMapping("/courses")
  public List<Course> getAllCourses() {
    return service.getAllCourses();
  }

}
