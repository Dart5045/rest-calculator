package com.sanitas.calculator.config;

import io.corp.calculator.TracerImpl;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

@Configuration
public class TracerSingleton {

    private static TracerImpl tracerImpl;

    public TracerSingleton(){
        if(Objects.isNull(tracerImpl)){
            tracerImpl = new TracerImpl();
        }
    }


    public void trace( String res){
        this.tracerImpl.trace( res );
    }
}