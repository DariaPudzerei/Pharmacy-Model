import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PharmacyTest {
    
    @Mock
    private Pharmacy mockPharmacy;
    
    @Test
    public void testPharmacyCreation() {
        Pharmacy pharmacy = new Pharmacy("Аптека №1", "вул. Головна, 123");
        assertEquals("Аптека №1", pharmacy.getName());
        assertEquals("вул. Головна, 123", pharmacy.getAddress());
        assertTrue(pharmacy.isOpen());
    }
    
    @Test
    public void testMockedPharmacy() {
        when(mockPharmacy.getName()).thenReturn("Мок Аптека");
        when(mockPharmacy.getAddress()).thenReturn("Мок Адреса");
        when(mockPharmacy.isOpen()).thenReturn(true);
        
        assertEquals("Мок Аптека", mockPharmacy.getName());
        assertEquals("Мок Адреса", mockPharmacy.getAddress());
        assertTrue(mockPharmacy.isOpen());
        
        verify(mockPharmacy, times(1)).getName();
        verify(mockPharmacy, times(1)).getAddress();
        verify(mockPharmacy, times(1)).isOpen();
    }
    
    @Test
    public void testSetOpen() {
        Pharmacy pharmacy = new Pharmacy("Нічна аптека", "вул. Миру, 78");
        pharmacy.setOpen(false);
        assertFalse(pharmacy.isOpen());
    }
}