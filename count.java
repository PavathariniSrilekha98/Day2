import java.util.Scanner;
class count{
    public static void main(String args[]){
       Scanner pava=new Scanner(System.in);
       int a=pava.nextInt();
       int count=0;
       while(a!=0){
       a=a/10;
       count++;
    }
    System.out.println(count);
}
}