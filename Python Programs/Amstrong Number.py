lower=int(input("enter lower range:"))
upper=int(input("enter upper range:"))
for num in range(lower,upper+1):
    sum=0
    temp=num
    while temp>0:
        digit=temp%10
        sum=sum+(digit**3)
        temp=temp//10
        if sum==num:
            print(num)
