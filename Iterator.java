interface Iterator<A> {
  boolean hasNext();
  A next();
}

class DinerMenuIterator implements Iterator<MenuItem> {
	MenuItem[] list; int position = 0;
	public DinerMenuIterator(MenuItem[] list) { this.list = list; }

	public MenuItem next() {
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
	}
 
 
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}

class PancakeHouseMenuIterator implements Iterator<MenuItem> {
	List<MenuItem> items;
	int position = 0;
 
	public PancakeHouseMenuIterator(List<MenuItem> items) {
		this.items = items;
	}
 
	public MenuItem next() {
		MenuItem item = items.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}