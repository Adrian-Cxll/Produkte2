package benutzerschnittstelle;

import java.io.IOException;
import java.util.ArrayList;

import datenspeicherung.*;
import datenspeicherung.datei.ProduktSpeicher;

public class Konsole
{
	public static void main(String[] args)
	{

		// produktspeicer objekt erzeugen
		// obj Produktdaten in dyn array ablegen
		// Produktdaten formatieren

		ProduktSpeicher speicher = new ProduktSpeicher();

		ArrayList<ProduktDaten> produktliste = null;

		try
		{
			produktliste = speicher.liesProdukte();
		}
		catch (Exception e0)
		{
			System.out.println("Fehler: " + e0);
		}
		System.out.format("%-50s  %10s  %10s \n", "Produktname", "Lager", "Preis");	
		System.out.println("------------------------------------------------------------------------------");
		for (int i = 0; i < produktliste.size(); i++)
		{
			ProduktDaten daten = produktliste.get(i);
			System.out.format("%-50s  %10.2f  %10.2f \n", daten.liesBezeichnung(),
					daten.liesLagerbestand(), daten.liesVerkaufspreis());
			// - text linksbündig / s String f fkz d digit %n neue Zeile
		}

	}
}
