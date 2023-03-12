package MenuLib;

import java.util.ArrayList;
import java.util.List;

public class MenuList {
    public ArrayList<Dish> MenuList;

    public MenuList(){
        MenuList = new ArrayList<>();
    }

    public void Add(Dish dish) {
        MenuList.add(dish);
    }

    public void Delete(int dish) {
        MenuList.remove(dish);
    }

    public int Count() {
        return MenuList.size();
    }

    public String Get(int index) {
        return MenuList.get(index).Name +" "+MenuList.get(index).Coast +" "+ MenuList.get(index).Calories+" "+ MenuList.get(index).VeganFriendly ;
    }
}
