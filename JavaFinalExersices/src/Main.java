
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         /*   *//*1 Leer un número entero y determinar si es un número terminado en 4*//*
            *//*pages 138-140 *//*


            System.out.print("Introduce un número entero: ");
            int numeroUNO = sc.nextInt();
            if (numeroUNO % 10 == 4)
            {
                System.out.println("is a number finished in 4");
            }

            *//*2 leer un número entero y determinar si tiene tres digitos"*//*

             Scanner sd = new Scanner(System.in);

             System.out.print("Introduce un número entero para determinar si tiene mas de tres dígitos: ");
             int numeroDos = sc.nextInt();

             if ( numeroDos >= 100 && numeroDos <= 999)
             {
                System.out.println("is a number with three digits");
             }

             *//*leer un número entero y determinar sis es negativo*//*

            System.out.print("Introduce un número entero para determinar si tiene tres dígitos: ");
            int numeroTres = sc.nextInt();

            if ( numeroCuatro < 0)
            {
                System.out.println("is a number with three digits");
            }*/

           /* 3- leer un número enterro y determinar si es negativo*/
           /* System.out.print("Introduce un número entero para determinar si es negativo: ");
            Double numeroCuatro = sc.nextDouble();
            if (numeroCuatro < 0 )
            {
                System.out.println("el numero es negativo");
            }*/

            /*4.Leer un número entero de dos digitos y determinar a cuanto es igual la suma de sus dígitos*/
            /*System.out.print("Introduce un número entero de dos dígitos para determinar a cuanto es igual la suma de sus dígitos: ");
            int numeroCinco = sc.nextInt();
            int unidad = numeroCinco % 10;
            int decena = numeroCinco / 10;

             System.out.println(unidad + decena);*/

            /* 5. Leer un número entero de dos digitos y determinar si ambos dígitos son pares*/

            /*System.out.print("Introduce un número entero de dos dígitos para determinar si ambos dígitos son pares: ");
            int numeroCinco = sc.nextInt();
            int unidad = numeroCinco % 10;
            int decena = numeroCinco / 10;
            if (unidad % 2 == 0 && decena %  2 == 0)
            {
                System.out.println(" ambos son pares");
            }
            System.out.println(unidad + decena);*/

            /*6. Leer un nùmero entero de dos dígitos menor que 20 y determinar si es primo */

             /*System.out.print("Introduce un número entero de  dos dígitos menor que 20 para determinar si es primo  ");
            int numeroCinco = sc.nextInt();º

            int unidad = numeroCinco % 10;
            int decena = numeroCinco / 10;
            if (unidad % 2 == 0 && decena %  2 == 0)
            {
                System.out.println(" ambos son pares");
            }
            System.out.println(unidad + decena);*/

           /* 7. leer un número entero de dos dígitos menor que 20 y determinar si es primo-*/

            /*System.out.print(" ");
            int numeroSiete = sc.nextInt();

            int unidad = numeroCinco % 10;
            int decena = numeroCinco / 10;
            if (unidad % 2 == 0 && decena %  2 == 0)
            {
                System.out.println(" ambos son pares");
            }/**/

    }
}



