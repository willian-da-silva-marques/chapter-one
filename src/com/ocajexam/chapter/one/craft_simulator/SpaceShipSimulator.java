package com.ocajexam.chapter.one.craft_simulator;

import com.ocajexam.chapter.one.craft_simulator.SpaceShip.ShipType;

public class SpaceShipSimulator {

	public static void main(String[] args) {
		/*Cria um objeto SpaceShip com o tipo de nave padrão*/
		SpaceShip ship1 = new SpaceShip();
		System.out.println(ship1);
		
		/*Cria um objeto SpaceShip com o tipo de nave especificado*/
		SpaceShip ship2 = new SpaceShip(ShipType.FRIGATE);
		System.out.println(ship2);
	}
}