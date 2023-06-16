a=int(input("enter the starting number:"))
b=int(input("enter the ending number:"))
print("The prime numbers in the range are:")
for i in range(a,b+1):
    if i>1:
        for j in range(2,i):
            if(i%j==0):
                break
        else:
            print(i)
            
