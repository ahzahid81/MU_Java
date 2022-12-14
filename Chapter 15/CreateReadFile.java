import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;

public class CreateReadFile
{
    private static Formatter output;
    private static Scanner input;
    public static void main(String[] args) 
    {
        openFile();
        addRecords();
        readRecords();
        closeFile();
    }
    public static void openFile()
    {
        try
        {
            output = new Formatter( "CreateReadFile.txt" );
        }
        catch ( SecurityException securityException )
        {
            System.err.println(
                "You do not have write access to this file." );
            System.exit( 1 );
        }
        catch ( FileNotFoundException filesNotFoundException )
        {
            System.err.println( "Error creating file." );
            System.exit( 1 );
        }
        try
        {
            input = new Scanner( new File( "CreateReadFile.txt" ) );
        }
        catch ( FileNotFoundException fileNotFoundException )
        {
            System.err.println( "Error opening file.Terminating" );
            System.exit( 1 );
        }  
    }


    public static void addRecords()
    {
        try (Scanner input = new Scanner( System.in )) {
            System.out.printf("%s%n%s%n? ", "Enter account number, first name, last name and balance.", "Enter end-of-file indicator to end input.");

            while ( input.hasNext() ) 
            {
                try 
                {
                    output.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
                }
                catch ( FormatterClosedException formatterClosedException )
                {
                    System.err.println( "Error writing to file." );
                    break;
                }
                catch ( NoSuchElementException elementException )
                {
                    System.err.println( "Invalid input. Please try again." );
                    input.nextLine();
                }

                System.out.printf( "? " );
            }
        }
    }

    public static void readRecords()
    {
        System.out.printf( "%-10s%-12s%-12s%10s\n", "Account",
            "First Name", "Last Name", "Balance" );
        try
        {
            while ( input.hasNext() )
            {
                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble()); 
            }
        }
        catch ( NoSuchElementException elementException )
        {
            System.err.println( "Error opening file.Terminating" );
        }
        catch ( IllegalStateException stateException )
        {
            System.err.println( "Error opening file.Terminating" );
        }
    }

    public static void closeFile()
    {
        if ( output != null )
            output.close();
    } 
}

