package aula04;

/**
 * Implementação de interface Crie uma interface chamada "FormatoAudio" com os
seguintes métodos:
- abrir(String arquivo): abre o arquivo de áudio especificado.
- reproduzir(): reproduz o arquivo de áudio.
- pausar(): pausa a reprodução do arquivo de áudio.
- parar(): interrompe a reprodução do arquivo de áudio. Implemente a
interface "FormatoAudio" em duas classes chamadas "MP3Player" e
"WAVPlayer". Forneça uma implementação adequada para cada
método em ambas as classes. Em seguida, crie instâncias de
MP3Player e WAVPlayer e teste os métodos implementados.
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
        System.out.println("MP3Player reproduzindo o arquivo de áudio.");
    }

    @Override
    public void pausar() {
        System.out.println("MP3Player pausando a reprodução do arquivo de áudio.");
    }

    @Override
    public void parar() {
        System.out.println("MP3Player interrompendo a reprodução do arquivo de áudio.");
    }
}

class WAVPlayer implements FormatoAudio {
    @Override
    public void abrir(String arquivo) {
        System.out.println("WAVPlayer abrindo o arquivo: " + arquivo);
    }

    @Override
    public void reproduzir() {
        System.out.println("WAVPlayer reproduzindo o arquivo de áudio.");
    }

    @Override
    public void pausar() {
        System.out.println("WAVPlayer pausando a reprodução do arquivo de áudio.");
    }

    @Override
    public void parar() {
        System.out.println("WAVPlayer interrompendo a reprodução do arquivo de áudio.");
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
