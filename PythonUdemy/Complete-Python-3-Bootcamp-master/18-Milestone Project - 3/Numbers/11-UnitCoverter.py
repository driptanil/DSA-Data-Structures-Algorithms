'''Unit Converter (temp, currency, volume, mass and more)
- Converts various units between one another. 
- The user enters the type of unit being entered, the type of unit they want to convert to and then the value.
- The program will then make the conversion.'''


class Currency:
    
    def user_input(self):
        boolean1=True
        boolean2=True
        input2=None
        input1=input("\nInitial Unit (currency) : ")
        if input1=='mode':
            boolean2=False
            return input1,input2,boolean1,boolean2
        elif input1=='exit':
            boolean2=False
            boolean1=False
            return input1,input2,boolean1,boolean2
        input2=input("Final Unit (currency) : ")
        if input2=='mode':
            boolean2=False
            return input1,input2,boolean1,boolean2
        elif input2=='exit':
            boolean2=False
            boolean1=False
            return input1,input2,boolean1,boolean2
        return input1,input2,boolean1,boolean2

    def web_scrapping(self,input1,input2):
        import requests
        import bs4
        res=requests.get("https://www.marketwatch.com/investing/currency/"+input1+input2)
        soup=bs4.BeautifulSoup(res.text,'lxml')
        convert=soup.find_all("h2",{"class":"intraday__price"})
        import re
        convert=convert[0].text
        index=re.search(r'\d+.\d+',convert)
        return index.group()

    def convertion(self,convert,input1,input2):
        input3=float(input(f'\n\tinput ({input1}) : '))
        result=input3*float(convert)
        print(f'\toutput ({input2}) : {result}')


class Temperature:
    
    def user_input(self):
        while True:
            input1=input("\nInitial Unit (temperature) : ")
            input2=input("Final Unit (temperature) : ")
            if input1 in ['C','K','F'] and input2 in ['C','K','F']:
                return input1,input2
            else:
                print("Wrong Input !")
    
    def convertion(self,input1,input2):
        input3=float(input(f"\tinput ({input1}) : "))
        if input1=='C':
            output=input3
            if input2=='F':
                output=output*9/5+32
            elif input2=='K':
                output=output+273.15
        elif input1=='F':
            output=input3
            if input2=='C':
                output=(output-32)*5/9
            elif input2=='K':
                output+=273.15
        elif input1=='K':
            output=input3
            if input2=='C':
                output=input3-273.15
            elif input2=='F':
                output=output*9/5+32
        print(f'\toutput ({input2}) : {output}')

class Length:

    def __init__(self,standard_units,british_units,units,standard_values,british_values):
        self.svalues=standard_values
        self.bvalues=british_values
        self.sunits=standard_units
        self.bunits=british_units
        self.units=units

    def user_input(self):
        while True:
            input1=input("\nInitial Unit (length) : ")
            input2=input("Final Unit (length) : ")
            if input1 in self.units and input2 in self.units:
                break
            else:
                print("Wrong Input !")
        while True:
            try:
                input3=float(input("\tinput : "))
                return input1,input2,input3
            except:
                print('Enter float or interger !')

    def convertion(self,input1,input2,input3):
        if input1 in self.sunits:
            if input2 in self.sunits:
                if self.sunits.index(input1)<self.sunits.index(input2):
                    for count in range(self.sunits.index(input1)+1,self.sunits.index(input2)+1):
                        storage=input3
                        input3=10**self.svalues[count]*input3
                        print(f"=> {storage} {self.sunits[count-1]} = [ {storage} * 10^{self.svalues[count]} ] {self.sunits[count]} = {input3} {self.sunits[count]}")

                elif self.sunits.index(input1)>self.sunits.index(input2):
                    for count in range(self.sunits.index(input2)+1,self.sunits.index(input1)+1):
                        storage=input3
                        input3=input3/(10**self.svalues[count])
                        print(f"=> {storage} {self.sunits[count]} = [ {storage} * 10^-{self.svalues[count]} ] {self.sunits[count-1]} = {input3} {self.sunits[count-1]}")
                
                else:
                    print(f"=> {input3} {input1} =[ {input3} * 10^0 ] {input2} = {input3} {input2}")
                    
            else:
                for count in range(self.sunits.index('km')+1,self.sunits.index(input1)+1):
                    storage=input3
                    input3=input3/10**self.svalues[count]
                    print(f"=> {storage} {self.sunits[count]} = [ {storage} * 10^{self.svalues[count]} ] {self.sunits[count-1]} = {input3} {self.sunits[count-1]}")
                storage=input3
                input3=input3*1.60934*3
                print(f"=> {storage} km = [ {storage} * 1.60934 * 3 ] km = {input3} league")
                for count in range(self.bunits.index('league')+1,self.bunits.index(input2)+1):
                    storage=input3
                    input3=input3*self.bvalues[count]
                    print(f"=> {storage} {self.bunits[count-1]} = [ {storage} / {self.bvalues[count]} ] {self.bunits[count]} = {input3} {self.bunits[count]}")

        elif input1 in self.bunits:
            if input2 in self.bunits:
                if self.bunits.index(input1)>self.bunits.index(input2):
                    for count in range(self.bunits.index(input2)+1,self.bunits.index(input1)+1):
                        storage=input3
                        input3=input3/self.bvalues[count]
                        print(f"=> {storage} {self.bunits[count]} = [ {storage} / {self.bvalues[count]} ] {self.bunits[count-1]} = {input3} {self.bunits[count-1]}")

                elif self.bunits.index(input1)<self.bunits.index(input2):
                    for count in range(self.bunits.index(input1)+1,self.bunits.index(input2)+1):
                        storage=input3
                        input3=input3*(self.bvalues[count])
                        print(f"=> {storage} {self.bunits[count-1]} = [ {storage} * {self.bvalues[count]} ] {self.bunits[count]} = {input3} {self.bunits[count]}")

                else:
                    print(f"=> {input3} {input1} =[ {input3} * 1 ] {input2} = {input3} {input2}")
            
            else:
                for count in range(self.bunits.index('league')+1,self.bunits.index(input1)+1):
                    storage=input3
                    input3=input3/(self.bvalues[count])
                    print(f"=> {storage} {self.bunits[count]} = [ {storage} / {self.bvalues[count]} ] {self.bunits[count-1]} = {input3} {self.bunits[count-1]}")
                storage=input3
                input3=input3/1.60934/3
                print(f"=> {storage} league = [ {storage} / 1.60934 / 3 ] km = {input3} km")
                for count in range(self.sunits.index('km')+1,self.sunits.index(input2)+1):
                    storage=input3
                    input3=input3*(10**self.svalues[count])
                    print(f"=> {storage} {self.sunits[count-1]} = [ {storage} * 10^-{self.svalues[count]} ] {self.sunits[count]} = {input3} {self.sunits[count]}")
        


