import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {
        try {
            logger.info("Application started");
            System.out.println("Hello! It is a new project!!!");
            
            Pharmacy pharmacy = new Pharmacy("Аптека №1", "вул. Головна, 123");
            System.out.println(pharmacy.getInfo());
            
            logger.info("Application completed successfully");
        } catch (Exception e) {
            logger.error("Error while running application", e);
        }
    }
}