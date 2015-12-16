package original;

/**
 * Created by macbookpro on 12/15/15.
 */
public class Maze {
    /**
     * 增加房间
     *
     * @param room
     */
    public void AddRoom(Room room) {

    }

    /**
     * 通过房间号,获得房间
     *
     * @param roomNo 房间号
     * @return
     */
    public Room RoomNo(int roomNo) {

        return new Room(roomNo);
    }
}
