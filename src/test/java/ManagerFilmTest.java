import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.managerfilm.RepositoryFilm;

public class ManagerFilmTest {

    RepositoryFilm film1 = new RepositoryFilm( "Бладшот");
    RepositoryFilm film2 = new RepositoryFilm( "Вперед");
    RepositoryFilm film3 = new RepositoryFilm("Отель Белград");
    RepositoryFilm film4 = new RepositoryFilm( "Джентельмены");
    RepositoryFilm film5 = new RepositoryFilm( "Человек-невидимка");
    RepositoryFilm film6 = new RepositoryFilm( "Номер 1");
    RepositoryFilm film7 = new RepositoryFilm("Тролли");


    @Test
    public void testLimit() {
        RepositoryFilm manager = new RepositoryFilm();
        Assertions.assertEquals(5, manager.getlimit());
    }

    @Test
    public void testLimitIfMovie7() {
        RepositoryFilm manager = new RepositoryFilm();
        manager.addMovie(film1.getMovie());
        manager.addMovie(film2.getMovie());
        manager.addMovie(film3.getMovie());
        manager.addMovie(film4.getMovie());
        manager.addMovie(film5.getMovie());
        manager.addMovie(film6.getMovie());
        manager.addMovie(film7.getMovie());
        Assertions.assertEquals(5, manager.getlimit());
    }

    @Test
    public void findAllMovieTest() {
        RepositoryFilm manager = new RepositoryFilm();
        manager.addMovie(film1.getMovie());
        manager.addMovie(film2.getMovie());
        manager.addMovie(film3.getMovie());
        manager.addMovie(film4.getMovie());
        manager.addMovie(film5.getMovie());
        manager.addMovie(film6.getMovie());
        manager.addMovie(film7.getMovie());
        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка", "Номер 1", "Тролли"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestifMovie7() {
        RepositoryFilm manager = new RepositoryFilm();
        manager.addMovie(film1.getMovie());
        manager.addMovie(film2.getMovie());
        manager.addMovie(film3.getMovie());
        manager.addMovie(film4.getMovie());
        manager.addMovie(film5.getMovie());
        manager.addMovie(film6.getMovie());
        manager.addMovie(film7.getMovie());
        String[] expected = {"Тролли", "Номер 1", "Человек-невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestIfMovie5() {
        RepositoryFilm manager = new RepositoryFilm();
        manager.addMovie(film1.getMovie());
        manager.addMovie(film2.getMovie());
        manager.addMovie(film3.getMovie());
        manager.addMovie(film4.getMovie());
        manager.addMovie(film5.getMovie());
        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestIfMovie2() {
        RepositoryFilm manager = new RepositoryFilm();
        manager.addMovie(film1.getMovie());
        manager.addMovie(film2.getMovie());
        String[] expected = {"Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestIfMovie0() {
        RepositoryFilm manager = new RepositoryFilm();
        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovieIfLimit7Test() {
        RepositoryFilm manager = new RepositoryFilm(7);
        manager.addMovie(film1.getMovie());
        manager.addMovie(film2.getMovie());
        manager.addMovie(film3.getMovie());
        manager.addMovie(film4.getMovie());
        manager.addMovie(film5.getMovie());
        manager.addMovie(film6.getMovie());
        manager.addMovie(film7.getMovie());
        String[] expected = {"Тролли", "Номер 1", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovieIfLimit3Test() {
        RepositoryFilm manager = new RepositoryFilm(3);
        manager.addMovie(film1.getMovie());
        manager.addMovie(film2.getMovie());
        manager.addMovie(film3.getMovie());
        manager.addMovie(film4.getMovie());
        manager.addMovie(film5.getMovie());
        manager.addMovie(film6.getMovie());
        manager.addMovie(film7.getMovie());
        String[] expected = {"Тролли", "Номер 1", "Человек-невидимка"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovieIfLimit10Test() {
        RepositoryFilm manager = new RepositoryFilm(10);
        manager.addMovie(film1.getMovie());
        manager.addMovie(film2.getMovie());
        manager.addMovie(film3.getMovie());
        manager.addMovie(film4.getMovie());
        manager.addMovie(film5.getMovie());
        manager.addMovie(film6.getMovie());
        manager.addMovie(film7.getMovie());
        String[] expected = {"Тролли", "Номер 1", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}