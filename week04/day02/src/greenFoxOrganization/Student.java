package greenFoxOrganization;

public class Student extends Person implements Cloneable{

  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, name);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() +
        " year old " + this.getGender() + " from " + this.previousOrganization +
        " who skipped " + this.skippedDays + " days from course already.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    Student copy = new Student(this.getName(), this.getAge(), this.getGender(), this.previousOrganization);
    return copy;
  }
}
