package Eto;

import java.util.Scanner;

public class Eto {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("西暦で入力してください。");
		int seinen = scn.nextInt();
		System.out.println(seinen+"年の干支は"+getJikkan(seinen)+getJunishi(seinen)+"です。");

		scn.close();
	}


	private enum Jikkan {

		J0("庚"),
		J1("辛"),
		J2("壬"),
		J3("癸"),
		J4("甲"),
		J5("乙"),
		J6("丙"),
		J7("丁"),
		J8("戊"),
		J9("己"),
		;
		private String type;
		private Jikkan(String type) {
			this.type = type;
		}
		public String getType() {
			return this.type;
		}

	}

	private static String getJikkan(int year) {

		year %= 10;

		Jikkan.values();
		String Jikname = "";

		switch(year) {
		//jikkanをみてyearと照らし合わせ文字列をreturnする
		case 0:
			Jikname = Jikkan.J0.getType();
			break;
		case 1:
			Jikname = Jikkan.J1.getType();
			break;
		case 2:
			Jikname = Jikkan.J2.getType();
			break;
		case 3:
			Jikname = Jikkan.J3.getType();
			break;
		case 4:
			Jikname = Jikkan.J4.getType();
			break;
		case 5:
			Jikname = Jikkan.J5.getType();
			break;
		case 6:
			Jikname = Jikkan.J6.getType();
			break;
		case 7:
			Jikname = Jikkan.J7.getType();
			break;
		case 8:
			Jikname = Jikkan.J8.getType();
			break;
		case 9:
			Jikname = Jikkan.J9.getType();
			break;
		}

		return Jikname;
	}

	private enum Junishi{

		SARU("申"),
		TORI("酉"),
		INU("戌"),
		INO("亥"),
		NE("子"),
		USHI("丑"),
		TORA("寅"),
		USA("卯"),
		TATU("辰"),
		MI("巳"),
		UMA("午"),
		HITUJI("未"),
		;

		private String type;
		private Junishi(String type) {
			this.type = type;
		}
		public String getType() {
			return this.type;
		}
	}

	private static String getJunishi(int year) {

		year %= 12;

		Jikkan.values();
		String Junname = "";

		switch(year) {
		//junishiをもとにyearと照らしあわせ文字列をreturnする
		case 0:
			Junname = Junishi.SARU.getType();
			break;
		case 1:
			Junname = Junishi.TORI.getType();
			break;
		case 2:
			Junname = Junishi.INU.getType();
			break;
		case 3:
			Junname = Junishi.INO.getType();
			break;
		case 4:
			Junname = Junishi.NE.getType();
			break;
		case 5:
			Junname = Junishi.USHI.getType();
			break;
		case 6:
			Junname = Junishi.TORA.getType();
			break;
		case 7:
			Junname = Junishi.USA.getType();
			break;
		case 8:
			Junname = Junishi.TATU.getType();
			break;
		case 9:
			Junname = Junishi.MI.getType();
			break;
		case 10:
			Junname = Junishi.UMA.getType();
			break;
		case 11:
			Junname = Junishi.HITUJI.getType();
			break;
		}

		return Junname;
	}
}