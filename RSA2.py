import math


def Isprime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

p=int(input("Enter first prime number p:"))
q=int(input("Enter the second prime number q:"))


if not (Isprime(p) and Isprime(q) and p != q):
    print("Numbers are not prime numbers .")
    exit()

msg = int(input("Enter message in integer- "))

n=p * q
phin=(p - 1) * (q - 1)

while True:
    e = int(input(f"Enter the value of 'e' (1 < e < {phin},: "))
    if 1 < e < phin and math.gcd(e, phin) == 1:
        break
        print("Enther the another value of e")


d =  pow(e, -1, phin)

C = pow(msg, e, n)  
M = pow(C, d, n)


print(f"Decrypted:{M}")
print(f"{d}")
print(f"{C}")