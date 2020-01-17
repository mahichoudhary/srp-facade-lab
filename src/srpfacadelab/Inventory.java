package srpfacadelab;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private int carryingCapacity;

    private List<Item> items;

    public Inventory(int cap)
    {
        items = new ArrayList<Item>();
        carryingCapacity = cap;
    }

    public boolean checkIfItemExistsInInventory(Item item) {
    for (Item i: items) {
        if (i.getId() == item.getId())
            return true;
    }
    return false;
}

    public int calculateInventoryWeight() {
        int sum = 0;
        for (Item i: items) {
            sum += i.getWeight();
        }
        return sum;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void addItem(Item item)
    {
        items.add(item);
    }

    public List<Item> getInventory()
    {
        return items;
    }
}
