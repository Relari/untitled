package org.example;

import javax.swing.DefaultDesktopManager;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final Perro PERRO = new Perro(1315, "Zeus", "Masculino");

    public static final String MESSAGE = "Saludo";

    public static void main(String[] args) {

//        String primer_nombre = "";
//
//        int numeroInteres = 123;
//        numeroInteres = 2;
//
//        System.out.println(MESSAGE);
//
//        String message = "Hello World";
//        String mensaje = "";
//
//        System.out.println(message);
//
//        message = "My first Class";
//
//        System.out.println(message);
//
//        System.out.println("------------------Numeros----------------");
//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//
//        System.out.println("-------------Decimales---------------------");
//
//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Double.MAX_VALUE);
//        MESSAGE = "asdas";
//
//        String texto = "Texto normal";
//
//        var textoConVar = "";
//
//        DefaultDesktopManager defaultDesktopManager = new DefaultDesktopManager();
//        var defaultDesktopManager = new DefaultDesktopManager();
//
//        String calcular = "asdasd";
//
//        if (calcular.equals(MESSAGE)) {
//            System.out.println("Es igual a la condicional");
//        } else {
//            System.err.println("No es igual a la condicional");
//        }
//
//        System.out.println("fin proceso");
//
//        List<String> names = new ArrayList<>();
//
//        if (names.isEmpty()) {
//            // ...
//        }

//        String texto = "";
//        String textoNulo = null;

//        List<String> names = null;
//        System.out.println(names);
//
//        List<Perro> perros = new ArrayList<>();
//
//        for (int i = 0; i < perros.size(); i++) {
//            if (perros.get(i).getGender().equals("M")) {
//                System.out.println(perros.get(i));
//            }
//        }
//
//        for (Perro perro: perros) {
//            if (perro.getGender().equals("F")) {
//                System.out.println(perro);
//            }
//        }

//        System.out.println(names2);
//
//        if (names2.isEmpty()) {
//            System.out.println("La lista esta vacia");
//        }

//        if (texto.equals("A")) {
//            // ...
//        } else if (texto.equals("B")) {
//            // ...
//        } else {
//            // ...
//        }
//
//        switch (texto) {
//            case "A":
//                break;
//            case "B":
//                break;
//            default:
//                break;
//        }

        AccionesInterface accionesInterface = new AccionesInterfaceImpl();
        accionesInterface.imprimir(PERRO);


    }
}