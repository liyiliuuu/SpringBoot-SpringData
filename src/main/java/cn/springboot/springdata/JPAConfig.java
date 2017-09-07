package cn.springboot.springdata;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("cn.springboot.springdata.repository.impl")
@EntityScan("cn.springboot.springdata.entity")   
public class JPAConfig {

}
