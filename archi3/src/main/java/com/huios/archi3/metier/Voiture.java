package com.huios.archi3.metier;

public class Voiture {
private int numVoiture;
private String model;
public int getNumVoiture() {
	return numVoiture;
}
public void setNumVoiture(int numVoiture) {
	this.numVoiture = numVoiture;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
@Override
public String toString() {
	return "Voiture [numVoiture=" + numVoiture + ", model=" + model + "]";
}

}
