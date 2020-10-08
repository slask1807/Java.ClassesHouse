import java.util.ArrayList;
import java.util.List;

class House{

    private String strit;
    private String typeHouse;
    private int yearSpend;
    private List<Flat> arrFlat= new ArrayList<Flat>();
    private static int numberFlat = 0;
    private static int floor = 1;
    private static int nextfloor = 0; //три квартиры на этаже
    private  int maxFlatOnFloor=3;

    public  int getMaxFlatOnFloor() {
        return maxFlatOnFloor;
    }

    public  void setMaxFlatOnFloor(int maxFlatOnFloor) {
        this.maxFlatOnFloor = maxFlatOnFloor;
    }

    public House(String strit, String typeHouse, int yearSpend) {
        this.strit = strit;
        this.typeHouse = typeHouse;
        this.yearSpend = yearSpend;
    }

    public  int getNumberFlat() {
        return numberFlat;
    }

    public void addFlat(Flat flat) throws CloneNotSupportedException {
        numberFlat+=1;
        flat.setNumberFlat(numberFlat);

        if(nextfloor<maxFlatOnFloor){
            nextfloor+=1;
        }
        else{
            floor+=1;
            nextfloor=1;
        }
        flat.setNumberFloor(floor);

        flat.setNumberFlat(numberFlat);

        arrFlat.add(flat.clone());
    }

    public  int getFloor() {
        return floor;
    }

    public void getFlatFiltr(int countFlat){
        System.out.println("поиск по кол-ву комнат:");
        for (Flat flat : arrFlat) {
            if (flat.getCountRoom() == countFlat){
                System.out.println("Квартира №"+flat.getNumberFlat()+" Размер:"+flat.getSizeRoom());
            }

        }

    }

    public void getFlatFiltr(int countFlat,int countFloor){
        System.out.println("поиск по кол-ву комнат и этаж:");
        for (Flat flat : arrFlat) {
            if (flat.getNumberFloor() == countFloor && flat.getCountRoom() == countFlat ){
                System.out.println("Квартира №"+flat.getNumberFlat()+" Размер:"+flat.getSizeRoom());
            }

        }

    }
    public void getSizeFiltr(double size){
        System.out.println("поиск по размеру комнат и этаж:");
        for (Flat flat : arrFlat) {
            if (flat.getSizeRoom() >= size ){
                System.out.println("Квартира №"+flat.getNumberFlat()+" Размер:"+flat.getSizeRoom());
            }

        }

    }


    public void fullInfoFlat(int numberFlat){
        System.out.println("полная информация по квартире:");
        for (Flat flat : arrFlat) {
            if (flat.getNumberFlat() == numberFlat ){
                System.out.println(flat);
                // System.out.println(flat);
                for (Room room : flat.getArrRoom()){
                    System.out.println(room);
                }
            }

        }
    }




}