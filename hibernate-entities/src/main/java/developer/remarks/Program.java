package developer.remarks;

import developer.remarks.models.Article;
import developer.remarks.models.Music;
import developer.remarks.models.Picture;

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
            saveTrack(em);
            saveWallpaper(em);
            em.getTransaction().commit();
        } catch (Throwable e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    private void saveBook(EntityManager em) {
        Article book = new Article();
        book.setTitle("Над пропастью во ржи");
        book.setCreated(new Date());
        em.persist(book);
    }

    private void saveTrack(EntityManager em) {
        Music track = new Music();
        track.setTitle("Moby - Lift Me Up");
        track.setBitRate(256);
        em.persist(track);
    }

    private void saveWallpaper(EntityManager em) {
        Picture wallpaper = new Picture();
        wallpaper.setTitle("Нескучные обои для рабочего стола");
        wallpaper.setWidth(1280);
        wallpaper.setHeight(1024);
        em.persist(wallpaper);
    }

}
