import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album supernatural = new Album();
        supernatural.setId(1);
        supernatural.setArtist("Carlos Santana");
        supernatural.setGenre("Latin rock");
        supernatural.setName("Super Natural");
        supernatural.setSales(30);
        supernatural.setReleaseDate(1999);

        Album betterLife = new Album();
        betterLife.setId(2);
        betterLife.setArtist("3 Doors Down");
        betterLife.setGenre("Post-grunge, hard rock, alternative metal");
        betterLife.setName("The Better Life");
        betterLife.setSales(5);
        betterLife.setReleaseDate(2000);

        Author shakespeare = new Author();
        shakespeare.setId(1);
        shakespeare.setFirstName("William");
        shakespeare.setLastName("Shakespeare");

        Author lincoln = new Author();
        lincoln.setId(2);
        lincoln.setFirstName("Abraham");
        lincoln.setLastName("Lincoln");


        Quotes toBe = new Quotes();
        toBe.setId(1);
        toBe.setAuthorId(1);
        toBe.setContent("To be, or not to be, that is the question:\n" +
                "Whether 'tis nobler in the mind to suffer\n" +
                "The slings and arrows of outrageous fortune,\n" +
                "Or to take Arms against a Sea of troubles,\n" +
                "And by opposing end them: to die, to sleep;\n" +
                "No more; and by a sleep, to say we end\n" +
                "The heart-ache, and the thousand natural shocks\n" +
                "That Flesh is heir to?");
        toBe.setAuthor("William Shakespeare");

        Quotes walk = new Quotes();
        walk.setId(2);
        walk.setAuthorId(2);
        walk.setContent("I am a slow walker, but I never walk back.");
        walk.setAuthor("Abraham Lincoln");

        ArrayList<Album> albums = new ArrayList<>();
        albums.add(supernatural);
        albums.add(betterLife);

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(shakespeare);
        authors.add(lincoln);

        ArrayList<Quotes> quotes = new ArrayList<>();
        quotes.add(toBe);
        quotes.add(walk);


        for(Album album : albums){
            System.out.println("album.getId() = " + album.getId());
            System.out.println("album.getArtist() = " + album.getArtist());
            System.out.println("album.getName() = " + album.getName());
            System.out.println("album.getGenre() = " + album.getGenre());
            System.out.println("album.getSales() = " + album.getSales());
            System.out.println("album.getReleaseDate() = " + album.getReleaseDate());
        }

        for(Author author : authors){
            System.out.println("author.getId() = " + author.getId());
            System.out.println("author.getFirstName() = " + author.getFirstName());
            System.out.println("author.getLastName() = " + author.getLastName());

        }

        for(Quotes quote : quotes){
            System.out.println("quote.getId() = " + quote.getId());
            System.out.println("quote.getAuthorId() = " + quote.getAuthorId());
            System.out.println("quote.getContent() = " + quote.getContent());
            System.out.println("quote.getAuthor() = " + quote.getAuthor());
        }
    }
}
