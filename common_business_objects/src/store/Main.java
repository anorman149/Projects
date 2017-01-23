package store;

import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import store.access.Role;
import store.application.Application;
import store.application.Store;
import store.application.User;

import javax.persistence.metamodel.EntityType;
import java.util.List;

/**
 * Created by Adam on 12/20/2016.
 */
public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure() // configures settings from hibernate.cfg.xml
                    .build();

            ourSessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();

        try {
            System.out.println("querying all the managed entities...");
//            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
//            for (EntityType<?> entityType : metamodel.getEntities()) {
//                final String entityName = entityType.getName();
//                final Query query = session.createQuery("from " + entityName);
//                System.out.println("executing: " + query.getQueryString());
//                for (Object o : query.list()) {
//                    System.out.println("  " + o.toString());
//                }
//            }

            List<Role> roles = session.createQuery(" FROM Role ").list();
            for(Role role : roles){
                System.out.println("result: " + role.getApplications().size());
            }
        } finally {
            System.out.println("Done");
            session.close();
//            System.exit(0);
        }
    }
}