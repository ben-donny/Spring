package org.gdelattre.springframework.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by guillaume on 01/08/17.
 */
@Component
public class Person implements Party {

    @Value("${person.name}")
    private String name;

    @Override
    public String getName() {
        return name;
    }
}
