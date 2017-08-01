package org.gdelattre.springframework;

import org.gdelattre.springframework.beans.Config;
import org.gdelattre.springframework.beans.InjectionByConstructorBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * UT for @see org.gdelattre.springframework.beans.Config
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={Config.class})
public class ConfigurationAnnotationTest {

    @Autowired
    InjectionByConstructorBean injectionByConstructorBean;

    @Test
    public void testGetBean() {
        Assert.assertEquals("valeur", injectionByConstructorBean.getChaine());
        Assert.assertEquals(10, injectionByConstructorBean.getEntier());
    }
}
