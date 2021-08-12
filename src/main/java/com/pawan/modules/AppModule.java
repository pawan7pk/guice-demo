package com.pawan.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;
import com.pawan.annotations.ColorValue;
import com.pawan.annotations.EdgeValue;
import com.pawan.requests.SquareRequest;
import com.pawan.services.DrawShape;
import com.pawan.services.DrawSquare;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Black");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(700);
//        bind(String.class).annotatedWith(Names.named("Color")).toInstance("RED");     used to set the value with Named Annotation
        bind(SquareRequest.class).in(Scopes.SINGLETON);         //to create SquareRequest class Singleton
    }
}
