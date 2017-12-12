package training;
public class Puppy {
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

    public static void main(String []args) {

        Puppy mypuppy = new Puppy("tommy");
        mypuppy.setPuppyAge(3);
        mypuppy.getPuppyAge();

        System.out.println("Variable value: "+mypuppy.puppyAge );
    }
}


