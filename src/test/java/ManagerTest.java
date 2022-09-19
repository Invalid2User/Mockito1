import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerTest {
    Manager obj = new Manager();

    @Test
    public void addNewFilmTest() {
        obj.addNewFilm("F1");
        obj.addNewFilm("F2");
        obj.addNewFilm("F3");
        obj.addNewFilm("F4");
        obj.addNewFilm("F5");

        String[] expected = {"F1", "F2", "F3", "F4", "F5"};
        String[] actual = obj.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMore() {
        obj.addNewFilm("F1");
        obj.addNewFilm("F2");
        obj.addNewFilm("F3");
        obj.addNewFilm("F4");
        obj.addNewFilm("F5");
        String[] expected = {"F5", "F4", "F3", "F2", "F1"};
        String[] actual = obj.findLast(15);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLess(){
        obj.addNewFilm("F1");
        obj.addNewFilm("F2");
        obj.addNewFilm("F3");
        obj.addNewFilm("F4");
        obj.addNewFilm("F5");
        String[] expected = {"F5", "F4", "F3"};
        String[] actual = obj.findLast(3);

        Assertions.assertArrayEquals(expected, actual);
    }
}