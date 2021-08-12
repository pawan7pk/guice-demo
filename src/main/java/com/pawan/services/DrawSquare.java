package com.pawan.services;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.pawan.annotations.ColorValue;
import com.pawan.annotations.EdgeValue;

public class DrawSquare implements DrawShape {

    private String color;
    private Integer edge;

    @Inject
    public DrawSquare(@ColorValue String color, @EdgeValue Integer edge) {
        this.color = color;
        this.edge = edge;
    }

/*    @Inject
    public DrawSquare(@Named("Color") String color) {
        this.color = color;
    }*/

    @Override
    public void draw() {
        System.out.println("Task performed to draw with color: " + color + " and edge : " + edge);
    }
}
