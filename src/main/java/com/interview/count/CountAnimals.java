package main.java.com.interview.count;


public class CountAnimals
{

	public static void main(String[] args) {

		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolhpin(),
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
		};
		int flyCount = 0;
		int swimCount = 0;
		int walkCount = 0;
		int singCount = 0;


		for(int i = 0 ; i< animals.length; i++){
			if(animals[i].fly()){
				flyCount++;
			}
			if(animals[i].sing()){
				singCount++;
			}
			if(animals[i].walk()){
				walkCount++;
			}
			if(animals[i].swim()){
				swimCount++;
			}
		}
		System.out.println("Fly count:"+flyCount);
		System.out.println("Sing count:"+singCount);
		System.out.println("Walk count:"+walkCount);
		System.out.println("Swim count:"+swimCount);

	}



}
