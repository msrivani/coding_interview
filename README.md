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
