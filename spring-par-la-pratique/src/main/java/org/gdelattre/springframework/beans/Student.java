package org.gdelattre.springframework.beans;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by guillaume on 01/08/17.
 */
@Component
public class Student {

    @Resource
    private Party person;

    public String getName() {
        return person.getName();
    }
}
