import java.util.Random;

class Dice{
  public static void main(String args[]){
    Random rand = new Random();
    int num = rand.nextInt(5) + 1;
    int num2 = rand.nextInt(5) + 1;
    System.out.println("Rolling the dice...");
    System.out.println("Dice 1: " + num);
    System.out.println("Dice 2: " + num2);
    System.out.println("Total value:" + (num + num2));
  }
}