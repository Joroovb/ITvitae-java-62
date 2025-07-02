import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Numbers implements Queue {
    List<Integer> values = new ArrayList<>();

    @Override
    public void add(int value) {
        values.add(value);
    }

    @Override
    public int remove(int index) {
        return 0;
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void print() {

    }

    @Override
    public void clear() {

    }

    @Override
    public void clear(int n) {

    }

    @Override
    public void printReverse() {

    }

    @Override
    public void jumpTheQueue(int n, int value) {

    }

    @Override
    public boolean equals(Queue jojo) {
        return ((Numbers) jojo).values.equals(this.values);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(values);
    }

    @Override
    public int indexOf(int value) {
        return 0;
    }

    @Override
    public int lastIndexOf(int value) {
        return 0;
    }
}
