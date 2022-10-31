package oopders5r3;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time1 saat=new Time1();
		saat.setTime(12,45,50);
		saat.saat();
		System.out.println(" kac kere set edildi?= "+Time1.getCount());
        Time2 saat2=new Time2(16,4,28);
        saat2.saat();
        saat2.setSaatDakikaSaniye(13, 15, 42);
        saat2.saat();
        saat2.setSaatDakika(11, 0);
        saat2.saat();
        Time2 saat3=new Time2(6,59,8);
        saat3.saat();
        
	}

}
