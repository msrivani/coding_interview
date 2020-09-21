package main.java.com.interview.behavior;

public class Dolphin extends Animal implements SwimmingBehavior
{
  Dolphin(String name){
    super(name);
  }

  @Override
  public void swim()
  {
    System.out.println( "Dolphins are not fishes , but they are good swimmers" );
  }

  @Override
  public void display()
  {
    System.out.println(getName());
  }
}
