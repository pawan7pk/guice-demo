package com.pawan.requests;

import com.google.inject.Inject;
import com.pawan.services.DrawShape;

public class SquareRequest {
//    DrawShape drawShape;

    @Inject
    DrawShape drawShape;    //inject using field

    /*@Inject
    public SquareRequest(DrawShape drawShape) {     //inject using constructor
        this.drawShape = drawShape;
    }*/

    public void makeRequest() {
        drawShape.draw();
    }

    /*@Inject
    public void setDrawShape(DrawShape drawShape) {         //inject using method
        this.drawShape = drawShape;
    }*/
}
