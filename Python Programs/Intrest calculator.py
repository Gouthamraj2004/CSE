def inter(p,n,r):
    inter=(p*n*r)/100
    print("interest:",inter)
A=input("enter the name of the customer:")
B=int(input("enter the age of the customer:"))
C=input("gender of the customer(M\F):")
D=int(input("enter the principle amount:"))
E=int(input("enter the number of years:"))
if(B>=60):
    r=12
    inter(D,E,r)
elif(B<60 and C=="F"):
    r=10
    inter(D,E,r)
else:
    r=9
    inter(D,E,r)


