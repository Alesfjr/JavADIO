package POOinterfaces1;

public class Main {
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

        var telefoneLD =new Telefone(){

            @Override
            public void LigarTelefone() {
                System.out.println("Ligando Telefone");

            }

            @Override
            public void DesligarTelefone() {
                System.out.println("Desligando Telefone");
            }
        };

        var pesquisador = new Navegador(){

            @Override
            public void Perquisar() {
                System.out.print("Oque deseja pesquisar");

            }
        };
        musicPlayer.PlayMusic();
        musicPlayer.stopMusic();
        musicPlayer.PauseMusic();
        telefoneLD.LigarTelefone();
        telefoneLD.DesligarTelefone();
        telefoneLD.LigarTelefone();
        pesquisador.Perquisar();

    }
}
