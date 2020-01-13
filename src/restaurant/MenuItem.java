package restaurant;

public class MenuItem {

    private String menuItemName;
    private double price;
    private String description;
    private String category;
    private String age;

    public MenuItem (String menuItemName, double price, String description, String category, String age) {
        this.menuItemName = menuItemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.age = age;
    }

    public MenuItem (String menuItemName, double price, String description, String category) {
        this(menuItemName, price, description, category, "New");
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getAge() {
        return age;
    }

    protected void setAge(String aAge) {
        age = aAge;
    }
}
