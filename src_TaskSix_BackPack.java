package TaskSix;

import java.util.ArrayList;
import java.util.List;

public class BackPack {

    private List<Things> things = new ArrayList<>();

    private static List<Things> bestItems;

    private static double maxW = 12;

    private static double bestPrice;

    public BackPack() {
        things.add(new Laptop());
        things.add(new Book());
        things.add(new Diary());
        things.add(new Notebook());
        things.add(new Pen());
    }

    public static void main(String[] args) {
        BackPack backPack = new BackPack();
        MakeAllSets(backPack.things);
        List<Things> rez = GetBestSet();
        System.out.print("Мы с собой возмем: ");
        for (Things x : rez) {
            System.out.print(x.getName() + " ");
        }
    }

    //вычисляет общий вес набора предметов
    private static double CalcWeigth(List<? extends Things> items) {
        double sumW = 0;

        for (Things i : items) {
            sumW += i.getWeight();
        }

        return sumW;
    }

    //вычисляет общую стоимость набора предметов
    private static double CalcPrice(List<Things> items) {
        double sumPrice = 0;

        for (Things i : items) {
            sumPrice += i.getCost();
        }

        return sumPrice;
    }

    //проверка, является ли данный набор лучшим решением задачи
    private static void CheckSet(List<Things> items) {
        if (bestItems == null) {
            if (CalcWeigth(items) <= maxW) {
                bestItems = items;
                bestPrice = CalcPrice(items);
            }
        } else {
            if (CalcWeigth(items) <= maxW && CalcPrice(items) > bestPrice) {
                bestItems = items;
                bestPrice = CalcPrice(items);
            }
        }
    }

    //создание всех наборов перестановок значений
    public static void MakeAllSets(List<Things> items) {
        if (items.size() > 0) CheckSet(items);

        for (int i = 0; i < items.size(); i++) {
            List<Things> newSet = new ArrayList<>(items);

            newSet.remove(i);

            MakeAllSets(newSet);
        }

    }

    //возвращает решение задачи (набор предметов)
    public static List<Things> GetBestSet() {
        return bestItems;
    }

}
