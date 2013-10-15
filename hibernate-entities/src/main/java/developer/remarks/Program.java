package developer.remarks;

import developer.remarks.models.Book;
import developer.remarks.models.Music;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Program {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

    public static void main(String[] args) {
        Program loader = new Program();
        loader.start();
    }

    public void start() {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        try {
            saveBook(em);
//            saveTrack(em);
            em.getTransaction().commit();
        } catch (Throwable e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    private void saveBook(EntityManager em) {
        Book book = new Book();
        book.setTitle("Над пропастью во ржи");
        book.getAuthor().setFirstName("Джером");
        book.getAuthor().setMiddleName("Дэвид");
        book.getAuthor().setLastName("Сэлинджер");
        book.setCreated(new Date());
        em.persist(book);
        em.detach(book);
        book.setId(null);
        em.persist(book);

//        em.refresh(book);
//        book = em.unwrap(book.getClass());
//        em.merge(book);
//        em.merge(book);
    }

    private void saveTrack(EntityManager em) {
        Music track = new Music();
        track.setTitle("Moby - Lift Me Up");
        track.getAuthor().setFirstName("Ричард");
        track.getAuthor().setMiddleName("Мэлвилл");
        track.getAuthor().setLastName("Холл");
        track.setBitRate(256);
        em.persist(track);
    }

}