print('''
  _   _       _ _      ____                          _            
 | | | |_ __ (_) |_   / ___|___  _ ____   _____ _ __| |_ ___ _ __ 
 | | | | '_ \| | __| | |   / _ \| '_ \ \ / / _ \ '__| __/ _ \ '__|
 | |_| | | | | | |_  | |__| (_) | | | \ V /  __/ |  | ||  __/ |   
  \___/|_| |_|_|\__|  \____\___/|_| |_|\_/ \___|_|   \__\___|_|   
                                                                  ''')

print("Choose the type of Conversion:")
print("\n\tCurrency : 'cur'")
print("\tTemperature : 'temp'")
print("\tLength : 'len'")

boolean1=True
while boolean1:
    string=input("\ninput : ")
    print(string)
    if string=='exit':
        break

    elif string == 'cur':
        print("\n\tU.S Dollar : 'USD'")
        print("\tEuropran Euro : 'EUR'")
        print("\tJapanese Yen : 'JPY'")
        print("\tBritish Pound : 'GBP'")
        print("\tSwiss Franc : 'CHF'")
        print("\tCanadian Dollar : 'CAD'")
        print("\tNew Zealand Dollar : 'NZD'")
        print("\tAustrialian Dollar : 'AUD'")
        print("\tSouth African Rand : 'ZAR'")
        print("\tIndian Rupee : 'INR'")

        boolean2=True
        while boolean2:
            while True:
                try:
                    cur=Currency()
                    input1,input2,boolean1,boolean2=cur.user_input()
                    if boolean2==False:
                        break
                    elif input1==input2:
                        print(f"\n1 {input1} => 1 {input2}")
                        break
                    else:
                        convert=cur.web_scrapping(input1.lower(),input2.lower())
                        print(f"\n1 {input1} => {convert} {input2}")
                        cur.convertion(convert,input1,input2)
                        break
                except:
                    print("\tWrong Input!!!\n")
            

    elif string=='temp':
        temp=Temperature()
        print("\n\tKelvin : 'K'")
        print("\tCelcius : 'C'")
        print("\tFahrenheit : 'F'")
        input1,input2=temp.user_input()
        temp.convertion(input1,input2)

    elif string=='len':
        print("\n\tMeter : 'm'")
        print("\tKilometer : 'km'")
        print("\tCentimeter : 'cm'")
        print("\tMillimeter : 'mm'")
        print("\tMicrometer : 'mmm'")
        print("\tNanometer : 'nm'")
        print("\tInch : 'inch'")
        print("\tFoot : 'foot'")
        print("\tYard : 'yard'")
        print("\tRod : 'rod'")
        print("\tFurlong : 'fur'")
        print("\tMile : 'mile'")
        print("\tLeague : 'league'")
        standard_units=['km','m','cm','mm','mmm','nm']
        standard_values=[0,3,2,1,1,3]
        british_units=['league','mile','fur','rod','yard','foot','inch']
        british_values=[1,3,8,40,5.5,3,12,1]
        units=standard_units+british_units
        len=Length(standard_units,british_units,units,standard_values,british_values)
        input1,input2,input3=len.user_input()
        len.convertion(input1,input2,input3)