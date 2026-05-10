package com.ultratech.ecommerce.utils;

import com.ultratech.ecommerce.R;
import com.ultratech.ecommerce.models.Producto;

import java.util.ArrayList;
import java.util.List;

public class DataProductos {

    public static List<Producto> obtenerProductos(){

        List<Producto> lista = new ArrayList<>();

        lista.add(new Producto(
                "Audífonos Bluetooth",
                "Audífonos inalámbricos con cancelación de ruido",
                R.drawable.audifonos,
                120000
        ));

        lista.add(new Producto(
                "Smartwatch",
                "Reloj inteligente con monitoreo de salud",
                R.drawable.smartwatch,
                180000
        ));

        lista.add(new Producto(
                "Teclado Gamer",
                "Teclado mecánico RGB",
                R.drawable.teclado,
                90000
        ));

        lista.add(new Producto(
                "Mouse Gamer",
                "Mouse ergonómico de alta precisión",
                R.drawable.mouse,
                60000
        ));

        return lista;
    }
}