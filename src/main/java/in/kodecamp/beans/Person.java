package in.kodecamp.beans;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

public class Person {
  
  @NotEmpty(message = "Id is required.")
  private String id;
  
  @NotEmpty(message="Name is required.")
  private String name;
  
  @Valid
  private Address address;

  public Person(String id, String name, Address address) {
    System.out.println("Constructor : Person");
    this.id = id;
    this.name = name;
    this.address = address;
  }
  
  @Override
  public String toString() {
    return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
  }
}
