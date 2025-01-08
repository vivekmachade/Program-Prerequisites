import java.util.Scanner;
class PerimeterRectangle{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("what is length :");
int length = scanner.nextInt();

System.out.print("what is Width :");
int width = scanner.nextInt();

int Perimeter = 2*(length +width);

System.out.println("simple interest is :"+ Perimeter);
}
}