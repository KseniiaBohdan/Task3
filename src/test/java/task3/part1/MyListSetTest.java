package task3.part1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class MyListSetTest {

    MyListSet mls;

    @Before
    public void init() {
        mls = new MyListSet();
        mls.add("test 1");
        mls.add("test 2");
        mls.add("test 3");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void whenSetElementByIndexThenException() {
        mls.set(1, "test 3");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void whenAddElementByIndexThenException() {
        mls.add(1, "test 3");
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenAddCollectionThatContainsTheSameElementThenException() {
        Collection c = new ArrayList();
        c.add("test 1");
        c.add("test 5");
        c.add("test 2");
        c.add(3);
        mls.addAll(c);
    }

    @Test
    public void whenAddCollectionThatNotContainsTheSameElementThenTrue() {
        Collection c = new ArrayList();
        c.add("test 5");
        c.add(3);
        mls.addAll(c);
        assertTrue(mls.contains("test 5") && mls.contains(3));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void whenAddCollectionByIndexThenException() {
        Collection c = new ArrayList();
        c.add("test 1");
        mls.addAll(1, c);
    }

    @Test
    public void whenAddElementThenTrue() {
        mls.add("test 678");
        assertTrue(mls.contains("test 678"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenAddContainedElementThenException() {
        mls.add("test 2");
    }
}
