public abstract class NormalLoc extends Location{


    NormalLoc(Player player,String name) {
        super(player);
        this.Locname =name;
    }
    public boolean getLocation(){
        return true;
    }

}
