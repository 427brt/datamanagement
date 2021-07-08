import java.util.Random;

class Dice{
  public static void main(String args[]){
    Random rand = new Random();
    System.out.println("What is your name?");
    Scanner sc1 = new Scanner(System.in);
    String name = sc1.nextLine();
    System.out.println("Hello, " + name);
    int num = rand.nextInt(5) + 1;
    int num2 = rand.nextInt(5) + 1;
    System.out.println("Rolling the dice...");
    System.out.println("Dice 1: " + num);
    System.out.println("Dice 2: " + num2);
    System.out.println("Total value:" + (num + num2));
    if((num + num2)>7){
      System.out.println("You won");
    }else{
      System.out.println("You lost");
    }
  }
}