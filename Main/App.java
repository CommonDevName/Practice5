package Main;

import Metods.Ejecutor;
import Metods.Reloj;

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        //Ejecutor e = new Ejecutor("calc", 1);
        //Scanner leer = new Scanner(System.in);
        //System.out.println("Escribe un commando	para ejecutar");
        //e.setComando(leer.next());
        //Reloj e = new Reloj();
        //if(e.necesitaEjecucion())	{
            //e.ejecutarTarea();
        //}
        new Thread(new Reloj()).start();
        new Thread(new Ejecutor("Calc", 0)).start();
    }
}


