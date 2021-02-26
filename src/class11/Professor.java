package class11;

public class Professor {

	public void organizeTheClass() throws ProfessorNotFeelingWellException, ProfessorNotInformedException {
		int i = getRandom(10);
		System.out.println("Number : " + i);

		if (i == 9) {
			ProfessorNotInformedException pne = new ProfessorNotInformedException();
			throw pne;
		}
		if (i == 8) {
			ProfessorNotFeelingWellException pe = new ProfessorNotFeelingWellException(98 + getRandom(7));
			throw pe;
		}
		if (i == 7) {
			ProfessorNotTakingClassException re = new ProfessorNotTakingClassException();
			throw re;
		}
		System.out.println("Professor is organizing a class to teach");
	}

	private int getRandom(int number) {
		return (int) (Math.random() * number);
	}
}

class Student {

	void doHomeWork() {
		System.out.println("Do homework");
	}

	void attendTheClass(Professor professor) throws ProfessorNotInformedException {
		try {
			professor.organizeTheClass();
		} catch (ProfessorNotFeelingWellException pe) {
			if (pe.temparature > 103) {
				greetProfessor(professor);
			}
			if (pe.temparature > 105) {
				System.out.println("Call 911");
			}
			return;

		} catch (ProfessorNotTakingClassException re) {
			this.doHomeWork();
			return;
		} catch (Exception e) {
			System.out.println("General exception -> " + e.getMessage());
			return;
		}

		finally {
			System.out.println("Looking at the subject that was either taught or to be taught");
		}
		System.out.println("Student is attending the class");
	}

	void greetProfessor(Professor p) {
		System.out.println("Please take rest, Professor and get well soon");
	}
}

class ProfessorNotInformedException extends Exception {

}

class ProfessorNotTakingClassException extends RuntimeException {

}

class ProfessorNotFeelingWellException extends RuntimeException {

	int temparature;

	ProfessorNotFeelingWellException(int temparature) {
		this.temparature = temparature;
	}

}