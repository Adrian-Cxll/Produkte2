package datenspeicherung.datei;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import datenspeicherung.ProduktDaten;

public class ProduktSpeicher
{
	public ProduktSpeicher()
	{

	}

	public void aendere(int pProduktNr, String pBezeichnung,
			double pVerkaufspreis, double pLagerbestand) throws IOException
	{

	}

	public void fuegeHinzu(String pBezeichnung, double pVerkaufspreis,
			double pLagerbestand) throws IOException
	{

	}

	public ArrayList<ProduktDaten> liesProdukte() throws Exception
	{
		ArrayList<ProduktDaten> arrlist = new ArrayList<>();

		try
		{
			BufferedReader br = new BufferedReader(
					new FileReader("produkt.csv"));
			String dateiZeile;
			while ((dateiZeile = br.readLine()) != null)
			{
				String daten[] = dateiZeile.split(";");

				int produktNr = Integer.parseInt(daten[0]);
				String bezeichnung = daten[1];
				double verkaufspreis = Double.parseDouble(daten[2]);
				double lagerbestand = Double.parseDouble(daten[3]);

				ProduktDaten produkt = new ProduktDaten(produktNr, bezeichnung,
						verkaufspreis, lagerbestand);

				arrlist.add(produkt);
			}
			br.close();

		}
		catch (Exception e)
		{

			throw new Exception("fehler:" + e);
		}
		return arrlist;

	}

	public void loesche(int pProduktNr) throws IOException
	{

		ArrayList<ProduktDaten> arrlist;
		BufferedReader br = new BufferedReader(new FileReader("produkt.csv"));
		try
		{
			arrlist = liesProdukte();
		}
		catch (Exception e)
		{

		}

		br.close();
	}
}
