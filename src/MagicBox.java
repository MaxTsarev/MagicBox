import java.util.Random;

public class MagicBox<T> {
    private T[] content;

    public MagicBox(int size) {
        this.content = (T[]) new Object[size];
    }

    public T[] getContent() {
        return content;
    }

    public boolean add(T item) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < content.length; i++) {
            if (content[i] == null) {
                content[i] = item;
                a++;
                break;
            }
        }
        return a > b;
    }

    public T pick() {
        for (int i = 0; i < content.length; i++) {
            if (content[i] == null) {
                throw new OccupBoxException();
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(content.length);
        return content[randomInt];
    }
}
