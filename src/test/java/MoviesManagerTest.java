import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void addMovie() {
        MoviesManager manager = new MoviesManager();
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джельтенмены");
        manager.add("Человек");
        manager.add("Тролли");
        manager.add("Номер один");
        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джельтенмены",
                "Человек", "Тролли", "Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovieMin() {
        MoviesManager manager = new MoviesManager();
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        String[] expected = {"Бладшот", "Вперед", "Отель Белград"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMovieLimit() {
        MoviesManager manager = new MoviesManager();
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джельтенмены");
        manager.add("Человек");
        String[] expected = {"Человек", "Джельтенмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMovieMinLimit() {
        MoviesManager manager = new MoviesManager();
        manager.add("Отель Белград");
        manager.add("Джельтенмены");
        manager.add("Человек");
        String[] expected = {"Человек", "Джельтенмены", "Отель Белград"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMovieMaxLimit() {
        MoviesManager manager = new MoviesManager();
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джельтенмены");
        manager.add("Человек");
        manager.add("Тролли");
        manager.add("Номер один");
        String[] expected = {"Номер один", "Тролли", "Человек", "Джельтенмены", "Отель Белград",};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}


