package com.xyz.product.catalogue.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages={"com.xyz.product.catalogue.repository"})
public class Config {

}
