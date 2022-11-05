import javax.ejb.MessageDriven;
import javax.jms.*;

@MessageDriven(mappedName="myQueue")
public class MyListener implements MessageListener{

    private final String example = "Hello";
    @Override
    public void onMessage(Message msg) {
        TextMessage m=(TextMessage)msg;
        try{
            if(m.getText().equals(example)){
                System.out.println("такое сообщение есть: "+m.getText());
            }
            else {
                System.out.println("такого сообщения нету: "+m.getText());
            }
        }catch(Exception e){System.out.println(e);}
    }
}