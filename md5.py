import hashlib


strTohash = "welcome"

result = hashlib.md5(strTohash.encode())


print("MD5 has is : ", end="")
print(result.hexdigest())


