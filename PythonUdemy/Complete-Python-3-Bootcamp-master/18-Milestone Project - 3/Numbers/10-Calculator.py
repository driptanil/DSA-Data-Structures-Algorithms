# Please read the comments to understand what is really going on under the hood
# Enjoy

# Defining class
from math import radians


class Calculator:
    # Defining function that coverts string to list:
    # "1+(23*sin(pi*2ln(e))" --> "[1,'+','(',23,'*','sin','(',3.14,'*',2,'ln','(',2.73,')',')']"
    def unpacking(self,string):
        import math
        num=0
        lst=[]
        count_deci=0
        for obj in string:
            if len(lst)!=0 and '.' in str(lst[num-1]):
                integer=True
                try:
                    int(obj)
                except:
                    integer=False
                if '.'==str(lst[num-1]) and integer==True:
                    lst[num-1]=float('0'+'.'+obj)
                    count_deci+=1
                    num-=1
                elif integer==True:
                    count_deci+=1
                    lst[num-1]=lst[num-1]+int(obj)/(10**count_deci)
                    num-=1

            integer=True
            try:
                int(obj)
            except:
                integer=False
            if integer==True:
                if lst==[]:
                    lst.append(int(obj))
                else:
                    if '.' not in str(lst[num-1]):
                        try:
                            int(lst[num-1])
                            lst[num-1]=lst[num-1]*10+int(obj)
                            num-=1
                        except:
                            lst.append(int(obj))

            # e
            elif obj=='e' and lst[num-1]!='d':
                if len(lst)==0:
                    lst.append(math.e)
                else:
                    integer=True
                    try:
                        int(lst[num-1])
                    except:
                        integer=False
                    if integer==True:
                        lst.append('*')
                        lst.append(math.e)
                        num+=1
                    else:
                        lst.append(math.e)

            # pi
            elif len(lst)!=0 and obj=='i' and lst[num-1]=='p':
                integer=True
                try:
                    int(lst[num-2])
                except:
                    integer=False
                if integer==True:
                    lst[num-1]='*'
                    lst.append(math.pi)
                else:
                    lst[num-1]=math.pi
                    num-=1

            # Degrees
            elif len(lst)>1 and obj=='g' and lst[num-1]=='e' and lst[num-2]=='d':
                lst[num-2]='deg'
                lst.pop(num-1)
                num-=2
                print(lst)

            # Radians
            elif len(lst)>1 and obj=='d' and lst[num-1]=='a' and lst[num-2]=='r':
                lst[num-2]='rad'
                lst.pop(num-1)
                num-=2

            # Sine
            elif len(lst)>1 and obj=='n' and lst[num-1]=='i' and lst[num-2]=='s':
                lst[num-2]='sin'
                lst.pop(num-1)
                num-=2

            # Inverse Sine
            elif len(lst)>2 and lst[num-3]=='sin' and lst[num-2]=='_' and lst[num-1]=='i' and obj=='n':
                lst[num-3]=lst[num-3]+lst[num-2]+lst[num-1]+obj
                lst.pop(num-1)
                lst.pop(num-2)
                num-=3

            # Tangent
            elif len(lst)>1 and obj=='n' and lst[num-1]=='a' and lst[num-2]=='t':
                lst[num-2]='tan'
                lst.pop(num-1)
                num-=2
            
            # Inverse Tangent
            elif len(lst)>2 and lst[num-3]=='tan' and lst[num-2]=='_' and lst[num-1]=='i' and obj=='n':
                lst[num-3]=lst[num-3]+lst[num-2]+lst[num-1]+obj
                lst.pop(num-1)
                lst.pop(num-2)
                num-=3

            # Natural Logarithm
            elif len(lst)>0 and obj=='n' and lst[num-1]=='l':
                lst[num-1]='ln'
                num-=1

            # Cosine
            elif len(lst)>1 and obj=='s' and lst[num-1]=='o' and lst[num-2]=='c':
                lst[num-2]='cos'
                lst.pop(num-1)
                num-=2

            # Inverse Cosine
            elif len(lst)>2 and lst[num-3]=='cos' and lst[num-2]=='_' and lst[num-1]=='i' and obj=='n':
                lst[num-3]=lst[num-3]+lst[num-2]+lst[num-1]+obj
                lst.pop(num-1)
                lst.pop(num-2)
                num-=3
    
            # Logarithm
            elif len(lst)>1 and obj=='g' and lst[num-1]=='o' and lst[num-2]=='l':
                if len(lst)==2:
                    lst[num-2]='log'
                    lst.pop(num-1)
                    num-=2
                else:
                    integer=True
                    try:
                        int(lst[num-3])
                    except:
                        integer=False
                    if integer==True:
                        lst[num-2]='*'
                        lst[num-1]='log'
                        num-=1
                    else:
                        lst[num-2]='log'
                        lst.pop(num-1)
                        num-=2

            # Decimal
            elif obj=='.':
                integer=True
                try:
                    int(lst[num-1])
                except:
                    integer=False
                if integer==True:
                    lst[num-1]=float(str(lst[num-1])+'.0')
                    num-=1
                else:
                    lst.append(obj)

            else:
                lst.append(obj)
            num+=1
        return lst
    
    # Index of Opening Brackets or Modulas
    def brakets_open_index(self,lst):
        if '(' in lst or '|' in lst:
            mycount=lst.count('|')/2
            count=0
            index1=0
            index=0
            for num,obj in enumerate(lst):
                if obj=='(':
                    index=num
            for num,obj in enumerate(lst):
                if obj=='|':
                    index1=num
                    count+=1
                    if count==mycount:
                        break 
            if index>index1:
                index1=index          
        else:
            index1=-1
        return index1
    
    # Index of Closing Brackets or Modulas
    def brakets_close_index(self,lst,index1):
        if ')' in lst[index1+1:] or '|' in lst[index1+1:]: 
            for num,obj in enumerate(lst[index1+1:]):
                if obj==')'or obj=='|': 
                    index2=num+index1+1
                    break
        else:
            index2=len(lst)-1
        return index2

    def operation(self,lst,index1,index2):
        import math

        # Factorial
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
        
        # Power
        elif '^' in lst[index1+1:index2+1]:
            count=lst[index1+1:index2+1].index('^')
            count=count+index1+1
            lst[count]=lst[count-1]**lst[count+1]
            lst.pop(count+1)
            lst.pop(count-1)
        
        # Percentage
        elif '%' in lst[index1+1:index2+1]:
            count=lst[index1+1:index2+1].index('%')
            count=count+index1+1
            lst[count]=lst[count-1]/100
            lst.pop(count-1)

        # Division
        elif '/' in lst[index1+1:index2+1]:
            count=lst[index1+1:index2+1].index('/')
            count=count+index1+1
            lst[count]=lst[count-1]/lst[count+1]
            lst.pop(count+1)
            lst.pop(count-1)

        # Multiplication
        elif '*' in lst[index1+1:index2+1]:
            count=lst[index1+1:index2+1].index('*')
            count=count+index1+1
            lst[count]=lst[count-1]*lst[count+1]
            lst.pop(count+1)
            lst.pop(count-1)

        # Addition
        elif '+' in lst[index1+1:index2+1]:
            count=lst[index1+1:index2+1].index('+')
            count=count+index1+1
            lst[count]=lst[count-1]+lst[count+1]
            lst.pop(count+1)
            lst.pop(count-1)
        
        # Substraction
        elif '-' in lst[index1+1:index2+1]:
            count=lst[index1+1:index2+1].index('-')
            count=count+index1+1
            # Joining '-' + number => -number
            if lst[count-1]=='(' or lst[count-1]=='|':
                lst[count]=-lst[count+1]
                lst.pop(count+1)
            # Normal Substraction
            else:
                lst[count]=lst[count-1]-lst[count+1]
                lst.pop(count+1)
                lst.pop(count-1)
        
        return lst

    def other_functions(self,lst,index1,index2):
        import math

        # Sine
        if 'sin' in lst:
            index3=lst.index('sin')
            if index3+1==index1:
                lst[index3]='('
                lst[index3+1]=math.sin(lst[index3+2])
                lst[index3+2]=')'
                lst.pop(index3+3)
        
        # Cosine
        elif 'cos' in lst:
            index3=lst.index('cos')
            if index3+1==index1:
                lst[index3]='('
                lst[index3+1]=math.cos(lst[index3+2])
                lst[index3+2]=')'
                lst.pop(index3+3)

        # Tangent
        elif 'tan' in lst:
            index3=lst.index('tan')
            if index3+1==index1:
                lst[index3]='('
                lst[index3+1]=math.tan(lst[index3+2])
                lst[index3+2]=')'
                lst.pop(index3+3)

        # Sine Inverse
        elif 'sin_in' in lst:
            index3=lst.index('sin_in')
            if index3+1==index1:
                lst[index3]='('
                lst[index3+1]=math.asin(lst[index3+2])
                lst[index3+2]=')'
                lst.pop(index3+3)

        # Cosine Inverse
        elif 'cos_in' in lst:
            index3=lst.index('cos_in')
            if index3+1==index1:
                lst[index3]='('
                lst[index3+1]=math.acos(lst[index3+2])
                lst[index3+2]=')'
                lst.pop(index3+3)

        # Tangent Inverse
        elif 'tan_in' in lst:
            index3=lst.index('tan_in')
            if index3+1==index1:
                lst[index3]='('
                lst[index3+1]=math.atan(lst[index3+2])
                lst[index3+2]=')'
                lst.pop(index3+3)

        # Logarithm (base 10)
        elif 'log' in lst:
            index3=lst.index('log')
            if index3+1==index1:
                lst[index3]='('
                lst[index3+1]=math.log(lst[index3+2],10)
                lst[index3+2]=')'
                lst.pop(index3+3)
        
        # Natural Logarithm (base e)
        elif 'ln' in lst:
            index3=lst.index('ln')
            if index3+1==index1:
                lst[index3]='('
                lst[index3+1]=math.log(lst[index3+2],math.e)
                lst[index3+2]=')'
                lst.pop(index3+3)
        
        # Radians
        elif 'rad' in lst:
            index3=lst.index('rad')
            if index3+1==index1:
                lst[index3]='('
                lst[index3+1]=math.radians(lst[index3+2])
                lst[index3+2]=')'
                lst.pop(index3+3)

        # Degrees
        elif 'deg' in lst:
            index3=lst.index('deg')
            if index3+1==index1:
                lst[index3]='('
                lst[index3+1]=math.degrees(lst[index3+2])
                lst[index3+2]=')'
                lst.pop(index3+3)

        return lst
    
    # Modulas
    def modulas(self,lst,index1,index2):
        if lst[index1]=='|' and lst[index2]=='|':
            if lst[index1+1]<0:
                lst[index1+1]=-lst[index1+1]
        return lst

    # Removing Opening Brackets
    def open_bracket(self,lst,index1):
        if index1==0:
            lst.pop(index1)
        else:
            if lst[index1-1] not in ['+','-','*','/','^','!','%']:
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

    # Removing Closing Brackets
    def close_bracket(self,lst,index2):
        if index2==len(lst)-1:
            lst.pop(index2)
        else:   
            if lst[index2+1] not in ['+','-','*','/','^','!','%']:
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

    # Printer
    def print_list(self,lst):
        string='='
        for obj in lst:
            string+=' '+str(obj)
        print(string)

