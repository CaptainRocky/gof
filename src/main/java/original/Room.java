package original;

/**
 * Created by macbookpro on 12/15/15.
 */
public class Room extends MapSite {
    private int roomNumber;
    private MapSite[] sides;    //?

    //todo why?
    public Room() {
    }

    public Room(int roomNo) {
        this.roomNumber = roomNo;
    }

    /*
    public MapSite getSide(Direction d) {
        return MapSite();
    }
*/
    public void setSide(Direction d, MapSite ms) {

    }

    @Override
    public void enter() {

    }


}
