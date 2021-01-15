"""Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100, the second - 
from the year 101 up to and including the year 200, etc.
Example:
- For year = 1905, the output should be centuryFromYear(year) = 20;
Author: Michel Corona 
"""

def centuryFromYear(year):
    # This will give us the first two digits, which would be the century.
    cen = int(year/100)
    # If the remainder of the division of the year by 100 is 0, then the 2 first digits of the div
    # represent the century. Otherwise, if the remainder is non-zero, the century is found by adding 1
    # to the result of the division
    while year >= 1:
        if year % 100 == 0:
            return year / 100
        else:
            return cen + 1