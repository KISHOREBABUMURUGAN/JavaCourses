package oops;



 class User {
    int roll;
    String name;

    public User(int r, String n) {
        this.roll = r;
        this.name = n;
    }
}

	

 class MainProgrammer extends User {
    String company;

    public MainProgrammer(int r, String n, String c) {
        super(r, n);
        this.company = c;
    }

    public void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
    }
}
	

public class MethodOverriding {
    public static void main(String[] args) {
        MainProgrammer o = new MainProgrammer(2, "Kishore", "Capgemini");
        o.display();
    }
}
