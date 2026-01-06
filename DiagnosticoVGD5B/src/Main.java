import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int numero, suma = 0;


        while(true){
            System.out.println("Ingresa un número: ");
            numero = read.nextInt();
            if(numero == 0){
                break;
            }

            System.out.println("Se ha ingresado el número: "+ numero);
            suma = suma + numero;

        }

        System.out.println("El resultado de la sumatoria es: "+ suma);
    }
}