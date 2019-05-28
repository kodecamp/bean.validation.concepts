package in.kodecamp.client;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import in.kodecamp.beans.Address;
import in.kodecamp.beans.Person;

public class BeanClient {
 
  @Inject
  private Person person;

  @Produces
  public static Person createPerson() {
    return new Person("", "Sunil", createAddress());
  }

  @Produces
  public static Address createAddress() {
    return new Address("", "Lucknow", "226012");
  }
  
  public Person getPerson() {
    return this.person;
  }
}
