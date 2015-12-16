package abstractFactoryDemo;

/**
 * Created by macbookpro on 12/16/15.
 */
public class Client {

    public void main() {
        MazeGame mazeGame = new MazeGame();
        BombedMazeFactory factory = new BombedMazeFactory();


        mazeGame.CreateMaze(factory);
        //选择:
        //函数参数,参数是一个factory对象.
        //由于继承,我们传入Client需要的子类达到选择目的.

        //todo 这种模式只能解决更换组件,但是迷宫的构成,
        //2个room变成10个!! 门!!
        //仍然需要修改CreateMaze的代码!!
    }
}
