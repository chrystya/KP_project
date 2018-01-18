package training;
public class Puppy extends Animal {
int puppyAge;

    public Puppy (String name){
        System.out.println("Name chosen is:"+ name);
            }

    public int getPuppyAge() {
        System.out.println("Puppy's age is :" + puppyAge );
              return puppyAge;
    }
    public void setPuppyAge(int puppyAge) {
        this.puppyAge = puppyAge;
    }

    @Override
    public void PrintAnimal(){
        //super.PrintAnimal();
        System.out.println(name + " doing usually " + voice);
    }

    public static void main(String []args) {

        Puppy mypuppy = new Puppy("tommy");
        mypuppy.setPuppyAge(3);
        mypuppy.getPuppyAge();


        System.out.println("Variable value: "+mypuppy.puppyAge );


        mypuppy.setName("tommy");
        mypuppy.setVoice("Wooh");
        mypuppy.PrintAnimal();

    }
}


