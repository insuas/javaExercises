import java.util.Scanner;

public class A_TallerDecisiones {
    public static void punto1(Scanner sc){

        System.out.print("Introduce un número entero: ");
        int numeroUNO = sc.nextInt();
        if(numeroUNO % 10 == 4){
            System.out.println("is a number finished in 4");
        }else{
            System.out.println("IS NOT a number finished in 4");
        }
    }
    public static void punto2(Scanner sc){
       /*2 leer un número entero y determinar si tiene tres digitos"*/

        System.out.print("Introduce a number to determinate if has more three digits ");
        int numeroDos = sc.nextInt();

        if ( numeroDos > 999 )
        {
            System.out.println("is a number with more of three digits");
        }
        else
            System.out.println("isn´t a number with more three digits ");
    }

    public static void punto3(Scanner sc) {
        Scanner se = new Scanner(System.in);
        /*3- leer un número enterro y determinar si es negativo*/
        System.out.print("Introduce un número entero para determinar si es negativo: ");
        int numeroTres = se.nextInt();
        if (numeroTres < 0) {
            System.out.println("el numero es negativo");
        } else
            System.out.println("el numero es positivo");
    }

        public static void punto4(Scanner sc ) {
            Scanner sf = new Scanner(System.in);
            /*4.Leer un número entero de dos digitos y determinar a cuanto es igual la suma de sus dígitos*/
            System.out.print("Introduce un número entero de dos dígitos para determinar a cuanto es igual la suma de sus dígitos: ");
            int numeroCuatro = sf.nextInt();
            int unidad = numeroCuatro % 10;
            int decena = numeroCuatro / 10;
            int plus = unidad + decena;

             System.out.println(" la suma es "  + plus);
        }

    public static void punto5(Scanner sc ) {
        Scanner sg = new Scanner(System.in);
        /* 5. Leer un número entero de dos digitos y determinar si ambos dígitos son pares*/

            System.out.print("Introduce un número entero de dos dígitos para determinar si ambos dígitos son pares: ");
            int numeroCinco = sg.nextInt();
            int unidad = numeroCinco % 10;
            int decena = numeroCinco / 10;
            if (unidad % 2 == 0 && decena %  2 == 0)
            {
                System.out.println(" both are pairs");
            }
            else
            {
                System.out.println("not pairs");
            }
    }
        public static void punto6(Scanner sc){
            /*6. Leer un nùmero entero de dos dígitos menor que 20 y determinar si es primo */

            System.out.print("Introduce un número entero de  dos dígitos menor que 20 para determinar si es primo  ");
            int numeroSeis = sc.nextInt();

            if (   numeroSeis == 11 || numeroSeis == 13 || numeroSeis == 17 || numeroSeis == 19  ) {
                System.out.println("es primo");
            }
        }

    public static void punto7(Scanner sc){
        /*7.  Leer un número entero de dos dígitos y determinar si es primo y además si es negativo. */

        System.out.print("Introduce un número entero de  dos dígitos menor que 20 para determinar si es primo o si es negativo ");
        int numeroSiete = sc.nextInt();

        if (   numeroSiete == 11 || numeroSiete == 13 || numeroSiete == 17 || numeroSiete == 19  ) {
            System.out.println("es primo");
        }

        if (   numeroSiete < 0  ) {
            System.out.println("es negativo");
        }
    }

    public static void punto8(Scanner sc){
//        8. Leer un número entero de dos dígitos y determinar si sus dos dígitos son primos.
        System.out.print("Introduce un número entero de  dos dígitos para determinar si sus dos dígitos son primos ");
        int numeroOcho = sc.nextInt();

        int decena = numeroOcho / 10 ;
        int unidad = numeroOcho % 10 ;


            if (decena == 2 || decena == 3 || decena == 5 || decena == 7 && decena == 2 || decena == 3 || decena == 5 || decena == 7  ) {
                System.out.println("sus dos digitos son primos");
            } else {
                System.out.println("no son primos");
            }
    }

    public static void punto9(Scanner sc){
//        9. Leer un número entero de dos dígitos y determinar si un dígito es múltiplo del otro..
        System.out.print("Introduce un número entero de  dos dígitos para determinar if a digit is a multiply of the  other  ");
        int numeroOcho = sc.nextInt();

        int decena = numeroOcho / 10 ;
        int unidad = numeroOcho % 10 ;


        if (unidad % decena == 0 || decena % unidad == 0  ) {
            System.out.println("son multiplos");
        } else {
            System.out.println("are not multiples");
        }
    }



    public static void punto10(Scanner sc){
//        10. Leer un número entero de dos dígitos y determinar si los dos dígitos son iguales.
        System.out.print("Introduce un número entero de  dos dígitos para determinar if both are the same  ");
        int numeroOcho = sc.nextInt();

        int decena = numeroOcho / 10 ;
        int unidad = numeroOcho % 10 ;


        if (unidad == decena) {
            System.out.println("both are the same");
        } else {
            System.out.println("both are not the same");
        }
    }

