package fail.toepic.tweeeeting.Generator.Condition;

/**
 * 고정스트링을 생성 한다.
 * Created by shimseokbo on 2017-05-07.
 */

public class Fixed extends Condition {
    private final String fixedString;

    public static final String REPR_KEY = "/FIXED/";



    public Fixed(String fixedString) {
        this.fixedString = fixedString;
    }

    @Override
    public String Generate() {
        if (fixedString == null) {
            return Condition.EMPTY.Generate();
        }
        return fixedString;
    }

    @Override
    protected String getReprKey() {
        return REPR_KEY;
    }

    @Override
    protected String ConditionText() {
        return fixedString;
    }
}
