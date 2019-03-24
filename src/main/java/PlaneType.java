public enum PlaneType {

    ISLANDER(9, 180),
    CONCORD(100, 2500),
    CESNA152(1, 15);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;

    }
    public int getCapacity(){
        return capacity;
    }
    public int getWeight(){
        return weight;
    }
}


