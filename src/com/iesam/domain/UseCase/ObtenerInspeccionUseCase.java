package com.iesam.domain.UseCase;

import com.iesam.data.InspeccionDataStore;
import com.iesam.domain.models.Inspeccion;

public class ObtenerInspeccionUseCase {

    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

    public Inspeccion execute(String codigo){
        return dataStore.buscar(codigo);
    }
}
