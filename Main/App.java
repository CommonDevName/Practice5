package Main;

import Metods.Ejecutor;

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Ejecutor e = new Ejecutor("calc", 1);
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un commando	para ejecutar");
        e.setComando(leer.next());
        if(e.necesitaEjecucion())	{
            e.ejecutarTarea();

        }
    }
}


