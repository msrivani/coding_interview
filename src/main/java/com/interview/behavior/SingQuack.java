package main.java.com.interview.behavior;

public class SingQuack implements SingBehavior
{
  @Override
  public void sing()
  {
    System.out.println("Quack, quack");
  }
}
