interface EventListner{
    public void performEvent();
}
interface MouseListner extends EventListner{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();
}
interface KeyListner extends EventListner{
    public void Keypressed();
    public void KeyReleased();
}
class EventDemo implements MouseListner , KeyListner{
    public void performEvent(){
        System.out.println("Event Performed");
    }
    public void mouseClicked(){
        System.out.println("Mouse clicked");
    }
    public void mousePressed(){
        System.out.println("Mouse Pressed");
    }
    public void mouseReleased(){
        System.out.println("Mouse Released");
    }
    public void mouseMoved(){
        System.out.println("Mouse Moved");
    }
    public void mouseDragged(){
        System.out.println("Mouse Dragged");
    }
    public void Keypressed(){
        System.out.println("Key Pressed");
    }
    public void KeyReleased(){
        System.out.println("Key Released");

    }
}

public class Lab_7_4 {
    public static void main(String []args){
        EventDemo e1 = new EventDemo();
        e1.performEvent();
        e1.mouseClicked();
        e1.mousePressed();
        e1.mouseDragged();
        e1.mouseMoved();
        e1.mouseReleased();
        e1.Keypressed();
        e1.KeyReleased();
    }
}
