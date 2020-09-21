public class Chicken extends Bird implements FlyingBehavior
{
  Chicken(String name){
    super(name);
    setSingBehavior( new SingCluck() );
  }

  @Override
  public void fly()
  {
    System.out.println("I can fly");
  }
}
