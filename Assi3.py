import math;

p=int(input("Enter first prime number p:"))
q=int(input("Enther the Primitive Root:"))

A_Key=int(input("Enter The private key for user A:"))
B_Key=int(input("Enter The private key for user B:"))

A_pub = pow(q, A_Key, p)
B_pub=pow(q,B_Key,p)

K_A=pow(B_pub,A_pub,p)
K_B=pow(A_pub,B_pub,p)

print(f"Shared Key for user A:{K_A}")  
print(f"Shared Key for user B:{K_B}")


