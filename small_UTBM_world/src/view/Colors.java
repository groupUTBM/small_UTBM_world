package view;

import java.awt.Color;

public final class Colors {
	
	public static Color getTdRoomColor() {
		return tdRoomColor;
	}

	public static void setTdRoomColor(Color tdRoomColor) {
		Colors.tdRoomColor = tdRoomColor;
	}

	public static Color getTpRoomColor() {
		return tpRoomColor;
	}

	public static void setTpRoomColor(Color tpRoomColor) {
		Colors.tpRoomColor = tpRoomColor;
	}

	public static Color getGymColor() {
		return gymColor;
	}

	public static void setGymColor(Color gymColor) {
		Colors.gymColor = gymColor;
	}

	public static Color getBarColor() {
		return barColor;
	}

	public static void setBarColor(Color barColor) {
		Colors.barColor = barColor;
	}

	public static Color getChineseClassColor() {
		return chineseClassColor;
	}

	public static void setChineseClassColor(Color chineseClassColor) {
		Colors.chineseClassColor = chineseClassColor;
	}

	public static Color getMecaColor() {
		return mecaColor;
	}

	public static void setMecaColor(Color mecaColor) {
		Colors.mecaColor = mecaColor;
	}

	public static Color getClassColor() {
		return classColor;
	}

	public static void setClassColor(Color classColor) {
		Colors.classColor = classColor;
	}

	public static Color getDormColor() {
		return dormColor;
	}

	public static void setDormColor(Color dormColor) {
		Colors.dormColor = dormColor;
	}

	public static Color getComputerColor() {
		return computerColor;
	}

	public static void setComputerColor(Color computerColor) {
		Colors.computerColor = computerColor;
	}
	private static Color tdRoomColor = new Color(255,193,193);
	private static Color tpRoomColor = new Color(221,160,221);
	private static Color gymColor = new Color(255,246,143);
	private static Color barColor = new Color(139,0,0);
	private static Color chineseClassColor = new Color(238,64,0);
	private static Color mecaColor = new Color(230,230,250);
	private static Color classColor = new Color(255,231,186);
	private static Color dormColor = new Color(205,201,201);
	private static Color computerColor = new Color(151,255,255);
	private static Color grassColor = new Color(202,255,112);
	private static Color messColor = new Color(139,37,0);
	
	private Colors(){
	
	}

	public static Color getGrassColor() {
		return grassColor;
	}

	public static void setGrassColor(Color grassColor) {
		Colors.grassColor = grassColor;
	}

	public static Color getMessColor() {
		return messColor;
	}

	public static void setMessColor(Color messColor) {
		Colors.messColor = messColor;
	}
}
