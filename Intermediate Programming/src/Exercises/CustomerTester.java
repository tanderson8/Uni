import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**Class: CustomerTester
* @author Your Name
* @version 1.0
* Course : ITEC 2150 Spring 2018
*  
*
*
* This class This class will test the Customer class
*
* Purpose: This class will test the Customer class
*/

import java.util.*;
02
import java.io.*;
03
 
04
public class CustomerTester
05
{
06
    public static Scanner scan;
07
    public static void main(String[] args) throws IOException
08
    {
09
        // Create an ArrayList called stats containing information concerning
10
        // SalesAndExpenses.   
11
        ArrayList<SalesAndExpenses> list = new ArrayList<SalesAndExpenses>();
12
      SalesAndExpenses salesperson;
13
      // Read in a file and assign its contents to scan.   
14
        scan = new Scanner(new FileReader("sales"));
15
             
16
        String name;            // Declare string variable name.
17
        int sales;              // Declare int variable sales.
18
        float expenses;     // Declare float variable expenses.
19
        float line;             // Declare float variable line.
20
       
21
        // While there is information to read from the file,
22
        // assign the first line to name, the next integer
23
        // value to sales, and the final float value to expenses.
24
        while(scan.hasNext())
25
        {
26
         name = scan.nextLine();
27
         sales = Integer.parseInt(scan.next());
28
         expenses = new Float(scan.nextLine());
29
            // Create an instance of class SalesAndExpenses called salesperson
30
            // and assign name, sales, and expenses to it. Add each salesperson
31
            // to the ArrayList stats.
32
            salesperson = new SalesAndExpenses(name, sales, expenses);
33
         list.add(salesperson);
34
        }
35
      // Close scan.   
36
        scan.close();
37
         
38
        /******Need to sort the list of employees in alphabetical order******/ 
39
         
40
        // For loop calculates the total sales of all the employees.
41
        int totalSales=0;
42
        for(int h=0; h<list.size(); h++)
43
        {
44
            totalSales = totalSales + list.get(h).getSales();
45
        }
46
       
47
        // For loop calculates the total expenses of all the employees.
48
        float totalExpenses=0;
49
        for(int h=0; h<list.size(); h++)
50
        {
51
            totalExpenses = totalExpenses + list.get(h).getExpenses();
52
        }

         

        // Title and headings for the table containing the employees

        // and their percentages of sales and expenses.

      System.out.println("*** List of Sales and Expenses ***");

        System.out.println("\nTotal Sales: $" + totalSales + "  "

                                 + " Total Expenses: $" + totalExpenses);

        System.out.println("\nName of Person" + "          " + "Percentage of Total Sales"
                                 + "       " + "Percentage of Total Expenses");          

         

        // Print the name, percent of sales and percent of expenses for each employee.

        for(int j=0; j<list.size(); j++)

       {  

            System.out.print("\n" + list.get(j).getName() + "\t\t"

            + (float)Math.round((float)list.get(j).getSales()/totalSales*10000)/100 + "%" 

          + "\t\t\t\t" + (float)Math.round(list.get(j).getExpenses()/totalExpenses*10000)/100 + "%");

        }

    }

}
