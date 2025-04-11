public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar(){
    ligada=true;
  }

  public void desligar(){
    ligada=false;
  }

  public void aumentarVolume(){
    volume++;
    System.out.println("Aumentou volume: "+volume);
  }

  public void diminuirVolume(){
    volume--;
    System.out.println("Diminuiu volume: "+volume);
  }

  public void avancarCanal(){
    canal++;
    System.out.println("Canal: "+canal);
  }

  public void voltarCanal() {
    canal--;
    System.out.println("Canal: "+canal);
  }
    public void mudarCanal (int novoCanal){
      canal = novoCanal;
    }

}
