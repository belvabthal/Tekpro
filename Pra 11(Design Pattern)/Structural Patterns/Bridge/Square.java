public class Square extends Shape {
    public Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String draw() {
        return renderer.renderShape("Square");
    }
}