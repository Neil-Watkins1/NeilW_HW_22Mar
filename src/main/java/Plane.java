public class Plane {

    private PlaneType plane;


    public Plane(PlaneType plane) {
        this.plane = plane;
    }


    public PlaneType getPlane() {
        return plane;
    }

    public int getCapacity() {
        return this.plane.getCapacity();
    }

    public int getWeight() {
        return this.plane.getWeight();
    }
}
