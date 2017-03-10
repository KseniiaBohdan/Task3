package task3.part2;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ArticleForthTest {

    HashMap<Integer, String> hashMap;
    LinkedHashMap<Integer, String> linkedHashMap;

    @Before
    public void initHashMap() {
        hashMap = new HashMap();

        ArticleLength first1 = new ArticleLength("1 test");
        hashMap.put(first1.hashCode(), first1.toString());
        ArticleLength first2 = new ArticleLength("2 test");
        hashMap.put(first2.hashCode(), first2.toString());
        ArticleLength first3 = new ArticleLength("3 test");
        hashMap.put(first3.hashCode(), first3.toString());
        ArticleLength first4 = new ArticleLength("11 test");
        hashMap.put(first4.hashCode(), first4.toString());
    }

    @Before
    public void initLinkedHashMap() {
        linkedHashMap = new LinkedHashMap();

        ArticleLength first1 = new ArticleLength("1 test");
        linkedHashMap.put(first1.hashCode(), first1.toString());
        ArticleLength first2 = new ArticleLength("2 test");
        linkedHashMap.put(first2.hashCode(), first2.toString());
        ArticleLength first3 = new ArticleLength("3 test");
        linkedHashMap.put(first3.hashCode(), first3.toString());
        ArticleLength first4 = new ArticleLength("11 test");
        linkedHashMap.put(first4.hashCode(), first4.toString());
    }

    @Test
    public void printHashMap() throws Exception {
        for (Integer i : hashMap.keySet()) {
            System.out.print(hashMap.get(i).toString() + " ");
        }
        System.out.println();
    }

    @Test
    public void printLinkedHashMap() throws Exception {
        for (Integer i : linkedHashMap.keySet()) {
            System.out.print(linkedHashMap.get(i).toString() + " ");
        }
        System.out.println();
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenAddToHMElementLessThenFourSymbolsThenException() {
        ArticleLength first4 = new ArticleLength("st");
        hashMap.put(first4.hashCode(), first4.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenAddToLinkedHMElementLessThenFourSymbolsThenException() {
        ArticleLength first4 = new ArticleLength("st");
        linkedHashMap.put(first4.hashCode(), first4.toString());
    }
}
