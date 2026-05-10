package com.ultratech.ecommerce.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ultratech.ecommerce.R;
import com.ultratech.ecommerce.activities.DetailActivity;
import com.ultratech.ecommerce.models.Producto;

import java.util.List;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ViewHolder> {

    private final List<Producto> productos;
    private final Context context;

    public ProductoAdapter(List<Producto> productos, Context context) {
        this.productos = productos;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imagen;
        TextView nombre, precio;

        public ViewHolder(View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imgProducto);
            nombre = itemView.findViewById(R.id.nombreProducto);
            precio = itemView.findViewById(R.id.precioProducto);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_producto, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Producto producto = productos.get(position);

        holder.nombre.setText(producto.getNombre());
        holder.precio.setText("$" + producto.getPrecio());
        holder.imagen.setImageResource(producto.getImagen());

        // Al hacer click, abrir DetailActivity con todos los datos del producto
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("nombre", producto.getNombre());
            intent.putExtra("descripcion", producto.getDescripcion());
            intent.putExtra("precio", producto.getPrecio());
            intent.putExtra("imagen", producto.getImagen());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }
}