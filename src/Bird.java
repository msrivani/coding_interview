public class Bird extends Animal implements SingBehavior
{
  Bird(String name){
    super(name);
  }
  @Override
  public void sing()
  {
    System.out.println("Bird is Singing");
  }

  @Override
  public void display()
  {
    System.out.println( this.getName() );
  }
}
