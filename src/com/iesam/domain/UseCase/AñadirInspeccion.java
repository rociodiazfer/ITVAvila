package com.iesam.domain.UseCase;

import com.iesam.data.InspeccionDataStore;
import com.iesam.domain.models.Inspeccion;


public class AñadirInspeccion {

    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

    public void execute(Inspeccion modelo) {
        dataStore.guardar(modelo);
    }
}
