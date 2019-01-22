package util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.SimpleUtil;

/**
 * Created by Andres Gonzalez on 1/19/19
 */
public class SimpleUtilTest {

    SimpleUtil client;

    @Before
    public void init() {
        client = new SimpleUtil();
    }

    @Test
    public void stringToBooleanTrueTest() {
        Assert.assertTrue(client.convertStringToBoolean("yes"));
    }

    @Test
    public void stringToBooleanFalseTest() {
        Assert.assertFalse(client.convertStringToBoolean("n"));
    }

    @Test
    public void getFileTypeByCodeTest() {
        Assert.assertEquals(SimpleUtil.FileType.PDF, client.getFileTypeByCode(3));
        Assert.assertEquals(SimpleUtil.FileType.JPEG, client.getFileTypeByCode(1));
        Assert.assertNull(client.getFileTypeByCode(999));
    }

    @Test
    public void getFileTypeByNameTest() {
        Assert.assertEquals(SimpleUtil.FileType.TEXT, client.getFileTypeByName("txt"));
        Assert.assertNull(client.getFileTypeByName("zebra"));
        Assert.assertNull(client.getFileTypeByName(null));
    }
}
