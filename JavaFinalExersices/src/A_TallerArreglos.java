import java.util.Scanner;

public class A_TallerArreglos {

    public static void punto1(Scanner sc){
        //1. Leer 10 enteros, almacenarlos en un vector y determinar en qué posición del vector está el
        //mayor número leído

        int[] array = new int[10];
        int j = 0;
        
        /*for (int i = 0; i < array.length; i++){

            System.out.println(array[i]);
        }*/

        for (int i = 0; i < array.length; i++){

            System.out.println("introduce el primer dígito");
            int first = sc.nextInt();

            array[i] = first ;
        }
        int mayor = array[0];

        for (int i = 0; i < array.length; i++){
            if( array[i] > mayor){
                mayor = array[i];
                j = i;
            }
        }
        System.out.println("esta en la posición");
        System.out.println(j + 1);

    }

    public static void punto2(Scanner sc){
        //2. Leer 10 enteros, almacenarlos en un vector y determinar en qué posición del vector está el
        //mayor número par leído.

        int[] array = new int[5];
        int j = 0;

        /*for (int i = 0; i < array.length; i++){

            System.out.println(array[i]);
        }*/

        for (int i = 0; i < array.length; i++){

            System.out.println("introduce el primer dígito");
            int first = sc.nextInt();

            array[i] = first ;
        }
        int mayor = array[0];

        for (int i = 0; i < array.length; i++){
            if( array[i] > mayor && array[i] % 2 == 0){
                mayor = array[i];
                j = i;
            }
        }
        System.out.println(j + 1);

    }
}