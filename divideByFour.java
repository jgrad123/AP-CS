import java.util.Scanner;

class divideByFour {
  public static void main(String[] args){
    double userNumber = 0, piCalculation = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("How many digits do you want pi to be calculated too?");
    userNumber = sc.nextDouble();
    for( double piCounter = 1; piCounter < userNumber; piCounter += 2){
      piCalculation = 1 - 1.0/piCounter + 1.0/(piCounter + 2);
    }
    System.out.println(piCalculation);
  }
}
