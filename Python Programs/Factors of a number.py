def print_factors(a):
    print("The factorrs of",a,"are:")
    for i in range(1,a+1):
        if a%i==0:
            print(i)
num=int(input("enter the number:"))
print_factors(num)
