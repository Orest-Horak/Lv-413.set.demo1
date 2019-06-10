package ua.edu.softserve.conditional;

public enum DayOFWeek {
	SUNDAY("SUNDAY", "��Ĳ��"), MONDAY("MONDAY", "����Ĳ���"), TUESDAY("TUESDAY", "������"),
	WEDNESDAY("WEDNESDAY", "²������"), THURSDAY("THURSDAY", "������"), FRIDAY("FRIDAY", "�'������"),
	SATURDAY("SATURDAY", "������");

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
