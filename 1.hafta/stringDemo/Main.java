package stringDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bu��n hava �ok so�uk";
		System.out.println(mesaj);
		
		
		System.out.println("Eleman say�s� :"+ mesaj.length());
		System.out.println("5. Eleman : "+ mesaj.charAt(4));
		System.out.println(mesaj.concat("uuuuuuuuuvuuuuuu"));
		System.out.println(mesaj.startsWith("B"));

	}

}
