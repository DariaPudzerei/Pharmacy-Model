import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pharmacy {
    private static final Logger logger = LogManager.getLogger(Pharmacy.class);
    
    private String name;
    private String address;
    private boolean isOpen;
    
    public Pharmacy(String name, String address) {
        logger.info("Creating new Pharmacy: name={}, address={}", name, address);
        this.name = name;
        this.address = address;
        this.isOpen = true;
        logger.debug("Pharmacy created successfully");
    }
    
    public String getName() {
        logger.debug("Getting pharmacy name: {}", name);
        return name;
    }
    
    public String getAddress() {
        logger.debug("Getting pharmacy address: {}", address);
        return address;
    }
    
    public boolean isOpen() {
        logger.debug("Checking if pharmacy is open: {}", isOpen);
        return isOpen;
    }
    
    public void setOpen(boolean open) {
        logger.info("Changing pharmacy status from {} to {}", isOpen, open);
        isOpen = open;
    }
    
    public String getInfo() {
        logger.debug("Getting pharmacy info");
        return "Аптека: " + name + ", Адреса: " + address + 
               ", Статус: " + (isOpen ? "Відкрита" : "Закрита");
    }
}