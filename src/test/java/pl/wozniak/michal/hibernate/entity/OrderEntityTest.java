package pl.wozniak.michal.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.transaction.Transactional;

import java.math.BigDecimal;

import static org.testng.Assert.*;

public class OrderEntityTest {
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
    @Transactional
    public void test(){
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setTotal(BigDecimal.ONE);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(orderEntity);
        transaction.commit();

    }

}