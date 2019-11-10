package Dam_M_03.Cursa_2;

import Dam_M_03.Cursa_2.View.MainMenuScreen;

import java.io.IOException;

public class Joc {
    void iniciarPartida() throws IOException {
        new MainMenuScreen().showMenu();
    }
    public static void main(String[] args) throws IOException {
         new Joc().iniciarPartida();
    }
}