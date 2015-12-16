package abstractFactoryDemo;

import original.Door;
import original.Room;

/**
 * Created by macbookpro on 12/16/15.
 */
public class DoorNeedingSpell
        extends Door {

    public DoorNeedingSpell(Room r1, Room r2) {
        System.out.println(DoorNeedingSpell.class.toString());
    }
}
