package class6;

public class Home {

	public static void main(String[] args) {
		Person heni = new Person("Heni", 18);
		Person jasmine = new Person("Jasmine", 18);
		iPhone zifanPhone = new iPhone("Silver", 256);
		System.out.println(heni);
		System.out.println(zifanPhone);

		Home home = new Home();
		home.playWithPerson(heni);
		home.playWithPhone(zifanPhone);

		System.out.println(zifanPhone);
		System.out.println(heni);

		System.out.println(heni.getName());

		heni.setName("ABC");
		heni.setName("BBC");
		//heni.name = "XYZ";
		System.out.println(heni.getName());
		System.out.println(jasmine.getName());

	}

	public void playWithPhone(iPhone iphone) {
		iphone.makePhoneCall();
		// iphone.memory = 1;
		// iphone.color = "Black";
	}

	public void playWithPerson(Person p) {
		p.play();
		// p.name = "Rishaan";
	}

}
