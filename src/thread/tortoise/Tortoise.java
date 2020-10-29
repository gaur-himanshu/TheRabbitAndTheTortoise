package thread.tortoise;

public class Tortoise extends Thread {
	
	public static final int MILESTONE = 5;

	public final Thread tortoise;
	private float raceTime= 0f;
	
	public float getRaceTime() {
		return raceTime;
	}

	public tortoise() {
		this.tortoise = new Thread(this, "Tortoise");
	}

	public Thread getTortoise() {
		return tortoise;
	}
}
