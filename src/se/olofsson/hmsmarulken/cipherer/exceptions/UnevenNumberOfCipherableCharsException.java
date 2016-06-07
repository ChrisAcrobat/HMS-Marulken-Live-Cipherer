package se.olofsson.hmsmarulken.cipherer.exceptions;

/**
 * Created on 2016-05-31.
 * @author Christoffer Olofsson
 */
public class UnevenNumberOfCipherableCharsException extends Exception
{
    public UnevenNumberOfCipherableCharsException()
    {
        super("Uneven number of cipherable chars.");
    }
}
