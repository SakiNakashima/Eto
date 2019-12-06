package jp.co.kenshu;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Register {
	public static void main(String args[]) {
		ArrayList<Kaiin> kaiinAll=new ArrayList<Kaiin>();
		
		Date date=new Date();
		SimpleDateFormat now =new SimpleDateFormat("yyyy年MM月dd日");
		
		kaiinAll.add(kaiinAdd(0001,"山田太郎"));
		kaiinAll.add(kaiinAdd(0002,"鈴木花子"));
		kaiinAll.add(kaiinAdd(0003,"佐藤琢磨"));
		
		for(int i=0;i<kaiinAll.size();i++) {
			System.out.println(kaiinAll.get(i).getName()+"さんの会員IDは"+String.format("%04d",kaiinAll.get(i).getId())+"です。登録："+now.format(date));
		}		
	}
	
	private static Kaiin kaiinAdd(int id,String name) {
		Kaiin who =new Kaiin();
		who.setId(id);
		who.setName(name);
		return who;
	}
}