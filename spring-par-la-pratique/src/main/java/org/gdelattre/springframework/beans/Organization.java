package org.gdelattre.springframework.beans;

import org.springframework.stereotype.Component;

/**
 * Created by guillaume on 01/08/17.
 */
@Component
public class Organization implements Party {
    @Override
    public String getName() {
        return null;
    }
}
