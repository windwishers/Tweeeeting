package fail.toepic.tweeeeting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import fail.toepic.tweeeeting.Generator.Condition.RandomCharacters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by shimseokbo on 2017-05-07.
 */

@RunWith(Parameterized.class)
public class randomCharacterGeneratesTest {

    private final char[] targeted;
    private final int minlen;
    private final int maxLen;
    private final String filledLetter;
    private final String targeted_ori;

    @Parameters
    public static Collection getTestParameters(){
        //public RandomCharacters(char[] targeted, int minLen, int maxLen, String filledLetter) {
        return Arrays.asList(new String[][]{
                {"ABCDEFGHIJKLMNOPQRSTUVWXYZ","1","2",""},
                {"ABCDEFGHIJKLMNOPQRSTUVWXYZ","1","1",""},
                {"ABCDEFGHIJKLMNOPQRSTUVWXYZ","1","3",""},
                {"0123456789","1","3","0"},
        });
    }

    public randomCharacterGeneratesTest(String targeted,String minlen,String maxLen,String filledLetter) {
        targeted_ori = targeted;
        this.targeted = targeted.toCharArray();
        this.minlen = Integer.parseInt(minlen);
        this.maxLen = Integer.parseInt(maxLen);
        this.filledLetter = filledLetter;
    }



    @Test
    public void Generate() throws Exception {

        System.out.println("Test Start "+targeted_ori + " " + minlen+ " " + maxLen + " "+ filledLetter);
        RandomCharacters rndChar;

        rndChar = new RandomCharacters(targeted, minlen, maxLen, filledLetter);


        CheckGenerateString(rndChar);
        System.out.println("Test End "+targeted_ori + " "  + minlen+ " " + maxLen + " "+ filledLetter);
    }

    private void CheckGenerateString(RandomCharacters rndChar) {
        String genString = rndChar.Generate();

        assertNotNull("Null Check FAIL ",genString);
        assertTrue("min len check FAIL ",genString.length()>=minlen);
        assertTrue("max len check FAIL ",genString.length()>=maxLen);


        for (String c : genString.split("")) {
            assertTrue("Targeted Check Fail "+c+" is not contained  "+targeted_ori,targeted_ori.contains(c));
        }

    }
}
