import org.assertj.core.api.AssertionsForClassTypes;
import org.example.Artwork;
import org.example.Customer;

import org.example.Gallery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {
    Customer customer;
    Gallery gallery;
    Artwork picasso;
    Artwork daVinci;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Adam");
        gallery = new Gallery("Tate Modern");
        Artwork picasso = new Artwork("Starring night", "Picasso");
        Artwork daVinci = new Artwork("Mona Lisa", "Da Vinci");
        gallery.addArtworks(picasso);
        gallery.addArtworks(daVinci);
    }

    @Test
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("Adam");
    }

    @Test
    public void hasWallet(){
        assertThat(customer.getWallet()).isEqualTo(1000);
    }

    @Test
    public void canSetWallet(){
        customer.setWallet(500);
        assertThat(customer.getWallet()).isEqualTo(500);
    }

    
}
