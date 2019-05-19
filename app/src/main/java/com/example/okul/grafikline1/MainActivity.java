package com.example.okul.grafikline1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LineChart lineChart = (LineChart) findViewById(R.id.chart);
        LineChart lineChart2 = (LineChart) findViewById(R.id.chart2);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(84f,1));
        entries.add(new Entry(80f, 2));
        entries.add(new Entry(80f, 3));
        entries.add(new Entry(80f, 4));
        entries.add(new Entry(84f, 5));
        entries.add(new Entry(85f, 6));
        ArrayList<Entry> entries2 = new ArrayList<>();
        entries2.add(new Entry(37f, 1));
        entries2.add(new Entry(36.5f, 2));
        entries2.add(new Entry(36.7f, 3));
        entries2.add(new Entry(37.1f, 4));
        entries2.add(new Entry(38f, 5));
        entries2.add(new Entry(39f, 6));

        LineDataSet dataset = new LineDataSet(entries, "# Hasta Nabız Grafiği");
        LineDataSet dataset2 = new LineDataSet(entries2, "# Hasta Ateş Grafiği");
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("saat1");
        labels.add("saat2");
        labels.add("saat3");
        labels.add("saat4");
        labels.add("saat5");
        labels.add("saat6");

        LineData data = new LineData(labels, dataset);
        LineData data2 = new LineData(labels, dataset2);

        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        dataset.setDrawCubic(true);
        dataset.setDrawFilled(true);
       dataset2.setColors(ColorTemplate.COLORFUL_COLORS); //
       dataset2.setDrawCubic(true);
        dataset2.setDrawFilled(true);

        lineChart.setData(data);
        lineChart2.setData(data2);
        lineChart2.animateY(5000);
        lineChart.animateY(5000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
