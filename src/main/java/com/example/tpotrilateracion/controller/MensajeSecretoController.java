package com.example.tpotrilateracion.controller;

import com.example.tpotrilateracion.dto.MensajeSecretoGET;
import com.example.tpotrilateracion.dto.MensajeSecretoPOST;
import com.example.tpotrilateracion.service.MensajeSecretoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mensaje")
public class MensajeSecretoController {
    @Autowired
    private MensajeSecretoService mensajeSecretoService;

    @PostMapping("/topsecret")
    public ResponseEntity<MensajeSecretoPOST> adivinarMensajeSecreto (@RequestBody MensajeSecretoGET mensajeSecretoGET) {
        return ResponseEntity.ok(mensajeSecretoService.adivinarMensajeSecreto(mensajeSecretoGET.frase1(), mensajeSecretoGET.frase2(), mensajeSecretoGET.frase3()));
    }

}


