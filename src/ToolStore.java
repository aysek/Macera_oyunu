public class ToolStore extends NormalLoc{

    ToolStore(Player player) {
        super(player, "Mağaza");
    }
        @Override
        public boolean getLocation(){
            System.out.println("Para: "+player.getMoney());
            System.out.println("1. Silahlar ");
            System.out.println("2. Zırhlar ");
            System.out.println("3. Çıkış ");
            int selTool = scan.nextInt();
            int selItemId;
            switch (selTool){
                case 1:
                    selItemId=weaponMenu();
                    buyWeapon(selItemId);
                    break;
                case 2:
                    selItemId=armorMenu();
                    buyArmor(selItemId);
                    break;
                case 3:
                    break;

            }
        return true;
    }
    public int armorMenu(){

        System.out.println("1. Hafif ==> Para : 15 - Engellenen Hasar : 1");
        System.out.println("2. Orta ==> Para : 25 - Engellenen Hasar : 3");
        System.out.println("3. Ağır ==> Para : 40 - Engellenen Hasar : 5");
        System.out.println("4. Çıkış");
        System.out.print("Zırh seçiniz : ");
        int selWeaponId=scan.nextInt();
        return selWeaponId;
    }
    public void buyArmor(int itemId){

        int avoid=0,price = 0;
        String aName=null;


            switch (itemId) {
                case 1:
                    avoid = 1;
                    aName = "Hafif Zırh";
                    price = 15;
                    break;

                case 2:
                    avoid = 3;
                    aName = "Orta Zırh";
                    price = 25;
                    break;
                case 3:
                    avoid = 5;
                    aName = "Tüfek";
                    price = 40;
                    break;
                case 4:
                    System.out.println("Çıkış Yapılıyor....");
                    break;
                default:
                    System.out.println("Geçersiz işlem...");
                    break;
            }
            if (price > 0) {
                if (player.getMoney() > price) {
                   player.getInv().setArmor(avoid);
                   player.getInv().setaName(aName);
                    player.setMoney(player.getMoney() - price);

                    System.out.println(aName + " satın aldınız , Engellenen hasar : " + player.getInv().getArmor() + " Yeni hasar : " + (player.getTotalDamage()));
                    System.out.println("Kalan Paranız: " + player.getMoney());
                } else {
                    System.out.println("Bakiye yetersiz....");
                }
            }
    }
    public int weaponMenu(){

        System.out.println("1. Tabanca ==> Para : 5 - Hasar : 2");
        System.out.println("2. Kılıç ==> Para : 35 - Hasar : 3");
        System.out.println("3. Tüfek ==> Para : 45 - Hasar : 7");
        System.out.println("4. Çıkış");
        System.out.print("Silah seçiniz : ");
        int selWeaponId=scan.nextInt();
        return selWeaponId;
    }
    public void buyWeapon(int itemId){

        int damage=0,price = 0;
        String wName=null;

            if(itemId> 0|| itemId <4 ) {
                switch (itemId) {
                    case 1:
                        damage = 2;
                        wName = "Tabanca";
                        price = 25;
                        break;

                    case 2:
                        damage = 3;
                        wName = "Kılıç";
                        price = 35;
                        break;
                    case 3:
                        damage = 7;
                        wName = "Tüfek";
                        price = 45;
                        break;
                    case 4:
                        System.out.println("Çıkış Yapılıyor....");
                        break;
                    default:
                        System.out.println("Geçersiz işlem...");
                        break;
                }
                if (price > 0) {
                    if (player.getMoney() > price) {
                        player.getInv().setDamage(damage);
                        player.getInv().setwName(wName);
                        player.setMoney(player.getMoney() - price);

                        System.out.println(wName + " satın aldınız , Önceki hasar : " + player.getDamage() + " Yeni hasar : " + (player.getTotalDamage()));
                        System.out.println("Kalan Paranız: " + player.getMoney());
                    } else {
                        System.out.println("Bakiye yetersiz....");
                    }
                }
            }
        }


}
