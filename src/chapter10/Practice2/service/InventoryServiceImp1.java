package chapter10.Practice2.service;

import chapter10.Practice2.entity.Item;
import chapter10.Practice2.repository.ItemRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class InventoryServiceImp1 implements  InventoryService{
    private ItemRepository repository;

    public InventoryServiceImp1(ItemRepository repository){
        this.repository = repository;
    }

    @Override
    public void addItem(Item item) {
        repository.addItem(item);
    }

    @Override
    public void updateItemPrice(String itemId, int newPrice) {
        Item item = repository.findById(itemId);

        if(item != null) {
            item.setPrice(newPrice);
        }
    }

    @Override
    public void deleteItem(String itemId) {
        Item item = repository.findById(itemId);
        if(item != null) {
            repository.removeItem(itemId);
        }
    }

    @Override
    public List<Item> getItemByCategory(String category) {
        Set<Item> allItems = repository.findAll();
        List<Item>  categoryItems = new ArrayList<>();

        for(Item item : allItems) {
            if(item.getCategory().equalsIgnoreCase(category)) {
                categoryItems.add(item);
            }
        }
        return categoryItems;
    }
}
