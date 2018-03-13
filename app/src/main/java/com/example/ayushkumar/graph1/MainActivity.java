package com.example.ayushkumar.graph1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity
{
    GraphView graphView;
    LineGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //    graphView.setHorizontalLabels(new String[]{"1/1/1970", "1/2/1970", "1/3/1970"});

        graphView = (GraphView) findViewById(R.id.graphView);
        series = new LineGraphSeries<>(getDataPoint());
        graphView.addSeries(series);

        graphView.getViewport().setXAxisBoundsManual(true);
        graphView.getViewport().setMinX(0);
        graphView.getViewport().setMaxX(8);

        graphView.getViewport().setYAxisBoundsManual(true);
        graphView.getViewport().setMinY(0);
        graphView.getViewport().setMaxY(15);

        graphView.getViewport().setScrollable(true);
        graphView.getViewport().setScrollableY(true);
    }

    private DataPoint[] getDataPoint()
    {
        DataPoint [] dp = new DataPoint[]
                {
                        new DataPoint(0,38),
                        new DataPoint(1,25),
                        new DataPoint(2,39),
                        new DataPoint(3,30),
                        new DataPoint(4,22),
                        new DataPoint(5,28),
                        new DataPoint(6,28),
                        new DataPoint(7,34),
                        new DataPoint(8,31),
                        new DataPoint(9,21),
                        new DataPoint(10,50)
                };

        return dp;
    }
}
