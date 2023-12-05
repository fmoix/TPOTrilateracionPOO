package com.example.tpotrilateracion.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorsHandler {
    @ExceptionHandler(SatelitesIguales.class)
    public ResponseEntity<String> handlerSatelitesIguales(SatelitesIguales error) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error.getMessage());
    }
    @ExceptionHandler(SatelitesSinInterseccion.class)
    public ResponseEntity<String> handlerSatelitesSinInterseccion(SatelitesSinInterseccion error) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error.getMessage());
    }
    @ExceptionHandler(SatelitesSinInterseccionComun.class)
    public ResponseEntity<String> handlerSatelitesSinInterseccionComun(SatelitesSinInterseccionComun error) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error.getMessage());
    }
    @ExceptionHandler(FrasesSinPalabras.class)
    public ResponseEntity<String> handlerFrasesSinPlabras(FrasesSinPalabras error) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error.getMessage());
    }
    @ExceptionHandler(PalabrasDispares.class)
    public ResponseEntity<String> handlerPalabrasDispares(PalabrasDispares error) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error.getMessage());
    }
    @ExceptionHandler(PalabrasSinCoincidencia.class)
    public ResponseEntity<String> handlerPalabrasSinCoincidencia(PalabrasSinCoincidencia error) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error.getMessage());
    }
    @ExceptionHandler(TamañosDistintos.class)
    public ResponseEntity<String> handlerTamañosDistintos(TamañosDistintos error) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error.getMessage());
    }

}