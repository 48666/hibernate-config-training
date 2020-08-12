package pl.wozniak.michal.hibernate.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import pl.wozniak.michal.hibernate.entity.OrderEntity;

import javax.transaction.Transactional;
import java.math.BigDecimal;

public class MainService {
    @Transactional
    public static void main(String[] args) {
//        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//                .configure()
//                .build();
//
//        SessionFactory sessionFactory = new MetadataSources(registry)
//                .buildMetadata()
//                .buildSessionFactory();

        Session session = DefaultSessionService.getSession();

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setTotal(BigDecimal.valueOf(12.6));

//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.persist(orderEntity);
//        transaction.commit();
//        sessionFactory.close();
        OrderEntity foundOrderEntity = session.find(OrderEntity.class, 1L);
        System.out.println(foundOrderEntity);
        Query query = session.createQuery("select o from OrderEntity o where o.total > 22");
        System.out.println(query.getResultList());
//        query.executeUpdate();

//transaction.commit();
    }
}
