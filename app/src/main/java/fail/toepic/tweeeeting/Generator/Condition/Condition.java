package fail.toepic.tweeeeting.Generator.Condition;

/**
 *
 * Created by shimseokbo on 2017-05-07.
 */

abstract public class Condition {

    static final String REPR_KEY = "/CONDIN/";

    /** 조건에 맞는 문자열을 생성 합니다. */
    abstract public String Generate();

    abstract protected String getReprKey();

    /**
     * 조건 텍스트를 반환 합니다. Repr 에서 사용합니다.
     */
    abstract protected String ConditionText();

    /**
     * 재생성 가능한 문자열을 반환 합니다.
     * /XXXXXX/LEN_LEN/Data
     * */
    public String Repr(){
        return getReprKey() + ConditionText().length() + "/" + ConditionText();
    }
    /**
     * 빈 조건 객체 "" 를 반환 한다.
     */
    public static final Condition EMPTY = new Condition() {
        @Override
        public String Generate() {
            throw new IllegalStateException("빈 컨디션 객체는 Genterate 할 수 없습니다. ");
        }

        @Override
        protected String getReprKey() {
            return Condition.REPR_KEY;
        }

        @Override
        protected String ConditionText() {
            return "";
        }
    };
}
