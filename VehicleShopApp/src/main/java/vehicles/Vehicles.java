package vehicles;

public class Vehicles {
	public int id_vozila;
	public String naziv_vozila;
	public String marka_vozila;
	public String model_vozila;
	public String godina_proizvodnje;
	public int getId_vozila() {
		return id_vozila;
	}
	public void setId_vozila(int id_vozila) {
		this.id_vozila = id_vozila;
	}
	public String getNaziv_vozila() {
		return naziv_vozila;
	}
	public void setNaziv_vozila(String naziv_vozila) {
		this.naziv_vozila = naziv_vozila;
	}
	public String getMarka_vozila() {
		return marka_vozila;
	}
	public void setMarka_vozila(String marka_vozila) {
		this.marka_vozila = marka_vozila;
	}
	public String getModel_vozila() {
		return model_vozila;
	}
	public void setModel_vozila(String model_vozila) {
		this.model_vozila = model_vozila;
	}
	public String getGodina_proizvodnje() {
		return godina_proizvodnje;
	}
	public void setGodina_proizvodnje(String godina_proizvodnje) {
		this.godina_proizvodnje = godina_proizvodnje;
	}
	@Override
	public String toString() {
		return "Vehicles [id_vozila=" + id_vozila + ", naziv_vozila=" + naziv_vozila + ", marka_vozila=" + marka_vozila
				+ ", model_vozila=" + model_vozila + ", godina_proizvodnje=" + godina_proizvodnje + ", getId_vozila()="
				+ getId_vozila() + ", getNaziv_vozila()=" + getNaziv_vozila() + ", getMarka_vozila()="
				+ getMarka_vozila() + ", getModel_vozila()=" + getModel_vozila() + ", getGodina_proizvodnje()="
				+ getGodina_proizvodnje() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
