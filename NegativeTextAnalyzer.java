public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private static final String[] negative = {":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
        return negative;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
