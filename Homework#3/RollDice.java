 import java.util.Scanner;

class RollDice {
     
 public static void Main (String[]args) {
Scanner scan = new Scanner(System.in);
int total = 0;
String answer = "y";
System.out.println("would you like to play the game?");
answer = scan.next();

      while (answer.equals("y")) {
     answer = scan.nextLine(); 
     
     System.out.println("How Many Dice Would You Like to Roll?");
     int rolls = scan.nextInt();
      System.out.println("How many sides do you want on your dice?");
      int sides = scan.nextInt();
     System.out.print("You Got: ");
     
    Roller(rolls, sides);
    
    total = 0;
}
 System.out.println("would you like to play again? [y or n]");
 answer = scan.next();
}

public static void Roller(int rolls, int sides) {
    int total = 0;
         for (int i = 0; i < rolls; i++) {
         
     int roll = (int) (Math.random()*sides) + 1;
     
     System.out.print(roll + " ");
     total = total + roll;
     
    }
    System.out.println("your total is:" + total);
}


}