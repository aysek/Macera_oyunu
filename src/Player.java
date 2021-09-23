import java.util.Scanner;

public class Player {

    private int damage,healthy, money,rHealty;
    private String name, cName;
    private Inventory inv;

    Scanner scan = new Scanner(System.in);
    public Player(String name) {
        this.name = name;
        this.inv= new Inventory();
    }
    public void selectCha(){
        switch (chaMenu()){
            case 1:
                 init("Samuray",5,21,15);
                break;
            case 2:
                init("Okçu",7,18,20);
                break;
            case 3:
                init("Şövalye",8,24,5);
                break;
            default:
                init("Samuray",5,21,15);
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
    public int getTotalDamage(){
        return this.getDamage()+this.getInv().getDamage();
    }

    public void init(String cNm,int dmg,int hlty,int mny){
        setcName(cNm);
        setDamage(dmg);
        setHealthy(hlty);
        setMoney(mny);
        setrHealty(hlty);
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

    public int getrHealty() {
        return rHealty;
    }

    public void setrHealty(int rHealty) {
        this.rHealty = rHealty;
    }
}
