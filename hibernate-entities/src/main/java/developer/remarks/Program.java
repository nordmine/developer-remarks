package developer.remarks;

import developer.remarks.models.Tailor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

    public static void main(String[] args) {
        Program loader = new Program();
        loader.start();
    }

    public void start() {
        try {
            EntityManager em = entityManagerFactory.createEntityManager();
            Tailor tailor = new Tailor();
            em.getTransaction().begin();
            tailor.setName("Mr. Tailor");
            em.persist(tailor);
            em.getTransaction().commit();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
