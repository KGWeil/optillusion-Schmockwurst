
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Hermanngitter.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hermanngitter extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
    }        
    
    int length = 60;
    int space  = 10;
    
    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        //hermann1();
        hermann2();
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

    public void hermann1()
    {
        background( 255, 255, 255 );
        fill( 0, 0, 0 );
        for (int y=0;y<7;y++){
            for (int x=0;x<7;x++){
                rect(x*(length+space)+space, y*(length+space)+space, length, length );
            }
        }
    }
    
    public void hermann2()
    {
        background( 66, 165, 250 );
        fill( 0, 0, 0 );
        for (int y=0;y<7;y++){    //drawing the squares
            for (int x=0;x<7;x++){
                rect(x*(length+space)+space, y*(length+space)+space, length, length );
            }
        }
        
        fill( 255, 255, 255 ); 
        stroke( 255, 255, 255 );
        int store = length+space;
        for (int y=0;y<6;y++){
            for (int x=0;x<6;x++){
                circle( x*(store)+store+space/2, y*(store)+store+space/2, space );
            }
        }
    }
    
    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Hermanngitter.class.getName() });
    }

}
