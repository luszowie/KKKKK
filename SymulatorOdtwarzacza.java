import java.sql.SQLOutput;

public class SymulatorOdtwarzacza {
    public static void main(String[] args) {
        MusicPlayer CD = new CD();
        CD.odtwarzaj();

            System.out.println("Gra CD");
        CD.PauseStop();
        System.out.println("Zatrzymano CD");
        CD.NextSong();
        System.out.println("Następna Piosenka CD");
        CD.PreviousSong();
        System.out.println("Poprzednia piosenka");

        MusicPlayer MP3 = new MP3();
        MP3.odtwarzaj();
        System.out.println("Gra MP3");
        MP3.PauseStop();
        System.out.println("Zatrzymano MP3");
        MP3.NextSong();
        System.out.println("Następna Piosenka MP3");
        MP3.PreviousSong();
        System.out.println("Poprzednia piosenka MP3");

        }
    }











