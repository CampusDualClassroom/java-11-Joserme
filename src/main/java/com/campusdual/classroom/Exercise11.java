package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
        redRemote.volumeUp();
        redRemote.volumeDown();
        redRemote.turnOn();
        redRemote.turnOff();
        modificarVolumume(0);


    }
    public static void modificarVolumume(int valor){
        TVRemote redRemote = new TVRemote("Rojo");
        redRemote.volume = valor;
    }
    public static void modificarCanal(int valor){
        TVRemote redRemote = new TVRemote("Rojo");
        redRemote.channel = valor;
    }


    /*A mayores del código proporcionado en el main(), también dentro de este método, será necesario:
Encender la TV Subir un canal Bajar un canal
Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
Subir el volumen
Bajar el volumen
Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
Obtener el color del mando a distancia y mostrarlo por pantalla
Apagar la TV*/

}