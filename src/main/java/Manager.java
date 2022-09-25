public class Manager {
    private String[] films = new String[0];

    private int numberOfFilms;

    public Manager() {
        this.numberOfFilms = 10;
    }

    public Manager(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    public void addNewFilm(String newFilm) {
        String[] temp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            temp[i] = films[i];
        }
        temp[temp.length - 1] = newFilm;
        films = temp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int length;
        if (films.length < numberOfFilms) {
            length = films.length;
        } else {
            length = numberOfFilms;
        }
        String[] temp = new String[length];
        int j = films.length - 1;
        for (int i = 0; i < temp.length; i++, j--) {
            temp[i] = films[j];
        }
        return temp;
    }
}
