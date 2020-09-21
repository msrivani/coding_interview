package main.java.com.interview.behavior;

public class Butterfly extends Animal implements FlyingBehavior
{
  Butterfly(String name){
    super(name);
  }

  @Override
  public void fly()
  {
    System.out.println( "A main.java.com.test.behavior.Butterfly can fly" );
  }

  @Override
  public void display()
  {
    System.out.println( this.getName() );
  }
}
