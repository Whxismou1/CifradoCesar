import java.util.Scanner;

public class MainCesar {
    public static void main(String[] args) {
        CifradoCesar cesar = new CifradoCesar();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena a encriptar: ");
        String frase = sc.next();
        
        String codificado = cesar.encriptar(frase);
        String descodificado = cesar.desencriptar(codificado);

        System.out.println("Tu texto codificado es: " + codificado);
        System.out.println("Tu texto decodificado es: " + descodificado);
    }
}
