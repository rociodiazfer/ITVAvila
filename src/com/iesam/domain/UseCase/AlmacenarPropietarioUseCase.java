package com.iesam.domain.UseCase;

import com.iesam.data.PropietarioDataStore;
import com.iesam.domain.models.Propietario;

public class AlmacenarPropietarioUseCase {

    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

      public void execute(Propietario modelo) {
        dataStore.guardar(modelo);
    }
}
