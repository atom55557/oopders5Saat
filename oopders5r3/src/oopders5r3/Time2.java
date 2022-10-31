package oopders5r3;

public class Time2 {
	private int hour;
	private int minute;
	private int second;
	
	public Time2() {

	}
	
	public Time2(int saat) {
		this.hour=saat;
	}
	
	public Time2(int saat,int dakika) {
		this.minute=dakika;
		this.hour=saat;
	}
	
	public Time2(int saat,int dakika,int saniye) {
		this.second=saniye;
		this.minute=dakika;
		this.hour=saat;
	}
	
	public void setSaat(int saat) {
		if(hour<0 || hour>23  ) {
			System.out.print("yanlis saat degerleri girdiniz");	
		}
		this.hour=saat;
		
	}
	
	public void setSaatDakika(int saat,int dakika) {
		if(hour<0 || hour>23 || minute<0 || minute>59 ) {
			System.out.print("yanlis saat degerleri girdiniz");	
		}
		this.hour=saat;
		this.minute=dakika;
		
	}
	
	public void setSaatDakikaSaniye(int saat,int dakika,int saniye) {
		if(hour<0 || hour>23 || minute<0 || minute>59 || second<0 || second>59) {
			System.out.print("yanlis saat degerleri girdiniz");	
		}
		this.hour=saat;
		this.minute=dakika;
		this.second=saniye;
	}
	public void saat() {
		System.out.printf("%n%02d:%02d:%02d",hour,minute,second);
	}

}
