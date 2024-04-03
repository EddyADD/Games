package games;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GamesF {
    static int select;
    static int option;
    static boolean continuar;
    //constructores
    public GamesF(){
    }
    //main
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        do {
            try {
                continuar = false;
                System.out.println("-----------------HELLO EVERYONE!----------------" +
                        "\n------Welcome to my little Games of figures-----");
                System.out.println("1. Triangulo ");
                System.out.println("2. Cuadrado ");
                System.out.println("3. Rectangulo");
                System.out.println("4. Circulo");
                System.out.println("5. Desea Salir");
                System.out.print(" Select one figure: -> ");
                select = inn.nextInt();

                if (select <=4){
                    System.out.println("1. * ");
                    System.out.println("2. @ ");
                    System.out.println("3. + ");
                    System.out.print(" Select a Option: -> ");
                    option = inn.nextInt();
                    inn.nextLine();
                    switch (select){
                        case 1:
                            Triangulo trian = new Triangulo ();
                            trian.trianguloisoles(option);
                            System.out.println("press enter to continue ");
                            inn.nextLine();
                            limpiarConsola();
                            continuar = true;
                            break;
                        case 2:
                            Cuadrado cua = new Cuadrado();
                            cua.cuadrado(option);
                            System.out.println("press enter to continue ");
                            inn.nextLine();
                            limpiarConsola();
                            continuar = true;
                            break;
                        case 3:
                            Rectangulo reg = new Rectangulo();
                            reg.regtangulo(option);
                            System.out.println("press enter to continue ");
                            inn.nextLine();
                            limpiarConsola();
                            continuar = true;
                            break;
                        case 4:
                            Circulo circle = new Circulo();
                            circle.circulo(option);
                            System.out.println("press enter to continue ");
                            inn.nextLine();
                            limpiarConsola();
                            continuar = true;
                            break;
                        case 5:
                            System.out.println("Adios");
                            inn.nextLine();
                            break;
                        default:

                    }
                } else if (select == 5){
                    System.out.println("\n\n******* bye ****** ");
                    inn.nextLine();
                    continuar = false;
                } else {
                    System.out.println("\n\n --- Try other number --- ");
                    limpiarConsola();
                    continuar=true;
                }



            }catch (InputMismatchException ex){
                System.out.println("******* Option no valid, try again ****** ");
                inn.next();
                limpiarConsola();
                continuar = true;
            }
        }while (continuar);


    }

    public static void limpiarConsola() {
        // Este método imprime 50 líneas en blanco para "limpiar" la consola
        for (int i = 0; i < 5; ++i) {
            System.out.println();
        }
    }
}
