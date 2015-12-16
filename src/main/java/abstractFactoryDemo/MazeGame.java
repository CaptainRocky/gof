package abstractFactoryDemo;


import original.*;

/**
 * Created by macbookpro on 12/15/15.
 */
public class MazeGame {

    /**
     * 创建迷宫
     *
     * @param factory 建造迷宫程序,将MazeFactory做为参数,
     *                这样程序员就能指定要创建房间,墙壁,门等类
     * @return
     */
    public Maze CreateMaze(MazeFactory factory) {
        Maze aMaze = factory.makeMaze();
        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);

        Door aDoor = factory.makeDoor(r1, r2);

        aMaze.AddRoom(r1);
        aMaze.AddRoom(r2);

        r1.setSide(Direction.North, factory.makeWall());
        r1.setSide(Direction.East, aDoor);
        r1.setSide(Direction.South, factory.makeWall());
        r1.setSide(Direction.West, factory.makeWall());

        r2.setSide(Direction.North, factory.makeWall());
        r2.setSide(Direction.East, factory.makeWall());
        r2.setSide(Direction.South, factory.makeWall());
        r2.setSide(Direction.West, factory.makeWall());

        return aMaze;
    }
}
