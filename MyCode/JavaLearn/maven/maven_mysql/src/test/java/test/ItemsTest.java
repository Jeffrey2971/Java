package test;

import dao.ItemsImpl.ItemsDaoImpl;
import domain.Items;
import org.junit.Test;

import java.util.List;

public class ItemsTest {
@Test
    public void findAll(){
        ItemsDaoImpl dao = new ItemsDaoImpl();
        List<Items> items = dao.findAll();
        for (Items item : items) {
            System.out.println("item"+item);
        }
    }
}
