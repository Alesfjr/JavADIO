package encaps;

public class carro {

    private String chasssi;

    public String getChasssi() {
        return chasssi;
    }

    public void setChasssi(String chasssi) {
        this.chasssi = chasssi;
    }

    public void ligar (){
         System.out.println("Carro ligado");
     }
     public void confereCombustivel(){
         System.out.println("Conferindo combustivel");
     }
    public void confereCambio(){
        System.out.println("Conferindo cambio em P");
    }

}
