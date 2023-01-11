package com.iesam.domain.UseCase;

import com.iesam.data.PropietarioDataStore;
import com.iesam.domain.models.Propietario;

public class ObtenerPropietarioUseCase {

    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

    public Propietario execute(String codigo){
        return dataStore.buscar(codigo);
    }
}
