package hello;
import java.time.LocalDate;

public class Hello {
    public static void main(String[] args) {
      Greeter greeter = new Greeter();
      LocalDate date = LocalDate.now();
      System.out.println("Date: - " + date);
      System.out.println("The month is: "+ date.getMonth());
      System.out.println("The day of month is : - " + date.getDayOfMonth());
      System.out.println(greeter.sayHello());
    }
  }