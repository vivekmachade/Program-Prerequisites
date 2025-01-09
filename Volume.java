import java.util.Scanner;
class Volume{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.println("What is radius of circle :");

double pie = 3.141;
double radius = scanner.nextDouble();

System.out.print("what is your height");
double height=scanner.nextDouble();
double volume = pie * radius*radius*height;

System.out.println("volume of cylinder : "+volume);
}
}
