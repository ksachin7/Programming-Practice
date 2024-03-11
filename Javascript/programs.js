"use strict"

// sort an array of numbers 
{
    // sort method mutates the original array. If you want to preserve the original array, you should make a copy of the array before sorting it.
    const array = [2, 5, 6, 7, 1, 0];

    // in ascending order
    const sortedArrayAsc = array.sort();
    console.log(sortedArrayAsc);

    // in descending order
    const sortedArrayDsc = [...array].sort((a, b) => b - a);
    console.log(sortedArrayDsc);
}

// largest and smallest numbers in an array
{
    function findLargestAndSmallest(arr) {
        if (!arr || arr.length === 0) {
            return { largest: null, smallest: null };
        }

        let largest = arr[0];
        let smallest = arr[0];

        for (let i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return { largest, smallest };
    }

    // Example usage:
    const numbers = [5, 2, 9, 1, 7, 3, 8];
    const results = findLargestAndSmallest(numbers);

    console.log(`Largest number: ${results.largest}`);
    console.log(`Smallest number: ${results.smallest}`);
}

// reverses the order of words in a string 
{
    const reverseWord = (str) => {
        const reversed = str.split(" ").map(w => w.split("").reverse().join("")).join();
        return reversed;
    }
    console.log(reverseWord("cba dcb edc"));
}

// count the occurrences of each character in the string
{
    const countCharOccur = (str) => {
        const charOccurs = {}
        str.split("").forEach(chr => charOccurs.chr = (charOccurs || 0) + 1);
    }
}

// non repeating characters
{   // The set method will not work as A & a is different
    const findUnique = (str) => {
        const unique = new Set();
        str.split("").forEach(e => {
            unique.add(e);
        });
        return [...unique];
    }

    const result = findUnique("India");
    console.log(result);    // [ 'I', 'n', 'd', 'i', 'a' ]

    // other method
    const nonRepeatedChars = (str) => {

        const uniqueChars = new Set();

        str.split.forEach((char) => {
            const lowerCaseChar = char.toLowerCase();


        });
    }
}

// Number pallindrome
{
    const isNumPallindrome = (number) => {
        let reversed = 0;
        let num = number;
        while (num > 0) {
            let lastDigit = num % 10;
            reversed = num * 10 + lastDigit;
            num = num / 10;
        }
        console.log(num === reversed ? `${number} is a pallindrome` : `${number} isn't a pallindrome`);
    }
    isNumPallindrome(10001);
}

// String Pallindrome
{
    const isStringPallindrome = (str) => {
        let reversedString = str.split("").reverse().join("");
        console.log(str === reversedString ? `${str} is a pallindrome` : `${str} isn't a pallindrome`);
    }
    isStringPallindrome('strrts');
}

// Factorial
{
    const factOf = (num) => {
        let fact = num;
        while (num > 1) {
            fact *= (num - 1);
            num--;
        }
        return fact;
    }
    console.log(factOf(5));
}

// Factorial recursive 
{
    function factorial(n) {
        // Base case: factorial of 0 or 1 is 1
        if (n === 0 || n === 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }

    // Example usage:
    const result = factorial(5);
    console.log(result);  // Output: 120
}

// Fibonacci series upto nth term: 0 1 1 2 3 5 8 13 21 34 55, ...
{
    const nthFibonacci = (n) => {
        let first = 0, second = 1, next;
        const series = [first, second];

        for (let i = 2; i < n; i++) {
            next = first + second;
            series.push(next);
            first = second;
            second = next;
        }

        // return series.toString().split(',').join(" ");
        return series.join(" ");
    }

    console.log(nthFibonacci(11));
}

// Fibonacci sequence up to a given number, utilizing memoization for optimized performance. 
{   // Function to calculate Fibonacci sequence using memoization
    function fibonacci(n, memo = {}) {
        if (n in memo) {
            return memo[n];
        }

        if (n <= 1) {
            return n;
        }

        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }

    // Function to generate Fibonacci sequence up to a given number
    function generateFibonacciSequence(upToNumber) {
        const sequence = [];
        let i = 0;

        while (fibonacci(i) <= upToNumber) {
            sequence.push(fibonacci(i));
            i++;
        }

        return sequence;
    }

    // Example: Generate Fibonacci sequence up to 50
    const upToNumber = 50;
    const fibonacciSequence = generateFibonacciSequence(upToNumber);
    console.log(`Fibonacci sequence up to ${upToNumber}: ${fibonacciSequence}`);
}

// Prime number
{
    function isPrime(num) {
        let prime = true;
        for (let i = 2; i <= Math.sqrt(num); i++) {
            if (num % i === 0) {
                prime = false;
                break;
            }
        }
        (prime && num > 1) ? console.log(`${num} is a prime number!`) : console.log(`${num} isn't a prime number!`);
    }

    isPrime(10111);
}

// Perfect number: A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding the number itself).
{
    const isPerfectNum = (num) => {
        let sum = 1; // 1 is always a divisor
        // const divisors = [1];

        // remember the conditions. It will check till num/2 to include all divisors.
        for (let i = 2; i <= num / 2; i++) {
            if (num % i === 0) {
                sum += i;
                // divisors.push(i);
            }
        }
        // console.log("sum", sum, "divisors: ", divisors);
        (sum === num) ? console.log(num + ' is a perfect number!') : console.log(`${num} isn't a perfect number!`)
    }
    isPerfectNum(28);
}

// Anagram: Two words are considered anagrams if they have the same characters but in a different order.
{
    function areAnagrams(str1, str2) {
        // Remove leading and trailing whitespaces, convert to lowercase
        const cleanStr1 = str1.trim().toLowerCase();
        const cleanStr2 = str2.trim().toLowerCase();

        // Sort the characters and compare the sorted strings
        const sortedStr1 = cleanStr1.split('').sort().join('');
        const sortedStr2 = cleanStr2.split('').sort().join('');

        // Check if the sorted strings are equal
        return sortedStr1 === sortedStr2;
    }

    // Example usage:
    const result = areAnagrams(' listen ', ' silent ');
    console.log(result);  // Output: true    
}

// Leap year: 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, and 2048.
{
    // using bitwise-operator
    const isLeapYear = (year) => {
        return (year % 4 === 0) && (year % 100 !== 0 || year % 400 === 0);
    }

    const year = 2100;
    isLeapYear(year) ? console.log(`${year} is a leap year!`) : console.log(`${year} isn't a leap year!`);

    // using if-else
    function leapYear(year) {
        if (year % 4 === 0) {
            if (year % 100 === 0) {
                if (year % 400 === 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
        return false
    }
    const yearToCheck = 2000;
    leapYear(yearToCheck) ? console.log(yearToCheck + " is a leap year!") : console.log(yearToCheck + " isn't a leap year!");
}