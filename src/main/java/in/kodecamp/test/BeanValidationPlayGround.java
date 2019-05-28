package in.kodecamp.test;

import java.util.Set;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import in.kodecamp.beans.Person;
import in.kodecamp.client.BeanClient;

public class BeanValidationPlayGround {

  public static void main(String[] args) {
    test1();
  }

  private static void test1() {
    System.out.println("******************** Test 1 ********************");
    try (SeContainer container = SeContainerInitializer.newInstance()
        .initialize()) {

      BeanClient client = container.select(BeanClient.class).get();

      System.out.println("Service Instance 1 : " + client);
      System.out.println(" ****************************** ");

      Person bean = client.getPerson();
      System.out.println("client.getPerson() : " + bean);

      ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
      Validator validator = factory.getValidator();

      Set<ConstraintViolation<Person>> violations = validator.validate(bean);
      final String msg = violations.size() == 0 ? processBean(bean)
          : processErrors(violations);
      
      System.err.println(msg);

    }
  }

  private static String processBean(Person person) {
    return "Bean Processed Successfully.";
  }

  private static String processErrors(
      Set<ConstraintViolation<Person>> voilations) {

    voilations
        .forEach((violation) -> System.out.println(violation.getMessage()));
    return "\n Bean Validation Failed";
  }
}
