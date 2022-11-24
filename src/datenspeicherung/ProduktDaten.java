package datenspeicherung;

public class ProduktDaten
{
	private String bezeichnung;
	private double lagerbestand;
	private int produktNr;
	private double verkaufspreis;

	public ProduktDaten(int pProduktNr, String pBezeichnung,
			double pVerkaufspreis, double pLagerbestand)
	{
		produktNr = pProduktNr;
		bezeichnung = pBezeichnung;
		verkaufspreis = pVerkaufspreis;
		lagerbestand = pLagerbestand;
	}

	public String liesBezeichnung()
	{
		return bezeichnung;
	}

	public double liesLagerbestand()
	{
		return lagerbestand;
	}

	public double liesProduktNr()
	{
		return produktNr;
	}

	public double liesVerkaufspreis()
	{
		return verkaufspreis;
	}
}
