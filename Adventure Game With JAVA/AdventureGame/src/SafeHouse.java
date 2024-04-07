
public class SafeHouse extends NormalLoc{
	
	SafeHouse(Player player) {
		super(player,"Güvenli Ev");
		}
 
	public boolean getLocation() {
		player.setHealthy(player.getrHealty());
		System.out.println("İyileştiniz...");
		System.out.println("Şuan Güvenli Evdesiniz..");
		return true;
	}

}
