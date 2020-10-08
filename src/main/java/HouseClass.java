public class HouseClass {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("House");

        Flat flat1 = new Flat();
        Flat flat2 = new Flat();
        Flat flat3 = new Flat();

        //Сконструируем однокомнатную кваритру
        flat1.addRoom(1,4.25);
        flat1.addRoom(2,2.25);
        flat1.addRoom(3,2.25);
        flat1.addRoom(4,2.25);
        flat1.addRoom(5,3.25);
        flat1.addRoom(6,15.25);
        //Сконструируем 2-ух комнатную кваритру
        flat2.addRoom(1,4.25);
        flat2.addRoom(2,4.25);
        flat2.addRoom(3,4.25);
        flat2.addRoom(4,4.25);
        flat2.addRoom(5,4.25);
        flat2.addRoom(6,15.25);
        flat2.addRoom(7,15.25);
        //Сконструируем 3-ех комнатную кваритру
        flat3.addRoom(1,4.25);
        flat3.addRoom(2,4.25);
        flat3.addRoom(3,4.25);
        flat3.addRoom(4,4.25);
        flat3.addRoom(5,4.25);
        flat3.addRoom(6,16.25);
        flat3.addRoom(7, 15.25);
        flat3.addRoom(7, 15.25);


        House house = new House("Сокола 5","Кирпичный",50);
        house.setMaxFlatOnFloor(3); // максимальное кол-во квартир на этаже
        //Сформируем дом
        house.addFlat(flat1);
        house.addFlat(flat2);
        house.addFlat(flat3);
        house.addFlat(flat2);
        house.addFlat(flat3);
        house.addFlat(flat1);
        house.addFlat(flat2);
        house.addFlat(flat3);
        house.addFlat(flat1);
        house.addFlat(flat1);

        System.out.println("Всего этажей: " + house.getFloor());
        System.out.println("Всего квартир: " + house.getNumberFlat());

        //найти квартиры с заданым чсилом комнат
        house.getFlatFiltr(3);

        //найти квартиры с заданым числом комнат на этаже
        house.getFlatFiltr(2,2);
        //поиск по размеру
        house.getSizeFiltr(51);
        //Поная информация по квартире поиск по номеру
        house.fullInfoFlat(8);

    }
}
