package task3.part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyListSet extends ArrayList {

    /**
     * Appends the specified element to the end of this list
     * if this list is not contain the same element.
     *
     * @param element element to be appended to this list
     * @return <tt>true</tt> (as specified by {@link Collection#add})
     * @throws IllegalArgumentException - if list contains the same  element
     */
    @Override
    public boolean add(Object element) {
        if (!contains(element)) {
            return super.add(element);
        }
        throw new IllegalArgumentException();
    }

    /**
     * Appends all of the elements in the specified collection to the end of
     * this list if this list is not contain the same element.
     *
     * @param c collection containing elements to be added to this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws NullPointerException     if the specified collection is null
     * @throws IllegalArgumentException - if list contains the same  element
     */
    @Override
    public boolean addAll(Collection c) {
        collectionValid(c);
        return super.addAll(c);
    }

    /**
     * Returns <tt>true</tt> if this list contains the specified element.
     *
     * @param o element whose presence in this list is to be tested
     * @return <tt>true</tt> if this list contains the specified element
     */
    @Override
    public boolean contains(Object o) {
        for (Object obj : this.toArray()) {
            if (obj.equals(o))
                return true;
        }
        return false;
    }

    private void collectionValid(Collection c) {
        for (Object o : c.toArray()) {
            if (contains(o)) {
                throw new IllegalArgumentException();
            }
        }
    }

    /**
     * @throws UnsupportedOperationException
     */
    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    /**
     * @throws UnsupportedOperationException
     */
    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    /**
     * @throws UnsupportedOperationException
     */
    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException();
    }

    /**
     * @throws UnsupportedOperationException
     */
    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    /**
     * @throws UnsupportedOperationException
     */
    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    /**
     * @throws UnsupportedOperationException
     */
    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    /**
     * @throws UnsupportedOperationException
     */
    @Override
    public Object get(int index) {
        throw new UnsupportedOperationException();
    }

    /**
     * @throws UnsupportedOperationException
     */
    @Override
    public Object remove(int index) {
        throw new UnsupportedOperationException();
    }
}
