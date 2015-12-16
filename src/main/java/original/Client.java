package original;


/**
 * Created by macbookpro on 12/16/15.
 */
public class Client {
    public void main() {
        MazeGame mazeGame = new MazeGame();


        mazeGame.CreateMaze();

        //扩展场景
        //多种迷宫
        //每种迷宫的组件不同,不同的Room\Door


        //
//        mazeGame内有不同的方法
//        参数名做"选择"        比如:1. CreateSmallMaze();
//        2. CreateMilldelMaze();
//        3. CreateMilldeMaze();
        //参数做"选择"
        //CreateMaze("Small")
        //CreateMaze("Spell")

        //MazeGame足够大,包裹所有的迷宫可能.客户通过某种方式做出选择.
    }
}
