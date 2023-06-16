a=int(input("Start:"))
b=int(input("Stop:"))
Even=0
Odd=0
for i in range(a,b+1):
    if(i%2==0):
        Even=Even+1
    else:
        Odd=Odd+1
print("Even:",Even)
print("Odd:",Odd)
        
