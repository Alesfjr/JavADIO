package POOinterfaces1;

public class main {
    public static void main(String[] args) {
        var musicPlayer = new MusicPlayer() {
            @Override
            public void PauseMusic() {
                System.out.println("Musica pausada ");

            }

            @Override
            public void PlayMusic() {
                System.out.println("Tocando musica");

            }

            @Override
            public void stopMusic () {
                System.out.println("Desligando");


            }
        };
        musicPlayer.PlayMusic();
        musicPlayer.stopMusic();
        musicPlayer.PauseMusic();
    }
}
