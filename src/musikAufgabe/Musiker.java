package musikAufgabe;

public abstract class Musiker extends Kuenstler{

  private Band band;

  public abstract void musizieren();


  public Band getBand() {
    return band;
  }

  public void setBand(Band band) {
    this.band = band;
  }
}
