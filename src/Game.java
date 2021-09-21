import java.util.Scanner;

public class Game {

    Player player;
    Location location;
    public void login(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Macera oyununa hoşgeldiniz...");
        System.out.println("oyuna başlamadan önce adınızı girin.");
        String playerName= scan.nextLine();
        player=new Player(playerName);
        player.selectCha();
    }
}
