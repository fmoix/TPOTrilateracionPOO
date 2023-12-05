# Proyecto de Trilateración de Exoplanetas
---

Este proyecto utiliza la trilateración para localizar exoplanetas.

## Uso
---
Para localizar un exoplaneta y descifrar mensajes ocultos.

### Uso con Postman
---
Para interactuar con la API, puede usar Postman. Aquí se describen los endpoints disponibles:

#### Localizar Exoplaneta
- Método: POST
- URL: `http://localhost:8080/api/trilateracion/locate`
- Body:
```json
{
    "distances": [110, 150, 200],
    "locations": [[0, 1], [0, 1], [1, 0]]
}
```
#### Descifrar Mensaje Oculto
- Método: POST
- URL: `http://localhost:8080/api/mensaje/topsecret`
- Body:
```json
{
  "frase1": ["este", "", "", "mensaje", "", "secreto"],
  "frase2": ["", "es", "un", "", "muy", ""],
  "frase3": ["", "", "", "mensaje", "muy", "secreto"]
}
```
