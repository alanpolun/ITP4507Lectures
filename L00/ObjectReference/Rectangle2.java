//package ObjectReference;

//create a class Rectangle with attributes Hienght and Width
public class Rectangle2 {
    public int height;
    public int width;

    //create a constructor with two parameters
    public Rectangle2(int h, int w) {
        height = h;
        width = w;
    }

    //creat a toString method to return the height and width of the rectangle
    public String toString() {
        return "Height: " + height + " Width: " + width;
    }

    //create a method to calculate the area of the rectangle
    public int area() {
        return height * width;
    }
}   