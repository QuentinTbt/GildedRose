package edu.insightr.gildedrose;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InventoryTest {

    protected Inventory inv;
    Item[] ancienneListDesItems;

    @Before
    public void setUp()
    {
        inv = new Inventory();
        ancienneListDesItems = inv.getItems();
    }

    @After
    public void tearDown()
    {

    }

    @Test
    public void testupdateQualityWhenSellInFinished() throws Exception
    {
        inv.updateQuality();
        Item[] items = inv.getItems();
        for(int i = 0; i < items.length; i++)
        {
            if(ancienneListDesItems[i].getSellIn()==0)
            {
                assertEquals(ancienneListDesItems[i].getQuality() - 2,items[i].getQuality());
            }
        }
    }
}
