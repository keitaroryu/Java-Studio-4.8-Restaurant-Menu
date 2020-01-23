package restaurant;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        Menu winterMenu = new Menu();

        MenuItem soulWarmingChili = new MenuItem("Soul Warming Chili", 4.99,
                "A bowl of our soul warming chili made with ground beef and beans spiced to warm your body.",
                "Appetizer");
        MenuItem turkeyDinner = new MenuItem("Turkey Dinner", 15.99,
                "Traditional turkey dinner with green beans and mash potatoes.", "Main Course");
        MenuItem blackberryCobbler = new MenuItem("Blackberry Cobbler", 5.99,
                "A slice of cobbler filled with blackberries.", "Dessert");


        winterMenu.addMenuItem(soulWarmingChili);
        winterMenu.addMenuItem(turkeyDinner);
        winterMenu.addMenuItem(blackberryCobbler);

        System.out.println(winterMenu.getLastUpdated());

        winterMenu.printAllMenuItems();
        System.out.println("-----------");
        winterMenu.printNewMenuItems();

    }
}
