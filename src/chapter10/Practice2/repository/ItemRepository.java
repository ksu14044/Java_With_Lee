package chapter10.Practice2.repository;

import chapter10.Practice2.entity.Item;

import java.util.Set;

public interface ItemRepository {
    void addItem (Item item);
    void removeItem (String itemID);
    Item findById(String itemID);
    Set<Item> findAll();
}
