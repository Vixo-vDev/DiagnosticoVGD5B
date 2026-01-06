import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        int numero, suma = 0;


        while(true){
            System.out.println("");
            System.out.println("Ingresa un número: ");
            numero = read.nextInt();
            numeros.add(numero);
            if(numero == 0){
                break;
            }


            for(int i = 0; i < numeros.size(); i++){
                System.out.print(numeros.get(i) +",");
            }

            suma += numero;

        }

        System.out.println("El resultado de la sumatoria es: "+ suma);
    }
}