package com.qa.javaAssessment;

public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

		public String getBert(String input) {
            String noBert = input.replace("bert", "");
            String reverse="";
            for(int i = noBert.length() - 1; i >= 0; i--)
            {
            	reverse  = reverse + noBert.charAt(i);
            }
            String answer= reverse;
            return answer;
}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	public boolean evenlySpaced(int a, int b, int c) {
		boolean arrange = (b-a==c-b);
        if (arrange) {
        return true;
        }
        else if (b-a==a-c) {
                        return true;
        }
        else if (c-a==b-c) {
                        return true;
        }
        else if (a-b==c-a) {
                        return true;
        }
        else if (c-b==a-c) {
                        return true;
                                                        }
        else if (b-c==a-b) {
                        return true;
        }
        return false;
}


	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String nMid(String input, int a) {
        int stringLength =input.length();
        int startPoint = (stringLength - a)/2;
        String oldStr = input;
        String newStr = input.substring(startPoint, startPoint + (a) );
        
        if(stringLength<a && a%2 ==0 && a>1);
        String result = oldStr.replace(newStr, "");

        return result;
        
}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	public int superBlock(String input) {
		int large = 0;
		int i;
		if(input!="") {
			int testing=1;
			for (i=1; i<input.length();i++) {
				large=1;
				if(input.charAt(i)==input.charAt(i-1)) {
				testing++;
				}
				if (testing>large) {
				large=testing;
				testing=1;
				}
			}
			if(testing>large) {
				large=testing;
			}
		}
		else {
			large=0;
		}
		return large;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) {
		int i;
		int count =0;
		String lookfor = "am";
		int length=lookfor.length();
			for (i=0; i<arg1.length()-1; i++) {
			if(arg1.substring(i, i+length).equals(lookfor)) {
				if(i==0) {
					if (arg1.substring(i, i+length).equals(" ")){
						count++;
					}
				}
				if(i==arg1.length()-length) {
					if(arg1.substring(i-1,i).contentEquals(" ")) {
						count++;
					}
				}
				if(arg1.substring(i-1,i).contentEquals(" ") && arg1.substring(i-1,i).contentEquals(" ")) {
					count++;
				}
			}
			}
		return count;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) ==> "fizz"
	//fizzBuzz(10) ==> "buzz"
	//fizzBuzz(15) ==> "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
        //boolean five = (arg1 % 5 == 0);
        //boolean three = (arg1 % 3 == 0);
        String answer;
        if (arg1 % 5 == 0 && arg1 % 3 == 0) 
           answer = "fizzbuzz";
        else if (arg1 % 5 == 0 )
           answer = "buzz";
        else if (arg1 % 3 == 0) 
                        answer = "fizz";
        else 
                        answer ="" ;
        return answer;                  
        }

	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public int largest(String arg1) {
		int i;
		int sum=0;
		int number=0;
		int answer=0;
		String num="";
		String alpha;
		for(i=0; i<arg1.length(); i++) {
			int a=0, b=0, c=0;
			alpha=arg1.substring(i, i+1);
			if(alpha.contentEquals(" ")) {
				if(num.length()==3) {
					c=Integer.parseInt(num)/100;
					number=Integer.parseInt(num)-100;
					b=number/10;
					a=number%10;
					sum=a+b+c;
				}
				if(num.length()==2) {
					number=Integer.parseInt(num);
					b=number/10;
					a=number%10;
					sum=a+b;
				}
				if(sum>answer) {
					answer=sum;
				}
				alpha="";
			}
			if(i==arg1.length()-1) {
				if(num.length()==3) {
					c=Integer.parseInt(num)/100;
					number=Integer.parseInt(num)-100;
					b=number/10;
					a=number%10;
					sum=a+b+c;
				}
				if(num.length()==2) {
					number=Integer.parseInt(num);
					b=number/10;
					a=number%10;
					sum=a+b;
				}
				if(sum>answer) {
					answer=sum;
				}
				alpha="";
			}
			else {
				num+=alpha;
			}
		}
        return answer;
}
}
