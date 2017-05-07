package fail.toepic.tweeeeting.Generator.Condition;

/**
 * 랜덤스트링을 생성 합니다.
 * Created by shimseokbo on 2017-05-07.
 */

public class RandomCharacters extends Condition{

    public static final String REPR_KEY = "/RANDCH/";

    private final char[] targeted;
    private final int minLen;
    private final int maxLen;
    private final String filledLetter;

    public RandomCharacters(char[] targeted, int minLen, int maxLen, String filledLetter) {
        this.targeted = targeted;
        this.minLen = minLen;
        this.maxLen = maxLen;
        this.filledLetter = filledLetter;
    }

    @Override
    public String Generate() {
        return generateString();
    }

    @Override
    protected String getReprKey() {
        return REPR_KEY;
    }

    @Override
    protected String ConditionText() {
        return "";
    }

    private String generateString() {

        return "AAAA";
    }
}
