import java.util.Scanner;

public class Game {

    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);

    public void login(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Macera oyununa hoşgeldiniz...");
        System.out.println("oyuna başlamadan önce adınızı girin.");
        String playerName= scan.nextLine();
        player=new Player(playerName);
        player.selectCha();
        start();
    }

    public void start(){
        while (true) {

            System.out.println();
            System.out.println("===========================================================");
            System.out.println();
            System.out.println("Eylem gerçekleştirmek için bir yer seçin....");
            System.out.println("1. Güvenli Ev ---> Size ait güvenli bir mekan, düşman yok !");
            System.out.println("2. Mağara ---> Karşınıza belki zombi çıkabilir !");
            System.out.println("3. Orman ---> Karşınıza belki vampir çıkabilir  !");
            System.out.println("4. Nehir ---> Karşınıza belki ayı çıkabilir  !");
            System.out.println("5. Mağaza ---> Silah veya zırh alabilirsiniz!");
            int selLoc = scan.nextInt();
            while (selLoc<1 || selLoc>5)
            {
                System.out.print("Lütfen geçerli bir yer seçin  ");
                selLoc = scan.nextInt();
            }
            switch (selLoc){
                case 1:
                    location=new SafeHouse(player);
                    break;
                case 2:
                    location=new Cave(player);
                    break;
                case 3:
                    location=new Forest(player);
                    break;
                case 4:
                    location=new River(player);
                case 5:
                    location=new ToolStore(player);
                    break;
                default:
                    location=new SafeHouse(player);
                    break;
            }
            if(!location.getLocation()){
                System.out.println("Oyun Bitti .... !!!");
                break;
            }
        }
    }
}
