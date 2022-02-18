import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.size = capacity;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void add(int index, E e) {
        size++;
        for (int i = DEFAULT_CAPACITY - 1 ; i < index; i++) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
    }

    public E remove(int index) {
        E e = (E) elements[index];

        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return e;
    }

    public int size() {
        return size;
    }

    public E clone() {
        Object[] newElements;
        return (E) (newElements = elements);
    }
    
    public boolean contains (E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf (E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean addElement(E e) {
        if (size == elements.length) {
                ensureCapa();
                elements[size++] = e;
                return true;
            }
            return false;
        }

        public void ensureCapacity(int minCapacity) {
            this.size = minCapacity;
        }

        public E get(int i) {
            E e = null;
            for (int j = 0; j < size; j++) {
                if (j == i) {
                    e = (E) elements[j];
                }
            }
            return e;
        }

        public void clear() {
            for (int i = 0; i < size; i++) {
                elements[i] = null;
            }
            this.size = 0;
        }

        public void print() {
            for (int i = 0; i < DEFAULT_CAPACITY; i++) {
                elements[i] = null;
            }
            this.size = 0;
    }
}
