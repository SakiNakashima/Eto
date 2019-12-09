package music;

public class Walkman extends Title implements Player{
	Walkman(){
		System.out.println("Walkmanを使用します。");
	}

	public void useWalkman(String music, String artist) {
		display(music,artist);
	}

	public void start() {
		System.out.println("爆音で再生します");
	}

	public void pause() {
		System.out.println("3分間待ってやる");
	}

	public void  stop() {
		System.out.println("停止しました");
	}
}