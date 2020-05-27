package net.radek;

import net.radek.Towar;
import net.radek.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sklep {

    private List<Towar> towarList = new ArrayList<>();

    public Sklep() {

    }

    public List<Towar> findAll() {
        return this.towarList;
    }

    public void addTowar(int sku, String typ, double cena, int maxIlość) {
        towarList.add(new Towar(sku, typ, cena, maxIlość));
    }

   /* public void wydanie(int sku, String klient) {

        Optional<Towar> optionalTowar = poszukajTowaru(sku);

        if (optionalTowar.isPresent()) {

            System.out.println("Podaje " + optionalTowar.get() + " klientowi " + klient);

            deleteTowar(sku);

        } else {
            System.out.println("Beer not found");
        }
    } */

    public Optional<Towar> poszukajTowaru(int sku) {

        return towarList.stream().filter(towar -> towar.getSku() == sku).findFirst();
    }

    public void deleteTowar(int sku) {

        poszukajTowaru(sku).ifPresentOrElse(

                towar -> towarList.remove(towar),

                () -> System.out.println("ni ma ")
        );
    }

    public void zamówienie (List<Integer> skus, String kl) {

        List<Optional<Towar>> listaofTowary = skus.stream().map(this::poszukajTowaru).collect(Collectors.toList());

        zamówTowar(listaofTowary, kl);


    }

    public void zamówTowar(List<Optional<Towar>> coś, String custommerName) {

        if (coś.size() >= 5) {

            System.out.println("Panu juz dziekujemy");

        } else {

            Table table = new Table();

            coś.forEach(towar -> {

                if (towar.isPresent()) {

                    System.out.println("Słucham? " + towar.get() + " to " + custommerName);

                    table.setClean(false);

                    deleteTowar(towar.get().getSku());

                } else {
                    System.out.println("Beer not found");
                }
            });
        }
    }
}