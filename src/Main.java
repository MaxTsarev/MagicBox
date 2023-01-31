import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MagicBox<Integer> magicBox = new MagicBox<>(4);
        System.out.println(magicBox.add(50));
        System.out.println(magicBox.add(20));
        System.out.println(magicBox.add(10));
        System.out.println(magicBox.add(25));
        System.out.println(magicBox.add(60));
        System.out.println(Arrays.toString(magicBox.getContent()));
        System.out.println(magicBox.pick());
        System.out.println();

        MagicBox<String> magicBox1 = new MagicBox<>(5);
        System.out.println(magicBox1.add("Конфета"));
        System.out.println(magicBox1.add("Шоколад"));
        System.out.println(magicBox1.add("Чак-чак"));
        System.out.println(magicBox1.add("Носки"));
        System.out.println(magicBox1.add("Медведь"));
        System.out.println(magicBox1.add("Заяц"));
        System.out.println(Arrays.toString(magicBox1.getContent()));
        System.out.println(magicBox1.pick());


    }
}
