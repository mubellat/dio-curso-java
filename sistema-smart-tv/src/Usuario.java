public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? "+smartTv.ligada);
        System.out.println("Canal atual:" +smartTv.canal);
        System.out.println("Informe o volume: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status da TV:" +smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status da TV:" +smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual:"+smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual:"+smartTv.volume);

        smartTv.mudarCanal(22);
        System.out.println("Canal atual: "+smartTv.canal);

        smartTv.voltarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();
    }
}
