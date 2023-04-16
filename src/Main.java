import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int numEstudiantes;
        float notaDeIntegrador;
        float notaDeExposicion;
        float notaDeParcial;
        float notaFinal;
        float totalDeLosFinalesDesaprobados = 0;
        float promedioDeLosDesaprobados;
        float porcentajeDeIntegradoresConMasDe7Con5;

        float mayorNotaDeExposicion = 0;

        int contadorParcialesEntre4Y7Con5 = 0;
        int contadorDeDesaprobados = 0;
        int contadorDeIntegradoresConMasDe7Con5 = 0;
//        int contadorDelBucle = 0;

        String solicitarNumeroDeEstudiantes;
        String solicitarNotaDelIntegrador;
        String solicitarNotaDelParcial;
        String solicitarNotaDeExposicion;



        solicitarNumeroDeEstudiantes = "Por favor ingrese el numero de estudiantes";
        solicitarNotaDelIntegrador = "Por favor ingrese la nota del integrador";
        solicitarNotaDelParcial = "Por favor ingrese la nota del parcial";
        solicitarNotaDeExposicion = "Por favor ingrese la nota de la exposicion";

        System.out.println(solicitarNumeroDeEstudiantes);
        numEstudiantes = scann.nextInt();


        for (int i = 0; i < numEstudiantes; i++) {


            System.out.println(solicitarNotaDelIntegrador);

            notaDeIntegrador = scann.nextInt();
            if(notaDeIntegrador >7.5){
                contadorDeIntegradoresConMasDe7Con5 ++;
            }

            System.out.println(solicitarNotaDelParcial);

            notaDeParcial = scann.nextInt();
            if (notaDeParcial > 4 && notaDeParcial < 7.5){
                contadorParcialesEntre4Y7Con5++;
            }

            System.out.println(solicitarNotaDeExposicion);

            notaDeExposicion = scann.nextInt();
            if(notaDeExposicion > mayorNotaDeExposicion){
                mayorNotaDeExposicion = notaDeExposicion;
            }

            System.out.println("Notas ingresadas");

            notaFinal = (notaDeIntegrador + notaDeParcial + notaDeExposicion)/3;
            if(notaFinal < 6.5){
                contadorDeDesaprobados++;
                totalDeLosFinalesDesaprobados = totalDeLosFinalesDesaprobados + notaFinal;
            }

        }

       /*
        do {
            System.out.println(solicitarNotaDelIntegrador);

            notaDeIntegrador = scann.nextInt();
            if(notaDeIntegrador >7.5){
                contadorDeIntegradoresConMasDe7Con5 ++;
            }

            System.out.println(solicitarNotaDelParcial);

            notaDeParcial = scann.nextInt();
            if (notaDeParcial > 4 && notaDeParcial < 7.5){
                contadorParcialesEntre4Y7Con5++;
            }

            System.out.println(solicitarNotaDeExposicion);

            notaDeExposicion = scann.nextInt();
            if(notaDeExposicion > mayorNotaDeExposicion){
                mayorNotaDeExposicion = notaDeExposicion;
            }

            notaFinal = (notaDeIntegrador + notaDeParcial + notaDeExposicion)/3;
            if(notaFinal < 6.5){
                contadorDeDesaprobados++;
                totalDeLosFinalesDesaprobados = totalDeLosFinalesDesaprobados + notaFinal;
            }

            contadorDelBucle++;
        }while(numEstudiantes >= contadorDelBucle);
       */

        porcentajeDeIntegradoresConMasDe7Con5 = (contadorDeIntegradoresConMasDe7Con5*100) / numEstudiantes;
        System.out.println("Este es el porcentaje de alumnos cuya nota de integrador es mayor a 7.5: " + porcentajeDeIntegradoresConMasDe7Con5 + "%");

        promedioDeLosDesaprobados = totalDeLosFinalesDesaprobados / contadorDeDesaprobados;
        System.out.println( "Este es el promedio final de los desaprobados: " + promedioDeLosDesaprobados);

        System.out.println("Esta es la mayor nota de las exposiciones: " + mayorNotaDeExposicion);

        System.out.println("Total de estudiantes que obtuvieron una nota entre 4  y 7.5: " + contadorParcialesEntre4Y7Con5);


    }
}