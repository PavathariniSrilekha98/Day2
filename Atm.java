import java.util.Scanner;
class Atm{
    public static void main(String agrs[]){
        Scanner pava =new Scanner(System.in);
        int choice=pava.nextInt();
        switch(choice)
        {
          case 1:
          System.out.println("with draw");
          break;
          case 2:
          System.out.println("deposit");
          break;
          case 3:
          System.out.println("balance check");
          break;
          case 4:
          System.out.println("thank you for your transaction");
          break;
          default:
            System.out.println("please enter choice correctly");
         }
    }
}