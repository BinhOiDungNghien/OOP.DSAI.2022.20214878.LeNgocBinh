package lab02;

import lab02.DigitalVideoDisc;
import lab02.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Spiderman", "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Gone with the wind", "Romantic", "George Lucas", 87, 24.95f);
        store.addDVD(dvd2);

        store.getItems();

        System.out.println("After remove dvd1");
        store.removeDVD(dvd1);
        store.getItems();
    }
}