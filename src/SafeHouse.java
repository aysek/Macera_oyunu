public class SafeHouse extends NormalLoc{

    SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean getLocation(){
        player.setHealthy(player.getrHealty());
        System.out.println("İyileştiniz.....");
        System.out.println("Güvenli Evdesiniz......");
        return true;
    }

}
