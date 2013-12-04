package developer.remarks;

import developer.remarks.models.Book;
import developer.remarks.models.Content;
import developer.remarks.models.Music;
import developer.remarks.services.MediaService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

    private static Logger logger = Logger.getLogger(Program.class);

    public static void main(String[] args) {
        Program loader = new Program();
        loader.run();
    }

    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
        MediaService service = (MediaService) context.getBean("storageService");
        service.save(getBook());
        service.save(getTrack());
        logger.info("Список всех элементов библиотеки мультимедиа:");
        for (Content content : service.getAll()) {
            logger.info(content);
        }
    }

    private Content getBook() {
        Book book = new Book();
        book.setTitle("Над пропастью во ржи");
        book.getAuthor().setFirstName("Джером");
        book.getAuthor().setMiddleName("Дэвид");
        book.getAuthor().setLastName("Сэлинджер");
        book.setPageCount(500);
        return book;
    }

    private Content getTrack() {
        Music track = new Music();
        track.setTitle("Moby - Lift Me Up");
        track.getAuthor().setFirstName("Ричард");
        track.getAuthor().setMiddleName("Мэлвилл");
        track.getAuthor().setLastName("Холл");
        track.setBitRate(256);
        return track;
    }

}
