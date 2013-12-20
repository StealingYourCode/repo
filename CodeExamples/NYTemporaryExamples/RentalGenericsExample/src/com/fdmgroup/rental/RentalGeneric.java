package com.fdmgroup.rental;

import java.util.*;
public class RentalGeneric<T> {  // "T" is for the type
                                 // parameter
   private List<T> rentalPool;   // Use the class type for the
                                 // List type
   private int maxNum;
  
   public RentalGeneric(
     int maxNum, List<T> rentalPool) { // constructor takes a
                                       // List of the class type
     this.maxNum = maxNum;
     this.rentalPool = rentalPool;
   }
   
   public T getRental() {                    // we rent out a T
     // blocks until there's something available
     return rentalPool.get(0);
   }
   
   public void returnRental(T returnedThing) { // and the renter
                                               // returns a T
     rentalPool.add(returnedThing);
   }
}
