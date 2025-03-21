package anotomiadeclasses;

public class statusTV {
    public static void main(String[] args) {


        SmartTV smartTV= new SmartTV();


        System.out.println("TV ligada:"+smartTV.power);
        System.out.println("Numeros de canais:"+smartTV.channel);
        System.out.println("Volume atual:"+smartTV.volum);


        smartTV.switchoff();
        System.out.println("TV ligada:"+smartTV.power);

        System.out.println("Status volum:"+smartTV.volum);
        System.out.println("usuario: abaixar volume");
        smartTV. volumdown();
        System.out.println("Status volum:"+smartTV.volum);
        smartTV.channelup();
        System.out.println("Mudar de canal :"+smartTV.channel);
        smartTV.changechannel(84);
        System.out.println("Canal:"+smartTV.channel);



    }
}
