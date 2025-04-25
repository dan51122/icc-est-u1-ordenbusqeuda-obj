package controllers;

import models.Persona;

public class PersonaController {
    public void sortByCodigoDireccion(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            int indexMayor = i;
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[j].compareCodigoDireccion(personas[i])) {
                    indexMayor = j;
                }
            }
            if (indexMayor != i) {
                Persona temp = personas[i];
                personas[i] = personas[indexMayor];
                personas[indexMayor] = temp;
            }
        }
    }

    public Persona findPersonaByCodigoDireccion(Persona[] personas, int codigo) {
        int bajo = 0;
        int alto = personas.length - 1;
        while (bajo <= alto) {
            int center = (bajo + alto) / 2;
            if (personas[center].equalsByCodigoDireccion(codigo)) {
                return personas[center];
            }
            if (personas[center].compareCodigoDireccion(codigo)) {
                bajo = center + 1;
            } else {
                alto = center - 1;
            }

        }
        return null;
    }
}