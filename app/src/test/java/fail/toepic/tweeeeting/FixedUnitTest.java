package fail.toepic.tweeeeting;

import org.junit.Test;

import fail.toepic.tweeeeting.Generator.Condition.Condition;
import fail.toepic.tweeeeting.Generator.Condition.Fixed;

import static org.junit.Assert.assertEquals;

/**
 * Created by shimseokbo on 2017-05-07.
 */

public class FixedUnitTest {
    @Test
    public void Generate() throws Exception {
        Condition condition;
        condition = new Fixed("aaaa");
        assertEquals("aaaa", condition.Generate());

        assertEquals(Fixed.REPR_KEY+"aaaa".length()+"/"+"aaaa", condition.Repr());


        condition = new Fixed("");
        assertEquals("", condition.Generate());

        assertEquals(Fixed.REPR_KEY+"".length()+"/"+"", condition.Repr());
    }
}
