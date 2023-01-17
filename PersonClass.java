//This is for Programming Challenge 7 in chapter 10 
//Demostrates inheritance
//Rachael Blank

import java.util.*;

public class PersonClass {

   private String name, address, telephone;
   
   public Person () {}
   
   public Person(String name, String address, String telephone) {
      this.name = name;
      this.address = address;
      this.telephone = telephone;
   }
   //setters and getters
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public String getTelephone() {
      return telephone;
   }
   public void setTelephone(String telephone) {
      this.telephone = telephone;
   }

}