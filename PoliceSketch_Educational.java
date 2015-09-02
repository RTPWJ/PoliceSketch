/*
Name: Alexander Georgiadis (RezTech)
Date Started: 5/4/2015
Date Last Edited: 9/2/2015
Description: A simple police sketch program, using art
*/

import java.awt.*;
import hsa.Console;

public class PoliceSketch_Educational
{
    static Console c;
    static String isCorrect, face, hair, mouth, eyes, ears; //These strings gets converted to int's
    static int shouldRun = 1, hasAnswered = 0, convertedChar, faceInt, hairInt, mouthInt, eyesInt, earsInt; //And get placed into these variables for case statements
    static char repeat;

    //Main Method
    public static void main (String[] args)
    {
	c = new Console (48, 236); //Note, changing this size will prevent the art from being displayed correctly

	//Run through main program
	do //Do works perfect here, as it will run through at least once
	{
	    hasAnswered = 0;
	    choiceFace ();
	    choiceHair ();
	    choiceMouth ();
	    choiceEyes ();
	    choiceEar ();
	    displayPicture ();
	}
	while (shouldRun == 1); //And check to see if the user would like to run it again, if not, don't
    }


    //Face Method
    public static void choiceFace ()
    {
	c.println ("What kind of face did the suspect have?");
	c.println ("1. Round\n2. Square\n3. Pentagon\n4. Long");
	face = c.readLine ();

	//Checks to see if its not a valid choice
	if (!(face.equals ("1") | face.equals ("2") | face.equals ("3") | face.equals ("4"))) //Keep it as string for now, it's easy enough to check those
	{
	    c.clear (); //Moving this here prevents the credits from being removed, but means it has to be repeatd a few more times down below (Better in my opinion)
	    choiceFace ();
	}

	faceInt = Integer.parseInt (face); //Convert String to int if it is either 1,2,3, or 4, and then moves on
    }


    //Hair Method
    public static void choiceHair ()
    {
	c.clear ();
	c.println ("What kind of hair did the suspect have?");
	c.println ("1. Spiky\n2. Curly\n3. Bald\n4. Flat");
	hair = c.readLine ();

	if (!(hair.equals ("1") | hair.equals ("2") | hair.equals ("3") | hair.equals ("4"))) //Also, because we are using Strings and not int, this cannot be checked using <= or >=. Parsing the int from the string before this point will cause errors if the String cannot become an int
	{
	    choiceHair ();
	}

	hairInt = Integer.parseInt (hair);
    }


    //Mouth Method
    public static void choiceMouth ()
    {
	c.clear ();
	c.println ("What kind of mouth did the suspect have?");
	c.println ("1. Smile\n2. Frown\n3. Surprised\n4. Neutral");
	mouth = c.readLine ();

	if (!(mouth.equals ("1") | mouth.equals ("2") | mouth.equals ("3") | mouth.equals ("4")))
	{
	    choiceMouth ();
	}

	mouthInt = Integer.parseInt (mouth);
    }


    //Eye Method
    public static void choiceEyes ()
    {
	c.clear ();
	c.println ("What kind of eyes did the suspect have?");
	c.println ("1. Small\n2. Big\n3. Small with glasses\n4. Big with glasses");
	eyes = c.readLine ();

	if (!(eyes.equals ("1") | eyes.equals ("2") | eyes.equals ("3") | eyes.equals ("4")))
	{
	    choiceEyes ();
	}

	eyesInt = Integer.parseInt (eyes);
    }


    //Ear Method
    public static void choiceEar ()
    {
	c.clear ();
	c.println ("What kind of ears did the suspect have?");
	c.println ("1. Round\n2. Sharp\n3. Rectangular\n4. Trapezoid");
	ears = c.readLine ();

	if (!(ears.equals ("1") | ears.equals ("2") | ears.equals ("3") | ears.equals ("4")))
	{
	    choiceEar ();
	}

	earsInt = Integer.parseInt (ears);
    }


