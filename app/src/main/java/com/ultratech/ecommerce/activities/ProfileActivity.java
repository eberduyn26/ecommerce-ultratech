package com.ultratech.ecommerce.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ultratech.ecommerce.R;

public class ProfileActivity extends AppCompatActivity {

    Button btnCerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnCerrar = findViewById(R.id.btnCerrar);
        btnCerrar.setOnClickListener(v -> finish()); // cierra sesión

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigation);
        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_home) {
                startActivity(new Intent(this, HomeActivity.class));
                return true;
            } else if (id == R.id.nav_search) {
                startActivity(new Intent(this, SearchActivity.class));
                return true;
            } else if (id == R.id.nav_saved) {
                startActivity(new Intent(this, SavedActivity.class));
                return true;
            } else if (id == R.id.nav_profile) return true;
            return false;
        });
    }
}