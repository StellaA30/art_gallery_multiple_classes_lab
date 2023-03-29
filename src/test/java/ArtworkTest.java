import org.example.Artwork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork artwork;
    @BeforeEach
    public void setUp(){
        artwork = new Artwork("Mona Lisa", "Da Vinci");
    }

//    public void hasName(){
//        assertThat(ginger.getName()).isEqualTo("Ginger");
//    }
    @Test
    public void hasTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Mona Lisa");
    }
    @Test
    public void hasArtist(){
        assertThat(artwork.getArtist()).isEqualTo("Da Vinci");
    }
    @Test
    public void hasPrice(){
        assertThat(artwork.getPrice()).isEqualTo(0);
    }

    @Test
    public void canSetTitle(){
        artwork.setTitle("Starry night");
        assertThat(artwork.getTitle()).isEqualTo("Starry night");
    }
    @Test
    public void canSetArtist(){
        artwork.setArtist("Picasso");
        assertThat(artwork.getArtist()).isEqualTo("Picasso");
    }

    @Test
    public void canSetPrice(){
        artwork.setPrice(500);
        assertThat(artwork.getPrice()).isEqualTo(500);
    }


}
