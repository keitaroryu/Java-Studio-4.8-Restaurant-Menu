package restaurant;

import java.util.ArrayList;

public class Menu {

    private String lastUpdated;
    private ArrayList<MenuItem> menuItems;

    public String getLastUpdated() {
        return lastUpdated;
    }

    protected void setLastUpdated(String aLastUpdated) {
        lastUpdated = aLastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    protected void setMenuItems(ArrayList<MenuItem> aMenuItems) {
        menuItems = aMenuItems;
    }
}
