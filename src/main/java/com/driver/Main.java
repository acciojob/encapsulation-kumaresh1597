package com.driver;

public class Main {
    // Task 2
    public static void main(String[] args) {
//        Task 3
        RWOnly obj = new RWOnly();
//       Task - 4
//        obj.name = "kumar";
//        System.out.println(obj.name);

//        java: name has private access in com.driver.RWOnly
//         the above two lines of code throws error, because name in RWOnly class is privavte
//         private member cannot be accessed directly through obj

//        Task 6
//        setting a value to name in Main function using setter function
//        and access it's value using getter function
          obj.setName("Akash");
          String name = obj.getName();

          System.out.println(name);
          // OUTPUT
//        classpath C:\Users\HANIFA\IdeaProjects\encapsulation-kumaresh1597\target\classes com.driver.Main
//                Akash
    }
}