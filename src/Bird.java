public abstract class Bird extends Animal
{
  public void setSingBehavior( SingBehavior singBehavior_ )
  {
    _singBehavior = singBehavior_;
  }

  SingBehavior _singBehavior;
  Bird(String name){
    super(name);
  }
  public void performSinging(){
    _singBehavior.sing();
  }

  @Override
  public void display()
  {
    System.out.println( this.getName() );
  }
}
