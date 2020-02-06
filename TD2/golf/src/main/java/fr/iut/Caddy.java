package fr.iut;

import fr.iut.club.Putter;
import fr.iut.club.Wood;

public class Caddy {

    private Club putter = new Putter();
    private Club wood = new Wood();

    /**
     * default empty constructor *
     */
    public Caddy() {  }

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
