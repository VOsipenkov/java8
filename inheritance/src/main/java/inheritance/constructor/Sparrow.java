package inheritance.constructor;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Sparrow extends Bird{
  public Sparrow(){
      System.out.println("Sparrow()");
  }
  
  public Sparrow(int age){
      super(age);
      System.out.println("Sparrow(int age)");
  }
}
