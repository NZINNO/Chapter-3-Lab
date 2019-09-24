// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03vst
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 80 Point Version\n");
      int Start =10000123;
      System.out.println("Starting millil-seconds: " + Start);
      System.out.println("Hours: " + Start/3600000);
      Start%=3600000;
      System.out.println("Minutes: " + Start/60000);
      Start%= 60000;
      System.out.println("Seconds: " + (Start/1000));
      Start%= 1000;
      System.out.println("Milli Seconds: " + Start);

	}
}
