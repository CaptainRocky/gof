package abstractFactoryDemo;


import original.*;

/**
 * 可以创建迷宫的组件,它建造房间,墙壁和房间之间的门.
 * <p>
 * Created by macbookpro on 12/15/15.
 * todo 抽象么?
 */
public class MazeFactory {
    public MazeFactory() {
    }

    public Maze makeMaze() {
        return new Maze();
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Room makeRoom(int n) {
        return new Room(n);
    }

    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }
}
