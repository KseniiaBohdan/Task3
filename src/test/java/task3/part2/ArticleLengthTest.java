package task3.part2;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ArticleLengthTest {

    HashMap<Integer, String> hashMap;
    LinkedHashMap<Integer, String> linkedHashMap;

    @Before
    public void initHashMap() {
        hashMap = new HashMap();

        ArticleForth first1 = new ArticleForth("1 test");
        hashMap.put(first1.hashCode(), first1.toString());
        ArticleForth first2 = new ArticleForth("2 test");
        hashMap.put(first2.hashCode(), first2.toString());
        ArticleForth first3 = new ArticleForth("3 test");
        hashMap.put(first3.hashCode(), first3.toString());
        ArticleForth first4 = new ArticleForth("11 test");
        hashMap.put(first4.hashCode(), first4.toString());
    }

    @Before
    public void initLinkedHashMap() {
        linkedHashMap = new LinkedHashMap();

        ArticleForth first1 = new ArticleForth("1 test");
        linkedHashMap.put(first1.hashCode(), first1.toString());
        ArticleForth first2 = new ArticleForth("2 test");
        linkedHashMap.put(first2.hashCode(), first2.toString());
        ArticleForth first3 = new ArticleForth("3 test");
        linkedHashMap.put(first3.hashCode(), first3.toString());
        ArticleForth first4 = new ArticleForth("11 test");
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
}
