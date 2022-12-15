package com.iesam.data;


import com.iesam.domain.models.Inspeccion;

import java.util.Map;
import java.util.TreeMap;

public class InspeccionDataStore {
    private static InspeccionDataStore instance = null;

    private Map<String, Inspeccion> dataStore = new TreeMap<>();

    public void guardar(Inspeccion model) {
        dataStore.put(model.getCodInspeccion(1), model);
    }

    public void eliminar(String codigo) {
        dataStore.remove(codigo);
    }

    public Inspeccion buscar(String codigo) {
        return dataStore.get(codigo);
    }

    public void modificar(Inspeccion model) {
        dataStore.put(model.getCodInspeccion(1), model);
    }

    public static InspeccionDataStore getInstance() {
        if (instance == null) {
            instance = new InspeccionDataStore();
        }
        return instance;
    }
}
