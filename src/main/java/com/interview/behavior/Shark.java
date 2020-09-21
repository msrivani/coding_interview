package main.java.com.interview.behavior;

public class Shark extends Fish
{
  Shark(String name){
    super(name);
  }

  @Override
  public void display()
  {
    super.display();
    System.out.println("Sharks are large and grey. Sharks eat other fish");
  }
}
