package class8.abs;

class Person {
	public void getEntertained(EntertainmentDevice ed) {
		ed.entertain();
	}
	


	public static void main(String args[]) {
		Person azher = new Person();
		TV sony = new TV();
		Friend jaya = new Friend();
		XBox xbox = new XBox();
		azher.getEntertained(sony);
		azher.getEntertained(xbox);
		azher.getEntertained(jaya);
		
	}
}