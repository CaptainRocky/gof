package abstractFactoryDemo;

import original.*;

/**
 * Created by macbookpro on 12/15/15.
 */
public class BombedMazeFactory
        extends MazeFactory {

    public Wall makeWall() {
        return new BombedWall();
    }

    public Room makeRoom(int n) {
        return new RoomWithABomb(n);
    }

}
