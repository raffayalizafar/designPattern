package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TreasureChest {

	private final List<Item> items;

	  public TreasureChest() {
	    items = List.of(
	        new Item(ItemType.RING, "Ring of time"),
	        new Item(ItemType.POTION, "Potion of healing"),
	        new Item(ItemType.WEAPON, "Sword of steel"),
	        new Item(ItemType.RING, "Ring of armor"),
	        new Item(ItemType.WEAPON, "Dagger of poison"));
	  }

	  ItemIterator iterator(ItemType itemType) {
		    return new TreasureChestItemIterator(this, itemType);
		  }
	  public List<Item> getItems() {
	    List<Item> list = new ArrayList<>();
	    list.addAll(items);
	    return list;
	  }

}
