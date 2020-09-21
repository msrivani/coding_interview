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

    //step 3: would you model a rooster
    Rooster rooster = new Rooster( "rooster" );
    rooster.display();
    rooster.performSinging();
    //another way of modelling a rooster is changing the SingingBehavior of chicken to SingCock type.
    chicken.setSingBehavior( new SingCock() );
    chicken.performSinging();
    //model a parrot
    //“Cock-a-doodle-doo”
    Parrot parrot = new Parrot( "parrot" );
    parrot.display();

    //A parrot living with dogs says: “Woof, woof”
    parrot.setSingBehavior( new SingWoof() );
    parrot.performSinging();
    //A parrot living with cats says: “Meow”
    parrot.setSingBehavior( new SingMeow() );
    parrot.performSinging();
    //A parrot living near the rooster says: “Cock-a-doodle-doo”
    parrot.setSingBehavior( new SingCock() );
    parrot.performSinging();

    //B model fishes that can swim , dont sing, dont walk
    Fish fish = new Fish("fish");
    fish.display();
    fish.swim();

  }
}
