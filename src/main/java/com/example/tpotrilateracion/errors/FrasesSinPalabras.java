package com.example.tpotrilateracion.errors;

public class FrasesSinPalabras extends RuntimeException {
    public FrasesSinPalabras() {
        super("No hay ninguna palabra");
    }
}