equation=False
while True:
    try:
        # Printing Instructions
        print('\n\n----------------------------Calculator------------------------------\n')
        print('\tOperations :')
        print("\t\tAddition : '+'")
        print("\t\tSubstraction : '-'")
        print("\t\tMultiplication : '*'")
        print("\t\tDecimal : '.'")
        print("\t\tDivide : '/'")
        print("\t\tPercentage : '%'")
        print("\t\tPower : '^'")
        print("\t\tFactorial : '!'")
        print("\t\tBrackets : '(...)'")
        print("\t\tModulas : '|...|'")
        print("\t\te : 'e'")
        print("\t\tπ : 'pi'")
        print("\t\tDegrees : 'deg(...)'")
        print("\t\tRadians : 'rad(...)'")
        print("\t\tSine : 'sin(...)'")
        print("\t\tCosine : 'cos(...)'")
        print("\t\tTangent : 'tan(...)'")
        print("\t\tSine Inverse : 'sin_in(...)'")
        print("\t\tCosine Inverse : 'cos_in(...)'")
        print("\t\tTangent Inverse : 'tan_in(...)'")
        print("\t\tLogarithm (base 10) : 'log(...)'")
        print("\t\tNatural Logarithm (base e) : 'ln(...)'")
        print('\n\t\!!!Caution!!!: Do not add any space in between the characters\n')
        print("\tDon't worry to use large equations (as it shows all steps)!!!!\n")
        print("\tUse 'exit' to Exit\n\n")

        # Taking input
        string=input('input:')

        # Exit
        if string=='exit':
            break

        elif string=='equation':
            equation=True
            break

        # Clear (it is not working in linux)!!!
        #elif string=='clear':
            #from IPython.display import clear_output
            #clear_output()

        # Calling Class
        cal=Calculator()

        # Unpacking (list)
        lst=cal.unpacking(string)
        cal.print_list(lst)

        # Inside Bracket or Modulas Operations
        if lst.count('(')==lst.count(')') and lst.count('|')%2==0:
            if '(' in lst or '|' in lst:
                pairs=lst.count('(')+lst.count('|')/2
                for count1 in range(0,int(pairs)):
                    index1=cal.brakets_open_index(lst)
                    index2=cal.brakets_close_index(lst,index1)

                    for obj in lst[index1:index2+1]:
                        if obj in ['+','-','*','/','^','!','%']:
                            # Checking Operator
                            lst=cal.operation(lst,index1,index2)
                            cal.print_list(lst)
                            index1=cal.brakets_open_index(lst)
                            index2=cal.brakets_close_index(lst,index1)
                    
                    # Checking Other Functions
                    if lst[index1-1] in ['sin','cos','tan','sin_in','cos_in','tan_in','log','ln','rad','deg']:
                        lst=cal.other_functions(lst,index1,index2)
                        index1=cal.brakets_open_index(lst)
                        index2=cal.brakets_close_index(lst,index1)
                        cal.print_list(lst)

                    # Modulas
                    index1=cal.brakets_open_index(lst)
                    index2=cal.brakets_close_index(lst,index1)
                    lst=cal.modulas(lst,index1,index2)
                    cal.print_list(lst)

                    # Bracket Remove
                    index1=cal.brakets_open_index(lst)
                    lst=cal.open_bracket(lst,index1)
                    index2=cal.brakets_close_index(lst,index1)
                    lst=cal.close_bracket(lst,index2)
                    cal.print_list(lst)

                # Outside Bracket or Modulas Operations
                index1=cal.brakets_open_index(lst)
                index2=cal.brakets_close_index(lst,index1)
                for obj in lst[index1+1:index2+1]:
                    if obj in ['+','-','*','/','^','!','%','`']:
                        # Checking Operator
                        lst=cal.operation(lst,index1,index2)
                        cal.print_list(lst)
                        index1=cal.brakets_open_index(lst)
                        index2=cal.brakets_close_index(lst,index1)
            # No Bracket or Modulas Operations
            else:
                index1=cal.brakets_open_index(lst)
                index2=cal.brakets_close_index(lst,index1)
                for obj in lst[index1+1:index2+1]:
                    if obj in ['+','-','*','/','^','!','%','`']:
                        # Checking Operator
                        lst=cal.operation(lst,index1,index2)
                        cal.print_list(lst)
                        index1=cal.brakets_open_index(lst)
                        index2=cal.brakets_close_index(lst,index1)
    except:
        print('Syntax/Math Error')
    else:
        if len(lst)!=1:
            print('Syntax/Math Error')
        else:
            try:
                float(lst[0])
            except:
                print('Syntax/Math Error')

while True:
    if equation==True:
        pass