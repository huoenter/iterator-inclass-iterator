public class Waitress {
  PancakeHouseMenu phm = new PancakeHouseMenu();
  DinerMenu dm = new DinerMenu();

  public void printMenu() {
    Iterator<MenuItem> iter;
    // rewrite the for loops to while loops
    for (iter=phm.createIterator(); iter.hasNext();) {
      System.out.println(iter.next());
    }

    iter = dm.createIterator();

    while (iter.hasNext()) {
      System.out.println(iter.next());
    }
  }
}