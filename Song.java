

public class Song {
    String TytulPiosenki;
    String Wykonawca;
    String NazwaAlbumu;
    public Song (String TytulPiosenki, String Wykonawca, String NazwaAlbumu) {
        this.TytulPiosenki = TytulPiosenki;
        this.Wykonawca = Wykonawca;
        this.NazwaAlbumu = NazwaAlbumu;
        Song song = new Song("tytul 1 piosenki","Wykonawca 1 piosenki", "Album 1 wykonawcy");
        Song song2 = new Song("tytul 2 piosenki","Wykonawca 2 piosenki", "Album 2 wykonawcy");

    }


}
