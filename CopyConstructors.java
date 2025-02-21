public class CopyConstructors
{
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10,5);
		Rectangle crect = new Rectangle(rect);
		rect.print();
		crect.print();
	}
}
class Rectangle{
    int length,width;
    Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    Rectangle(Rectangle o){
        this.length=o.length;
        this.width=o.width;
    }
    void print(){
        System.out.println("Length : "+length+"\tWidth : "+width);
    }
}