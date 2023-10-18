#include <iostream>
#include <limits>
using namespace std;

int scenario1();
int scenario2();

int main(){
	
	int option;
	
	do{
		cout << "Data Structure and Algorithm \n";
		cout << "Options: \n\n";
		cout << "1. [Custodio] Secenario 1 \n";
		cout << "2. [Villanueva] Scenario 2 \n";
		cout << "3. Exit \n";
		
		cout << "Please enter your choice: ";
		if(!(cin >> option)){
			cout << "Invalid input! " << endl;
			cin.clear();
			cin.ignore(numeric_limits<streamsize> :: max(), '\n');
			system("PAUSE");
			system("cls");
			continue;
		}
		
		system("cls");
		
		switch(option){
			case 1:
				scenario1();
				break;
			case 2:
				scenario2();
				break;
			case 3:
				cout << "Program finished...\n";
				break;
			default:
				cout << "Invalid input! \n";
				system("PAUSE");
				system("cls");
				continue;
		}
	}while(option != 3);
	
	
	return 0;
}

int scenario1(){
	cout << "[Custodio] 1st scenario \n";
	cout << "Identify your height whether you are tall(180 cm and above) or else short...\n\n";
	
	string var;
	double height;
	
	while(true){
		cout << "Enter your height: ";
		if(!(cin >> height)){
			cout << "Invalid input! " << endl;
			cin.clear();
			cin.ignore();
			continue;
		}else{
			break;
		}
	}
	
	var = height >= 180 ? "Tall \n" : "Short \n";
	cout << var;
	
	system("PAUSE");
	system("cls");
}

int scenario2(){
	cout << "[Villanueva] 2nd scenario \n";
	cout << "Find the sum of two numbers...\n\n";
	
	long double n1, n2, sum;
	
	while(true){
		cout << "Enter 1st number: ";
		if(!(cin >> n1)){
			cout << "Invalid input! " << endl;
			cin.clear();
			cin.ignore(numeric_limits<streamsize> :: max(), '\n');
			continue;
		}else{
			break;
		}
	}
	while(true){
		cout << "Enter second number: ";
		if(!(cin >> n2)){
			cout << "Invalid input! " << endl;
			cin.clear();
			cin.ignore(numeric_limits<streamsize> :: max(), '\n');
			continue;
		}else{
			break;
		}
	}
	
	sum = n1 + n2;
	
	cout << "The sum of " << n1 << " + " << n2 << " is " << sum << endl;
	system("PAUSE");
	system("cls");
}
