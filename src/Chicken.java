public class Chicken extends Bird
{
  Chicken(String name){
    super(name);
    setSingBehavior( new SingCluck() );
  }

}
