package training;

public class RASteam {
    String position;
    int experiance;
    String location;
    String firstName;
    String lastName;

    public RASteam(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void RASposition(String RASposition) {
        position = RASposition;
    }

    public void RASexperiance(int RASexperiance) {
        experiance = RASexperiance;
    }

    public void RASlocation(String RASlocation) {
        location = RASlocation;
    }

    public void PrintTeamMembers(){
        System.out.println("Name = "+ firstName + " " + lastName);
        System.out.println("Experiance = "+ experiance);
        System.out.println("Location = "+ location);
    }

    public static void main(String[] args) {

        RASteam ras1 = new RASteam("Khrystyna", "Kindii");
        RASteam ras2 = new RASteam("Oleksa", "Kushnir");

        ras1.RASposition("scrum master");
        ras1.RASlocation("Lviv");
        ras1.RASexperiance(5);
        ras1.PrintTeamMembers();


        ras2.RASposition("Software engineer");
        ras2.RASlocation("Rivne");
        ras2.RASexperiance(4);
        ras2.PrintTeamMembers();

    }
}