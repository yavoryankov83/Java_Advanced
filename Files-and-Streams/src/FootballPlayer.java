import java.io.Serializable;

public class FootballPlayer implements Serializable {
  private String name;
  private int age;
  private String team;
  private double sallary;

  public FootballPlayer(String name, int age, String team, double sallary) {
    this.name = name;
    this.age = age;
    this.team = team;
    this.sallary = sallary;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getTeam() {
    return team;
  }

  public double getSallary() {
    return sallary;
  }

  @Override
  public String toString() {
    return String.format("%s %d %s %.2f", this.name, this.age, this.team, this.sallary);
  }
}
