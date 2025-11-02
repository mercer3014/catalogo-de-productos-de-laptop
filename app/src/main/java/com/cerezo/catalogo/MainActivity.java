package com.cerezo.catalogo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    String[] catalogo = {"Razer Portátil para juegos Blade 14 (2025)",
            "LG gram Pro - Computadora portátil ligera de 17 pulgadas",
            "MSI Katana 15 HX 15.6 165Hz QHD+ Portátil para juegos",
            "Acer Nitro V Laptop para juegos | Procesador Intel Core i7-13620H | GPU NVIDIA GeForce RTX 4050",
            "Coolby Computadora portátil, portátil de 15.6 pulgadas con pantalla FHD de 1080P, 16 GB de RAM",
            "Laptop para juegos 2025, portátil con AMD Ryzen 7 7735HS (8C/16T, hasta 4.75 GHz), 16 GB DDR5 512 GB",
            "MSI Portátil para juegos Thin 15 15.6\" 144Hz FHD: Intel Core i7-13620H",
            "ASUS TUF Gaming F16 (2024) Laptop para juegos, pantalla FHD+ 144Hz de nivel IPS 16:10, procesador Intel",
            "Laptop para juegos 2025 de 15.6 pulgadas, con 16 GB de RAM, SSD de 512 GB, procesador R5 7430U (hasta 4.3 GHz)",
            "Computadora portátil, computadora portátil, AMD Ryzen 7 5700U (8C/16T, hasta 4.3 GHz), 16 GB RAM"};
    String[] nombreImg = {"img","img_1","img_2","img_3","img_4","img_5","img_6","img_8","img_9","img_10"};

    String[] descripcion = {"\n" +
            "Marca\tRazer\n" +
            "Nombre del modelo\tRazer Hoja 14\n" +
            "Tamaño de pantalla\t14 Pulgadas\n" +
            "Color\tNegro -\n" +
            "Tamaño del disco duro\t1 TB\n" +
            "Modelo de CPU\tRyzen AI\n" +
            "Tamaño de la memoria RAM instalada\t32 GB\n" +
            "Sistema operativo\tWindows 11 Home\n" +
            "Características especiales\tCalman Pantalla verificada, Herramientas de productividad impulsadas por IA, Sistema de enfriamiento avanzadoCalman Pantalla verificada, Herramientas de productividad impulsadas por IA, Sistema de enfriamiento avanzado\n" +
            "Descripción de la tarjeta gráfica","\n" +
            "Marca\tLG\n" +
            "Nombre del modelo\t17Z90TR-E.ADB9U1\n" +
            "Tamaño de pantalla\t17 Pulgadas\n" +
            "Color\tNegro -\n" +
            "Tamaño del disco duro\t2 TB\n" +
            "Modelo de CPU\tIntel Core Ultra 9\n" +
            "Tamaño de la memoria RAM instalada\t32 GB\n" +
            "Sistema operativo\tWindows 11\n" +
            "Características especiales\tAudio HD, Ligera, Recubrimiento antidestellos, Teclado numérico, Teclado retroiluminado\n" +
            "Descripción de la tarjeta gráfica\tNVIDIA RTX5050","\n" +
            "Marca\tmsi\n" +
            "Nombre del modelo\tDelgado 15 B13VE-1697CA\n" +
            "Tamaño de pantalla\t15,6 Pulgadas\n" +
            "Color\tCosmos Gris\n" +
            "Tamaño del disco duro\t512 GB\n" +
            "Modelo de CPU\tCore i5\n" +
            "Tamaño de la memoria RAM instalada\t16 GB\n" +
            "Sistema operativo\tWindows 11 Home\n" +
            "Características especiales\tMSI App Player\n" +
            "Descripción de la tarjeta gráfica\tNVIDIA® GeForce RTX™ 4050","\n" +
            "Marca\tmsi\n" +
            "Nombre del modelo\tKatana 15 HX B14WGK-016US\n" +
            "Tamaño de pantalla\t15,6 Pulgadas\n" +
            "Color\tNegro -\n" +
            "Tamaño del disco duro\t1 TB\n" +
            "Modelo de CPU\tCore i9\n" +
            "Tamaño de la memoria RAM instalada\t32 GB\n" +
            "Sistema operativo\tWindows 11 Home\n" +
            "Características especiales\tAudio HD, Teclado retroiluminado\n" +
            "Descripción de la tarjeta gráfica\tRTX 5070","\n" +
            "Marca\tmsi\n" +
            "Nombre del modelo\tKatana 15 HX B14WGK-016US\n" +
            "Tamaño de pantalla\t15,6 Pulgadas\n" +
            "Color\tNegro -\n" +
            "Tamaño del disco duro\t1 TB\n" +
            "Modelo de CPU\tCore i9\n" +
            "Tamaño de la memoria RAM instalada\t32 GB\n" +
            "Sistema operativo\tWindows 11 Home\n" +
            "Características especiales\tAudio HD, Teclado retroiluminado\n" +
            "Descripción de la tarjeta gráfica\tRTX 5070","\n" +
            "Marca\tacer\n" +
            "Nombre del modelo\tNitro V\n" +
            "Tamaño de pantalla\t15,6 Pulgadas\n" +
            "Color\tNegro -\n" +
            "Tamaño del disco duro\t1000 GB\n" +
            "Modelo de CPU\tApple ci7\n" +
            "Tamaño de la memoria RAM instalada\t16 GB\n" +
            "Sistema operativo\tWindows 11 Home\n" +
            "Características especiales\tTeclado numérico, Teclado retroiluminado\n" +
            "Descripción de la tarjeta gráfica\tDedicada","\n" +
            "Marca\tCoolby\n" +
            "Nombre del modelo\tBTC519\n" +
            "Tamaño de pantalla\t15,6 Pulgadas\n" +
            "Tamaño del disco duro\t512 GB\n" +
            "Modelo de CPU\tPentium\n" +
            "Tamaño de la memoria RAM instalada\t16 GB\n" +
            "Sistema operativo\tWindows 11 Pro\n" +
            "Características especiales\tLigera\n" +
            "Descripción de la tarjeta gráfica\tIntegrado\n" +
            "Velocidad de la CPU\t1,1 GHz","\n" +
            "Marca\tKAIGERR\n" +
            "Nombre del modelo\tRX16\n" +
            "Tamaño de pantalla\t16 Pulgadas\n" +
            "Color\tGris\n" +
            "Tamaño del disco duro\t512 GB\n" +
            "Modelo de CPU\tRyzen 7\n" +
            "Tamaño de la memoria RAM instalada\t16 GB\n" +
            "Sistema operativo\tWindows 11\n" +
            "Características especiales\tHasta 4 TB, 2 ranuras M.2 2280, compatible con SSD M.2 NVMe PCIe3.0 o SSD SATA M.2, Ligera, Ligero, Teclado numérico, Teclado retroiluminado, Ventiladores dualesHasta 4 TB, 2 ranuras M.2 2280, compatible con SSD M.2 NVMe PCIe3.0 o SSD SATA M.2, Ligera, Ligero, Teclado numérico, Teclado retroiluminado, Ventiladores duales\n" +
            "Descripción de la tarjeta gráfica\tIntegrado","\n" +
            "Marca\tmsi\n" +
            "Nombre del modelo\tB13VE-2678US\n" +
            "Tamaño de pantalla\t15,6 Pulgadas\n" +
            "Color\tNegro -\n" +
            "Tamaño del disco duro\t512 GB\n" +
            "Modelo de CPU\tCore i7\n" +
            "Tamaño de la memoria RAM instalada\t16 GB\n" +
            "Sistema operativo\tWindows 11 Home\n" +
            "Características especiales\tAudio HD, Teclado retroiluminado\n" +
            "Descripción de la tarjeta gráfica\tRTX 4050",
            "Marca\tASUS\n" +
                    "Nombre del modelo\tTUF Gaming F16\n" +
                    "Tamaño de pantalla\t16 Pulgadas\n" +
                    "Color\tMecha Gris\n" +
                    "Tamaño del disco duro\t512 GB\n" +
                    "Modelo de CPU\tIntel Core 5\n" +
                    "Tamaño de la memoria RAM instalada\t8 GB\n" +
                    "Sistema operativo\tWindows 11 Home\n" +
                    "Características especiales\tTeclado retroiluminado\n" +
                    "Descripción de la tarjeta gráfica\tDedicada",
            "\n" +
                    "Marca\tKUMNOSAL\n" +
                    "Tamaño de pantalla\t15,6 Pulgadas\n" +
                    "Tamaño del disco duro\t512 GB\n" +
                    "Modelo de CPU\tRyzen 5\n" +
                    "Tamaño de la memoria RAM instalada\t16 GB\n" +
                    "Sistema operativo\tWind 11 Pro\n" +
                    "Características especiales\tDiseño delgado y ligero, cámara web, USB 3.2, tipo C, HDMI, pantalla FHD IPS, biseles estrechos, bisagra de 180°Diseño delgado y ligero, cámara web, USB 3.2, tipo C, HDMI, pantalla FHD IPS, biseles estrechos, bisagra de 180°\n" +
                    "Descripción de la tarjeta gráfica\tIntegrado\n" +
                    "Velocidad de la CPU\t5,6 GHz\n" +
                    "Descripción del disco duro\tSSD",
            "\n" +
                    "Marca\tKAIGERR\n" +
                    "Nombre del modelo\tLX15PRO\n" +
                    "Tamaño de pantalla\t15,6 Pulgadas\n" +
                    "Color\tGris C\n" +
                    "Tamaño del disco duro\t512 GB\n" +
                    "Modelo de CPU\tRyzen 7 5700U\n" +
                    "Tamaño de la memoria RAM instalada\t16 GB\n" +
                    "Sistema operativo\tWindows 11\n" +
                    "Características especiales\tRanura de tarjeta de memoria, Teclado numérico\n" +
                    "Descripción de la tarjeta gráfica\tIntegrado"};
    public void cargarDatos (View v){
            ImageView ib = (ImageView) v;
            Intent ventana = new Intent(this, datosCatalogo.class);
            int tag =Integer.parseInt(ib.getTag().toString());
            ventana.putExtra("img",nombreImg[tag]);
            ventana.putExtra("titulo",catalogo[tag]);
            ventana.putExtra("descipcion",descripcion[tag]);

            startActivity(ventana);
    }
}