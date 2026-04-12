import java.util.Scanner;
public class Java01_InputTutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");   
        sc.close();


    


        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.println("Hello, " + name + "!");
        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();
        // System.out.println("You are " + age + " years old.");
        // sc.close();
    }
    
}
