package org.gdelattre.springframework.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.inject.Inject;

/**
 * Spring configuration with annotations.
 */
@Configuration
@PropertySource("classpath:/beans.properties")
public class Config {

    @Inject
    Environment env;

    @Value("${chaine}")
    String chaine;

    @Value("${entier}")
    String entier;

    @Bean
    public InjectionByConstructorBean unBean() {
//        return new InjectionByConstructorBean("valeur", 10);
//        return new InjectionByConstructorBean(env.getProperty("chaine"),
//                                              Integer.valueOf(env.getProperty("entier")));
        return new InjectionByConstructorBean(chaine, Integer.valueOf(entier));
    }
}
