package com.iesam.domain.UseCase;

import com.iesam.data.PropietarioDataStore;
import com.iesam.data.VehiculoDataStore;
import com.iesam.domain.models.Propietario;
import com.iesam.domain.models.Vehiculo;

public class AñadirPropietario {

    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

      public void execute(Propietario modelo) {
        dataStore.guardar(modelo);
    }
}
