import java.util.Scanner;

  class isbn{
    public static void main(String[] args){
        String isbnNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ISBN #");
        isbnNumber = sc.nextLine();
        String x = isbnNumber.substring(9);
        int d1 = Integer.parseInt(isbnNumber.substring(0,1));
        int d2 = Integer.parseInt(isbnNumber.substring(1,2));
        int d3 = Integer.parseInt(isbnNumber.substring(2,3));
        int d4 = Integer.parseInt(isbnNumber.substring(3,4));
        int d5 = Integer.parseInt(isbnNumber.substring(4,5));
        int d6 = Integer.parseInt(isbnNumber.substring(5,6));
        int d7 = Integer.parseInt(isbnNumber.substring(6,7));
        int d8 = Integer.parseInt(isbnNumber.substring(7,8));
        int d9 = Integer.parseInt(isbnNumber.substring(8,9));
        int d10;
        if(x.equals("x")){
          d10 = 10;
        }
        else{
          d10 = Integer.parseInt(x);
        }
        if(d10 == (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9) % 11){
          System.out.println("You entered a valid ISBN #");
        }
        else{
          System.out.println("You entered an invalid ISBN #");
        }


    }
  }
