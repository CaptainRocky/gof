package abstractFactoryDemo;

import original.*;

/**
 * Created by macbookpro on 12/15/15.
 */
public class EnchantedMazeFactory
        extends MazeFactory {
    protected Spell CastSpell;


    public EnchantedMazeFactory() {
    }

    public Room makeRoom(int n) {

        return new EnchantedRoom(n, this.CastSpell);
    }

    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }


}
