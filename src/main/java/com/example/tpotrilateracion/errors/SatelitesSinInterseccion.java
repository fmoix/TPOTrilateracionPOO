package com.example.tpotrilateracion.errors;

/* Sin interseccion, no se tocan en ningun punto */
public class SatelitesSinInterseccion  extends RuntimeException {
    public SatelitesSinInterseccion (String mens) {
        super(mens);
    }
}
