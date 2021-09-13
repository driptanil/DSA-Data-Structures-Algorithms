class Calculator:

    def unpacking(self,string):
        import math
        num=0
        lst=[]
        for obj in string:
            if obj.isnumeric()==True:
                if lst==[]:
                    lst.append(int(obj))
                else:
                    try:
                        int(lst[num-1])
                        lst[num-1]=lst[num-1]*10+int(obj)
                        num-=1
                    except:
                        lst.append(int(obj))
            else:
                if obj=='e':
                    lst.append(math.e)
                elif obj=='i':
                    if lst[num-1]=='p':
                        lst[num-1]=math.pi
                        num-=1
                else:
                    lst.append(obj)
            num+=1
        return lst

    def brakets_open_index(self,lst):
        if '(' in lst:
            for num,obj in enumerate(lst):
                if obj=='(':
                    index1=num
        else:
            index1=-1
        return index1
    
    def brakets_close_index(self,lst,index1):
        if ')' in lst[index1:]: 
            index2=lst[index1:].index(')')+index1
        else:
            index2=len(lst)-1
        return index2

    def operation(self,lst,index1,index2):
        import math
        if '!' in lst[index1+1:index2+1]:
            count=lst[index1+1:index2+1].index('!')
            count=count+index1+1
            fact=1
            if lst[count-1]==0:
                lst[count]=fact
                lst.pop(count-1)
            else:
                for obj in range(1,lst[count-1]+1):
                    fact=fact*obj
                lst[count]=fact
                lst.pop(count-1)

        elif '^' in lst[index1+1:index2+1]:
            count=lst[index1+1:index2+1].index('^')
            count=count+index1+1
            lst[count]=lst[count-1]**lst[count+1]
            lst.pop(count+1)
            lst.pop(count-1)

        elif '/' in lst[index1+1:index2+1]:
            count=lst[index1+1:index2+1].index('/')
            count=count+index1+1
            lst[count]=lst[count-1]/lst[count+1]
            lst.pop(count+1)
            lst.pop(count-1)

        elif '*' in lst[index1+1:index2+1]:
            count=lst[index1+1:index2+1].index('*')
            count=count+index1+1
            lst[count]=lst[count-1]*lst[count+1]
            lst.pop(count+1)
            lst.pop(count-1)

        elif '+' in lst[index1+1:index2+1]:
            count=lst[index1+1:index2+1].index('+')
            count=count+index1+1
            lst[count]=lst[count-1]+lst[count+1]
            lst.pop(count+1)
            lst.pop(count-1)
        
        elif '-' in lst[index1+1:index2+1]:
            count=lst[index1+1:index2+1].index('-')
            count=count+index1+1
            lst[count]=lst[count-1]-lst[count+1]
            lst.pop(count+1)
            lst.pop(count-1)
        
        return lst
    
    def open_bracket(self,lst,index1):
        if index1==0:
            lst.pop(index1)
        else:
            if lst[index1-1] not in ['+','-','*','/','^','!']:
                integer=False
                for count in range(index1):
                    try:
                        int(lst[count])
                        integer=True
                        break
                    except:
                        pass
                if integer==True:
                    lst[index1]='*'
                else:
                    lst.pop(index1)
            else:
                lst.pop(index1)
        return lst

    def close_bracket(self,lst,index2):
        if index2==len(lst)-1:
            lst.pop(index2)
        else:   
            if lst[index2+1] not in ['+','-','*','/','^','!']:
                integer=False
                for count in range(index2+1,len(lst)):
                    try:
                        int(lst[count])
                        integer=True
                        break
                    except:
                        pass
                if integer==True:
                    lst[index2]='*'
                else:
                    lst.pop(index2)
            else:
                lst.pop(index2)
        return lst

    def print_list(self,lst):
        string='='
        for obj in lst:
            string+=' '+str(obj)
        print(string)

# Taking input (string)
print('\n\n-------------------------Calculator--------------------------\n')
print('Operations :')
print("\tAddition : '+'")
print("\tSubstraction : '-'")
print("\tMultiplication : '*'")
print("\tDivide : '/'")
print("\tPower : '^'")
print("\tFactorial : '!'")
print("\tBrackets : '(',')'")
print("\te : 'e'")
print("\tπ : 'pi'")
print('\n!!!Causion!!!: Do not add any space in between the charecters\n\n')

string=input('input:')
#string='(4572*25)/70(12/78+2589*89+63)/13'

# Calling Class
cal=Calculator()

# Unpacking (list)
lst=cal.unpacking(string)
cal.print_list(lst)
if lst.count('(')==lst.count(')'):
    if '(' in lst:
        for count1 in range(0,lst.count('(')):
            index1=cal.brakets_open_index(lst)
            index2=cal.brakets_close_index(lst,index1)

            for obj in lst[index1:index2+1]:
                if obj in ['+','-','*','/','^','!']:
                    # Checking Operator
                    lst=cal.operation(lst,index1,index2)
                    cal.print_list(lst)
                    index1=cal.brakets_open_index(lst)
                    index2=cal.brakets_close_index(lst,index1)

            # Bracket Remove
            index1=cal.brakets_open_index(lst)
            lst=cal.open_bracket(lst,index1)
            cal.print_list(lst)

            index2=cal.brakets_close_index(lst,index1)
            lst=cal.close_bracket(lst,index2)
            cal.print_list(lst)

        index1=cal.brakets_open_index(lst)
        index2=cal.brakets_close_index(lst,index1)
        for obj in lst[index1+1:index2+1]:
            if obj in ['+','-','*','/','^','!']:
                # Checking Operator
                lst=cal.operation(lst,index1,index2)
                cal.print_list(lst)
                index1=cal.brakets_open_index(lst)
                index2=cal.brakets_close_index(lst,index1)

    else:
        index1=cal.brakets_open_index(lst)
        index2=cal.brakets_close_index(lst,index1)
        for obj in lst[index1+1:index2+1]:
            if obj in ['+','-','*','/','^','!']:
                # Checking Operator
                lst=cal.operation(lst,index1,index2)
                cal.print_list(lst)
                index1=cal.brakets_open_index(lst)
                index2=cal.brakets_close_index(lst,index1)