package calculadoraavanzada;

import java.util.Scanner;

public class CalculadoraAvanzada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Variables comunes para todos los casos
        double num1 = 0, num2 = 0;
        int num = 0;

        // Menú de elección para el usuario
        do {
            System.out.println("--- Calculadora Avanzada ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Logaritmo");
            System.out.println("8. Factorial");
            System.out.println("9. Seno");
            System.out.println("10. Coseno");
            System.out.println("11. Tangente");
            System.out.println("12. Valor absoluto");
            System.out.println("13. Conversión de Grados a Radianes");
            System.out.println("14. Números primos");
            System.out.println("15. Tabla de multiplicar");
            System.out.println("16. Número mayor");
            System.out.println("17. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            // Pedimos los números según el tipo de operación
            if (opcion >= 1 && opcion <= 5 || opcion == 16) {
                System.out.print("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Introduce el segundo número: ");
                num2 = sc.nextDouble();
            } else if (opcion == 6 || opcion == 7 || opcion == 8 || opcion == 9 || opcion == 10 || opcion == 11 || opcion == 12 || opcion == 13 || opcion == 14) {
                System.out.print("Introduce el número: ");
                num = sc.nextInt();
            }

            // Switch para elegir la operación
            switch (opcion) {
                case 1:
                    sumar(num1, num2); 
                    break;
                case 2:
                    restar(num1, num2); 
                    break;
                case 3:
                    multiplicar(num1, num2); 
                    break;
                case 4:
                    dividir(num1, num2); 
                    break;
                case 5:
                    potencia(num1, num2); 
                    break;
                case 6:
                    raizCuadrada(num); 
                    break;
                case 7:
                    logaritmo(num);
                    break;
                case 8:
                    factorial(num); 
                    break;
                case 9:
                    seno(num); 
                    break;
                case 10:
                    coseno(num); 
                    break;
                case 11:
                    tangente(num); 
                    break;
                case 12:
                    valorAbsoluto(num); 
                    break;
                case 13:
                    gradosARadianes(num); 
                    break;
                case 14:
                    esPrimo(num); 
                    break;
                case 15:
                    tablaDeMultiplicar(num); 
                    break;
                case 16:
                    numeroMayor(num1, num2); 
                    break;
                case 17:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción correcta.");
            }
        } while (opcion != 17); // Mantenemos el bucle mientras la opción no sea 17("Salir")
    }

    // Funciones de nuestro programa
    
   /**
     * Suma dos números.
     * 
     * @param num1 Primer número.
     * @param num2 Segundo número.
     */
    public static void sumar(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    /**
     * Resta dos números.
     * 
     * @param num1 Primer número.
     * @param num2 Segundo número.
     */
    public static void restar(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    /**
     * Multiplica dos números.
     * 
     * @param num1 Primer número.
     * @param num2 Segundo número.
     */
    public static void multiplicar(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    /**
     * Divide dos números.
     * 
     * @param num1 Primer número.
     * @param num2 Segundo número.
     */
    public static void dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir entre cero.");
        } else {
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }

    /**
     * Calcula la potencia de un número.
     * 
     * @param base     Base de la potencia.
     * @param exponente Exponente de la potencia.
     */
    public static void potencia(double base, double exponente) {
        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado de la potencia es: " + resultado);
    }

    /**
     * Calcula la raíz cuadrada de un número.
     * 
     * @param num Número al que se le calculará la raíz cuadrada.
     */
    public static void raizCuadrada(double num) {
        if (num < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            double resultado = Math.sqrt(num);
            System.out.println("La raíz cuadrada de " + num + " es: " + resultado);
        }
    }

    /**
     * Calcula el logaritmo natural de un número.
     * 
     * @param num Número al que se le calculará el logaritmo natural.
     */
    public static void logaritmo(double num) {
        if (num <= 0) {
            System.out.println("El logaritmo solo está definido para números mayores que cero.");
        } else {
            double resultado = Math.log(num);
            System.out.println("El logaritmo de " + num + " es: " + resultado);
        }
    }

    /**
     * Calcula el factorial de un número entero no negativo.
     * 
     * @param num Número para calcular el factorial.
     */
    public static void factorial(int num) {
        if (num < 0) {
            System.out.println("El factorial solo está definido para números enteros no negativos.");
        } else {
            long resultado = 1;
            for (int i = 1; i <= num; i++) {
                resultado *= i;
            }
            System.out.println("El factorial de " + num + " es: " + resultado);
        }
    }

    /**
     * Calcula el seno de un ángulo en grados.
     * 
     * @param grados Ángulo en grados.
     */
    public static void seno(int grados) {
        double radianes = Math.toRadians(grados);
        double resultado = Math.sin(radianes);
        System.out.println("El seno de " + grados + " grados es: " + resultado);
    }

    /**
     * Calcula el coseno de un ángulo en grados.
     * 
     * @param grados Ángulo en grados.
     */
    public static void coseno(int grados) {
        double radianes = Math.toRadians(grados);
        double resultado = Math.cos(radianes);
        System.out.println("El coseno de " + grados + " grados es: " + resultado);
    }

    /**
     * Calcula la tangente de un ángulo en grados.
     * 
     * @param grados Ángulo en grados.
     */
    public static void tangente(int grados) {
        double radianes = Math.toRadians(grados);
        double resultado = Math.tan(radianes);
        System.out.println("La tangente de " + grados + " grados es: " + resultado);
    }

    /**
     * Calcula el valor absoluto de un número.
     * 
     * @param num Número al que se le calculará el valor absoluto.
     */
    public static void valorAbsoluto(int num) {
        double resultado = Math.abs(num);
        System.out.println("El valor absoluto de " + num + " es: " + resultado);
    }

    /**
     * Convierte un ángulo de grados a radianes.
     * 
     * @param grados Ángulo en grados.
     */
    public static void gradosARadianes(int grados) {
        double radianes = Math.toRadians(grados);
        System.out.println(grados + " grados es igual a " + radianes + " radianes.");
    }

    /**
     * Verifica si un número es primo.
     * 
     * @param num Número a verificar.
     * @return true si es primo, false si no.
     */
    public static boolean esPrimo(int num) {
        boolean esPrimo = true;
        if (num < 2) {
            esPrimo = false;
        } else {
            for (int m = 2; m <= Math.sqrt(num); m++) {
                if (num % m == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El número " + num + " es un número primo.");
        } else {
            System.out.println("El número " + num + " no es un número primo.");
        }

        return esPrimo;
    }

    /**
     * Determina cuál de dos números es el mayor.
     * 
     * @param numero1 Primer número.
     * @param numero2 Segundo número.
     */
    public static void numeroMayor(double numero1, double numero2) {
        double mayor = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("El mayor de los dos números es: " + mayor);
    }

    /**
     * Muestra la tabla de multiplicar de un número.
     * 
     * @param num Número de la tabla.
     */
    public static void tablaDeMultiplicar(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}