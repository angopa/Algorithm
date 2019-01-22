package euclid;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Andres Gonzalez on 1/21/19
 */
public class EuclidTest {

    Euclid euclid;

    @Before
    public void init() {
        euclid = new Euclid();
    }

    @Test
    public void gcdTest(){
        Assert.assertEquals(2, euclid.gcd(22, 6));
        Assert.assertEquals(2, euclid.gcd(10, 2));
    }

    @Test
    public void gcd2Test(){
        Assert.assertEquals(2, euclid.gcd2(22, 6));
        Assert.assertEquals(2, euclid.gcd2(10, 2));
    }

    @Test
    public void gcdVsGcd2() {
        Assert.assertEquals(euclid.gcd(22, 6), euclid.gcd2(22, 6));
        Assert.assertEquals(euclid.gcd(10, 2), euclid.gcd2(10, 2));
        Assert.assertEquals(euclid.gcd(187, 35), euclid.gcd2(187, 35));
    }

}
