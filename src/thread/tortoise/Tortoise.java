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
	
	@Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Tortoise has started from the start line!");
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Tortoise has reached the Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Tortoise has reached the Big Oak Tree!");
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the finish line!");
            }
            try {
                Thread.sleep(3000L);
				raceTime += 3;
            } catch (InterruptedException e) {
                System.out.println("The Tortoise has lost the path!");
            }
			
			JOptionPane.showConfirmDialog(
				null,
				"The Tortoise has completed the race!",
				"Tortoise",
				JOptionPane.OK_CANCEL_OPTION
			);
        }
}
