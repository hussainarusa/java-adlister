import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        Album album = new Album("Tia Corrine", "Lotto", 2018, 110.9, "Rap");
        System.out.println(album.getArtist());
        System.out.println(album.getName());
        Album emptyAlbum = new Album();

        Author author = new Author("Arusa", "Hussain");
        Quote quote = new Quote("POYO!", author);
        Quote quoteTwo = new Quote("YUUUR", author);

        List<Quote> donaldQuotes = new ArrayList<>(List.of(quote, quoteTwo));

        for(Quote donaldQuote : donaldQuotes) {
            System.out.printf("\"%s\"  - %s %s%n", donaldQuote.getContent(), donaldQuote.getAuthor().getFirstName(), donaldQuote.getAuthor().getLastName());
        }

    }
}
