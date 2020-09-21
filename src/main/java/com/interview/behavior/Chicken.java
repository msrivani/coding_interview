package main.java.com.interview.behavior;

public class Chicken extends Bird
{
  Chicken(String name){
    super(name);
    setSingBehavior( new SingCluck() );
  }

}
