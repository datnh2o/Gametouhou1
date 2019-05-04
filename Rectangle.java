public class Rectangle {
    public double height;
    public double width;
    Vector2D position;

    public Rectangle(double height, double width, Vector2D position){
        this.height = height;
        this.width = width;
        this.position = position;
    }

    // Xác định các tính chất hình chữ nhật
    public double bottom(){
        return this.position.y ;
    }
    public double top(){
        return this.bottom()+ this.height;
    }

    public double left(){
        return this.position.x;
    }
    public double right(){
        return this.left() + this.width;
    }
    // Kiểm tra
    public boolean intersects(Rectangle other){
        if(other.bottom() >= this.bottom() && other.bottom() <= this.bottom()){
            if(other.left() >= this.left() && other.left() <= this.right())
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Rectangle Gamer = new Rectangle(20, 50, new Vector2D(10, 10));
        Rectangle bullet = new Rectangle(5, 5, new Vector2D(20, 20));
        System.out.println(Gamer.intersects(bullet));
    }

}
