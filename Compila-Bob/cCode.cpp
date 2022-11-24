#include <iostream>
#include <stdlib.h>
using namespace std;
int main()
{ 
int a ;
int b ;
int c ;
int d ;
int e ;
int n ;
int i = 0 ;
cout << "Escribe 5 numeros enteros" << endl ;
cin >> a;

cin >> b;

cin >> c;

cin >> d;

cin >> e;

do { if ( a > b ) { 
n =  a;

a =  b;

b =  n;

} 
else { 
if ( b > c ) { 
n =  b;

b =  c;

c =  n;

} 
else { 
if ( c > d ) { 
n =  c;

c =  d;

d =  n;

} 
else { 
if ( d > e ) { 
n =  d;

d =  e;

e =  n;

} 
if ( e < d ) { 
n =  e;

e =  d;

d =  n;

} 
else { 
if ( d < c ) { 
n =  d;

d =  c;

c =  n;

} 
else { 
if ( c < b ) { 
n =  c;

c =  b;

b =  n;

} 
else { 
if ( b < a ) { 
n =  b;

b =  a;

a =  n;

i = 1 ;

} 
else { 
i = 1 ;

} 
} 
} 
} 
} 
} 
} 
} while ( i == 0 ) ;
cout << a << b << c << d << e << endl ;
cout << "Mayor: " << e << endl ;
cout << "Menor: " << a << endl ;
int suma ;
suma =  e+  a;

int resta ;
resta =  e-  a;

int mult ;
mult =  e*  a;

cout << "Suma: " << suma << endl ;
cout << "Resta: " << resta << endl ;
cout << "Multiplicacion: " << mult << endl ;
do { cout << i << ".- " << b << ", " << c << ", " << d << endl ;
i =  i+ 1 ;

} while ( i < 20 ) ;
}
