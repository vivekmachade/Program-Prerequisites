import java.util.Scanner;
class Area{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.println("What is radius of circle :");

double pie = 3.141;
double radius = scanner.nextInt();
double area = pie * radius*radius;

System.out.println("Area of circle : "+area);
}
}