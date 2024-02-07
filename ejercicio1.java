import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int arreglo[];
        int nElementos;

        System.out.print("Digite la cantidad de elementos para su arreglo: ");
        nElementos = teclado.nextInt();
        arreglo = new int[nElementos];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Digite un elemento en la posicion " + i + ": ");
            arreglo[i] = teclado.nextInt();
        }

        int mayorElemento = arreglo[0];
        int menorElemento = arreglo[0];
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (mayorElemento < arreglo[i]) {
                mayorElemento = arreglo[i];
                posicionMayor = i;
            }
            if (menorElemento > arreglo[i]) {
                menorElemento = arreglo[i];
                posicionMenor = i;
            }
        }
        System.out.println("");
        System.out.println("El mayor elemento del arreglo es: " + mayorElemento + " y se encuentra en la posicion " + posicionMayor);
        System.out.println("El menor elemento del arreglo es: " + menorElemento + " y se encuentra en la posicion " + posicionMenor);

    }
}