package com.example.tpotrilateracion.entities;

import lombok.Getter;

import java.util.List;

@Getter
public abstract class Observatorio {
    String name;
    double distance;
    Ubicacion position;

    protected Observatorio(String name, double distance, double X, double Y){
        this.name = name;
        this.distance = distance;
        this.position = new Ubicacion(X, Y);
    }
}
