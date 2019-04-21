package com.xiejun.builder;

public class TicketHelper {
	public void buildAdult(String info) {
		System.err.println("buildAdult" + info);
	}

	public void buildChildrenForSeat(String info) {
		System.err.println("buildChildrenForSeat" + info);
	}

	public void buildchildrenNoSeat(String info) {
		System.err.println("buildchildrenNoSeat" + info);
	}

	public void buildElderly(String info) {
		System.err.println("buildElderly" + info);
	}

	public void buildSoldier(String info) {
		System.err.println("buildSoldier" + info);
	}
}
