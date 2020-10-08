import java.util.ArrayList;
import java.util.List;

class Flat implements Cloneable {
    private  int numberFlat;
    private  int numberFloor;
    private List<Room> arrRoom = new ArrayList<Room>();

    public int getNumberFlat() {
        return numberFlat;
    }

    public void setNumberFlat(int numberFlat) {
        this.numberFlat = numberFlat;
    }

    public  void addRoom(int typeRoom,double spaseSize){
        arrRoom.add(new Room(typeRoom, spaseSize));
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public int getCountRoom(){
        int count =0;
        for (Room o :arrRoom) {
            if (o.getTypeRoom() == 6 || o.getTypeRoom() == 7){
                count +=1;
            }

        }
        return count;
    };

    public List<Room> getArrRoom() {
        return arrRoom;
    }

    public double getSizeRoom(){
        double sizeRoom =0;
        for (Room o :arrRoom) {
            sizeRoom +=o.getSpaseSize();
        }
        return sizeRoom;
    };

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("№ квартиры: ").append(numberFlat);
        sb.append(" Этаж:").append(numberFloor);
        return sb.toString();
    }

    public Flat clone() throws CloneNotSupportedException{

        return (Flat) super.clone();
    }

}