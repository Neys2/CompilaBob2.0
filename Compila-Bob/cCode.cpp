#include <iostream>
#include <stdlib.h>
using namespace std;
int main()
{ 
int n = 5 + 30 - 20 ;
cout << "Dame tu nombre: " << endl ;
string cadena ;
cin >> cadena;

float dcimal = 5.4 ;
cout << "Dame tu edad: " << endl ;
cin >> n;

if ( n == 3 ) { 
cout << "Este es un if, n es igual a 3 " << endl ;
} 
else { 
cout << "Este es un else, n es igual a " << n << endl ;
} 
int x = 3 ;
cout << "Hola! " << cadena << " voy a entrar al ciclo OwO" << endl ;
x = ( 10 + 5 ) / 3 ;

cout << x << endl ;
do { n =  n- 1 ;

cout << "Este es n: " << n << endl ;
} while ( n != 0 ) ;
x = 5 * 2 ;

cout << "Este es x otra vez:" << x << endl ;
}
