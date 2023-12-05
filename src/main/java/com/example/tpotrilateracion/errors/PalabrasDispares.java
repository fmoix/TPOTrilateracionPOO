package com.example.tpotrilateracion.errors;


public class PalabrasDispares extends RuntimeException{
    public PalabrasDispares() {
        super("Cantidad incorrecta de palabras");
    }
}