package com.ultratech.ecommerce.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ultratech.ecommerce.R;
import com.ultratech.ecommerce.adapters.ProductoAdapter;
import com.ultratech.ecommerce.utils.FavoritosManager;

public class SavedActivity extends AppCompatActivity {

    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved);

        recycler = findViewById(R.id.recyclerSaved);
        ProductoAdapter adapter =
                new ProductoAdapter(FavoritosManager.obtenerFavoritos(), this);

        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigation);
        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_home) {
                startActivity(new Intent(this, HomeActivity.class));
                return true;
            } else if (id == R.id.nav_search) {
                startActivity(new Intent(this, SearchActivity.class));
                return true;
            } else if (id == R.id.nav_saved) return true;
            else if (id == R.id.nav_profile) {
                startActivity(new Intent(this, ProfileActivity.class));
                return true;
            }
            return false;
        });
    }
}