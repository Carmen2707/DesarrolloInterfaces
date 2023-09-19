import java.util.Scanner;

public class NumerosPrimos {
    public static boolean Primo(int numero){
        if (numero <= 1){
            return false;
        }for(int i=2;i <= Math.sqrt(numero);i++){
            if(numero % i == 0){
                return false;
            }

            }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BUSCADOR DE PRIMOS");
        System.out.println("==================");

        while(true){
            System.out.println("Escriba el numero inicial (0 para salir)");
            int numInicial = sc.nextInt();
            if(numInicial==0){
                break;
            }

            System.out.println("Escriba el numero final:");
            int numFinal = sc.nextInt();
            int contador = 0;
            System.out.println("Buscando primos...");
            for (int x = numInicial; x <= numFinal; x++) {
                if (Primo(x) == true) {
                    contador++;
                    System.out.println(x);
                }

            }

            System.out.println("Se han encontrado " + contador + " numeros primos en el intervalo");
        }
    }

}