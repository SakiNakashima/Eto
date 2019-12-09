package music;

public class MusicPlayAction {
	public static void main(String[] args) {
		Walkman walk = new Walkman();
		walk.start();
		walk.useWalkman("", "X Japan");
		walk.pause();
		walk.stop();

		Ipod ipod = new Ipod();
		ipod.start();
		ipod.useIpod("未来は僕らの手の中","THE BLUE HEARTS");
		ipod.pause();
		ipod.stop();
		}
}
