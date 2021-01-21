
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{       
    int s = 40;
    int[] spaces = { 10, 20, 30, 20, 10, 20, 30, 20 ,10, 20, 30, 20, 10 };
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);                  //set window size
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background( 255, 255, 255 );    //set background white
        drawStuff();                    //draw parallels
    }

    public void drawStuff()
    {
        stroke( 150, 150, 150 );      //set draw color grey
        for (int i=0;i<10;i++){       //loop executed 10 times
            blackQuads( s*i );        //draw boxes
            line(0,0+s*i,640,0+s*i);  //draw a line?
        }
    }
    
    public void blackQuads( int y )
    {
        fill( 0, 0, 0 );
        for (int i=0;i<8;i++){
            rect(spaces[y/40]+s*2*i,y,s,s);
        }
    }
    
    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
