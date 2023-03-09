package K_OOPS_Programs;

abstract class Phone {

	/*
	 * public Phone(){ System.out.println("phone"); }
	 */
	abstract public void makeCall();

	abstract public void receiveCall();

	public void info() {
		System.out.println("Hello phone is working");
	}
}

interface check {
	int x = 1;
}

interface Camera {
	default void camera() {
		System.out.println("in camera");
	}
}

interface Player {
	public void play(String song);
}

interface Wifi {
	public void wifi();
}

class Mysmartphone extends Phone implements Camera, Player, Wifi, check {
	// int x=12;

	public void makeCall() {
		System.out.println("Calling...");

	}

	public void receiveCall() {
		System.out.println("Hello!");

	}

	public void camera() {

		System.out.println("Snapshot taken");
	}

	public void play(String song) {
		camera();
		System.out.println("Singing " + song);
	}

	public void wifi() {
		System.out.println("wifi");
	}

	public void workingphone() {
		String song;
		makeCall();
		receiveCall();
		camera();
		// play();
		wifi();

	}

	@Override
	public void info() {
		System.out.println("Hiiii smartphone is working");
	}

	public void checking() {
		System.out.println("Congratulation...\nSmart phone is working");
	}
}

public class SmartPhone {

	static void nothing() {
		System.out.println("nothing");
	}

	public static void main(String[] args) {

		{
			Mysmartphone sp = new Mysmartphone();
			int x = sp.x;
			sp.info();
			if (x == 1) {
				sp.checking();
				sp.workingphone();
				Player p = new Mysmartphone();
				p.play("Lag ja gale....");
				// p.camera();
				Camera c = new Mysmartphone();
				c.camera();
				//Phone ph2 = new Phone();
				Phone ph = new Mysmartphone();
				ph.info();
			}

		}
	}
}
