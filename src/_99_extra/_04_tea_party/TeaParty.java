package _99_extra._04_tea_party;

public class TeaParty {
	public static void main(String[] args) {
		TeaParty party = new TeaParty();
		System.out.println(party.welcome("Isaac Newton", false, true));
		System.out.println(party.welcome("Jane Austen", true, false));
		System.out.println(party.welcome("George Orwell", false, false));
		System.out.println(party.welcome("Laura", true, true));
		
	}

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isKnighted && isWoman) {
			return "hello Lady " + name;
		} else if (isKnighted == false && isWoman) {
			return "hello Ms. " + name;
		} else if (isKnighted && isWoman == false) {
			return "hello Sir " + name;
		} else {
			return "hello Mr. " + name;
			
		}
	}
}