package com.iesam.domain.UseCase;

import com.iesam.data.VehiculoDataStore;
import com.iesam.domain.models.Vehiculo;

public class AlmacenarVehiculoUseCase {

    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public void execute(Vehiculo modelo) {
        dataStore.guardar(modelo);
    }
}
