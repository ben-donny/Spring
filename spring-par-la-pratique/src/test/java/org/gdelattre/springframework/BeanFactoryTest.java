package org.gdelattre.springframework;

import org.gdelattre.springframework.beans.InjectionByConstructorBean;
import org.gdelattre.springframework.beans.InjectionByModifierBean;
import org.gdelattre.springframework.beans.Party;
import org.gdelattre.springframework.beans.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by guillaume on 01/08/17.
 */
public class BeanFactoryTest {

    private ApplicationContext context;

    @Before
    public void init() {
        context = new
                ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void testGetBeanCB() {
        InjectionByConstructorBean monBean = (InjectionByConstructorBean) context.getBean("beanCB");

        Assert.assertEquals("valeur", monBean.getChaine());
        Assert.assertEquals(10, monBean.getEntier());
    }

    @Test
    public void testGetBeanM() {
        InjectionByModifierBean monBean = (InjectionByModifierBean) context.getBean("beanM");

        Assert.assertEquals("valeur", monBean.getChaine());
        Assert.assertEquals(10, monBean.getEntier());
    }

    @Test
    public void testGetPersonBean() {
        Party person = (Party)context.getBean("person");
        Assert.assertEquals("guillaume", person.getName());

        Student student = (Student) context.getBean("student");
        Assert.assertEquals("guillaume", student.getName());
    }
}
