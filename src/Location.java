import java.util.Scanner;

public abstract class Location {

   protected Player player;
   protected String Locname;
    Scanner scan = new Scanner(System.in);
        Location(Player player){
            this.player=player;
        }
        public abstract boolean getLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getLocName() {
        return Locname;
    }

    public void setLocname(String locname) {
        this.Locname = locname;
    }
}
