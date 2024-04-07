import java.util.*;

public class Player {
	
	private int damage,healthy,money,rHealty;
	private String name,cName;
	private Inventory inv;
	Scanner scan = new Scanner(System.in);
	
	public Player(String name) {
		this.name = name;
		this.inv = new Inventory(); 
	}
	
	public void selectCha() {
		switch(charMenu()) {
		case 1:
			initPlayer("Samuray", 5, 21, 15);
			break;
		case 2:
			initPlayer("Okçu", 7, 18, 20);
			break;
		case 3:
			initPlayer("Şovalye", 8, 24, 5);
			break;
		default:
			initPlayer("Şovalye", 8, 24, 5);
			break;
		}
		System.out.println("Karakteriniz:" + getcName() + " , Hasar:" + getDamage() + " , Sağlık:" + getHealthy() + " , Para:" + getMoney());
	}
	
	public int charMenu() {
		System.out.println("Lütfen Bir Karakter Seçiniz :");
		System.out.println("1- Samuray \t Hasar : 5 \t Sağlık : 21 \t Para : 15");
        System.out.println("2- Okçu \t Hasar : 7 \t Sağlık : 18 \t Para : 20");
        System.out.println("3- Şovalye \t Hasar : 8 \t Sağlık : 24 \t Para : 5");
        System.out.print("Seçiminiz: ");
        int chaID = scan.nextInt();
        
        while(chaID<1 || chaID>3) {
        	System.out.print("Lütfen Geçerli Bir Rakam Giriniz!");
        	chaID = scan.nextInt();
        }
        
        return chaID;
        
	}
	
	public int getTotalDamage() {
		return this.getDamage() + this.getInv().getDamage();
	}
	
	public void initPlayer(String cName,int damage,int healty,int money) {
         setcName(cName);
         setDamage(damage);
         setHealthy(healty);
		 setMoney(money);
		 setrHealty(healty);
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
