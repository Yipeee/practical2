package model;

/**
 * Created by asus on 11/12/2015.
 */

        import javax.persistence.EntityManagerFactory;
        import javax.persistence.Persistence;


public class EMF {
    private static final EntityManagerFactory emfInstance = Persistence.createEntityManagerFactory("bookstore");
    private EMF() {}
    public static EntityManagerFactory get() {
        return emfInstance;
    }
}
