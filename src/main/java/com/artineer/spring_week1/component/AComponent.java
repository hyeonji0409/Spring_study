package com.artineer.spring_week1.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AComponent{
    BComponent bComponent;
    CComponent cComponent;
    DComponent dComponent;

    @Autowired
    public AComponent(BComponent bComponent, CComponent cComponent, DComponent dComponent){
        this.bComponent = bComponent;
        this.cComponent = cComponent;
        this.dComponent = dComponent;
    }
}
