package builder;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author simon
 */
public class TestThingBuilder {

    @Test(expected = IllegalArgumentException.class)
    public void uninitializedShouldFail() {
        Thing.builder().build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void xGreaterYShouldFail() {
        Thing.builder().x(5).y(3).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void uninitializedStringSShouldFail() {
        Thing.builder().x(3).y(5).t("Hello").build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void uninitializedStringTShouldFail() {
        Thing.builder().x(3).y(5).s("Hello").build();
    }

    @Test
    public void allGoodShouldPass() {
        Thing.builder().x(3).y(5).s("What?").t("Hello").build();
    }

    @Test
    public void testStringLength() {
        String l = "Hello";
        Assert.assertEquals("Length should be five", 6, l.length());
    }
}
