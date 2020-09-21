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
    System.out.println("Clownfish are small and colourful (orange). Clownfish make jokes");
  }
}
