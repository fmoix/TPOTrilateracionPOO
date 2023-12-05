package com.example.tpotrilateracion.errors;

/* Hay interseccion pero no en un unico punto */
public class SatelitesSinInterseccionComun extends RuntimeException {
    public SatelitesSinInterseccionComun (String mens){
        super(mens);
    }
}
