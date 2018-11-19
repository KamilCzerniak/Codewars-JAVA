public class CircularList<T> {
    private T[] array;
    private int index = -1;

    public CircularList(final T... elements) {
        if (elements.length == 0) {
            throw new IllegalArgumentException();
        }
        this.array = elements;
    }

    public T next() {
        return array[index = ++index % array.length];
    }

    public T prev() {
        return array[--index < 0 ? index = array.length - 1 : index];
    }
}
