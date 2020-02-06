package fr.iut;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import fr.iut.club.Putter;
import fr.iut.club.Wood;

public class Caddy {

    @Inject
    @Named("Putter")
    private Club putter = new Putter();

    @Inject
    @Named("Wood")
    private Club wood = new Wood();

    /**
     * default empty constructor *
     */
    public Caddy() {}

    /**
     * Return
     * @param conditions
     * @return
     */
    public Club getClub(final Conditions conditions) {
        switch (conditions) {
            case GREEN:
                return putter;
            case FAIRWAY:
                return wood;
            default:
                return putter;
        }
    }
}
