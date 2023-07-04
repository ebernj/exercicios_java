package aula04;

/**
 * Implementa��o de interface Crie uma interface chamada "FormatoAudio" com os
seguintes m�todos:
- abrir(String arquivo): abre o arquivo de �udio especificado.
- reproduzir(): reproduz o arquivo de �udio.
- pausar(): pausa a reprodu��o do arquivo de �udio.
- parar(): interrompe a reprodu��o do arquivo de �udio. Implemente a
interface "FormatoAudio" em duas classes chamadas "MP3Player" e
"WAVPlayer". Forne�a uma implementa��o adequada para cada
m�todo em ambas as classes. Em seguida, crie inst�ncias de
MP3Player e WAVPlayer e teste os m�todos implementados.
 */

interface FormatoAudio {
    void abrir(String arquivo);
    void reproduzir();
    void pausar();
    void parar();
}

class MP3Player implements FormatoAudio {
    @Override
    public void abrir(String arquivo) {
        System.out.println("MP3Player abrindo o arquivo: " + arquivo);
    }

    @Override
    public void reproduzir() {
        System.out.println("MP3Player reproduzindo o arquivo de �udio.");
    }

    @Override
    public void pausar() {
        System.out.println("MP3Player pausando a reprodu��o do arquivo de �udio.");
    }

    @Override
    public void parar() {
        System.out.println("MP3Player interrompendo a reprodu��o do arquivo de �udio.");
    }
}

class WAVPlayer implements FormatoAudio {
    @Override
    public void abrir(String arquivo) {
        System.out.println("WAVPlayer abrindo o arquivo: " + arquivo);
    }

    @Override
    public void reproduzir() {
        System.out.println("WAVPlayer reproduzindo o arquivo de �udio.");
    }

    @Override
    public void pausar() {
        System.out.println("WAVPlayer pausando a reprodu��o do arquivo de �udio.");
    }

    @Override
    public void parar() {
        System.out.println("WAVPlayer interrompendo a reprodu��o do arquivo de �udio.");
    }
}

public class Exercicio2 {
	public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        mp3Player.abrir("musica.mp3");
        mp3Player.reproduzir();
        mp3Player.pausar();
        mp3Player.parar();

        WAVPlayer wavPlayer = new WAVPlayer();
        wavPlayer.abrir("audio.wav");
        wavPlayer.reproduzir();
        wavPlayer.pausar();
        wavPlayer.parar();
    }
}
