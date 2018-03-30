package main;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import modules.LeshaZalataModule;
import person.Person;

public class Main {

    @Inject
    private Person alex;

    public static void main(String[] args) {
        final Injector injector = Guice.createInjector(new LeshaZalataModule());
        Main main = injector.getInstance(Main.class);
        System.out.println("!!!!!!!!!1");
        main.alex.say();
    }
}