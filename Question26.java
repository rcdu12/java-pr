import java.awt.*;
import java.applet.*;
import java.net.*;

public class Question26 extends Applet
{
  //DiSPLAY CODE AND DOCUMENT BASES
  public void paint(Graphics g){
    String msg;
    URL url=getCodeBase();
    msg="Code base: " + url.toString();
    g.drawString(msg,10,20);
    url=getDocumentBase();
    msg="Document base:"+url.toString();
    g.drawString(msg,10,40);
  }
}