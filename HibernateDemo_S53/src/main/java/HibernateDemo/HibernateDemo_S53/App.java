package HibernateDemo.HibernateDemo_S53;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {

    public static void main(String[] args) {

        StandardServiceRegistry ssr =
                new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        Metadata md = new MetadataSources(ssr)
                .getMetadataBuilder()
                .build();

        SessionFactory sf = md.getSessionFactoryBuilder().build();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();

        Employee e = new Employee();
        e.setRegno(1);
        e.setFname("Prasanth");
        e.setLname("Ineni");

        s.save(e);

        t.commit();
        s.close();
        sf.close();

        System.out.println("✅ Connected & Inserted Successfully");
    }
}
