import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerTest {

    @Test
    public void addNewFilmTest() {
        Manager obj = new Manager();
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
        Manager obj = new Manager(8);
        obj.addNewFilm("F1");
        obj.addNewFilm("F2");
        obj.addNewFilm("F3");
        obj.addNewFilm("F4");
        obj.addNewFilm("F5");
        String[] expected = {"F5", "F4", "F3", "F2", "F1"};
        String[] actual = obj.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLess(){
        Manager obj = new Manager(3);
        obj.addNewFilm("F1");
        obj.addNewFilm("F2");
        obj.addNewFilm("F3");
        obj.addNewFilm("F4");
        obj.addNewFilm("F5");

        String[] expected = {"F5", "F4", "F3"};
        String[] actual = obj.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastTest(){
        Manager obj = new Manager();
        obj.addNewFilm("F1");
        obj.addNewFilm("F2");
        obj.addNewFilm("F3");
        obj.addNewFilm("F4");
        obj.addNewFilm("F5");
        obj.addNewFilm("F6");
        obj.addNewFilm("F7");
        obj.addNewFilm("F8");
        obj.addNewFilm("F9");
        obj.addNewFilm("F10");

        String[] expected = {"F10", "F9", "F8", "F7", "F6", "F5", "F4", "F3", "F2", "F1"};
        String[] actual = obj.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}