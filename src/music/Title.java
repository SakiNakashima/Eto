package music;

public class Title {

	protected void display(String music, String artist) {
		if(music==null||music==""||artist==null||artist=="") {
			System.out.println("再生に失敗しました。");
		}else {
			System.out.println("PLAYING:"+music+"/feat;"+artist);
		}
	}
}
