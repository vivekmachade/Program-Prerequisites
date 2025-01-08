import java.util.Scanner;
class Power{
public static void main  (String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("what is base number :");
int base = scanner.nextInt();

System.out.print("what is exponent number :");
int exponet = scanner.nextInt();

double power = Math.pow(base,exponet);
System.out.println("power of number is : "+ power);
}}