    //Print Suspects Picture
    public static void displayPicture ()
    {
	c.clear (); //Clear Useless Spam
	switch (faceInt) //Switch For The Face
	{
	    case 1: //Round Face
		{
		    c.drawArc (99, 0, 162, 280, 170, 200);
		    break; //Let's not forget those again...
		}
	    case 2: //Square Face
		{
		    c.drawLine (99, 280, 99, 120);
		    c.drawLine (260, 280, 260, 120);
		    c.drawLine (99, 280, 260, 280);
		    break;
		}
	    case 3: //Pentagon Face
		{
		    c.drawLine (99, 200, 99, 120);
		    c.drawLine (260, 200, 260, 120);
		    c.drawLine (99, 200, 179, 280);
		    c.drawLine (260, 200, 179, 280);
		    break;
		}
	    case 4: //Long Face
		{
		    c.drawLine (99, 200, 99, 120);
		    c.drawLine (260, 200, 260, 120);
		    c.drawArc (99, 35, 162, 280, 170, 200);
		    break;
		}
	}

	switch (hairInt) //Switch For The Hair
	{
	    case 1: //Spiky
		{
		    c.println ();
		    c.println ("            |||||||||||||||||||||"); //Could use \t, but that can be changed in the user settings to spacing should be fine here
		    c.println ("            |||||||||||||||||||||");
		    c.println ("            |||||||||||||||||||||");
		    c.println ("            |||||||||||||||||||||");
		    c.println ("            |||||||||||||||||||||");
		    break;
		}
	    case 2: //Curly
		{
		    c.println ();
		    c.println ("                  ((   )  (");
		    c.println ("               ( (   )(( (   )");
		    c.println ("             )    ) ( )) )( (( )");
		    c.println ("             ( (((   )  (  )  ) )");
		    c.println ("            )) (( ) (  ) (     ((");
		    break;
		}
	    case 3: //Bald
		{
		    c.drawArc (99, 11, 161, 200, 355, 190);
		    break;
		}
	    case 4: //Flat
		{
		    c.println ("\n\n\n\n"); //Save a few lines of code
		    c.println ("            _____________________");
		    break;
		}
	}

	switch (mouthInt) //Switch For The Mouth
	{
	    case 1: //Smile
		{

		    c.drawArc (165, 230, 30, 20, 170, 200);
		    break;
		}
	    case 2: //Frown
		{
		    c.drawArc (165, 220, 30, 20, 15, 150);
		    break;
		}
	    case 3: //Surprised
		{
		    c.drawOval (170, 200, 20, 50);
		    break;
		}
	    case 4: //Neutral
		{
		    c.drawLine (170, 240, 190, 240);
		    break;
		}
	}
	switch (eyesInt) //Switch For The Eyes
	{
	    case 1: //Small eyes
		{
		    c.setColor (Color.black);
		    c.fillOval (130, 150, 10, 10);
		    c.fillOval (220, 150, 10, 10);
		    c.drawOval (120, 150, 30, 10);
		    c.drawOval (210, 150, 30, 10);
		    break;
		}
	    case 2: //Big Eyes
		{
		    c.setColor (Color.black);
		    c.fillOval (130, 150, 20, 20);
		    c.fillOval (210, 150, 20, 20);
		    c.drawOval (115, 150, 50, 20);
		    c.drawOval (195, 150, 50, 20);
		    break;
		}
	    case 3: //Glasses with small eyes
		{
		    c.setColor (Color.black);
		    c.fillOval (130, 150, 10, 10);
		    c.fillOval (220, 150, 10, 10);
		    c.drawOval (120, 150, 30, 10);
		    c.drawOval (210, 150, 30, 10);
		    c.drawRect (115, 145, 40, 20);
		    c.drawRect (205, 145, 40, 20);
		    c.drawLine (155, 155, 205, 155);
		    c.drawLine (115, 155, 100, 155);
		    c.drawLine (245, 155, 260, 155);
		    break;
		}
	    case 4: //Glasses with large Eyes
		{
		    c.setColor (Color.black);
		    c.fillOval (130, 150, 20, 20);
		    c.fillOval (210, 150, 20, 20);
		    c.drawOval (115, 150, 50, 20);
		    c.drawOval (195, 150, 50, 20);
		    c.drawRect (115, 145, 50, 30);
		    c.drawRect (195, 145, 50, 30);
		    c.drawLine (165, 160, 195, 160);
		    c.drawLine (115, 160, 100, 160);
		    c.drawLine (245, 160, 260, 160);
		    break;
		}
	}
	switch (earsInt) //Switch For The Ears
	{
	    case 1: //Round
		{
		    c.drawArc (82, 125, 30, 50, 80, 200);
		    c.drawArc (248, 125, 30, 50, 260, 200);
		    break;
		}
	    case 2: //Sharp
		{
		    c.drawLine (99, 125, 80, 125);
		    c.drawLine (99, 170, 80, 125);
		    c.drawLine (280, 125, 260, 125);
		    c.drawLine (260, 170, 280, 125);
		    break;
		}
	    case 3: //Rectangular
		{
		    c.drawLine (99, 125, 80, 125);
		    c.drawLine (80, 175, 80, 125);
		    c.drawLine (99, 175, 80, 175);
		    c.drawLine (280, 125, 260, 125);
		    c.drawLine (280, 175, 280, 125);
		    c.drawLine (280, 175, 260, 175);
		    break;
		}
	    case 4: //Trapezoid
		{
		    c.drawLine (99, 125, 80, 135);
		    c.drawLine (80, 165, 80, 135);
		    c.drawLine (99, 175, 80, 165);
		    c.drawLine (280, 135, 260, 125);
		    c.drawLine (280, 165, 280, 135);
		    c.drawLine (280, 165, 260, 175);
		    break;
		}
	}

	//Finding Our Answer
	while (hasAnswered == 0)
	{
	    c.setCursor (20, 1); //Prevents text over the face, works way better then a bunch of \n's or c.println's
	    c.println ("Is this the suspect? (Y/N)");
	    isCorrect = c.readLine ();

	    if (isCorrect.equals ("Yes") | isCorrect.equals ("Y") | isCorrect.equals ("yes") | isCorrect.equals ("y"))
	    {
		c.println ("Okay, good luck catching the suspect!");
		c.println ("Please press the <Enter> key to end the program, or any other key to generate another face.");
		repeat = c.getChar ();
		convertedChar = repeat;

		if (convertedChar == 10) //If they press enter
		{
		    shouldRun = 0; //Ends program
		    hasAnswered = 1; //Prevents looping the answer
		    c.clear ();
		    c.println ("Thank you for using Alexander's suspect identification program! We hope to see you again."); //Print some credits, and stop
		}

		else
		{
		    c.clear ();
		    hasAnswered = 1; //Re-loop!
		}
	    }
	    else if (isCorrect.equals ("No") | isCorrect.equals ("N") | isCorrect.equals ("no") | isCorrect.equals ("n"))
	    {
		c.clear (); //Clear useless junk
		c.println ("Okay, let's see if we can get them this time.\n"); //Might as well try again (Check into once the rest of the program is done
		hasAnswered = 1;
	    }
	    else //If they have not answered in the correct format, prompt them again
	    {
		hasAnswered = 0;
		c.clear (); //Prevents useless spam
		displayPicture (); //Re-prints the picture
	    }
	}
    }
}
