package task3.part2;

public class ArticleForth {

    private String article;

    public ArticleForth(String article) {
        this.article = article;
    }

    @Override
    public int hashCode() {
        return article.length();
    }

    @Override
    public String toString() {
        return article;
    }

}
