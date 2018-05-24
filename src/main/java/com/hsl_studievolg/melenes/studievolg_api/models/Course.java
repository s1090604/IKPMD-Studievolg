package com.hsl_studievolg.melenes.studievolg_api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Type;

/**
 * Created by Lorenzo Jokhan on 24/05/2018.
 */
@Entity
public class Course {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private float grade;

  @Column(columnDefinition = "TINYINT(1)")
  private boolean isPassed;

  @JsonCreator
  public Course(@JsonProperty("name") String name, @JsonProperty("grade") float grade) {
    this.name = name;
    this.grade = grade;
  }

  public Course() {}

  public void setPassed() {
    isPassed = true;
  }

  public String getName() {
    return name;
  }

  public float getGrade() {
    return grade;
  }

  public boolean isPassed() {
    return isPassed;
  }

  @Override
  public String toString() {
    return "Course{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", grade=" + grade +
        ", isPassed=" + isPassed +
        '}';
  }
}
