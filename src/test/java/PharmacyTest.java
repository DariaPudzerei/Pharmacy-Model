import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PharmacyTest {
    
    @Test
    public void testPharmacyCreation() {
        Pharmacy pharmacy = new Pharmacy("Аптека №1", "вул. Головна, 123");
        assertEquals("Аптека №1", pharmacy.getName());
        assertEquals("вул. Головна, 123", pharmacy.getAddress());
        assertTrue(pharmacy.isOpen());
    }
    
    @Test
    public void testPharmacyInfo() {
        Pharmacy pharmacy = new Pharmacy("24/7 Аптека", "пр. Перемоги, 45");
        String expectedInfo = "Аптека: 24/7 Аптека, Адреса: пр. Перемоги, 45, Статус: Відкрита";
        assertEquals(expectedInfo, pharmacy.getInfo());
    }
    
    @Test
    public void testSetOpen() {
        Pharmacy pharmacy = new Pharmacy("Нічна аптека", "вул. Миру, 78");
        pharmacy.setOpen(false);
        assertFalse(pharmacy.isOpen());
    }
}