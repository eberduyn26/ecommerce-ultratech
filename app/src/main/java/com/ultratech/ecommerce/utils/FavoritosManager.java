package com.ultratech.ecommerce.utils;

import com.ultratech.ecommerce.models.Producto;

import java.util.ArrayList;
import java.util.List;

public class FavoritosManager {

    public static List<Producto> favoritos = new ArrayList<>();

    public static void agregarFavorito(Producto producto){
        favoritos.add(producto);
    }

    public static List<Producto> obtenerFavoritos(){
        return favoritos;
    }

}