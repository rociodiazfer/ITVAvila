package com.iesam.domain.UseCase;

import com.iesam.data.VehiculoDataStore;
import com.iesam.domain.models.Moto;
import com.iesam.domain.models.Vehiculo;

public class ObtenerVehiculoUseCase {

    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public Vehiculo execute(String codigo){
        return dataStore.buscar(codigo);
    }
}

