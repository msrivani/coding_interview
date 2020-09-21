#1st commit - adding sing method to Bird class.
Since every animal cannot sing, modelling the sing() method inside an interface.Every Animal has a name. SO considering name of the animal as the common behavior.
So, Bird class extends Animal class and Implements Singing Behavior.
#2nd Commit - Adding 2 special kinds of birds - Duck and Chicken to make their own special sounds
Here Duck can sing and swim whereas chicken can sing and fly. Singing is common to both the birds. SO making sing() method abstract in Bird class. So making Bird as Abstract class. There are 2 different types of sing behavior. So implementing concrete classes with quack and cluck singing behaviors respectively.Flying and Swimming are specific to the type of the bird. So Duck implements swimmingBehavior and chicken implements flying behavior.


#3 -commit - Now how would you model a rooster
Here there are 2 ways to model a rooster which sings “Cock-a-doodle-doo”

1. By extending Bird class
Can you think of other ways to model a rooster without using inheritance?
2. By setting the singBehavior of chick to "cock-a-doodle-doo”
How is the rooster related to the chicken?
Its just another bird with a different singinBehavior

Here I created a new concrete ckass with “Cock-a-doodle-doo” singing behavior for rooster.

#4- commit
A parrot living with dogs says: “Woof, woof”
b. A parrot living with cats says: “Meow”
c. A parrot living near the rooster says: “Cock-a-doodle-doo”
d. How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently?
All these are achieved by creating a new Parrot class which extends bird class. The singing behavior can be modified by setting the singing sound.

#5 - commit B1. In addition to the birds, can you model a fish?
a. Fishes don’t sing
b. Fishes don’t walk
c. Fishes can swim
Create a new fish class which extends Bird class and Implements swimming interface

#6 - commit B2. Can you specialize the fish as a Shark and as a Clownfish?
Created 2 new classes SHark and CLownFish extended from Fish. The display methods of these 2 classes are overridden to show their specific features.

#7- commit B.3. Dolphins are not exactly fish, yet, they are good swimmers
a. Can you model a dolphin that swims without inheriting from a fish class?
b. How do you avoid duplicating code or introducing unneeded overhead?

Achieved this by creating a Dolphin class by extending Animal class and implementing Swimming Behavior. This waty, dolphins are not a child of Fish class but they are animals which have swimming behavior