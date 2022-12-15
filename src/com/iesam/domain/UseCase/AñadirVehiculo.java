package com.iesam.domain.UseCase;

import com.iesam.data.InspeccionDataStore;
import com.iesam.data.VehiculoDataStore;
import com.iesam.domain.models.Inspeccion;
import com.iesam.domain.models.Vehiculo;

public class AñadirVehiculo {

    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public void execute(Vehiculo modelo) {
        dataStore.guardar(modelo);
    }
}
