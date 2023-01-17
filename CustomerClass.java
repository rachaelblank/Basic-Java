//This is for Programming Challenge 7 in chapter 10 
//Demostrates inheritance
//Rachael Blank

import java.util.*;

public class CustomerClass extends PersonClass {

   private String number;
   private boolean mailingList;
   
   public Customer(String name, String address, String telephone, String number, boolean mailingList) {
      super(name, address, telephone);
      
      this.number = number;
      this.mailingList = mailingList;
   }
   
   //getters and setters
   
   public String getNumber() {
      return number;
   }
   public void setNumber(String number) {
      this.number = number;
   }
   public boolean mailingList() {
      return mailingList;
   }
   public void setMailingList(String mailingList) {
      this.mailingList = mailingList;
   }
}