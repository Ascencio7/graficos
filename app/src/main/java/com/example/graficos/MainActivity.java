package com.example.graficos;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import java.util.ArrayList;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LineChart graficaLineal = findViewById(R.id.lineChart);

        ArrayList<Entry> entries = new ArrayList<>();

        entries.add(new Entry(0,10));
        entries.add(new Entry(1,20));
        entries.add(new Entry(2,30));
        entries.add(new Entry(3,40));
        entries.add(new Entry(4,50));
        entries.add(new Entry(5,60));
        entries.add(new Entry(6,70));
        entries.add(new Entry(7,80));
        entries.add(new Entry(8,90));
        entries.add(new Entry(9,100));

        // Crear el conjunto de datos y configurar sus propiedades
        LineDataSet conjuntoDatos = new LineDataSet(entries, "Datos de ejemplo");
        conjuntoDatos.setColor(Color.BLUE);
        conjuntoDatos.setValueTextColor(Color.RED);

        // Configurar el conjunto de datos en la grafica
        LineData datosLineas = new LineData(conjuntoDatos);
        graficaLineal.setData(datosLineas);

        // Actualiza la grafica
        graficaLineal.invalidate();

    }
}