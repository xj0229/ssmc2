package com.xiejun.builder;

public class BuilderTest {
	public static void main(String[] args) {
		TicketHelper helper = new TicketHelper();
		helper.buildAdult("buildAdult");
		helper.buildChildrenForSeat("buildChildrenForSeat");
		helper.buildchildrenNoSeat("buildchildrenNoSeat");
		helper.buildElderly("buildElderly");
		helper.buildSoldier("buildSoldier");
		Object ticket = TicketBuilder.builder(helper);
	}
}
