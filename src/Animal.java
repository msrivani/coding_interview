public abstract class Animal
{
  /* Every Animal has a name. This is the only common thing.

   */
  public String getName()
  {
    return name;
  }

  private String name;
  Animal(){
  }
  Animal(String name){
    this.name = name;
  }
  public abstract void display();
}
