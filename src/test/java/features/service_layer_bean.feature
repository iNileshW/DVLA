Feature: Car Reg number data comparison
In order to compare the data present in excel/csv file
As a tester
I want to check the data matches with DVLA website

Scenario Outline: Scanning of directory for csv and excel files 
Given User is on "C:\\Users\\nwairagade\\Documents\\Car_Reg_Data" directory with readable files
When user opens the excel or csv <file>
And the user enters the <reg no> on webpage 
Then the user is shown <Make> and <Colour> of car and test result and take screenshot if test fails

Examples:
|		file				|	reg no			|	Make			|	Colour		|
|    Registration1.xlsx     |     NM06BHP     	|     FORD     		|     BLACK     |
|    Registration2.xlsx     |     KW15ZWD     	|     SEAT     		|     GREY     	|
|    Registration3.xlsx     |     WM17GNP     	|     TOYOTA    	|     WHITE     |
|    Registration4.xlsx     |     X102ANV     	|     FORD     		|     BLUE     	|
|    Registration5.xlsx     |     EJ12ZZH    	|     AUDI     		|     RED     	|
|    Registration6.csv     	|     T227HWN  		|     VOLSKAWAGEN   |     RED     	|
|    Registration7.csv     	|     RJ55FBK     	|     SKODA     	|     SILVER    |
|    Registration8.csv     	|     ML13WVY     	|     FORD     		|     RED     	|
|    Registration9.csv     	|     PX63FSE     	|     SEAT     		|     WHITE     |
|    Registration10.csv     |     X319CWN     	|     AUDI     		|     BLUE    	|
|    Registration11.xlsx    |     AK02NJF     	|     SKODA    		|     ORANGE    |