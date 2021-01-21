
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse self.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class self extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(1000,1000);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        drawCircles( 4 );
    }

    public void drawRectangles( int times )
    {
        for (int i=0;i<times;i++){
            rect(0+100*i,0,100,100);
        }
    }
    
    public void drawCircles( int times )
    {
        for (int i=0;i<times;i++){
            circle(500,500,950-50*i);
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
        PApplet.main(new String[] {self.class.getName() });
    }

}
