public class Uxxankyun extends Shape{

    int height;
    int length;

    public Uxxankyun (int height, int length) {
        this.height = height;
        this.length = length;
    }

    public void setHeight (int delta) {
        this.height = delta;
    }

    public int getHeight () {
        return this.height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int calculateArea () {
        return this.height * this.length;
    }

}
