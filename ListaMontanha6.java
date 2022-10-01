import java.util.Scanner;


public class ListaMontanha6 {

    
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double pi, raio, area;
        System.out.println("Digite o raio de um circulo");
        raio = leia.nextDouble();
        pi = 3.14159;
                area = pi * (raio * raio);
                System.out.println("A area do circulo e: " + area);
        
    }
    
}