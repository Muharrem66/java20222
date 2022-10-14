package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
    String[] ogrenciler = new String[6];
    
    ogrenciler[0]="Muharrem";
    ogrenciler[1]="Ali";
    ogrenciler[2]="Velid";
    ogrenciler[3]="Ahmet";
    ogrenciler[4]="Ömer";
    ogrenciler[5]="Ýsmail";
    
    for(int i=0; i<ogrenciler.length;i++) {
    	System.out.println(ogrenciler[i]);
    	
    }
    
    for(String ogrenci:ogrenciler) {
    	System.out.println(ogrenci);
    }

	}

}
