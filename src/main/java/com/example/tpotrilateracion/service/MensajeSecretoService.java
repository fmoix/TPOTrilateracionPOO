package com.example.tpotrilateracion.service;
import com.example.tpotrilateracion.dto.MensajeSecretoPOST;
import com.example.tpotrilateracion.errors.*;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MensajeSecretoService {

    public MensajeSecretoPOST adivinarMensajeSecreto(List<String> frase1, List<String> frase2, List<String> frase3) {
        List<String> mensajeFinal = new ArrayList<>();
        int tamañoMens;
        if (frase1.get(0).isEmpty() && frase2.get(0).isEmpty() && frase3.get(0).isEmpty()) {
            frase1.remove(0);
            frase2.remove(0);
            frase3.remove(0);
            tamañoMens = frase1.size();
        } else {
            int longitudFinalCandidato = Math.min(frase1.size(), frase2.size());
            tamañoMens = Math.min(longitudFinalCandidato, frase3.size());
            if (frase1.size() > tamañoMens) {
                if (!frase1.get(0).equals("")) {
                    throw new PalabrasDispares();
                }
                frase1.remove(0);
            }
            if (frase2.size() > tamañoMens) {
                if (!frase2.get(0).equals("")) {
                    throw new PalabrasDispares();
                }
                frase2.remove(0);
            }
            if (frase3.size() > tamañoMens) {
                if (!frase3.get(0).equals("")) {
                    throw new PalabrasDispares();
                }
                frase3.remove(0);
            }
        }

        if (frase1.size() != tamañoMens || frase2.size() != tamañoMens || frase3.size() != tamañoMens) {
            throw new TamañosDistintos();
        }

        for (int i = 0; i < tamañoMens; i++) {
            String pal1 = frase1.get(i);
            String pal2 = frase2.get(i);
            String pal3 = frase3.get(i);
            if (pal1.isBlank() && pal2.isBlank() && pal3.isBlank()) {
                throw new FrasesSinPalabras();
            }

            if (!pal1.equals(pal2) && !(pal1.isBlank() || pal2.isBlank()) ||
                    !pal2.equals(pal3) && !(pal2.isBlank() || pal3.isBlank())) {
                throw new PalabrasSinCoincidencia();
            }
            if (!pal1.equals("")) {
                mensajeFinal.add(pal1);
                continue;
            }
            if (!pal2.equals("")) {
                mensajeFinal.add(pal2);
                continue;
            }
            if (!pal3.equals("")) {
                mensajeFinal.add(pal3);
            }
        }
        return new MensajeSecretoPOST(mensajeFinal);
    }
}
