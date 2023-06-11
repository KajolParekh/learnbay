#Python Program to Check Leap Year
#A leap year is exactly divisible by 4 except for century years (years ending with 00). The century year is a leap year only if it is perfectly divisible by 400.

year = int(input("Enter a year "))
if(year % 4 == 0): print('{0} is a leap year'.format(year))
else: print('{0} is not a leap year'.format(year))