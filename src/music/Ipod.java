package music;

public class Ipod extends Title implements Player{
	Ipod(){
		System.out.println("ipodを使用します。");
	}

	public void useIpod(String music, String artist) {
		display(music,artist);
	}

	public void start() {
		System.out.println("ひかえめに再生します");
	}

	public void pause() {
		System.out.println("かしこまりました、一時停止します");


	}

	public void  stop() {
		System.out.println("再生を停止しました");
	}
}