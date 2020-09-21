package main.java.com.interview.behavior;

public class Duck extends Bird implements SwimmingBehavior
{
  Duck(String name){
    super(name);
    setSingBehavior( new SingQuack() );
  }

  @Override
  public void swim()
  {
    System.out.println("I can swim");
  }
}
