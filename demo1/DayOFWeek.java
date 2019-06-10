package ua.edu.softserve.conditional;

public enum DayOFWeek {
	SUNDAY("SUNDAY", "мед╡къ"), MONDAY("MONDAY", "онмед╡кнй"), TUESDAY("TUESDAY", "яепедю"),
	WEDNESDAY("WEDNESDAY", "б╡брнпнй"), THURSDAY("THURSDAY", "вербеп"), FRIDAY("FRIDAY", "о'ърмхжъ"),
	SATURDAY("SATURDAY", "ясанрю");

	private final String ua;
	private final String en;

	public String getUa() {
		return ua;
	}

	public String getEn() {
		return en;
	}

	private DayOFWeek(String en, String ua) {
		this.en = en;
		this.ua = ua;
	}
}
