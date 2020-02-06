package fr.iut;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main2 {

    public static void main( String[] args ) {
        Injector injector = Guice.createInjector(new MainModuleExperimental());

        Caddy caddy = new Caddy();
        Player player = new Player("John", caddy);
        System.out.println(player);
        player.play(0.8, Math.PI / 2, Conditions.FAIRWAY);
        System.out.println(player);
        player.play(0.1, Math.PI / 2, Conditions.GREEN);
        System.out.println(player);
    }
}
