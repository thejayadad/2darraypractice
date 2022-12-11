import java.util.Scanner;


public class Main {
public static void main(String[] arg) {
Scanner scan = new Scanner(System.in);
System.out.println("\n****Employee Data****");
System.out.println("How many employees will you register?");
int people = scan.nextInt();
String[][] database = new String[people][3];
scan.nextLine();
for(int i = 0; i < database.length; i++){
    System.out.println("Employee #:" + (i + 1));
    System.out.print(" - Name:");
    database[i][0] = scan.nextLine();
    System.out.print(" - Department:");
    database[i][1] = scan.nextLine();
    System.out.print(" - Hire Data:");
    database[i][2] = scan.nextLine();
    System.out.print("** Employee Added **");
    System.out.println("\n");
}
System.out.println("Employees in Database:");
printDb(database);
}
public static void printDb(String[][] array) {
    for(int i = 0; i < array.length; i++){
        System.out.println("\t");
        for(int j = 0; j < array[i].length; j++){
            System.out.print(array[i][j] + " ");
        }
        System.out.println("\n");
    }
}

}
