package zadanieUI1;

//trieda reprezentujuca stav
public class Stav {

	Integer[] rozlozenie;
	int aktualnaCena;
	String operator;
	Stav previousStav;
	int hlbka;

	public Stav(Integer[] rozlozenie, int aktualnaCena, String operator,
			Stav previousStav, int hlbka) {
		this.rozlozenie = rozlozenie;
		this.aktualnaCena = aktualnaCena;
		this.operator = operator;
		this.previousStav = previousStav;
		this.hlbka = hlbka;
	}

}

