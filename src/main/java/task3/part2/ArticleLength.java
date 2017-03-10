package task3.part2;

public class ArticleLength {

    private String article;

    public ArticleLength(String article) {
        this.article = article;
    }

    @Override
    public int hashCode() {
        char[] charArr = article.toCharArray();
        int hashCode = 0;
        if (charArr.length < 4) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < 4; i++) {
            hashCode += charArr[i];
        }
        return hashCode;
    }

    @Override
    public String toString() {
        return article;
    }
}
