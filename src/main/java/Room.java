class Room {
    private int typeRoom; //1 - коридор; 2-балкон;3-кухня;4-ванная; 5- санузел; 6- гостинная 7- дополнительная комната
    private double spaseSize;

    public Room(int typeRoom, double spaseSize) {
        this.typeRoom = typeRoom;
        this.spaseSize = spaseSize;
    }

    public int getTypeRoom() {
        return typeRoom;
    }

    public double getSpaseSize() {
        return spaseSize;
    }

    private String getStringType(int typeR) {
        switch(typeR) {
            case 1:
                return "коридор";
            case 2:
                return "балкон";
            case 3:
                return "кухня";
            case 4:
                return "ванная";
            case 5:
                return "санузел";
            case 6:
                return "гостинная";
            default:
                return "дополнительная комната";
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Тип комнаты:").append(getStringType(typeRoom)).append("\n");
        sb.append("Размер: ").append(spaseSize);
        return sb.toString();
    }
}
