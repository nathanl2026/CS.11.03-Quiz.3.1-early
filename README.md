# CS.11.03-Quiz.3.1

Ensure that you read all instructions carefully. Do not include any additional methods that are not specified in this quiz description. Declare all methods as static. Good luck, have fun! :)


1. Inside the Main class, complete the method calculateGrade. This method will take an integer argument and return a character that corresponds to the letter grade associated with a score. 

95 and above = A

85 to 94 = B

75 to 84 = C

65 to 74 = D

55 to 64 = E

54 and below = F


calculateGrade(90);	// Returns ‘B’

calculateGrade(79);	// Returns ‘C’


2. Inside the Main class, complete the method fizzBuzz. This method will take an integer argument and return a String depending on the divisibility of the argument passed. This method will return “fizz” if the value is divisible by 2, “buzz” if the value is divisible by 7, “fizzbuzz” if the value is divisible by both 2 and 7, and “unlucky” if the number is not divisible by 2 or 7.

fizzBuzz(2);	// Returns “fizz”

fizzBuzz(7);	// Returns “buzz”

fizzBuzz(14); 	// Returns “fizzbuzz”

fizzBuzz(15);	// Returns “unlucky”


3. Inside the Main class, complete the method backFront. This method will take a String as an argument and return a String that has the last two characters of the original string passed added to the front and to the end of the original string. If the argument is less than two characters in length, return the argument. 

backFront(“hello”);	// Returns “lohellolo”

backFront(“hi”);	// Returns “hihihi”

backFront(“g”);		// Returns “g”



4. Inside the Main class, complete the method twoAsOne. This method will take three integers as arguments and return a boolean value depending on whether any two of the three integers can be multiplied together to equal the third. 

twoAsOne(4,2,2); 	// Returns true as 2*2=4

twoAsOne(-4,-11,44);	// Returns true as -4 * -11 = 44

twoAsOne(4,6,12);	// Returns false


5. Inside the Main class, complete the method endDown. This method will take a String as an argument and return a string where the last three characters are converted to lowercase. If there are fewer than three characters in the argument, then make the entire string lowercase. 

endDown(“HELLO”);	// Returns “HEllo”

endDown(“FOR SURE”);	// Returns “FOR Sure”

endDown(“GG”);		// returns “gg”
