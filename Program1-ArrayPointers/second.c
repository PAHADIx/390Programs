#include <stdio.h>
void rowPrinter(int*);

void second(){

	printf("\n\nQuestion 2 :\n");
	//Question 2 : Make a 2D Array of 10x10
	int array2[10][10];

	//2A Using pointer fill from 0 to 99
	int* ptr2 = &array2[0][0];
	int i;
	for(i = 0; i < 100; i++){
		*ptr2 = i;
		ptr2++;
	}

	//2B Creating pointers for all rows
	int* ptr01 = array2[0];
	int* ptr02 = array2[1];
	int* ptr03 = array2[2];
	int* ptr04 = array2[3];
	int* ptr05 = array2[4];
	int* ptr06 = array2[5];
	int* ptr07 = array2[6];
	int* ptr08 = array2[7];
	int* ptr09 = array2[8];
	int* ptr10 = array2[9];

	//2C Write a function to print a row
	//rowPrinter() below

	//2D Print all using rowPrinter
	rowPrinter(ptr01);
	rowPrinter(ptr02);
	rowPrinter(ptr03);
	rowPrinter(ptr04);
	rowPrinter(ptr05);
	rowPrinter(ptr06);
	rowPrinter(ptr07);
	rowPrinter(ptr08);
	rowPrinter(ptr09);
	rowPrinter(ptr10);


	printf("\n");
	//2E Exchange Rows (1 & 8) and (2 & 3)
	int* temp = ptr01;
	ptr01 = ptr07;
	ptr07 = temp;

	temp = ptr02;
	ptr02 = ptr03;
	ptr03 = temp;



	//2F Printing again
	rowPrinter(ptr01);
	rowPrinter(ptr02);
	rowPrinter(ptr03);
	rowPrinter(ptr04);
	rowPrinter(ptr05);
	rowPrinter(ptr06);
	rowPrinter(ptr07);
	rowPrinter(ptr08);
	rowPrinter(ptr09);
	rowPrinter(ptr10);





}

void rowPrinter(int* add){
	int i;
	for(i = 0; i < 10; i++){
		printf("%d ",*add);
		add++;
	}
	printf("\n");
}
