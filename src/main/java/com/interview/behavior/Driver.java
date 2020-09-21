package main.java.com.interview.behavior;

public class Driver
{
  public static void main(String args[]){
    /*  //create a bird
    main.java.com.test.behavior.Bird bird = new main.java.com.test.behavior.Bird("bird");
    bird.display();
    //test singing behavior
    bird.sing();*/

    //step 2 -- create 2 special types of birds: duck and chicken // since changed main.java.com.test.behavior.Bird to abstract, the above steps wont work
    Chicken chicken = new Chicken( "chicken" );
    Duck duck = new Duck("duck");
    duck.display();
    duck.performSinging();
    duck.swim();
    chicken.display();
    chicken.performSinging();

    //step 3: would you model a rooster
    Rooster rooster = new Rooster( "rooster" );
    rooster.display();
    rooster.performSinging();
    //another way of modelling a rooster is changing the SingingBehavior of chicken to main.java.com.test.behavior.SingCock type.
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

    //B1. model fishes that can swim , dont sing, dont walk
    Fish fish = new Fish("fish");
    fish.display();
    fish.swim();
    //B2.Can you specialize the fish as a main.java.com.test.behavior.Shark and as a main.java.com.test.behavior.Clownfish?
    Shark shark = new Shark( "shark" );
    Clownfish clownFish = new Clownfish( "clown fish" );
    shark.display();
    shark.swim();
    clownFish.display();
    clownFish.swim();
    //B3 Dolphins are not exactly fish, yet, they are good swimmers
    Dolphin dolphin = new Dolphin( "dolphin" );
    dolphin.display();
    dolphin.swim();
    //D. Model animals that change their behaviour over time
    //D1. Can you model a butterfly

    Caterpillar cater_pillar = new Caterpillar( "cater pillar" );
    cater_pillar.display();
    cater_pillar.walk();


    Butterfly butterfly = new Butterfly( "butterfly" );
    butterfly.display();
    butterfly.fly();


  }
}
