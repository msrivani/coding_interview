package main.java.com.interview.behavior;

public class Clownfish extends Fish
{
  Clownfish( String name )
  {
    super( name );
  }

  @Override
  public void display()
  {
    super.display();
    System.out.println("main.java.com.test.behavior.Clownfish are small and colourful (orange). main.java.com.test.behavior.Clownfish make jokes");
  }
}
