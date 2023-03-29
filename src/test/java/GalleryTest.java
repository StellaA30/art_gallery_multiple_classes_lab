import org.example.Artwork;
import org.example.Gallery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Tate Modern");
        Artwork picasso = new Artwork("Starring night", "Picasso");
        Artwork daVinci = new Artwork("Mona Lisa", "Da Vinci");
        gallery.addArtworks(picasso);
        gallery.addArtworks(daVinci);
    }

    @Test
    public void hasName(){
        assertThat(gallery.getName()).isEqualTo("Tate Modern");
    }

    @Test
    public void hasTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill(){
        gallery.setTill(200);
        assertThat(gallery.getTill()).isEqualTo(200);
    }

    @Test
    public void canGetArtwork(){
        assertThat(gallery.getArtworks().size()).isEqualTo(gallery.getArtworkCount());
    }

//    METHODS

    @Test
    public void canAddArtwork(){
        Artwork claude = new Artwork("Summer", "Claude");
        gallery.addArtworks(claude);
        assertThat(gallery.getArtworkCount()).isEqualTo(3);
    }








}
