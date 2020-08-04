package greenFoxOrganization;

public class Mentor extends Person {

  private MentorLevel level;

  public Mentor(String name, int age, String gender, MentorLevel level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super("Jane Doe", 30, "female");
    this.level = MentorLevel.INTERMEDIATE;
  }

    @Override
    public void getGoal () {
      System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
      System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() +
          " year old " + this.getGender() + " " + this.level + " mentor.");
    }
  }

