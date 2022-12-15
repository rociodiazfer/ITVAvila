package com.iesam.data;

import com.iesam.domain.models.Vehiculo;

import java.util.Map;
import java.util.TreeMap;

public class VehiculoDataStore {

    private static VehiculoDataStore instance = null;

    private Map<String, Vehiculo> dataStore = new TreeMap<>();

    public void guardar(Vehiculo model) {
        dataStore.put(model.getCodVehiculo(), model);
    }

    public void eliminar(String codigo) {
        dataStore.remove(codigo);
    }

    public Vehiculo buscar(String codigo) {
        return dataStore.get(codigo);
    }

    public void modificar(Vehiculo model) {
        dataStore.put(model.getCodVehiculo(), model);
    }

    public static VehiculoDataStore getInstance() {
        if (instance == null) {
            instance = new VehiculoDataStore();
        }
        return instance;
    }
}
