package class7;

public class EarPhones {
	double price;
	String color = "Black";

	EarPhones(String color) {
		this.color = color;
	}

	EarPhones() {

	}
	
	private void accessCopperWireInTheCable() {
		System.out.println("Access copper wire");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double d) {
		this.price = d;
	}

	void listenToSound() {
		System.out.println("Listen to sound from " + getType());
	}

	public String getType() {
		return "earphones";
	}

	void adjustVolume() {
		System.out.println("Adjust the volume");
	}

	void connectWithAudioDevice() {
		System.out.println("Transmit the sound");
	}

	void cancelNoise() {
		System.out.println("Cancel noise");
	}

	void talk() {
		System.out.println("Talk");
	}

	public static void main(String args[]) {
		EarPhones jayasEarPhones = new EarPhones();
		jayasEarPhones.listenToSound();
		System.out.println(jayasEarPhones.getColor());
		jayasEarPhones.talk();
		// jayasEarPhones.chargeDevice();

		AirPods palaksAirpods = new AirPods();
		palaksAirpods.listenToSound();
		System.out.println(palaksAirpods.getColor());
		System.out.println(palaksAirpods);

		AirPods zifanAirpods = new AirPods("Blue");
		System.out.println(zifanAirpods.getColor());// Parent
		zifanAirpods.talk();// Parent
		zifanAirpods.chargeDevice();// Child

		System.out.println(zifanAirpods);
		System.out.println("--------");
		AirPods anupamaAP = new AirPods();
		anupamaAP.adjustVolume();

	}
}

class AirPods extends EarPhones {
	String color;

	AirPods() {
		this("White");
	}

	AirPods(String color) {
		//super(color);
		this.color = super.getColor().toUpperCase();
	}

	@Override
	public String getType() {
		return "AirPods";
	}

	@Override
	void adjustVolume() {
		super.adjustVolume();
		System.out.println("Volume can be adjsuted using Siri");
	}

	void chargeDevice() {
		System.out.println("Charge airpods");
	}

	public String toString() {
		return "[Color (parent), Color (child)[]" + super.color + ", " + color + "]";
	}

}
