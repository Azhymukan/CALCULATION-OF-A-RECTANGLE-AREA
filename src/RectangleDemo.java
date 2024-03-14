import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RectangleArea {
    private double length;
    private double width;
    private double area;

    public void getData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the length of the rectangle: ");
        length = Double.parseDouble(reader.readLine());
        System.out.print("Enter the width of the rectangle: ");
        width = Double.parseDouble(reader.readLine());
    }

    public void computeField() {
        area = length * width;
    }

    public void fieldDisplay() {
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + area);
    }
}

public class RectangleDemo {
    public static void main(String[] args) throws IOException {
        RectangleArea ra = new RectangleArea();
        ra.getData();
        ra.computeField();
        ra.fieldDisplay();
    }
}
