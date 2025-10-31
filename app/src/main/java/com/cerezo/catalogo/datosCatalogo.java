package com.cerezo.catalogo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class datosCatalogo extends AppCompatActivity {
    ImageView iv;
    TextView tituloProducto,descripcionProducto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_datos_catalogo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        iv = findViewById(R.id.iv);
        tituloProducto = findViewById(R.id.tituloProducto);
        descripcionProducto = findViewById(R.id.descripcionProducto);

        String nombreImagen = getIntent().getStringExtra(   "img");
        String tituloImg =  getIntent().getStringExtra(   "titulo");
        String descripcion =  getIntent().getStringExtra(   "descipcion");
        iv.setImageResource(getResources().getIdentifier(nombreImagen,"drawable",getPackageName()));
        tituloProducto.setText(tituloImg);
        descripcionProducto.setText(descripcion);

    }
}