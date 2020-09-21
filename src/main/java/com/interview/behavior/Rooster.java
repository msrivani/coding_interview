package main.java.com.interview.behavior;

public class Rooster extends Bird
{
  Rooster(String name){
    super(name);
    setSingBehavior( new SingCock() );
  }
}
