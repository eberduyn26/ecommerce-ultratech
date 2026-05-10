package com.ultratech.ecommerce.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ultratech.ecommerce.R;
import com.ultratech.ecommerce.models.Producto;
import com.ultratech.ecommerce.utils.FavoritosManager;

public class DetailActivity extends AppCompatActivity {

    ImageView imgProducto;
    TextView nombreProducto, precioProducto, descripcionProducto;
    Button btnComprar, btnGuardar;
    Producto producto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgProducto = findViewById(R.id.imgProducto);
        nombreProducto = findViewById(R.id.nombreProducto);
        precioProducto = findViewById(R.id.precioProducto);
        descripcionProducto = findViewById(R.id.descripcionProducto);
        btnComprar = findViewById(R.id.btnComprar);
        btnGuardar = findViewById(R.id.btnGuardar);

        // Recibir datos del producto enviados desde HomeActivity o SearchActivity
        String nombre = getIntent().getStringExtra("nombre");
        String descripcion = getIntent().getStringExtra("descripcion");
        double precio = getIntent().getDoubleExtra("precio", 0);
        int imagen = getIntent().getIntExtra("imagen", R.drawable.audifonos);

        // Llenar vistas con los datos
        nombreProducto.setText(nombre);
        descripcionProducto.setText(descripcion);
        precioProducto.setText("$" + precio);
        imgProducto.setImageResource(imagen);

        // Acción del botón Comprar
        btnComprar.setOnClickListener(v -> {
            Toast.makeText(this, "Producto comprado", Toast.LENGTH_SHORT).show();
        });

        // Acción del botón Guardar favorito
        btnGuardar.setOnClickListener(v -> {
            producto = new Producto(nombre, descripcion, imagen, precio);
            FavoritosManager.agregarFavorito(producto);
            Toast.makeText(this, "Producto guardado", Toast.LENGTH_SHORT).show();
        });
    }
}