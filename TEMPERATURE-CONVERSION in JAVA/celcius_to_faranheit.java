import java.util.Scanner;

/**
 * celcius_to_faranheit
 */
public class celcius_to_faranheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number into celcius : ");
        float tempC = sc.nextFloat();
        float tempF = (tempC * 9/5)+32;
        System.out.println("the temperature in faranheit is  "+ tempF);
    }
}