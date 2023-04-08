package clasecuatro;
import java.util.Scanner;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Hello world!");

        String mes;
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce el mes: ");
        mes = datos.nextLine();

        switch (mes){
            case "Enero":
                System.out.println("Estamos en en la estación de Verano");
                break;
            case "Abril":
                System.out.println("Estamos en en la estación de Otoño");
                break;
                case "Julio":
                    System.out.println("Estamos en en la estación de Invierno");
                    break;
            case "Septiembre":
                System.out.println("Estamos en en la estación de Primavera");
                break;
            default:
                System.out.println("No es una estación del año");

        }

        System.out.println("===============================================================");
        System.out.println("===============================================================");

        int edad;
        System.out.println("Introduce tu edad en foma numérica: ");
        edad = datos.nextInt();

        switch (edad){
            case 17:
                System.out.println("Puedes ingrasar con un adulto");
                break;
            case 18:
                System.out.println("Puedes ingresar sin acompañante");
                break;
            case 19:
                System.out.println("Puedes ingresar sin acompañante");
                break;
            case 20:
                System.out.println("Puedes ingresar sin acompañante");
                break;
            default:
                System.out.println("No corresponde a un dato de tipo edad");

        }

        System.out.println("===============================================================");
        System.out.println("===============================================================");

        String [] paises = new String[5];

        for(int i=0; i < paises.length; i++){
            paises[i] = JOptionPane.showInputDialog("Introduce un pais: ");
        }

        System.out.println("===============================================================");
        for(String arrayPaises : paises){
            System.out.println("los países agregados son: " + arrayPaises);
        }
        System.out.println("===============================================================");

        for(String arrayPaises : paises){
            System.out.println(arrayPaises);
            if(arrayPaises.equals("Argentina")){
                System.out.println("Somos campeones de mundo");
                break;
            }
        }

        System.out.println("===============================================================");
        System.out.println("===============================================================");

        for(String arrayPaises : paises){
            System.out.println(arrayPaises);
            if(arrayPaises.equals("Argentina")){
                System.out.println("Somos campeones de mundo");
                continue;
            }
        }

        System.out.println("===============================================================");
        System.out.println("===============================================================");





    }
}