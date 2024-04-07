import java.util.Scanner;

public class Game {
	
	Player player;
	Location location;
	Scanner scan = new Scanner(System.in);
	
	public void login() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Macera Oyununa Hoşgeldiniz !");
		System.out.print("Oyuna Başlamadan Önce İsminizi Giriniz: ");
        String playerName = scan.nextLine();
        player = new Player(playerName);
        player.selectCha();
        start();
	}
	
	public void start() {
		while(true) {
			System.out.println();
			System.out.println("---------------------");
			System.out.println();
			System.out.println("Harekete Geçmek İçin Bir Yer Seçiniz:");
		    System.out.println("(1) - Güvenli Ev ---> Size ait güvenli bir mekan. Düşman yok...");
		    System.out.println("(2) - Mağara     ---> Karşınıza belki ZOMBİ çıkabilir!");
		    System.out.println("(3) - Orman      ---> Karşınıza belki VAMPİR çıkabilir!");
		    System.out.println("(4) - Nehir      ---> Karşınıza belki AYI çıkabilir!");
		    System.out.println("(5) - Mağaza     ---> Silah veya Zırh alabilirsiniz...");
		    System.out.println("Gitmek istediğiniz yer : ")		;
		    
		    int selloc=scan.nextInt();
		    
		    while(selloc<0 || selloc>5) {
		    	System.out.println("Lütfen geçerli bir yer seçiniz: ");
		    	selloc=scan.nextInt();
		    }
		    
		    switch(selloc) {
		    case 1:
		    	location = new SafeHouse(player);
		    	break;
		    case 2:
		    	location = new Cave(player);
		    	break;
		    case 3:
		    	location = new Forest(player);
		    	break;
		    case 4:
		    	location = new River(player);
		    	break;
		    case 5:
		    	location = new ToolStore(player);
		    	break;
		    default: 
		    	location = new SafeHouse(player);
		    	break;
		    }
		    
		    if(location.getClass().getName().equals("SafeHouse")) {
		    	if(player.getInv().isFirewood() && player.getInv().isFood() && player.getInv().isWater()) {
		    		System.out.println("Tebrikler Oyunu Kazandınız ! ");
		    		break;
		    	}
		    }
		    
		    if(!location.getLocation()) {
		    	System.out.println("Oyun Bitti!!!");
		    	break;	
		    }
		}
	}

}
