package PROJECTS;
import java.util.Scanner;
import java.util.Random;

public class TicTacToe
{
static int count;								//COUNTER FOR PLAYER
final static int R=3;								//SIZE OF ROWS IN TIC-TAC-TOE 
final static int C=3;								//SIZE OF COLUMNS IN TIC-TAC-TOE
static char [][]arr=new char[R][C];

static String PLAYER_1;							//PLAYER_1
static String PLAYER_2;							//PLAYER_2
static int flag;								//KEY

private void input(int r,int c)
{
Scanner sc=new Scanner(System.in);

if(r<0 || r>=R || c<0 || c>=C)						//CASE OF INVALID ROW/COLUMN SCANNED
{
System.out.print("ENTER VALID ROW AND COLUMN FOR "+ (count%2 !=0 ? PLAYER_1 :  PLAYER_2) + ": ");
r=sc.nextInt();								
c=sc.nextInt();
}


if(arr[r][c] != ' ')								//IF ALREADY FILLED
{
if(count%2 != 0)
{
System.out.print("ENTER VALID ROW AND COLUMN FOR  "+PLAYER_1+": ");
input(sc.nextInt(),sc.nextInt());
}
else
{
if(flag!=1)
{
System.out.print("ENTER VALID ROW AND COLUMN FOR "+ (count%2 !=0 ? PLAYER_1 :  PLAYER_2) + ": ");
input(sc.nextInt(),sc.nextInt());						//IF PLAYER_2 IS HUMAN
}
else
{
Random rand=new Random();							//IF PLAYER_2 IS COMPUTER
input(rand.nextInt(R),rand.nextInt(C));					//GENERATES RANDOM VALUE IN THE RANGE 0 TO R-1 INCLUSIVE.....
}
}
}
else
{
if(count%2 != 0) arr[r][c]='O';
else arr[r][c]='X';
check();
}
}




void check()									//CHECKS FOR WINNER
{
String str1="";
String str2="";

//FOR LEFT-RIGHT DIAGONAL:-
for(int i=1;i<R;i++)
{
for(int j=1;j<C;j++)
{
if(i == j && arr[i][j] == arr[i-1][j-1] && arr[i][j]!=' ')
{
if(arr[i][j]=='O')
{
/*System.out.println("----------------------");

System.out.println("arr["+i+"]["+j+"] |"+arr[i][j]+"|");
System.out.println("arr["+ (i-1) +"]["+ (j-1) +"] |"+arr[i-1][j-1]+"|");

System.out.println("----------------------");*/
str1+='O';
}
else
{
/*System.out.println("----------------------");

System.out.println("arr["+i+"]["+j+"] |"+arr[i][j]+"|");
System.out.println("arr["+ (i-1) +"]["+ (j-1) +"] |"+arr[i-1][j-1]+"|");

System.out.println("----------------------");*/
str2+='X';
}
/*System.out.println("str1=> "+str1);
System.out.println("str2=> "+str2);
System.out.println();*/
}
}
}
if(str1.length() == 2 || str2.length() == 2)
play(count%2 != 0 ? PLAYER_1 : PLAYER_2);


//FOR RIGHT-LEFT DIAGONAL:-
str1=str2="";
for(int i=1;i<R;i++)
{
for(int j=0;j<C-i;j++)
{
if(i+j == R-1 && arr[i][j] == arr[i-1][j+1] && arr[i][j]!=' ')
{
if(arr[i][j]=='O')
{
/*System.out.println("----------------------");

System.out.println("arr["+i+"]["+j+"] |"+arr[i][j]+"|");
System.out.println("arr["+ (i-1) +"]["+ (j+1) +"] |"+arr[i-1][j+1]+"|");

System.out.println("----------------------");*/
str1+='O';
}
else
{
/*System.out.println("----------------------");

System.out.println("arr["+i+"]["+j+"] |"+arr[i][j]+"|");
System.out.println("arr["+ (i-1) +"]["+ (j+1) +"] |"+arr[i-1][j+1]+"|");

System.out.println("----------------------");*/
str2+='X';
}
/*System.out.println("str1=> "+str1);
System.out.println("str2=> "+str2);
System.out.println();*/
}
}
}
if(str1.length() == 2 || str2.length() == 2)
play(count%2 != 0 ? PLAYER_1 : PLAYER_2);



//FOR ROWS:-
for(int i=0;i<R;i++)
{
str1=str2="";
for(int j=1;j<C;j++)
{
if(arr[i][j] == arr[i][j-1] && arr[i][j]!=' ')
{
if(arr[i][j]=='O')
{
/*System.out.println("----------------------");

System.out.println("arr["+i+"]["+j+"] |"+arr[i][j]+"|");
System.out.println("arr["+ i +"]["+ (j-1) +"] |"+arr[i][j-1]+"|");

System.out.println("----------------------");*/
str1+='O';
}
else
{
/*System.out.println("----------------------");

System.out.println("arr["+i+"]["+j+"] |"+arr[i][j]+"|");
System.out.println("arr["+ i +"]["+ (j-1) +"] |"+arr[i][j-1]+"|");

System.out.println("----------------------");*/
str2+='X';
}
/*System.out.println("str1=> "+str1);
System.out.println("str2=> "+str2);
System.out.println();*/
}
}
}
if(str1.length() == 2 || str2.length() == 2)
play(count%2 != 0 ? PLAYER_1 : PLAYER_2);



//FOR COLUMNS:-
for(int i=1;i<R;i++)
{
str1=str2="";
for(int j=0;j<C;j++)
{
if(arr[i][j] == arr[i-1][j] && arr[i][j]!=' ')
{
if(arr[i][j]=='O')
{
/*System.out.println("----------------------");

System.out.println("arr["+i+"]["+j+"] |"+arr[i][j]+"|");
System.out.println("arr["+ (i-1) +"]["+ j +"] |"+arr[i-1][j]+"|");

System.out.println("----------------------");*/
str1+='O';
}
else if(arr[i][j]=='X')
{
/*System.out.println("----------------------");

System.out.println("arr["+i+"]["+j+"] |"+arr[i][j]+"|");
System.out.println("arr["+ (i-1) +"]["+ j +"] |"+arr[i-1][j]+"|");

System.out.println("----------------------");*/
str2+='X';
}
/*System.out.println("str1=> "+str1);
System.out.println("str2=> "+str2);
System.out.println();*/
}
}
}
if(str1.length() == 2 || str2.length() == 2)
play(count%2 != 0 ? PLAYER_1 : PLAYER_2);




if(count == R*C)								//IF MATCH DRAWS
{
Print();
System.out.println("|##################|  MATCH DRAWS  |#####################|");
System.out.println("|  GAME OVER  |#|  GAME OVER  |#|  GAME OVER  |#|  GAME OVER  |");
System.exit(0);								//TO STOP PROGRAM'S EXECUTION
}
}






void play(String name)
{
Print();
System.out.println("|##################|  WINNER IS => "+name+"  |#####################|");
System.out.println("|  GAME OVER  |#|  GAME OVER  |#|  GAME OVER  |#|  GAME OVER  |");
System.exit(0);								//TO STOP PROGRAM'S EXECUTION
}





private static void Print()							//TO PRINT TIC-TAC-TOE's MATRIX
{

System.out.println("\nTIC-TAC-TOE:-");
System.out.println("=====");
for(char a[]:arr)
{
for(char b:a)
System.out.print(b+" ");
System.out.println();
}
System.out.println("=====");
}




public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
TicTacToe T=new TicTacToe();

for(int i=0;i<R;i++)								//INITIALIZATION OF ARRAY WITH BLANK SPACE CHARACTER(' ')
for(int j=0;j<C;j++)
arr[i][j]=' ';

System.out.println("PRESS KEY '1' FOR HUMAN VS COMPUTER");
flag=Integer.parseInt(sc.nextLine());						//SCAN KEY(flag)

System.out.print("NAME OF PLAYER-1: ");
PLAYER_1=sc.nextLine();							//NAME OF PLAYER_1

if(flag!=1)
{
System.out.print("NAME OF PLAYER-2: ");
PLAYER_2=sc.nextLine();							//NAME OF PLAYER_2
}
else
{
PLAYER_2="COMPUTER";
}

System.out.println("TIC-TAC-TOE: "+PLAYER_1+" Vs "+PLAYER_2);

for(int i=1;i<=9;i++)
{
count=i;
if(i%2 != 0)
{
System.out.print("SCAN ROW AND COLUMN FOR "+PLAYER_1+": ");
T.input(sc.nextInt(),sc.nextInt());
Print();
}
else
{
if(flag!=1)
{
System.out.print("SCAN ROW AND COLUMN FOR "+PLAYER_2+": ");			//IF PLAYER_2 IS HUMAN
T.input(sc.nextInt(),sc.nextInt());
Print();
}
else
{
Random rand=new Random();							//IF PLAYER_2 IS COMPUTER
T.input(rand.nextInt(R),rand.nextInt(C));
Print();
}
}
}

}
}
