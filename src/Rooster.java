public class Rooster extends Bird
{
  Rooster(String name){
    super(name);
    setSingBehavior( new SingCock() );
  }
}
