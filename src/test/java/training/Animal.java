package training;

public class Animal  {

    String voice;
    String name;

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getVoice() {
        return voice;
    }

    public String getName() {
        return name;
    }

    public void PrintAnimal(){
        System.out.println(name + " doing " + voice);
    }

    public static void main(String []args) {

        Animal animal1 = new Animal();
        animal1.setName("Lion");
        animal1.setVoice("roarr");
        animal1.PrintAnimal();



    }
}


