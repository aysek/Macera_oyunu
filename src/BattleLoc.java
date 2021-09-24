import java.util.Locale;

public abstract class BattleLoc extends Location{
        protected Obstracle obstracle;
        protected String award;

    BattleLoc(Player player,String name,Obstracle obstracle,String award) {
        super(player);
        this.Locname =name;
        this.obstracle=obstracle;
        this.award=award;
    }

    public boolean getLocation() {
        int obsCount = obstracle.count();
        System.out.println("Şuan burdasınız : " + this.getLocName());
        System.out.println("Dikkatli ol burda " + obsCount + " tane " + obstracle.getName() + " var");
        System.out.println("<S>avaş veya <K>aç");
        String selCase = scan.next();
        selCase = selCase.toUpperCase();
        if (selCase.equals("S")) {
            if (combat(obsCount)) {

                System.out.println(this.getLocName() + " bölgesindeki tüm düşmanları temizlediniz !!!");

                if (this.award.equals("Food") && !player.getInv().isFood()) {
                    System.out.println(this.award + " Kazandınız");
                    player.getInv().setFood(true);
                }else if (this.award.equals("Water") && !player.getInv().isWater()) {
                    System.out.println(this.award + " Kazandınız");
                    player.getInv().setWater(true);
                }else if (this.award.equals("Firewood") && !player.getInv().isFirewood()) {
                    System.out.println(this.award + " Kazandınız");
                    player.getInv().setFirewood(true);
                }
                return true;
            }if(player.getHealthy()<=0) {
                System.out.println("Öldünüz.........");
                return true;
                }

            }
            return true;
        }

    public boolean combat(int obsCount){
        for (int i = 0; i<obsCount;i++){
            int defObsHealth=obstracle.getHealth();
            playerStats();
            enemyStats();
            while (player.getrHealty()>0 && obstracle.getHealth()>0){
                System.out.println("<V>ur veya <K>aç: ");
                String selCase = scan.next();
                selCase = selCase.toUpperCase();
                if(selCase.equals("V")){
                    System.out.println("Siz vurdunuz....");
                    obstracle.setHealth(obstracle.getHealth()-player.getTotalDamage());
                    afterHit();
                    if(obstracle.getHealth() > 0) {
                        System.out.println();
                        System.out.println("Canavar size vurdu..........");
                        player.setHealthy(player.getrHealty() - (obstracle.getDamage() - player.getInv().getArmor()));
                        afterHit();
                    }
                }else {
                    return false;
                }
            }
            if(obstracle.getHealth()< player.getrHealty()){
                System.out.println("düşmanı yendiniz.......");
                player.setMoney(player.getMoney()+obstracle.getAward());
                System.out.println("güncel paranız: "+player.getMoney());
                System.out.println();
                obstracle.setHealth(defObsHealth);
            }else {
                return false;
            }
        }
        return true;
    }
    public void playerStats(){
        System.out.println("Oyuncu Değerleri");
        System.out.println("Can: "+player.getHealthy());
        System.out.println("Hasar: "+player.getTotalDamage());
        System.out.println("Para: "+player.getMoney());
        System.out.println("----------------------------------------------\n");
        if(player.getInv().getDamage()>0){
            System.out.println("Silah: "+ player.getInv().getwName());
        }
        if(player.getInv().getArmor() > 0){
            System.out.println("Zırh: "+player.getInv().getaName());
        }
    }
    public void enemyStats(){//düşman
        System.out.println(obstracle.getName()+" Degerleri");
        System.out.println("Can: "+obstracle.getHealth());
        System.out.println("Hasar: "+obstracle.getDamage());
        System.out.println("Ödül: "+obstracle.getAward());
        System.out.println("--------------------------------------------\n");
    }
    public void afterHit(){
        System.out.println("Oyuncu Canı: "+player.getHealthy());
        System.out.println(obstracle.getName()+"canı : "+obstracle.getHealth());
    }


}
