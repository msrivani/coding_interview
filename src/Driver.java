public class Driver
{
  public static void main(String args[]){
    /*  //create a bird
    Bird bird = new Bird("bird");
    bird.display();
    //test singing behavior
    bird.sing();*/

    //step 2 -- create 2 special types of birds: duck and chicken // since changed Bird to abstract, the above steps wont work
    Chicken chicken = new Chicken( "chicken" );
    Duck duck = new Duck("duck");
    duck.display();
    duck.performSinging();
    duck.swim();
    chicken.display();
    chicken.performSinging();
    chicken.fly();


  }
}
