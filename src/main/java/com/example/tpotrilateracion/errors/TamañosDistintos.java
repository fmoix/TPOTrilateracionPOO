package com.example.tpotrilateracion.errors;

public class TamañosDistintos extends RuntimeException{
    public TamañosDistintos() {
        super("Frases de distintos tamaños, no coincide con el tamaño del mensaje");
    }
}
