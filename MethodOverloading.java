class Rectangle {
    int area(int a, int b) {
        return a * b;
    }

    float area(int a, float b) {
        return a * b;
    }

    float area(float a, int b) {
        return a * b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        
        System.out.println("Area (int, int): " + rect.area(5, 10));
        System.out.println("Area (int, float): " + rect.area(5, 10.5f));
        System.out.println("Area (float, int): " + rect.area(7.5f, 4));
    }
}
