package in.kodecamp.beans;

import javax.validation.constraints.NotEmpty;

public class Address {
  
  @NotEmpty(message = "House No must not be empty.")
  private String houseNo;
  
  @NotEmpty(message = "City must not be empty.")
  private String city;

  private String pinCode;

  public Address(String houseNo, String city, String pinCode) {
    
    System.out.println("Address : Constructor");
    this.houseNo = houseNo;
    this.city = city;
    this.pinCode = pinCode;
  }
  
  @Override
  public String toString() {
    return "Address [houseNo=" + houseNo + ", city=" + city + ", pinCode="
        + pinCode + "]";
  }
  
  

}
