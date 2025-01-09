import java.util.Scanner;
class KiloToMiles{
public static void main(String[] args){


Scanner scanner = new Scanner(System.in);
System.out.print("write the kilometers : ");
double kilo = scanner.nextDouble();

double miles = kilo*0.621371;
System.out.println("kilometer to miles :"+miles);
}
}
