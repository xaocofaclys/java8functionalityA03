


interface abc {
    Person create(String name, int age);
  }
  
  class Person {
    private String name;
    private int age;
  
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    public String getName() {
      return name;
    }
  
    public int getAge() {
      return age;
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      abc factory = Person::new;
      Person person = factory.create("Shubham kumar", 20);
      System.out.println("Name: " + person.getName());
      System.out.println("Age: " + person.getAge());
    }
  }
  