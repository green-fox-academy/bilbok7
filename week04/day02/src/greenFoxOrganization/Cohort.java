package greenFoxOrganization;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
  private String cohortName;
  private List<Student> students;
  private List<Mentor> mentors;

  public Cohort(String name) {
    this.cohortName = name;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }

  public void addStudent(Student newStudent) {
    if (newStudent != null) {
      students.add(newStudent);
    }
  }

  public void addMentor(Mentor newMentor) {
    if (newMentor != null) {
      mentors.add(newMentor);
    }
  }

  public void info() {
    System.out.println("The " + cohortName + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }
}
