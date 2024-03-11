#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

void myFunction(char yourName[1], int age)
{
    printf("Hello %s You're %d\n", yourName, age);
}

int calculator();

//! Structure:
struct Student
{
    char name[30];
    char major[10];
    int age;
    double gpa;
};

int main()
{
    //! input & output:
    char name[1];
    char place[11];

    printf("Hello World!\n");
    printf("%f\n", ceil(36.08));

    printf("Enter your place: ");
    scanf("%s", place);
    printf("%s\n", place);

    //? Nested printf:
    int X = 1987;
    printf("%d\n", printf("%d", printf("%d", X)));

    char *string[20] = {"yes", "no"};
    printf("%s\n", string[1]);
    printf("%c\n\n", string[1][1]);

    while ((getchar()) != '\n')
        ; // This will consume the '\n' char
    // need to use this to use fgets after scanf

    //? or can use scanf like this after scanf
    //* scanf("%255[^\n]%*c", str);      //  %*c to remove trailing \n
    //* scanf("%[^\n]s", str);
    //* scanf("%[^\n]c", str2);
    //* fgets(str, 255, stdin);

    printf("Enter your name: ");
    fgets(name, 21, stdin);
    printf("Your Name is : %s\n", name);

    /* The 'gets' function is deprecated, and also dangerous if you don't know
    The exact number of characters in the input.
    This can lead to overflowing the buffer because the gets() function doesn't know
    how big the buffer is so it keeps reading until it finds a newline character or EOF. */
    //? You should use fgets() instead of gets().
    char x[11];
    printf("Enter a string: ");
    gets(x);
    puts(x);

    // myFunction("Sachin Kumar", 25);

    //! struct:
    struct Student stud;
    // stud.name = "Sachin"; This wil not work like that. use strcpy.
    stud.age = 25;
    stud.gpa = 3.6;
    strcpy(stud.major, "computer");

    printf("%s\n", stud.name);
    printf("%f\n", stud.gpa);
    printf("%s\n", stud.major);

    struct Student st;
    strcpy(st.name, "Rohit");
    st.age = 24;
    st.gpa = 3.6;
    strcpy(st.major, "computer");

    printf("%s\n", st.name);
    printf("%f\n", st.gpa);
    printf("%s\n", st.major);

    //! Union:

    //! Pointers:
    int num = 40;
    int *pnum = &num;

    printf("\n\n%d\n", num);
    printf("%d\n", *&*&num);
    printf("%p\n", &num);
    printf("%d\n", *&num);
    printf("%d\n", *&num);
    printf("%p\n\n", pnum);

    //! File Handling:
    char line[255];
    // FILE *fp = fopen("cfile.txt", "w");
    // FILE *fp = fopen("cfile.txt", "a");
    FILE *fp = fopen("cfile.txt", "r");
    // fprintf(fp, "Rohit: 25\nUtkarsh: 30\nwais: 40");
    fprintf(fp, "\nWebsite phishing detection");
    fgets(line, 255, fp); // read information from a file(fp) and stores it somewhere(line)
    printf("%s", line);   // printing the first line
    fclose(fp);

    //! Function:
    calculator();
    return 0;
}

int calculator()
{
    double num1, num2, result;
    char op;

    printf("Enter a number\n");
    scanf("%lf", &num1);

    printf("Enter an operator\n");
    scanf(" %c", &op);

    printf("Enter another number\n");
    scanf("%lf", &num2);

    if (op == '+')
    {
        result = num1 + num2;
    }
    else if (op == '-')
    {
        result = num1 - num2;
    }
    else if (op == '*')
    {
        result = num1 * num2;
    }
    else if (op == '/')
    {
        result = num1 / num2;
    }
    else
    {
        printf("Something went wrong!");
    }
    float r = printf("%f\n", result);

    return r;
}

// sizeof
#include <stdio.h>
int main()
{
    int x = 11;
    char y = 'c';
    double z = 1.2;

    int *a = &x;
    char *b = &y;
    double *d = &z;

    printf("%lu, %lu,  %lu", sizeof a, sizeof b, sizeof(double));
    return 0;
}

// continue program
#include <stdio.h>
int main()
{
    int i;
    for (i = 1; i <= 5; i++)
    {
        if (i == 2)
            continue;
        printf("%d\n", i);
    }
    return 0;
}

// infinite loop with continue
#include <stdio.h>
void main()
{
    int i = 0;
    while (i != 10)
    {
        printf("%d", i);
        continue;
        i++;
    }
}
