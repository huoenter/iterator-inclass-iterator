public class Main {}

class MenuItem {
  String name; String desc; boolean isVeggie; double price;
  public MenuItem(String n, String d, boolean v, double p) {
    name = n; desc = d; isVeggie = v; price = p; }
  public String toString() { return name + " " + price + "\n" + desc + "\n"; }
}

class PancakeHouseMenu {
  List<MenuItem> menuItems;
  public PancakeHouseMenu() {
    menuItems = new ArrayList<>();
    addItem("K&B's Pancake Breakfast",
			"Pancakes with scrambled eggs, and toast",
			true,
			2.99);

		addItem("Regular Pancake Breakfast",
			"Pancakes with fried eggs, sausage",
			false,
			2.99);
  }
  public void addItem(String name, String desc, boolean veg, double price) {
		MenuItem menuItem = new MenuItem(name, desc, veg, price);
		menuItems.add(menuItem);
	}

  // public List<MenuItem> getMenuItems() { return menuItems; }
  public Iterator<MenuItem> createIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }
}

public class DinerMenu {
	static final int MAX_ITEMS = 16;
	int numberOfItems = 0;
	MenuItem[] menuItems;
  
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT",
			"(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT",
			"Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day",
			"Soup of the day, with a side of potato salad", false, 3.29);
	}
  
	public void addItem(String name, String desc, boolean veg, double price) {
		MenuItem menuItem = new MenuItem(name, desc, veg, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	// public MenuItem[] getMenuItems() { return menuItems; }
  public Iterator<MenuItem> createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}
