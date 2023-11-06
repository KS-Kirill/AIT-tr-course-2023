package practice.Album.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.Album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {

    Album album;
    LocalDateTime now = LocalDateTime.now();
    Photo[] ph;


    @BeforeEach
    void setUp() {
        album = new AlbumImpl(7);
        ph = new Photo[6];
        ph[0] = new Photo(1, 1, "t1", "url1", now.minusDays(2));
        ph[1] = new Photo(1, 2, "t2", "url2", now.minusDays(3));
        ph[2] = new Photo(1, 3, "t3", "url3", now.minusDays(5));
        ph[3] = new Photo(2, 1, "t4", "url4", now.minusDays(7));
        ph[4] = new Photo(2, 2, "t5", "url5", now.minusDays(7));
        ph[5] = new Photo(2, 3, "t6", "url6", now.minusDays(7));

        //положить эти фото в альбом методов addPhoto
        for (int i = 0; i < ph.length; i++) {
            album.addPhoto(ph[i]);

        }

    }

    @Test
    void addPhoto() {
        //нельзя добавит нулл,
        assertFalse(album.addPhoto(null));
        // нельзя добавить существующее,
        assertFalse(album.addPhoto(ph[1]));
        // проверить возможность добавления,
        Photo photo = new Photo(3, 1, "t", "url", now);
        assertTrue(album.addPhoto(photo));
        // проверить ожидаемое количество после добавления,
        assertEquals(7, album.size());
        // нельзя превысить капасити
        photo = new Photo(3, 2, "t", "url", now);
        assertFalse(album.addPhoto(photo));

    }

    @Test
    void removePhoto() {
        //нельзя удалить null
        assertTrue(album.removePhoto(3, 1));
        //удаление отсутствующего фото
        assertFalse(album.removePhoto(5, 1));
        //проверка поличества
        assertEquals(5, album.size());
        //не найдём удаленное
        assertNull(album.getPhotoFromAlbum(3, 1));

    }

    @Test
    void updatePhoto() {
        assertTrue(album.updatePhoto(1, 1, "newUrl"));//обновили
        assertEquals("newUrl", album.getPhotoFromAlbum(1, 1).getUrl());//проверили обновление
    }

    @Test
    void getPhotoFromAlbum() {
        assertEquals(ph[0], album.getPhotoFromAlbum(1, 1) );//проверяем нахождение фото
        assertNull(album.getPhotoFromAlbum(1, 3));
    }

    @Test
    void getAllPhotoFromAlbum() {
        //возвращает массив фото
        Photo[] expected = {ph[3], ph[4], ph[5]};//фото из второго альбома
        Photo[] actual = album.getAllPhotoFromAlbum(2);//выбрали второй альбом
        Arrays.sort(actual);//sorting of Array
        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllPhotoBetweenDate() {
        LocalDate ld = now.toLocalDate();//оставляем только дату, убираем время
        Photo[] actual = album.getAllPhotoBetweenDate(ld.minusDays(1), ld.minusDays(6));
        Arrays.sort(actual);
        Photo[] expected = {ph[0], ph[1], ph[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void sizeTest() {

        assertEquals(6, album.size());

    }
}