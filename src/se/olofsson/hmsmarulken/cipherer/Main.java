package se.olofsson.hmsmarulken.cipherer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2016-05-29.
 * @author Christoffer Olofsson
 */
public class Main
{
    public static final List<Character> SUPPORTED_CHARACTERS = new ArrayList<>();
    public static final String CIPHERABLE_CHARS = new CipherableChars(SUPPORTED_CHARACTERS).getChars();

    public static void main(String[] args)
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(UnsupportedLookAndFeelException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }

        new LiveCipher().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
