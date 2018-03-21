#include <iostream>
#include <fstream>

using namespace std;

class stack
{
private:
    int push_index = 0;
    int size = 20;
public:
    char *array;
    stack()
    {
        array = new char [size];
    }
    ~stack()
    {
        delete [] array;
    }
    void print_stack();
    bool is_empty();
    void push (char value);
    char pop();
    int get_push_index();
    void size_up();
    int top();
};

int stack::get_push_index()
{
    return push_index;
}

void stack::print_stack()
{
    for (int i = 0; i < (sizeof(array)/sizeof(*array)); i++)
    {
        cout << array[i];
    }
    cout << endl;
}

bool stack::is_empty()
{
    return push_index == 0;
}

void stack::size_up()
{
    char * new_array = new char [size * 2];
    for (int i = 0; i < size; i++)
    {
        new_array[i] = array[i];
    }
    delete [] array;
    array = new_array;
}

void stack::push(char value)
{
    if (push_index == size)
    {
        size_up();
    }
    array[push_index] = value;
    push_index++;
}

char stack::pop()
{
    push_index--;
    return array[push_index];
}

int stack::top()
{
    return array[push_index - 1];
}

int prior(char operation)
{
    switch (operation)
    {
        case '(':
        {
            return 1;
            break;
        }
        case '+':
        case '-':
        {
            return 2;
            break;
            
        }
        case '*':
        case '/':
        {
            return 3;
            break;
        }
        default: cout << "No such operation!" << endl;
    }
    return int();
}

bool is_operation(char operation)
{
    return operation == '+' || operation == '-' || operation == '*' || operation == '/';
}

bool is_digit(char digit)
{
    return digit >= '0' && digit <= '9';
}

void convert_into_polish_notation(char * origin, char * polish)
{
    stack st;
    int i = 0;
    int j = 0;
    for ( ; origin[i] != '\0'; ++i)
    {
        if (is_digit(origin[i]))
        {
            polish[j] = origin[i];
            ++j;
        }
        else
        {
            if (j != 0 && polish[j - 1] >= '0' && polish[j - 1] <= '9')
            {
                polish[j] = ' ';
                ++j;
            }
            
            if (is_operation(origin[i]))
            {
                if (st.is_empty() || prior(st.top()) < prior(origin[i]))
                {
                    st.push(origin[i]);
                }
                else
                {
                    while (!st.is_empty() && (prior(st.top()) >= prior(origin[i])))
                    {
                        polish[j++] = st.top();
                        st.pop();
                    }
                    st.push(origin[i]);
                }
            }
            else if (origin[i] >= 'a' && origin[i] <= 'z')
            {
                cout << "There are a letter in expression!" << endl;
                exit(1);
            }
            else
            {
                if (origin[i] == '(')
                {
                    st.push(origin[i]);
                }
                else
                {
                    if (origin[i] == ')')
                    {
                        if (st.is_empty() || st.top() == '(')
                        {
                            cout << "Input error!" << endl;
                            exit(1);
                        }
                        else
                        {
                            while (st.top() != '(')
                            {
                                polish[j] = st.top();
                                st.pop();
                                j++;
                            }
                        }
                        st.pop();
                    }
                }
            }
        }
    }
    while (!st.is_empty())
    {
        if (st.top() == '(')
        {
            cout << "Input error!!";
            exit(1);
        }
        else
        {
            polish[j] = st.top();
            st.pop();
            j++;
        }
    }
}

int main()
{
    char origin [100] = {"(1+2)*2"};
    char polish [100] = { 0 };
    
    convert_into_polish_notation(origin, polish);
    cout << polish;
    
    cout << endl;
    return 0;
}
