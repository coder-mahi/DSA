//stack operations practice 
//17/02/2025
#include<iostream>
#define MAX 10
using namespace std;
struct stack{
    int top;
    int data[MAX];
}s;
int main(){
    int ch,c,x;
    s.top = -1;
    do{
        cout<<"Select stack operation ->"<<endl;
        cout<<"1.push"<<endl;
        cout<<"2.pop"<<endl;
        cout<<"3.top element"<<endl;
        cout<<"4.display stack"<<endl;
        cin>>ch;
        switch(ch){
            case 1:
                if(s.top == MAX-1){
                    cout<<"stack overflow...!!!"<<endl;
                }else{
                    cout<<"Enter element :> "<<endl;
                    cin>>x;
                    s.top++;
                    s.data[s.top] = x;
                }
                break;
            case 2:
                if(s.top == -1){
                    cout<<"stack underflow...!!!"<<endl;
                }else{
                    cout<<"element popped :> "<<s.data[s.top]<<endl;
                    s.top--;
                }
                break;
            case 3:
                if(s.top != -1){
                    cout<<"TOP -> "<<s.data[s.top]<<endl;
                }else{ 
                    cout<<"Top -> -1 (stack is empty)"<<endl; 
                }
                break;
            case 4:
                cout<<"Displaying stack ---"<<endl;
                for(int i=s.top;i>=0;--i){
                    cout<<s.data[i]<<endl;
                }
                break;
        }
        cout<<"Do you want to continue (1/0)"<<endl;
        cin>>c;
    }while(c==1);
    return 0;
}