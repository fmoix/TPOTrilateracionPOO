package com.example.tpotrilateracion.controller;


import com.example.tpotrilateracion.dto.TrilateracionGET;
import com.example.tpotrilateracion.entities.ExoPlaneta;
import com.example.tpotrilateracion.service.SateliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/trilateracion")
public class TrilateracionController {

    private final SateliteService sateliteService;

    @Autowired
    public TrilateracionController(SateliteService sateliteService) {
        this.sateliteService = sateliteService;
    }

    @PostMapping("/locate")
    public ExoPlaneta locateExoplanet(@RequestBody TrilateracionGET request) {
        return sateliteService.locateExoplanet(request.getDistances(), request.getLocations());
    }

    // other endpoints
}
