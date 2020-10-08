import java.util.Scanner;
    public class HelloWorld {
        public static void main(String[] args){
            Scanner userInput = new Scanner(System.in);
             System.out.println("What is your first name?");
             String firstName = userInput.nextLine();
             System.out.println("What is your last name?");
             String lastName = userInput.nextLine();
             System.out.printf("Hello %s %s!\n", firstName, lastName);
             System.out.printf("Goodbye %s %s!\n", firstName, lastName);
	}
}

