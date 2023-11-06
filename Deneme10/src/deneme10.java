import java.util.Scanner;

public class deneme10 {

	public static void main(String[] args) {
		// switch case kullanarak 4 işlem yapan hesap makinesi
		Scanner scanner = new Scanner(System.in);
		System.out.println("****************");
		String islem = "1. Toplama İşlemi \n"
		               +"2. Çıkarma İşlemi \n"
		               +"3. Çarpma İşlemi \n"
		               +"4. Bölme İşlemi";
		System.out.println(islem);
		System.out.println("****************");
		
		System.out.print("İşlemi seçiniz: ");
		String sayi = scanner.nextLine();
		
		System.out.print("Birinci sayı:" );
		int a = scanner.nextInt();
		System.out.print("İkinci sayı:");
		int b = scanner.nextInt();
		switch(sayi) {
		case "1":
			System.out.println("Sonuç = " + (a+b));
		   break;
		case "2": 
			System.out.println("Sonuç = " + (a-b));
			break;
		case "3":
			System.out.println("Sonuç = " + (a*b));
			break;
		case "4":
			System.out.println("Sonuç = " + (a/b));
			break;
		default: 
			System.out.println("İşlem gerçekleştirilemiyor...");
		}

		
	}

}
