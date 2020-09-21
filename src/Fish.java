public class Fish extends Animal implements SwimmingBehavior
{
  Fish(String name){
    super(name);
  }
  @Override
  public void swim()
  {
    System.out.println("Fishes can Swim");
  }

  @Override
  public void display()
  {
    System.out.println( this.getName() );
  }
}
