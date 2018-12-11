public class Person {
  private String name;
  
  public void setName(String nameOfPerson) {
    name = nameOfPerson;
  }
  
  public String getName() {
    return name;
  }
  
  public String toString() {
    return "Person: " + name;
  }
  
  public boolean equals(Person other) {
    return this.name.equals(other.name);
  }
}