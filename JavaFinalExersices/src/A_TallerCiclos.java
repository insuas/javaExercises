import java.util.Scanner;

public class A_TallerCiclos {
    public static void punto1Ciclos(Scanner sc){
        /*. Leer un número entero y mostrar todos los enteros comprendidos entre 1 y el número leído.*/

        System.out.print("Introduce  un número entero y mostrar todos los enteros comprendidos entre 1 y el número leído.");
        System.out.println("introduce el primer dígito");
        int first = sc.nextInt();


        for (int i = 1; i <= first ; i++) {
            System.out.println(i);
        }

    }

    public static void punto2Ciclos(Scanner sc){
        /*. 2. Leer un número entero y mostrar todos los pares comprendidos entre 1 y el número leído..*/

        System.out.print("Introduce  un número entero y mostrar todos los enteros comprendidos entre 1 y el número leído.");
        System.out.println("introduce el primer dígito");
        int first = sc.nextInt();

        System.out.println(1);
        for (int i = 1; i <= first ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void punto3Ciclos(Scanner sc){
        // 3. Leer un número entero y mostrar todos los divisores exactos del número comprendidos entre 1
        // y el número leído.

        System.out.print("Introduce  un número entero para mostrar todos los divisores exactos del número comprendidos entre 1\n" +
                "        // y el número leído.");
        int first = sc.nextInt();

        for (int i = 1; i <= first ; i++) {

            for (int j = i ; j <= 1; j--) {


                if (i % j == 0) {
                    System.out.println(i);
                }

            }
        }
    }

    public static void punto4Ciclos(Scanner sc){
        //4. Leer dos números y mostrar todos los enteros comprendidos entre ellos.

        System.out.print("Introduce dos números para mostrar todos los enteros comprendidos entre ellos.");
        int first = sc.nextInt();
        System.out.print("Introduce  el other número ");
        int second= sc.nextInt();

        for (int i = 1; i <= first ; i++) {

            if (first % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println("\n");
        for (int i = 1; i <= second ; i++) {
            if (first % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void punto7Ciclos(Scanner sc){
        //7. Mostrar en pantalla todos los enteros comprendidos entre 1 y 100

        for (int i = 1; i <= 100  ; i++) {
            System.out.println(i);
        }
    }
    public static void punto8Ciclos(Scanner sc){
        //8. Mostrar en pantalla todos los pares comprendidos entre 20 y 200.

        for (int i = 20; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void punto9Ciclos(Scanner sc){
        //9. Mostrar en pantalla todos los números terminados en 6 comprendidos entre 25 y 205.

        for (int i = 25; i <= 205; i++) {
            if (i % 10  == 6) {
                System.out.println(i);
            }
        }
    }

    public static void punto10Ciclos(Scanner sc){
        //10. Leer un número entero y determinar a cuánto es igual la suma de todos los enteros
        //comprendidos entre 1 y el número leído
        System.out.print("Introduce un número para  determinar a cuánto es igual la suma de todos los enteros\n" +
                "        //comprendidos entre 1 y el número leído");
        int first = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= first; i++) {
            suma = i + suma;
        }
        System.out.println(suma);
    }

    public static void punto11Ciclos(Scanner sc){
        //11. Leer un número entero de dos dígitos y mostrar en pantalla todos los enteros comprendidos
        //entre un dígito y otro

        System.out.print("Introduce un número  entero de dos dígitos y mostrar en pantalla todos los enteros comprendidos\n" +
                "        //entre un dígito y otro");
        int first = sc.nextInt();
        int decena = first / 10;
        int unidad = first % 10;

        if (decena > unidad) {
            for (int  i = decena; i >= unidad; i--) {
                System.out.println(i);
            }
        }else{
            for (int i = decena; i <= unidad; i++) {
                System.out.println(i);
            }
        }
    }

    public static void punto12Ciclos(Scanner sc){
        //11. 12. Leer un número entero de 3 dígitos y determinar si tiene el dígito 1.


        System.out.print("Introduce unn número entero de 3 dígitos y determinar si tiene el dígito 1.v");
        int first = sc.nextInt();
        int centena = first / 100;
        int decena = first % 100 / 10 ;
        int unidad = first % 10;


           /* if (centena == 1) {
                System.out.println("tiene el dígito 1");

            }
            if (decena == 1) {
                System.out.println("tiene el dígito 1");

            }
            if (decena == 1) {
                System.out.println("tiene el dígito 1");
            }*/

            while (centena == 1 || decena == 1 || unidad == 1){
                System.out.println("contiene el digito 1  ");
                break;
            }

       /* System.out.println(centena );
        System.out.println(decena );
        System.out.println(unidad );*/
        }


}
