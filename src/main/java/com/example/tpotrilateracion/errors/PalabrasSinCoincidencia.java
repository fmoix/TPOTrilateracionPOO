package com.example.tpotrilateracion.errors;

public class PalabrasSinCoincidencia extends RuntimeException {
    public PalabrasSinCoincidencia() {
        super("No coinciden las palabras");
    }
}
