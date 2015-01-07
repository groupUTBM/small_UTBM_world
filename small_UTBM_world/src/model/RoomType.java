package model;

public enum RoomType {
	TPROOM("TP")
	, TDROOM("TD")
	, COMPUTERROOM("CR")
	, CLASSROOM("CLASSROOM")
	, BAR("BAR")
	, GYM("GYM")
	, DORMITORY("BEDS")
	, CHINESECLASS("CHINESE")
	, MECANICCLASS("MECANIC")
	, GRASS("GRASS")
	, MESS("MESS")
	;
	
	String label;

	private RoomType(String lbl) {
		label = lbl;
	}

	public String getLabel() {
		return label;
	}

}
