public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Vincent Van Gogh", 37, "Art", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Edgar Allan Poe", 40, "Writing", WritingStyle.POETRY);
        writer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Niana Guerrero", 18, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();
    }
}