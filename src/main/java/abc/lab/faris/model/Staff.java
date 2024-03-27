package abc.lab.faris.model;

public class Staff {
    
    private int staffId;
    private String name;
    private String description;
    
    public Staff(int staffId, String name, String description) {
        this.staffId = staffId;
        this.name = name;
        this.description = description;
    }
    
    public Staff(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Staff() {
        
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
