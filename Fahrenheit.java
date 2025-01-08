import java.util.Scanner;
class Fahrenheit{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("what is temperature in :");

double Celsius = scanner.nextInt();
double fahrenheit =(Celsius * 9/5)+32;

System.out.println("temperature in fahrenheit :"+ fahrenheit);
}
}
