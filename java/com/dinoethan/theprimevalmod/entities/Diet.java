package com.dinoethan.theprimevalmod.entities;

public enum Diet {
	CARNIVORE(1),
	HERBIVORE(2),
	OMNIVORE(3),
	PISCIVORE(4),
	INSECTIVORE(5),
	CARNIVORE_EGG(6),
	PISCCARNIVORE(7),
	NONE(0);

	private final int fearIndex;

	Diet(int fearIndex) {
		this.fearIndex = fearIndex;
	}

	public int getFearIndex() {
		return this.fearIndex;
	}
}
