import java.util.Scanner;

public class Player {

    private int damage,healthy, money;
    private String name, cName;
    private Inventory inv;

    Scanner scan = new Scanner(System.in);
    public Player(String name) {
        this.name = name;
    }
    public void selectCha(){
        switch (chaMenu()){
            case 1:
                setcName("Samuray");
                setDamage(5);
                setHealthy(21);
                setMoney(15);
                break;
            case 2:
                setcName("Okçu");
                setDamage(7);
                setHealthy(18);
                setMoney(20);
                break;
            case 3:
                setcName("Şövalye");
                setDamage(8);
                setHealthy(24);
                setMoney(5);
                break;
            default:
                setcName("Samuray");
                setDamage(5);
                setHealthy(21);
                setMoney(15);
                break;

        }
        System.out.println("Karakter : "+getcName()+"\tHasar: "+getDamage()+"\tSağlık: "+getHealthy()+"\tPara: "+getMoney());

    }

    public int chaMenu(){
        System.out.println("Lütfen bir karakter seçiniz...");
        System.out.println("1- Samuray\tHasar:5\tSaglık:21\tPara:15");
        System.out.println("2- Okçu\t\tHasar:7\tSaglık:18\tPara:20");
        System.out.println("3- Şovalye\tHasar:8\tSaglık:24\tPara:5");
        System.out.println("Karakter Seçiminiz: ");
        int charId=scan.nextInt();

        while (charId < 1 || charId>3) {
            System.out.println("Lütfen 1-3 Arasında bir sayı giriniz...");
            charId=scan.nextInt();

        }


        return charId;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }
}
