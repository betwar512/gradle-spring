package net.skelton.config.db;

import javax.persistence.EntityManagerFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;


@Configuration
@EntityScan("net.skelton.model")
public class DatabaseConfig {

/**
 *<p>Hibrenate model annotation mapping configuration </p>
 * @param emf <p>EntityManagger Auto confided you
 *  can explicitly define it as a bean with custom</p>
 * @return
 */
    @Bean
    public HibernateJpaSessionFactoryBean sessionFactory(EntityManagerFactory emf) {
        HibernateJpaSessionFactoryBean fact = new HibernateJpaSessionFactoryBean();
    
        fact.setEntityManagerFactory(emf);
        return fact;
    }
	
}
