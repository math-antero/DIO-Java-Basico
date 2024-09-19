public class Usuário {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Volume atual:" + smartTv.volume);

        System.out.println("A TV está ligada:" + smartTv.ligada);
        System.out.println("Canal atual:" + smartTv.canal);
        System.out.println("Volume atual:" + smartTv.volume);

        smartTv.ligar();
        System.out.println("A TV está ligada:" + smartTv.ligada);

    }
}
