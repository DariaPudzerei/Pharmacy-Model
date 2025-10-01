public class Pharmacy {
    private String name;
    private String address;
    private boolean isOpen;
    
    public Pharmacy(String name, String address) {
        this.name = name;
        this.address = address;
        this.isOpen = true;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public boolean isOpen() {
        return isOpen;
    }
    
    public void setOpen(boolean open) {
        isOpen = open;
    }
    
    public String getInfo() {
        return "Аптека: " + name + ", Адреса: " + address + 
               ", Статус: " + (isOpen ? "Відкрита" : "Закрита");
    }
}