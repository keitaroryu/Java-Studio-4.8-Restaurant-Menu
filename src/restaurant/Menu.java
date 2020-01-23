package restaurant;

import java.util.ArrayList;
import java.util.Date;


public class Menu {

    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem (MenuItem item) {

        for(MenuItem i: menuItems){
            i.setAge("Old");
        }

        menuItems.add(item);
        item.setAge("New");

        lastUpdated = new Date();
    }

    public void removeMenuItem (MenuItem item) {
        menuItems.remove(item);
    }

    public void printAllMenuItems(){
        for(MenuItem i: menuItems) {
            System.out.println("\n<<" + i.getCategory() + ">> " + i.getMenuItemName() + " " + i.getPrice() + "\n" + i.getDescription());
        }
    }

    public void printNewMenuItems(){
        for(MenuItem i: menuItems) {
            if(i.getAge().equals("New")) {
                System.out.println("\n<<" + i.getCategory() + ">> " + i.getMenuItemName() + " " + i.getPrice() + "\n" + i.getDescription());
            }
        }
    }

}
