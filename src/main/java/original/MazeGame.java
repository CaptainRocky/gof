package original; /**
 * Created by macbookpro on 12/15/15.
 */

/**
 * 用于创建迷宫
 * Version 1:这个版本的迷宫,仅有两个房间
 */
public class MazeGame {

    /**
     * 创建迷宫
     * Trouble: 迷宫布局硬编码
     *
     * @return
     */
    public Maze CreateMaze() {
        Maze aMaze = new Maze();

        Room r1 = new Room(1);  //Room --hardcode
        Room r2 = new Room(2); //Room --hardcode

        Door theDoor = new Door(r1, r2);    //Door --hardcode

        aMaze.AddRoom(r1);
        aMaze.AddRoom(r2);

        r1.setSide(Direction.North, new Wall());    //Wall --hardcode
        r1.setSide(Direction.East, theDoor);
        r1.setSide(Direction.South, new Wall());
        r1.setSide(Direction.West, new Wall());

        r2.setSide(Direction.North, new Wall());
        r2.setSide(Direction.East, new Wall());
        r2.setSide(Direction.South, new Wall());
        r2.setSide(Direction.West, theDoor);

        return aMaze;
    }
}
