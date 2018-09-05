import java.util.Scanner;

public class Triangulo 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int ladoA, ladoB, ladoC;

        System.out.print("Insira o primeiro lado ");
        ladoA = input.nextInt();

        System.out.print("Insira o segundo lado");
        ladoB = input.nextInt();

        System.out.print("Insira o terceiro lado");
        ladoC = input.nextInt();

        if(ladoA == ladoB && ladoA == ladoC) 
        {
            System.out.printf("tri\u00e2ngulo \u00e2 equil\u00e1tero");
        }
            
        if((ladoA == ladoB && ladoA != ladoC) || (ladoA != ladoB && ladoA == ladoC))
            System.out.printf("tri\u00e2ngulo \u00e2 is\u00ef3celes");
        if(ladoA != ladoB && ladoA != ladoC)
            System.out.printf("tri\u00e2ngulo \u00e2 escaleno");
        
    }
        
}


