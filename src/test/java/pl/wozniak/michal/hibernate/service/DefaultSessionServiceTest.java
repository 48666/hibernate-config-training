package pl.wozniak.michal.hibernate.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pl.wozniak.michal.hibernate.entity.ClientEntity;

import static org.testng.Assert.*;

public class DefaultSessionServiceTest {
    SessionFactory sessionFactory;

    @BeforeSuite
    public void setup() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        sessionFactory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();
    }
@Test
    public void test(){
    ClientEntity clientEntity = new ClientEntity();
    try(session)

    }
}