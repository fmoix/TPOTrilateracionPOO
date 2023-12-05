package com.example.tpotrilateracion.entities;

import lombok.Getter;

import java.util.List;

@Getter
public class Satelite extends Observatorio{
    public Satelite(String name, double distance, double X, double Y){
        super(name, distance, X, Y);
    }
}
