package restaurant;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        Menu winterMenu = new Menu();
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        MenuItem soulWarmingChili = new MenuItem("Soul Warming Chili", 4.99,
                "A bowl of our soul warming chili made with ground beef and beans spiced to warm your body.",
                "Appetizer");
        MenuItem turkeyDinner = new MenuItem("Turkey Dinner", 15.99,
                "Traditional turkey dinner with green beans and mash potatos.", "Main Course");
        MenuItem blackberryCobbler = new MenuItem("Blackberry Cobbler", 5.99,
                "A slice of cobbler filled with blackberries.", "Dessert", "Old");


        menuItems.add(soulWarmingChili);
        menuItems.add(turkeyDinner);
        menuItems.add(blackberryCobbler);

        winterMenu.setLastUpdated("January 13, 2020.");
        winterMenu.setMenuItems(menuItems);

        turkeyDinner.setAge("Old");

        System.out.println("\nWelcome to the Java Dinner!");
        System.out.println("Please have a seat and look at our menu. A server will be with you shortly.\n");
        System.out.println("Menu Last Updated: " + winterMenu.getLastUpdated() + "\n");

        for (MenuItem i: winterMenu.getMenuItems()) {
            String newItem ="";

            if(i.getAge().equals("New")){
                newItem = "New Item!";
            }

            System.out.println(i.getMenuItemName() + " <<" + i.getCategory() + ">> " + newItem);
            System.out.println("$" + i.getPrice());
            System.out.println(i.getDescription() + "\n");
        }

    }
}
