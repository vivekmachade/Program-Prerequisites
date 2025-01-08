import java.util.Scanner;
class AverageThree{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("what is first number :");
int first = scanner.nextInt();

System.out.print("what is second number :");
int second = scanner.nextInt();

System.out.print("what is third number :");
int third = scanner.nextInt();

int SI = (first+second+third)/3;

System.out.println("simple interest is :"+SI);
}
}