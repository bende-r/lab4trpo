package ConsoleMenu;

import MenuLib.Dish;
import MenuLib.Drinks;
import MenuLib.MenuList;
import MenuLib.Toasts;


public class ConsoleMenuMain {
    public static void main(String[] args) {
        MenuList menu = new MenuList();

        Drinks tecila = new Drinks("Текила", 1000, 100, false);
        Drinks milkshake = new Drinks("Молочный коктель", 100, 100, false);
        Drinks water = new Drinks("Вода", 10, 100, true);
        Drinks tea = new Drinks("Чай", 15, 100, true);
        Drinks coffe = new Drinks("Кофе", 20, 100, true);
        Drinks applejuise = new Drinks("Яблочный сок", 30, 100, true);
        menu.Add(tecila);
        menu.Add(milkshake);
        menu.Add(water);
        menu.Add(tea);
        menu.Add(coffe);
        menu.Add(applejuise);
        Toasts toastwithstrawberryjam = new Toasts("Тост с клубничным вареньем", 50, 350, true);
        Toasts toastwithblueberriejam = new Toasts("Тост с черничным вареньем", 50, 300, true);
        Toasts toastwithapricotjam = new Toasts("Тост с абрикосовым вареньем", 50, 320, true);
        Toasts toastwithbutterjam = new Toasts("Тост с маслом", 50, 400, true);
        Toasts toastwithcreamjam = new Toasts("Тост с кремом", 50, 200, true);
        menu.Add(toastwithapricotjam);
        menu.Add(toastwithblueberriejam);
        menu.Add(toastwithstrawberryjam);
        menu.Add(toastwithbutterjam);
        menu.Add(toastwithcreamjam);

        System.out.println("\nМеню:\n");

        for (int i = 0; i < menu.Count(); i++) {
            System.out.println(menu.Get(i));
        }

        System.out.println("\nВеганское меню:\n");

        for (int i = 0; i < menu.Count(); i++) {
            if (menu.MenuList.get(i).VeganFriendly)
                System.out.println(menu.Get(i));
        }

        System.out.print("\nСредняя стоимость блюд с калорийностью более 300:\n");

        float AveregaCalories = 0;
        int k = 0;

        for (int i = 0; i < menu.Count(); i++) {
            if (menu.MenuList.get(i).Calories > 300) {
                AveregaCalories += menu.MenuList.get(i).Calories;
                k++;
            }
        }
        AveregaCalories /= k;
        System.out.println(AveregaCalories);
    }
}

