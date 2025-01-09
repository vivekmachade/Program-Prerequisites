import java.util.Scanner;
class SimpleInterest{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("what is principal :");
int principal = scanner.nextInt();

System.out.print("what is Rate :");
int rate = scanner.nextInt();

System.out.print("what is time :");
int time = scanner.nextInt();

double SI = (principal*rate*time)/100;

System.out.println("simple interest is :"+SI);
}
}
