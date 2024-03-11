#include <iostream>
using namespace std;

// ! class:
class Book
{
public:
    string title;
    string author;
    int pages;
};

int main()
{
    Book book;
    book.title = "Harry Potter";
    book.author = "J.K.Rollins";
    book.pages = 399;

    Book book1;
    book1.title = "Lord of the rings";
    book1.author = "Tolkein";
    book1.pages = 500;

    cout << book.title << endl;
    cout << book1.title << endl;

    return 0;
}

// ! constructor:
class Book
{
public:
    string title;
    string author;
    int pages;

    Book() // constructor without parameter
    {
        title = "not title";
        author = "no author";
        pages = 0;
    }
    Book(string Title, string Author, int Pages) // constructor with parameters
    {
        title = Title;
        author = Author;
        pages = Pages;
    }
};

int main()
{
    Book book("Lord of the rings", "Tolkein", 500); // creating objects
    Book book1("Harry Potter", "J.K.Rollins", 399);
    Book book2;
    cout << book.title << "\t" << book.author << '\t' << book.pages << endl;
    cout << book1.title << "\t\t" << book1.author << '\t' << book1.pages << endl;
    cout << book2.title << "\t\t" << book2.author << '\t' << book2.pages << endl;

    return 0;
}

// ! object functions or class methods:
class Student
{
public:
    string name;
    string major;
    double gpa;
    void isITGuy();

    Student(string Name, string Major, double GPA)
    {
        name = Name;
        major = Major;
        gpa = GPA;
    }
    bool hasHonors() // object function or class method
    {
        if (gpa >= 7.5)
        {
            return true;
        }
        return false;
    }
};                      //  remember the semicolon;
void Student::isITGuy() // outside class method
{
    if (major == "Computer")
    {
        cout << "Yes he's an IT guy!" << endl;
    }
}

int main()
{
    Student stud("Sachin", "Computer", 7.56);
    cout << stud.name << endl;
    cout << stud.hasHonors() << endl;
    stud.isITGuy();
    return 0;
}

// ? There are three access specifiers:
// public-
// members are accessible from outside the class
// private -
// members cannot be accessed(or viewed)from outside the class
// protected -
// members cannot be accessed from outside the class,
// however, they can be accessed by child class.

// ! Getters & Setters and Encapsulation:
class Movie
{
private:
    string rating;

public:
    string name;

    Movie(string Name, string Rating)
    {
        name = Name;
        setRating(Rating);
    }

    void setRating(string Rating)
    {
        if (Rating == "R" || Rating == "NR" || Rating == "G" || Rating == "PG" || Rating == "PG-13")
        {
            rating = Rating;
        }
        else
        {
            rating = "NR";
        }
    }
    string getRating()
    {
        return rating;
    }
};

int main()
{
    Movie marvel("The Avengers", "R");
    marvel.setRating("dj");
    cout << marvel.name << ":\t" << marvel.getRating() << endl;
    return 0;
}

// ! Inheritance:
class shef
{
private:
    /* data */
public:
    void makeChicken()
    {
        cout << "Shef makes chicken" << endl;
    }
    void makeSalad()
    {
        cout << "Shef makes salad" << endl;
    }
    void makeSpecialdish()
    {
        cout << "Shef makes bbq" << endl;
    }
};
class italianShef : public shef
{
public:
    void makePasta()
    {
        cout << "Shef makes Pasta" << endl;
    }
    void makeSpecialdish() // polymorphism(overriding method)
    {
        cout << "Shef makes chicken parm" << endl;
    }
};
int main()
{
    shef s;
    italianShef is;
    s.makeChicken();
    s.makeSpecialdish();
    cout << "\nItalian shef:" << endl;
    is.makeChicken();
    is.makeSpecialdish();
    is.makePasta();

    return 0;
}

//! abstraction:
#include <iostream>
using namespace std;

class Shape
{
public:
    virtual int Area() = 0; // Pure virtual function is declared as follows.
    // Function to set width.
    void setWidth(int w)
    {
        width = w;
    }
    // Function to set height.
    void setHeight(int h)
    {
        height = h;
    }

protected:
    int width;
    int height;
};

// A rectangle is a shape; it inherits shape.
class Rectangle : public Shape
{
public:
    // The implementation for Area is specific to a rectangle.
    int Area()
    {
        return (width * height);
    }
};
// A triangle is a shape too; it inherits shape.
class Triangle : public Shape
{
public:
    // Triangle uses the same Area function but implements it to
    // return the area of a triangle.
    int Area()
    {
        return (width * height) / 2;
    }
};

int main()
{
    Rectangle R;
    Triangle T;

    R.setWidth(5);
    R.setHeight(10);

    T.setWidth(20);
    T.setHeight(8);

    cout << "The area of the rectangle is: " << R.Area() << endl;
    cout << "The area of the triangle is: " << T.Area() << endl;
}