    public static void punto11(Scanner sc){
//        1.  Leer dos números enteros y determinar cuál es el mayor.
        System.out.print("Introduce un entire numbers for determinate wich is bigger  ");
        int first = sc.nextInt();
        System.out.print("Introduce other entire numbers for determinate wich is bigger  ");
        int second = sc.nextInt();



        if (first > second) {
            System.out.println("the first is more than second");
        } else {
            System.out.println("the second is more than first");
        }

    }

    public static void punto19(Scanner sc ){
    //19. Leer tres números enteros y determinar cuál es el mayor. Usar solamente dos variables.

        System.out.print("Introduce un entire number for determinate wich is bigger  ");
        int first = sc.nextInt();
        System.out.print("Introduce second entire number for determinate wich is bigger  ");
        int second = sc.nextInt();
        System.out.print("Introduce third entire number for determinate wich is bigger  ");
        int third = sc.nextInt();
        int mayor = third;


        if (first > second && first > third ) {
            mayor = first;
        } else if (second > first && second > third){
            mayor = second;
        }
        System.out.println("el mayor es ");
        System.out.println(mayor);
    }

    public static void punto20(Scanner sc){
        //20. Leer tres números enteros y mostrarlos ascendentemente.
        System.out.print("Introduce un entire number to show ascendent");
        int first = sc.nextInt();
        System.out.print("Introduce second entire number  ");
        int second = sc.nextInt();
        System.out.print("Introduce third entire number  ");
        int third = sc.nextInt();
        int mayor = 0 ;
        int intermedio = 0 ;
        int menor = 0;

        if(first > second && first > third){
            mayor = first;

        }
        if(second > first && second > third){
            mayor = second;
        }
        if(third > second && third > first){
            mayor = third;
        }

        if(first > second && first > third){
            menor = first;
        }
        if(second > first && second > third){
            menor = second;
        }
        if(third > second && third > first){
            menor = third;
        }

        if(first > second && first < third ){

            intermedio = first;
        }
        if (first < second && first > third){
            intermedio = first;
        }

        if(second > first && second < third){
            intermedio = second;
        }
        if(second < first && second > third){
            intermedio = second;
        }

        if(third > second && third < first){
            intermedio = third;
        }
        if(third < second && third > first){
            intermedio = third;
        }
        System.out.println("el orden es" + menor + intermedio + mayor);


    }


    public static void punto21(Scanner sc){
        /*21. Leer tres números enteros de dos dígitos cada uno y determinar en cuál de ellos se encuentra
        el mayor dígito.*/

        System.out.print("Introduce tres numeros enteros de dos dígitos cada uno y determinar en cuál de ellos se encuentra el mayor dígito");
        System.out.println("introduce el primer dígito");
        int first = sc.nextInt();
        System.out.print("Introduce second entire number ");
        int second = sc.nextInt();
        System.out.print("Introduce third entire number  ");
        int third = sc.nextInt();

        int decenaFirst = first / 10;
        int unidadFirst = first % 10;

        int decenaSecond = second / 10;
        int unidadSecond = second % 10;

        int decenaThird = third / 10;
        int unidadThird = third % 10;

        /*if (decenaFirst > decenaSecond  decenaFirst > unidadSecond  )
        {

        }*/

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //A_TallerDecisiones.punto1(sc);
        //A_TallerDecisiones.punto2(sc);
        //A_TallerDecisiones.punto3(sc);
        //A_TallerDecisiones.punto4(sc);
        //A_TallerDecisiones.punto5(sc);
        //A_TallerDecisiones.punto6(sc);
        //A_TallerDecisiones.punto7(sc);
        //A_TallerDecisiones.punto8(sc);
        // A_TallerDecisiones.punto9(sc);
        //A_TallerDecisiones.punto10(sc);
        //A_TallerDecisiones.punto19(sc);
        //A_TallerDecisiones.punto20(sc);
        //A_TallerCiclos.punto1Ciclos(sc);
        //A_TallerCiclos.punto2Ciclos(sc);
        //A_TallerCiclos.punto3Ciclos(sc);
        //A_TallerCiclos.punto4Ciclos(sc);//no está hecho
        //A_TallerCiclos.punto7Ciclos(sc);// no está hecho
        //A_TallerCiclos.punto8Ciclos(sc);
        //A_TallerCiclos.punto10Ciclos(sc);
        // A_TallerCiclos.punto11Ciclos(sc);
        //A_TallerCiclos.punto12Ciclos(sc);
        A_TallerArreglos.punto1(sc);
    }
}
