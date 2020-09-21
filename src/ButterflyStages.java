public class ButterflyStages extends Animal
{
  ButterflyStages(String name){
    super(name);
  }


  @Override
  public void display()
  {
    System.out.println( this.getName() );
  }
}
